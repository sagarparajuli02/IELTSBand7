package com.ielts.reading.listening.writing.speaking;


public class GetterSetter {

    private String topicTitle,localUrl;

    public GetterSetter(String topicTitle,String localUrl) {
        this.topicTitle = topicTitle;
        this.localUrl = localUrl;
    }

    public String gettopicTitle() {
        return topicTitle;
    }

    public String getLocalUrl() {
        return localUrl;
    }

    public void setLocalUrl(String localUrl) {
        this.localUrl = localUrl;
    }

    public void settopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }



}