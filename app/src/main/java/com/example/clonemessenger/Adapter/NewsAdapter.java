package com.example.clonemessenger.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonemessenger.Model.IUserFacade;
import com.example.clonemessenger.Model.News.News;
import com.example.clonemessenger.Model.User;
import com.example.clonemessenger.Model.UserFacade;
import com.example.clonemessenger.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    List<UserFacade> list;
    Context mContext;

    public NewsAdapter(List<UserFacade> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_name.setText(list.get(position).getHuman().getShortName());
        holder.img.setImageResource(list.get(position).getHuman().getAvatar());
        holder.img_online.setVisibility(getVisibility(position));
        holder.news_read.setImageResource(getNewsImg(position));
    }

    private int getVisibility(int position)
    {
        if (list.get(position).getHuman().isOnline())
        {
            return View.VISIBLE;
        }
        else
        {
            return View.GONE;
        }
    }

    private int getNewsImg(int position)
    {
        int readState = this.list.get(position).getNews().getReadState();
        switch (readState)
        {
            case News.READ:
                return R.drawable.news_true;
            case News.UNREAD:
                return R.drawable.news_false;
            default:
                return 0;
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView tv_name;
        CheckBox img_online;
        ImageView news_read;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.chat_img);
            tv_name = (TextView) itemView.findViewById(R.id.news_name);
            img_online = (CheckBox) itemView.findViewById(R.id.chat_online);
            news_read = (ImageView) itemView.findViewById(R.id.news_read);
        }
    }


}
