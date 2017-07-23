package com.Pedrum.StoryFinderFinale.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.Pedrum.StoryFinderFinale.R;
import com.Pedrum.StoryFinderFinale.adapters.AdapterStory;
import com.Pedrum.StoryFinderFinale.application.G;
import com.Pedrum.StoryFinderFinale.helpers.CustomRequest;
import com.Pedrum.StoryFinderFinale.models.Story;

public class MainActivity extends AppCompatActivity {
    ArrayList<Story> stories = new ArrayList<>();
    AdapterStory adapterStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtSearch = (EditText) findViewById(R.id.txtSearch);
        RecyclerView storiesRecyclerView = (RecyclerView) findViewById(R.id.storiesRecyclerView);
        adapterStory = new AdapterStory(stories);
        GridLayoutManager layoutManager = new GridLayoutManager(G.context, 1);
        storiesRecyclerView.setLayoutManager(layoutManager);
        for (int i = 0; i < 15; i++) {
            Story story = new Story("Story number : " + i,
                    "Description number " + i,
                    R.drawable.empty_profile);
            stories.add(story);
        }
        adapterStory.setListener(new AdapterStory.IStory() {
            @Override
            public void onClickStory(Story story, int position) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("story", story);
                startActivity(intent);
            }
        });
        storiesRecyclerView.setAdapter(adapterStory);

        txtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                adapterStory.setStorys(searchInStories(txtSearch.getText().toString(), stories));
                adapterStory.notifyDataSetChanged();
            }
        });
        Map<String, String> params = new HashMap<String, String>();

        CustomRequest jsObjRequest = new CustomRequest(G.API_URL + "find/events", params, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    };




    public ArrayList<Story> searchInStories(String query, ArrayList<Story> userList) {

        ArrayList<Story> list = new ArrayList<>();
        if (!query.equals("")) {
            for (Story user : userList) {
                if (user.getName().contains(query))
                    list.add(user);
            }
            return list;
        } else {
            return userList;
        }
    }
}

