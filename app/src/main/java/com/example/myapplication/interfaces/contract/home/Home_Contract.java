package com.example.myapplication.interfaces.contract.home;


import com.example.myapplication.bean.Logi_bean;
import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.IBaseView;

public interface Home_Contract {

    interface View extends IBaseView {
        void getHomeData(Logi_bean logi_bean);
    }
    interface Presenter extends IBasePresenter<View> {
        void getHomeData();
    }
}
