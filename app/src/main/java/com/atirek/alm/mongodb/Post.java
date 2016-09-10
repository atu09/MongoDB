package com.atirek.alm.mongodb;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Alm on 6/28/2016.
 */
public class Post {

    @SerializedName("_id")
    JsonObject _id;

    @SerializedName("audio_url")
    String audio_url;

    @SerializedName("category")
    String category;

    @SerializedName("colorCode")
    String colorCode;

    @SerializedName("comment")
    String[] comment;

    @SerializedName("duration")
    String duration;

    @SerializedName("language")
    String language;

    @SerializedName("like")
    String[] like;

    @SerializedName("retweet")
    String[] retweet;

    @SerializedName("timeStamp")
    String timeStamp;

    @SerializedName("title")
    String title;

    @SerializedName("type")
    String type;

    @SerializedName("userId")
    String userId;

    @SerializedName("userImage")
    String userImage;

    @SerializedName("username")
    String username;

    public JsonObject get_id() {
        return _id;
    }

    public void set_id(JsonObject _id) {
        this._id = _id;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String[] getComment() {
        return comment;
    }

    public void setComment(String[] comment) {
        this.comment = comment;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String[] getLike() {
        return like;
    }

    public void setLike(String[] like) {
        this.like = like;
    }

    public String[] getRetweet() {
        return retweet;
    }

    public void setRetweet(String[] retweet) {
        this.retweet = retweet;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
