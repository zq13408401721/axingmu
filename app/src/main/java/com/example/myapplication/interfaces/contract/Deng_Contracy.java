package com.example.myapplication.interfaces.contract;


import com.example.myapplication.bean.Logi_bean;
import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.IBaseView;

import okhttp3.RequestBody;

public interface Deng_Contracy {
    interface View extends IBaseView {
        void getdata_deng(Logi_bean logi_bean);
    }
    interface Presenter extends IBasePresenter<View> {
        void getData_deng();
    }
}
