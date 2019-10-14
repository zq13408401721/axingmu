package com.example.myapplication.presenter;


import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.bean.Logi_bean;
import com.example.myapplication.interfaces.contract.Deng_Contract;
import com.example.myapplication.utils.CommonSubscriber;
import com.example.myapplication.utils.HttpUtils;
import com.example.myapplication.utils.RxUtils;

public class SearchLan_Presenter extends BasePresenter<Deng_Contract.View> implements Deng_Contract.Presenter {


    @Override
    public void getData_deng() {
        addSubscribe(HttpUtils.getMyServer().getdata_search().compose(RxUtils.<Logi_bean>rxScheduler()).subscribeWith(new CommonSubscriber<Logi_bean>(mView) {
            @Override
            public void onNext(Logi_bean logi_bean) {
                if (logi_bean != null) {
                    if (mView != null) {
                        mView.getdata_deng(logi_bean);
                    }
                }
            }
        }));
    }

}
