package com.jesu.handymanprovider.home.models;

import android.graphics.Bitmap;

public class NotificationModel {
    private String content,time;
    private Bitmap bPhoto;

    public NotificationModel(String content, String time, Bitmap bPhoto) {
        this.content = content;
        this.time = time;
        this.bPhoto = bPhoto;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Bitmap getbPhoto() {
        return bPhoto;
    }

    public void setbPhoto(Bitmap bPhoto) {
        this.bPhoto = bPhoto;
    }
}
