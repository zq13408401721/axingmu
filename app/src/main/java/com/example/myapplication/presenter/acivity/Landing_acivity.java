package com.example.myapplication.presenter.acivity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.fragment.landing.Landing_Fragment;
import com.example.myapplication.fragment.landing.Verification_Fragment;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Landing_acivity extends BaseActivity {


    @BindView(R.id.color)
    Toolbar mColor;
    @BindView(R.id.background)
    ImageView mBackground;
    @BindView(R.id.fl_landing)
    FrameLayout mFlLanding;
    @BindView(R.id.tv_verificatiom)
    TextView mTvVerificatiom;
    @BindView(R.id.tv_passage)
    TextView mTvPassage;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_landing;
    }

    @Override
    protected void initFragments() {
        addFragment(getSupportFragmentManager(), Verification_Fragment.class, R.id.fl_landing, null);
    }

    @Override
    protected void initView() {
        mTvPassage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(getSupportFragmentManager(), Landing_Fragment.class, R.id.fl_landing, null);
            }
        });
        mTvVerificatiom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(getSupportFragmentManager(), Verification_Fragment.class, R.id.fl_landing, null);
            }
        });
    }

    @Override
    public void showError(String errorMsg) {

    }
}
