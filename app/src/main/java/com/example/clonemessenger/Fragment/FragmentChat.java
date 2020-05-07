package com.example.clonemessenger.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonemessenger.Adapter.ChatAdapter;
import com.example.clonemessenger.Adapter.NewsAdapter;
import com.example.clonemessenger.Model.Friend;
import com.example.clonemessenger.Model.User;
import com.example.clonemessenger.Model.UserFacade;
import com.example.clonemessenger.MyApplication;
import com.example.clonemessenger.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentChat extends Fragment {
    private final String TAG = "FragmentChatTag";
    private static final String KEY_NEWS = "User_News";
    View v;
    RecyclerView rv_news, rv_chat;
    List<User> list;
    List<User> chatList;
    NewsAdapter newsAdapter;
    ChatAdapter chatAdapter;
    Context mContext;
    Friend friends = new Friend();
    // New models
    List<UserFacade> listOfUsers;
    public FragmentChat() {
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = container.getContext();
        v = inflater.inflate(R.layout.chat_fragment, container, false);
        // init users and friend
        this.listOfUsers = new ArrayList<>(MyApplication.getInstance().getUserList());
        list = friends.getUserList();
        list.add(0, new User("Your Story","", R.drawable.plus, false, 0));
        chatList = new ArrayList<>(list);
        chatList.remove(0);
        // init view
        rv_news = v.findViewById(R.id.rv_news);
        rv_chat = v.findViewById(R.id.rv_chat);

        // set up news recycler view
        newsAdapter = new NewsAdapter(this.listOfUsers, mContext);
        rv_news.setAdapter(newsAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv_news.setLayoutManager(linearLayoutManager);
        rv_news.setNestedScrollingEnabled(false);
        // set up chat recycler view

        chatAdapter = new ChatAdapter(listOfUsers, mContext);
        rv_chat.setAdapter(chatAdapter);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rv_chat.setLayoutManager(linearLayoutManager1);
        rv_chat.setNestedScrollingEnabled(false);
        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}
