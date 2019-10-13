package com.example.myapplication.view;

import com.example.myapplication.base.BasePresenter;
import com.example.myapplication.bean.DictBean;
import com.example.myapplication.interfaces.contract.Repairs_Contracy;
import com.example.myapplication.utils.CommonSubscriber;
import com.example.myapplication.utils.HttpUtils;
import com.example.myapplication.utils.RxUtils;

/**
 *
 */
public class RepairsPresenter extends BasePresenter<Repairs_Contracy.View> implements Repairs_Contracy.Presenter {
    @Override
    public void getDictData(String sign) {
        addSubscribe(HttpUtils.getMyServer().getdata_dict(sign)
                .compose(RxUtils.<DictBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<DictBean>(mView) {
                    @Override
                    public void onNext(DictBean dictBean) {
                        mView.getDictDataInfo(dictBean);
                    }
                }));
    }
}
