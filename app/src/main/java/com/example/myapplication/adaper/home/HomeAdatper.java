package com.example.myapplication.adaper.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseAdapter;

import java.util.List;

public class HomeAdatper extends BaseAdapter {

    public HomeAdatper(List mDatas) {
        super(mDatas);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_home_new_activity_item;
    }

    @Override
    protected void bindData(BaseViewHolder holder, int position, Object o) {
        Object o1 = mDatas.get(position);
        ImageView ivActivity = (ImageView) holder.getView(R.id.iv_activity);
        TextView title = (TextView) holder.getView(R.id.tv_activity_title);
        TextView remark = (TextView) holder.getView(R.id.tv_activity_remark);
        TextView applyTime = (TextView) holder.getView(R.id.tv_activity_apply_time);
        //Glide.with(mContext).load().into(ivActivity);
        /*title.setText();
        remark.setText();
        applyTime.setText();*/


    }


}
