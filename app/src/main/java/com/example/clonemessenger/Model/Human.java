package com.example.clonemessenger.Model;

import java.util.Random;

public class Human implements IHuman {
    private int avatar;
    private String name;
    private boolean onlineState;
    public Human(int avatar, String name)
    {
        this.avatar = avatar;
        this.name = name;
        initRandomState();
    }

    private void initRandomState()
    {
        int online = new Random().nextInt(2);
        if (online == 0) {
            this.onlineState = true;
        }
        else
        {
            this.onlineState = false;
        }
    }
    @Override
    public int getAvatar() {
        return this.avatar;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isOnline() {
        return this.onlineState;
    }

    @Override
    public String getShortName() {
        String shortName = this.name.substring(0, this.name.indexOf(" "));
        return shortName;
    }
}
