package com.example.clonemessenger.Model.News;

public class News implements INews
{
    public static final int INVISIBLE = 0, READ = 1, UNREAD = 2;
    private int newsImg;
    private int readState;

    public News(int newsImg, int readState) {
        this.newsImg = newsImg;
        this.readState = readState;
    }

    public int getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(int newsImg) {
        this.newsImg = newsImg;
    }

    public int getReadState() {
        return readState;
    }

    public void setReadState(int readState) {
        this.readState = readState;
    }



}
