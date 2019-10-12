package com.example.myapplication.view;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 门禁钥匙
 * 扫码开门
 */
public class Entrance_GuardActivity extends BaseActivity {

    @BindView(R.id.iv_entrance_ground_back)
    ImageView ivEntranceGroundBack;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_entrance__guard;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }


    @Override
    public void showError(String errorMsg) {

    }


    @OnClick(R.id.iv_entrance_ground_back)
    public void onViewClicked() {
        finish();
    }
}
