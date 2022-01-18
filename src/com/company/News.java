package com.company;

import java.util.Objects;

public class News implements Comparable<News> {
    String text;
    int priority; // from 1 to 10

    public News(String text, int priority) {
        this.text = text;
        this.priority = priority;
    }

    //TODO the news which is of a higher priority must go first, if the priorities are equal, the shorter news
    // must go first.
    @Override
    public int compareTo(News incomingOtherNews) {
        Objects.nonNull(incomingOtherNews);
        if (incomingOtherNews.text==null){
           throw new MalformedNewsException("Text is null.");
        }
        if (this.priority < incomingOtherNews.priority)
            return -1;
        if (this.priority > incomingOtherNews.priority)
            return 1;
        // if (this.priority == incomingOtherNews.priority)  - just for understanding
        if ((incomingOtherNews.text.length() - this.text.length()) > 0) {
            return 1;
        } else {
            return -1; //We are here also, if priorities are the same and text length are the same too.
        }
    }
}
