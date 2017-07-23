package com.Pedrum.StoryFinderFinale.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.Pedrum.StoryFinderFinale.R;
import com.Pedrum.StoryFinderFinale.models.Story;
import com.Pedrum.StoryFinderFinale.application.G;


/**
 * Created by Pedrum Aghamir on 7/19/2017
 */


public class AdapterStory extends RecyclerView.Adapter<AdapterStory.AppsViewHolder> {


    public interface IStory {
        void onClickStory(Story story, int position);
    }

    public void setStorys(ArrayList<Story> users) {
        this.names = users;
    }

    IStory listener;

    public void setListener(IStory listener) {
        this.listener = listener;
    }

    public static class AppsViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtName;
        protected TextView txtDescription;
        protected ImageView imgPicture;

        public AppsViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtDescription = (TextView) itemView.findViewById(R.id.txtDescription);
            imgPicture = (ImageView) itemView.findViewById(R.id.imgPicture);
        }

    }


    private ArrayList<Story> names = new ArrayList<>();

    public AdapterStory(ArrayList<Story> names) {
        this.names = names;
    }

    @Override
    public AppsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(G.context).inflate(R.layout.row_story, viewGroup, false);
        return new AppsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AppsViewHolder personViewHolder, final int i) {
        final Story story = names.get(i);
        personViewHolder.txtName.setText(story.getName());
        personViewHolder.txtDescription.setText(story.getName());
        personViewHolder.imgPicture.setImageResource(story.getResource());
        personViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClickStory(story, i);
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return names.size();
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}