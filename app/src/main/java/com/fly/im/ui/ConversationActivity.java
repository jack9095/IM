package com.fly.im.ui;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fly.im.R;

/**
 * Created by Android Studio
 * User: fei.wang
 * Date: 2016-04-27
 * Time: 9:57
 * Email: 929728742@qq.com
 * Description: 会话页面
 */
public class ConversationActivity extends AppCompatActivity {

    private static final String TAG = ConversationActivity.class.getSimpleName();

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
    }
}
