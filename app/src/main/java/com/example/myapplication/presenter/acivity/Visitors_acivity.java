package com.example.myapplication.presenter.acivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Visitors_acivity extends BaseActivity {

    @BindView(R.id.toob_fangke)
    Toolbar mToobFangke;
    @BindView(R.id.fangke)
    TextView mFangke;
    @BindView(R.id.dianhua)
    TextView mDianhua;
    @BindView(R.id.shuliang)
    TextView mShuliang;
    @BindView(R.id.tv_fangshi)
    TextView mTvFangshi;
    @BindView(R.id.dpPicker)
    DatePicker mDpPicker;
    @BindView(R.id.ll_date)
    LinearLayout mLlDate;
    @BindView(R.id.yuanyin)
    TextView mYuanyin;
    @BindView(R.id.et_cause)
    EditText mEtCause;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_visitors_acivity;
    }

    @Override
    protected void initView() {
        mDpPicker.init(2013, 8, 20, new DatePicker.OnDateChangedListener() {

                     @Override
             public void onDateChanged(DatePicker view, int year,
                    int monthOfYear, int dayOfMonth) {
                                 // 获取一个日历对象，并初始化为当前选中的时间
                                 Calendar calendar = Calendar.getInstance();
                                 calendar.set(year, monthOfYear, dayOfMonth);
                             }
         });
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void showError(String errorMsg) {

    }
}