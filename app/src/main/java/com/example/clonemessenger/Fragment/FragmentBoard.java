package com.example.clonemessenger.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonemessenger.Adapter.BoardAdapter;
import com.example.clonemessenger.Model.UserFacade;
import com.example.clonemessenger.MyApplication;
import com.example.clonemessenger.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentBoard extends Fragment {
    public FragmentBoard()
    {
    }
    Context mContext;
    RecyclerView rv_board;
    BoardAdapter adapter;
    List<UserFacade> listOfUsers;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = container.getContext();
        View v = inflater.inflate(R.layout.board_fragment, container, false);
        // init fragment
        listOfUsers = new ArrayList<>(MyApplication.getInstance().getUserList());
        adapter = new BoardAdapter(mContext, listOfUsers);
        rv_board = v.findViewById(R.id.rv_board);
        rv_board.setAdapter(adapter);
        rv_board.setLayoutManager(new GridLayoutManager(mContext, 2));
        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        MyApplication.getInstance().setList(this.listOfUsers);
        super.onSaveInstanceState(outState);
    }
}
