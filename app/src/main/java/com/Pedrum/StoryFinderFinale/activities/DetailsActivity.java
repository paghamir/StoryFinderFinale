package com.Pedrum.StoryFinderFinale.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.Pedrum.StoryFinderFinale.R;
import com.Pedrum.StoryFinderFinale.models.Story;

public class DetailsActivity extends AppCompatActivity {
    protected TextView txtName;
    protected TextView txtUuid;
    protected TextView txtDescription;
    protected ImageView imgPicture;
    private Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        if (getIntent().hasExtra("story")) {
            story = (Story) getIntent().getExtras().getSerializable("story");
            txtName = (TextView) findViewById(R.id.txtName);
            txtUuid = (TextView) findViewById(R.id.txtUuid);
            txtDescription = (TextView) findViewById(R.id.txtDescription);
            imgPicture = (ImageView) findViewById(R.id.imgPicture);
            txtName.setText(story.getName());
            txtDescription.setText(story.getDescription());
            txtUuid.setText(story.getUuid().toString());
            imgPicture.setImageResource(story.getResource());
        }
        else {
            Toast.makeText(DetailsActivity.this, "Problem with Story intent.", Toast.LENGTH_SHORT).show();
        }

    }
}
