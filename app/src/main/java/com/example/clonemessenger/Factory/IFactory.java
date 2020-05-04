package com.example.clonemessenger.Factory;

import com.example.clonemessenger.Model.IHuman;
import com.example.clonemessenger.Model.News.INews;
import com.example.clonemessenger.Model.News.News;

public interface IFactory {
    INews initNews();
    IHuman initHuman();
}

