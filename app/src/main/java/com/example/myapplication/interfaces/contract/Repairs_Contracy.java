package com.example.myapplication.interfaces.contract;

import com.example.myapplication.bean.DictBean;
import com.example.myapplication.interfaces.IBasePresenter;
import com.example.myapplication.interfaces.IBaseView;

/**
 */
public interface Repairs_Contracy  {
    interface View extends IBaseView {
        void getDictDataInfo(DictBean dictBean);
    }
    interface Presenter extends IBasePresenter<View>{
        void getDictData(String sign);
    }
}
