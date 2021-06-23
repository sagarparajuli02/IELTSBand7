package com.ielts.reading.listening.writing.speaking;

public class List_Data {

    private String title;
    private String url;
    String videoId;

    public List_Data(String title, String url, String videoId) {
        this.title = title;
        this.url = url;
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}