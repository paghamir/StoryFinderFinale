package com.Pedrum.StoryFinderFinale.models;

import java.io.Serializable;
import java.util.UUID;

/**
  Created by Pedrum Aghamir on 7/3/2017.
 */
/** This is a test.**/

public class Story implements Serializable{
    UUID mUuid;
    String mName;
    String mDescription;
    int mResource;

    public Story(String mName, String mDescription, int mResource) {
        this.mUuid = UUID.randomUUID();
        this.mName = mName;
        this.mDescription = mDescription;
        this.mResource = mResource;
    }

    public UUID getUuid() {
        return mUuid;
    }

    public void setUuid(UUID mUuid) {
        this.mUuid = mUuid;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getResource() {
        return mResource;
    }

    public void setResource(int mResource) {
        this.mResource = mResource;
    }
}
