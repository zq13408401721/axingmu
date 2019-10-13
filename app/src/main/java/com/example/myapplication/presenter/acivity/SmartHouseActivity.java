package com.example.myapplication.presenter.acivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SmartHouseActivity extends AppCompatActivity {

    @BindView(R.id.iv_back_smartHouse)
    ImageView ivBackSmartHouse;
    @BindView(R.id.iv_switch)
    ImageView ivSwitch;
    @BindView(R.id.tv_house_num)
    TextView tvHouseNum;
    @BindView(R.id.tv_goHome)
    TextView tvGoHome;
    @BindView(R.id.tv_leaveHome)
    TextView tvLeaveHome;
    @BindView(R.id.tv_diNuan)
    TextView tvDiNuan;
    @BindView(R.id.tv_xinFeng)
    TextView tvXinFeng;
    @BindView(R.id.tab_smart)
    TabLayout tabSmart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_house);
        ButterKnife.bind(this);
        initView();
    }

    private void initView(){
        tabSmart.setSelectedTabIndicatorHeight(0);
        tabSmart.setTabRippleColor(ColorStateList.valueOf(this.getResources().getColor(R.color.white)));
        tabSmart.addTab(tabSmart.newTab().setCustomView(setTabItem(R.string.keting,R.drawable.selector_smart_house_keting)));
        tabSmart.addTab(tabSmart.newTab().setCustomView(setTabItem(R.string.canting,R.drawable.selector_smart_house_canting)));
        tabSmart.addTab(tabSmart.newTab().setCustomView(setTabItem(R.string.zhuwo,R.drawable.selector_smart_house_zhuwo)));
        tabSmart.addTab(tabSmart.newTab().setCustomView(setTabItem(R.string.ciwo,R.drawable.selector_smart_house_ciwo)));
        tabSmart.addTab(tabSmart.newTab().setCustomView(setTabItem(R.string.ertongfang,R.drawable.selector_smart_house_ertongfang)));
        tabSmart.addTab(tabSmart.newTab().setCustomView(setTabItem(R.string.shufang,R.drawable.selector_smart_house_shufang)));
    }
    private View setTabItem(int title,int icon){
        View view = LayoutInflater.from(this).inflate(R.layout.layout_smart_house_tab, null);
        ImageView ivSmartPlace = view.findViewById(R.id.iv_smart_place);
        TextView tvSmartPlace = view.findViewById(R.id.tv_smart_place);
        ivSmartPlace.setBackgroundResource(icon);
        tvSmartPlace.setText(title);
        return view;
    }
    @OnClick({R.id.tv_goHome, R.id.tv_leaveHome, R.id.tv_diNuan, R.id.tv_xinFeng})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_goHome:
                break;
            case R.id.tv_leaveHome:
                break;
            case R.id.tv_diNuan:
                break;
            case R.id.tv_xinFeng:
                break;
        }
    }
}
