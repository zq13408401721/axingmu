package com.example.myapplication.hous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BIndHouseActivity extends BaseActivity {


    @BindView(R.id.iv_back_household)
    ImageView ivBackHousehold;
    @BindView(R.id.tv_atte)
    TextView tvAtte;
    @BindView(R.id.tv_attename)
    TextView tvAttename;
    @BindView(R.id.tv_mobile)
    TextView tvMobile;
    @BindView(R.id.tv_identity)
    TextView tvIdentity;
    @BindView(R.id.tv_building)
    TextView tvBuilding;
    @BindView(R.id.tv_unit)
    TextView tvUnit;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_bind_house;
    }

    @Override
    public void showError(String errorMsg) {

    }



    @OnClick({R.id.iv_back_household, R.id.tv_building})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back_household:
                break;
            case R.id.tv_building://楼宇选择
                startActivity(new Intent(BIndHouseActivity.this,BuildingActivity.class));
                break;
        }
    }
}
