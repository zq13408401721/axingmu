package com.example.myapplication.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.bean.DictBean;
import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.contract.Repairs_Contracy;
import com.example.myapplication.utils.MD5Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RepairsActivity extends BaseActivity implements Repairs_Contracy.View {
    @BindView(R.id.repairs_back)
    ImageView repairsBack;
    @BindView(R.id.repairs_tablayout)
    TabLayout repairsTablayout;
    @BindView(R.id.tt)
    TextView tt;
    @BindView(R.id.et_describe)
    EditText etDescribe;
    @BindView(R.id.tv_number)
    TextView tvNumber;
    @BindView(R.id.xian)
    TextView xian;
    @BindView(R.id.dizhi)
    TextView dizhi;
    @BindView(R.id.site)
    EditText site;
    @BindView(R.id.shijian)
    TextView shijian;
    @BindView(R.id.time)
    EditText time;
    @BindView(R.id.dianhua)
    TextView dianhua;
    private String sign;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_repairs_acivity;
    }

    @Override
    protected void initView() {
        sign = MD5Utils.MD5Encode("m$c2Bk3kb^J$7MDE", "utf8").toUpperCase();
    }

    @Override
    protected void initData() {
        ((RepairsPresenter)mPresenter).getDictData(sign);
    }



    @Override
    protected IBasePresenter getPresenter() {
        return new RepairsPresenter();
    }

    @Override
    public void getDictDataInfo(DictBean dictBean) {
        ArrayList<String> strings = new ArrayList<>();
        List<DictBean.DataBean.RepairBean> repair = dictBean.getData().getRepair();
        for (int i = 0; i < repair.size(); i++) {
            String name = repair.get(i).getName();
            strings.add(name);
        }
        for (int i = 0; i < repair.size(); i++) {
            repairsTablayout.addTab(repairsTablayout.newTab().setText(strings.get(i)));
        }
    }

    @Override
    public void showError(String errorMsg) {

    }
}
