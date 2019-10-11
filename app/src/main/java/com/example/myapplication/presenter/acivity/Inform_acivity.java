package com.example.myapplication.presenter.acivity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.fragment.information.Broadcast_Fragment;
import com.example.myapplication.fragment.information.Inform_Fragment;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Inform_acivity extends BaseActivity {


    @BindView(R.id.inform)
    TextView mInform;
    @BindView(R.id.broadcast)
    TextView mBroadcast;
    private FragmentManager manager;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_inform_acivity;
    }

    @Override
    protected void initView() {
        manager = getSupportFragmentManager();
        addFragment(getSupportFragmentManager(), Inform_Fragment.class,R.id.fl_Inform,null);

    }

    @Override
    protected void initListener() {
        mInform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(getSupportFragmentManager(), Inform_Fragment.class,R.id.fl_Inform,null);
            }
        });
        mBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment(getSupportFragmentManager(), Broadcast_Fragment.class,R.id.fl_Inform,null);
            }
        });
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    public void showError(String errorMsg) {

    }
}
