package com.example.myapplication;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;

import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.fragment.Activity_Fragment;
import com.example.myapplication.fragment.Home_Fragment;
import com.example.myapplication.fragment.My_Fragment;
import com.example.myapplication.fragment.Neighborhood_Fragment;
import com.example.myapplication.interfaces.contract.Deng_Contract;
import com.example.myapplication.presenter.SearchLan_Presenter;

import butterknife.BindView;


public class MainActivity extends BaseActivity {


    @BindView(R.id.tl)
    TabLayout mTl;
    @BindView(R.id.fl)
    FrameLayout mFl;
    private FragmentManager manager;

    @Override
    protected Deng_Contract.Presenter getPresenter() {
        return new SearchLan_Presenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initFragments() {
        manager = getSupportFragmentManager();
        mTl.addTab(mTl.newTab().setText("首页").setIcon(R.mipmap.shouye));
        mTl.addTab(mTl.newTab().setText("邻里").setIcon(R.mipmap.linli));
        mTl.addTab(mTl.newTab().setText("活动").setIcon(R.mipmap.huodong));
        mTl.addTab(mTl.newTab().setText("我的").setIcon(R.mipmap.wode));
    }

    @Override
    protected void initView() {
        addFragment(getSupportFragmentManager(), Home_Fragment.class, R.id.fl, null);
    }


    @Override
    protected void initData() {
        

    }

    @Override
    protected void initListener() {
        mTl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    addFragment(manager, Home_Fragment.class, R.id.fl, null);
                } else if (position == 1) {
                    addFragment(manager, Neighborhood_Fragment.class, R.id.fl, null);
                } else if (position == 2) {
                    addFragment(manager, Activity_Fragment.class, R.id.fl, null);
                } else if (position == 3) {
                    addFragment(manager, My_Fragment.class, R.id.fl, null);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void showError(String errorMsg) {

    }
}
