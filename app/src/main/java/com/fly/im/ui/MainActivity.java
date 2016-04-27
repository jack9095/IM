package com.fly.im.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.fly.im.R;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

/**
 * Created by Android Studio
 * User: fei.wang
 * Date: 2016-04-27
 * Time: 9:57
 * Email: 929728742@qq.com
 *      http://www.rongcloud.cn/docs/android.html
 *      https://developer.rongcloud.cn/apitool/KX41uPV7JTYS/vZXbnc=
 * Description:
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // aa   fei
//        String token = "mcyirV+awRtXGpfzRQ+r8W8UE5JLEIkk2tyQWS/pglFI7z9DpQvy1NvAh3CSGMb+w/Jnm92xEHzB3zVj6g1kEw==";

        // bb   fly
        String token = "KjFNhXvaCz9/URSJYLaCZGJSv5f9Ptw0SwgASX6mKNb1haP8j/waWLw9+3vlqOdPw05D96bJO+Y=";
        RongIM.connect(token, new RongIMClient.ConnectCallback() {

            @Override
            public void onSuccess(String userId) {
                Log.e("MainActivity", "——onSuccess—-" + userId);
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Log.e("MainActivity", "——onError—-" + errorCode);
            }

            @Override
            public void onTokenIncorrect() {
                //Connect Token 失效的状态处理，需要重新获取 Token
            }
        });


        /**
         * 启动单聊
         * context - 应用上下文。
         * targetUserId - 要与之聊天的用户 Id。
         * title - 聊天的标题，如果传入空值，则默认显示与之聊天的用户名称。
         */
        if (RongIM.getInstance() != null) {
            RongIM.getInstance().startPrivateChat(MainActivity.this, "aa", "");
        }

    }
}
