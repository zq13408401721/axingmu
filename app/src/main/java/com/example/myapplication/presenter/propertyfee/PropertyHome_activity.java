package com.example.myapplication.presenter.propertyfee;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.contract.propertyfee.PropertyFeeContract;

public class PropertyHome_activity extends BaseActivity implements PropertyFeeContract.View {
    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_propertyfee_home;
    }

    @Override
    public void showError(String errorMsg) {

    }

    @Override
    public void requestResult() {

    }
}
