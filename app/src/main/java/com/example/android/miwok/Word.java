package com.example.android.miwok;

import android.view.View;
import android.widget.ImageView;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String miwok;
    private String defaultTranslate;
    private int imageResourceID=NO_IMAGE_PROVIDED;
    private int audioResourcesID ;



    public Word(String defaultTranslate,String miwok,int audioResourcesID){
        this.defaultTranslate=defaultTranslate;
        this.miwok=miwok;
        this.audioResourcesID=audioResourcesID;
    }

    public Word(String defaultTranslate,String miwok,int imageResourceID,int audioResourcesID){
        this.defaultTranslate=defaultTranslate;
        this.miwok=miwok;
        this.imageResourceID=imageResourceID;
        this.audioResourcesID=audioResourcesID;
    }

    public boolean hasImage(){
        return imageResourceID !=NO_IMAGE_PROVIDED;
    }

    public String getMiwok(){
        return miwok;
    }

    public void setMiwok(String miwok){
        this.miwok=miwok;
    }

    public String getDefaultTranslate(){
        return defaultTranslate;
    }

    public void setDefaultTranslate(String defaultTranslate){
        this.defaultTranslate=defaultTranslate;
    }

    public int getImageResourceID(){
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public int getAudioResourcesID(){
        return audioResourcesID;
    }

    public void setAudioResourcesID(int audioResourcesID) {
        this.audioResourcesID = audioResourcesID;
    }

}
