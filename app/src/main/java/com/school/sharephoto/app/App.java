package com.school.sharephoto.app;

import android.app.Application;

import cn.alien95.resthttp.request.RestHttp;


/**
 * Created by linlongxin on 2016/1/27.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RestHttp.initialize(this);



    }
}
