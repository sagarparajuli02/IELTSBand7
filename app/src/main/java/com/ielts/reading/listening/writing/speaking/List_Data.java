package com.ielts.reading.listening.writing.speaking;

public class List_Data {

    private String title;
    private String url;

    public List_Data(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getName() {
        return title;
    }

    public String getImage_url() {
        return url;
    }
}