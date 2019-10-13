package com.example.myapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.interfaces.IBasePresenter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class Home_Fragment extends BaseFragment {

    @BindView(R.id.weather)
    ImageView mWeather;
    @BindView(R.id.tb)
    Toolbar mTb;
    @BindView(R.id.banner)
    Banner mBanner;
    @BindView(R.id.ll_iv)
    LinearLayout mLlIv;
    /*@BindView(R.id.visible)
    LinearLayout mVisible;*/
    @BindView(R.id.tongzhi)
    ImageView mTongzhi;
    @BindView(R.id.latest)
    TextView mLatest;
    @BindView(R.id.iv_tu)
    ImageView mIvTu;
    @BindView(R.id.tv_titl)
    TextView mTvTitl;
    @BindView(R.id.titl1)
    TextView mTitl1;
    @BindView(R.id.ll_title)
    RelativeLayout mLlTitle;
    @BindView(R.id.iv_tu1)
    ImageView mIvTu1;
    @BindView(R.id.title1)
    TextView mTitle1;
    @BindView(R.id.title2)
    TextView mTitle2;
    @BindView(R.id.entrance)
    TextView mEntrance;
    @BindView(R.id.managment)
    TextView mManagment;
    @BindView(R.id.cost)
    TextView mCost;
    @BindView(R.id.warranty)
    TextView mWarranty;
    private View view;
    private Unbinder unbinder;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_;

    }

    @Override
    protected void initView() {
        final ArrayList<Integer> imageViews = new ArrayList<>();
        imageViews.add(R.mipmap.banner);
        imageViews.add(R.mipmap.banner1);
        imageViews.add(R.mipmap.banner2);
        mBanner.setImages(imageViews);
        mBanner.setImageLoader(new imaApp());
        mBanner.setDelayTime(2000);
        mBanner.isAutoPlay(true);
        mBanner.start();
    }

    @Override
    protected void initListener() {
        mManagment.setOnClickListener(new View.OnClickListener() {

            private View inflate;

            @Override
            public void onClick(View v) {
                inflate = getLayoutInflater().inflate(R.layout.popupwindow, null);
                PopupWindow popupWindow = new PopupWindow(inflate,50,50);
                popupWindow.showAsDropDown(mBanner);
            }
        });
    }

    public class imaApp extends ImageLoader {

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load(path).into(imageView);
        }
    }
}
