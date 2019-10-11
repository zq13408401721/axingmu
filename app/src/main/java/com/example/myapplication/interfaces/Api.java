package com.example.myapplication.interfaces;


import com.example.myapplication.bean.Logi_bean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface Api {
    //https://www.wanandroid.com/catalog/index
    @GET("article/list/0/json")
    Flowable<Logi_bean> getdata_search();



}


