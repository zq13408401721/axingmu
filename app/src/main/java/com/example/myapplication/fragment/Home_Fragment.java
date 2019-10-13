package com.example.myapplication.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.myapplication.NumView;
import com.example.myapplication.R;
import com.example.myapplication.adaper.home.HomeAdatper;
import com.example.myapplication.base.BaseAdapter;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.bean.Logi_bean;
import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.contract.home.Home_Contract;
import com.example.myapplication.presenter.home.Home_Presenter;
import com.youth.banner.Banner;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Home_Fragment extends BaseFragment implements Home_Contract.View, BaseAdapter.OnItemClickListener {


    @BindView(R.id.weather)
    ImageView weather;
    @BindView(R.id.tv_temperature)
    TextView tvTemperature;
    @BindView(R.id.iv_msg)
    ImageView ivMsg;
    @BindView(R.id.rl_home)
    RelativeLayout rlHome;
    @BindView(R.id.banner)
    Banner mBanner;
    @BindView(R.id.ll_iv)
    LinearLayout llIv;
    @BindView(R.id.tongzhi)
    ImageView tongzhi;
    @BindView(R.id.tv_notify)
    TextView tvNotify;
    @BindView(R.id.ll_notify)
    LinearLayout llNotify;
    @BindView(R.id.latest)
    TextView latest;
    @BindView(R.id.rv_activity)
    RecyclerView rvActivity;
    @BindView(R.id.ll_activity)
    LinearLayout llActivity;
    @BindView(R.id.ll_entrance)
    LinearLayout llEntrance;
    @BindView(R.id.ll_managment)
    LinearLayout llManagment;
    @BindView(R.id.ll_cost)
    LinearLayout llCost;
    @BindView(R.id.ll_warranty)
    LinearLayout llWarranty;
    @BindView(R.id.ll_visitor)
    LinearLayout llVisitor;
    @BindView(R.id.msg_num)
    NumView msgNum;
    Unbinder unbinder;

    private HomeAdatper homeAdatper;
    private ArrayList<Logi_bean> list;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_;
    }

    @Override
    protected void initView() {
        msgNum.setNum(6);
        list = new ArrayList<>();
        rvActivity.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeAdatper = new HomeAdatper(list);
        rvActivity.setAdapter(homeAdatper);
        homeAdatper.setOnItemClickListener(this);
        
    }

    @Override
    protected void initData() {
        ((Home_Presenter) mPresenter).getHomeData();
    }

    @Override
    protected IBasePresenter getPresenter() {
        return new Home_Presenter();
    }


    @Override
    public void getHomeData(Logi_bean logi_bean) {

        //加载banner图
        /*mBanner.setImages()
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {

                    }
                })
                .setDelayTime(2000)
                .isAutoPlay(true)
                .start();*/


        //tvTemperature.setText();
        //tvNotify.setText();

        //list.addAll();
        //homeAdatper.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(View v, int position) {

    }

    @OnClick({R.id.iv_msg, R.id.ll_entrance, R.id.ll_managment, R.id.ll_cost, R.id.ll_warranty, R.id.ll_visitor})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_msg:

                break;
            case R.id.ll_entrance:

                break;
            case R.id.ll_managment:

                break;
            case R.id.ll_cost:

                break;
            case R.id.ll_warranty:

                break;
            case R.id.ll_visitor:

                break;
        }
    }

}
