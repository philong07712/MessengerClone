package com.example.clonemessenger;

import com.example.clonemessenger.Factory.BalanceFactory;
import com.example.clonemessenger.Factory.IFactory;
import com.example.clonemessenger.Factory.RandomFactory;
import com.example.clonemessenger.Model.UserFacade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyApplication {
    private List<UserFacade> userList = new ArrayList<>();
    private final static MyApplication instance = new MyApplication();
    private MyApplication()
    {
        init();
    }

    public void init()
    {
        this.initMockUser();
    }


    public static MyApplication getInstance() {
        return instance;
    }

    public void setList(List<UserFacade> userList)
    {
        this.userList = userList;
    }

    public List<UserFacade> getUserList()
    {
        return this.userList;
    }

    private void initMockUser() {
        IFactory factory = new BalanceFactory();
        for (int i = 0; i < 40; i++)
        {
            this.userList.add(new UserFacade(factory.initHuman(), factory.initNews()));
        }
    }
}
