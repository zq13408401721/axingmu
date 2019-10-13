package com.example.myapplication.interfaces.contract.propertyfee;

import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.IBaseView;

public interface PropertyFeeContract {
    interface View extends IBaseView{
        void requestResult();
    }
    interface  Presenter extends IBasePresenter<View>{
        void requestService();
    }

}
