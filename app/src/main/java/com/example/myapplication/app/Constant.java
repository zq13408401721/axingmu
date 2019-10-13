package com.example.myapplication.app;

import java.io.File;

public class Constant {

    public static final String URl = "http://sc.minxj.com/api/";

    //网络缓存的地址
    public static final String PATH_DATA = MyApp.mApp.getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/ShiXun";

    public static String token = "";
    public static String TERMINAL="a01973b3-38a2-4260-8caa-00c4b53e6d86";

}
