package com.fly.im.app;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Android Studio
 * User: fei.wang
 * Date: 2016-04-27
 * Time: 9:57
 * Email: 929728742@qq.com
 * Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /**初始化融云*/
        RongIM.init(this);
    }
}
