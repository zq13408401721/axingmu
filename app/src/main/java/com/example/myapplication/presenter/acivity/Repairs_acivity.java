package com.example.myapplication.presenter.acivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Repairs_acivity extends BaseActivity {

    @BindView(R.id.tt)
    TextView mTt;
    @BindView(R.id.et_describe)
    EditText mEtDescribe;
    @BindView(R.id.tv_number)
    TextView mTvNumber;
    @BindView(R.id.xian)
    TextView mXian;
    @BindView(R.id.dizhi)
    TextView mDizhi;
    @BindView(R.id.site)
    EditText mSite;
    @BindView(R.id.shijian)
    TextView mShijian;
    @BindView(R.id.time)
    EditText mTime;
    @BindView(R.id.dianhua)
    TextView mDianhua;
    private int num = 200;

    private CharSequence recording;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_repairs_acivity;
    }

    @Override
    public void showError(String errorMsg) {

    }


    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {
        mEtDescribe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                recording = s;
                int length = recording.length();
                mTvNumber.setText(length+"/"+num);
            }
        });

    }

    @Override
    protected void initData() {
        super.initData();
    }

}
