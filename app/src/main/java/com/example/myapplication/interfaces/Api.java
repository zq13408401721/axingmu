package com.example.myapplication.interfaces;


import com.example.myapplication.bean.DictBean;
import com.example.myapplication.bean.Logi_bean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {
    //https://www.wanandroid.com/catalog/index
    @GET("article/list/0/json")
    Flowable<Logi_bean> getdata_search();
    //获取公共配置宝典接口
    @FormUrlEncoded
    @POST("dict")
    @Headers({"device-id:a01973b3-38a2-4260-8caa-00c4b53e6d86"})
    Flowable<DictBean> getdata_dict(@Field("sign")String sign);

}


