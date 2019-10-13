package com.example.myapplication.presenter.home;


import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.bean.Logi_bean;
import com.example.myapplication.interfaces.contract.Deng_Contracy;
import com.example.myapplication.interfaces.contract.home.Home_Contract;
import com.example.myapplication.utils.CommonSubscriber;
import com.example.myapplication.utils.HttpUtils;
import com.example.myapplication.utils.RxUtils;

public class Home_Presenter extends BasePresenter<Home_Contract.View> implements Home_Contract.Presenter {


    @Override
    public void getHomeData() {
        addSubscribe(HttpUtils.getMyServer().getdata_search()
                .compose(RxUtils.<Logi_bean>rxScheduler())
                .subscribeWith(new CommonSubscriber<Logi_bean>(mView) {
                    @Override
                    public void onNext(Logi_bean logi_bean) {
                        if (logi_bean != null) {
                            if (mView != null) {
                                mView.getHomeData(logi_bean);
                            }
                        }
                    }
                }));
    }
}
