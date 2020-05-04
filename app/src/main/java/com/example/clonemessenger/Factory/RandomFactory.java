package com.example.clonemessenger.Factory;

import com.example.clonemessenger.Model.Human;
import com.example.clonemessenger.Model.IHuman;
import com.example.clonemessenger.Model.News.INews;
import com.example.clonemessenger.Model.News.News;
import com.example.clonemessenger.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFactory extends AFactory
{
    @Override
    public INews initNews() {
        int readState = generate.nextInt(3);
        return new News(randomNews(), readState);
    }

    @Override
    public IHuman initHuman() {
        return new Human(randomAvatar(), randomName());
    }

    private int randomAvatar()
    {
    int position = generate.nextInt(this.listAvatarImgs.size());
    return this.listAvatarImgs.get(position);
}

    private int randomNews()
    {
        int position = generate.nextInt(this.listNewsImgs.size());
        return this.listNewsImgs.get(position);
    }

    private String randomName()
    {
        int position = generate.nextInt(this.listName.size());
        return this.listName.get(position);
    }
}
