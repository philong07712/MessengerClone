package com.example.clonemessenger.Factory;

import com.example.clonemessenger.Model.Human;
import com.example.clonemessenger.Model.IHuman;
import com.example.clonemessenger.Model.News.INews;
import com.example.clonemessenger.Model.News.News;

public class BalanceFactory extends AFactory {
    private int newPosition = 0;
    private int namePosition = 0;
    private int avatarPosition = 0;
    @Override
    public INews initNews() {
        int readState = generate.nextInt(3);
        return new News(randomNews(), readState);
    }

    @Override
    public IHuman initHuman() {
        return new Human(randomAvatar(), randomName());
    }

    private int randomNews()
    {
        int newsImgId = this.listNewsImgs.get(newPosition);
        newPosition++;
        newPosition %= this.listNewsImgs.size();
        return newsImgId;
    }

    private String randomName()
    {
        String name = this.listName.get(namePosition);
        namePosition++;
        namePosition %= this.listName.size();
        return name;
    }

    private int randomAvatar()
    {
        int avatarID = this.listAvatarImgs.get(avatarPosition);
        avatarPosition++;
        avatarPosition %= this.listAvatarImgs.size();
        return avatarID;
    }

}
