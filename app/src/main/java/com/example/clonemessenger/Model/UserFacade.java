package com.example.clonemessenger.Model;

import com.example.clonemessenger.Model.News.INews;

public class UserFacade implements IUserFacade
{
    private IHuman human;
    private INews news;

    public UserFacade(IHuman human, INews news) {
        this.human = human;
        this.news = news;
    }

    public IHuman getHuman() {
        return human;
    }

    public void setHuman(IHuman human) {
        this.human = human;
    }

    public INews getNews() {
        return news;
    }

    public void setNews(INews news) {
        this.news = news;
    }
}
