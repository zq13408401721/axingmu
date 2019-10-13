package com.example.myapplication.hous;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class HouseholdManagementActivity extends BaseActivity {
    @BindView(R.id.iv_back_household)
    ImageView ivBackHousehold;
    @BindView(R.id.tv_addmanagement_household)
    TextView tvAddmanagementHousehold;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.rv_mananagement)
    RecyclerView rvMananagement;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_household_management;
    }

    @Override
    public void showError(String errorMsg) {

    }



    @OnClick({R.id.iv_back_household, R.id.tv_addmanagement_household, R.id.rv_mananagement})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back_household:
                break;
            case R.id.tv_addmanagement_household:
                startActivity(new Intent(HouseholdManagementActivity.this,BIndHouseActivity.class));
                break;
            case R.id.rv_mananagement:
                break;
        }
    }

}
