package com.example.cjlkbxt.rn_into_native.module;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by cjlkbxt on 2018/12/11.
 */

public class MyNativeModule extends ReactContextBaseJavaModule {

    private ReactApplicationContext mContext;

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @Override
    public String getName() {
        //rn代码需要这个名字来调用该类的方法
        return "MyNativeModule";
    }

    //函数不能有返回值，因为被调用的原生代码是异步的；原生代码执行结束之后只能通过回调函数或者发送消息给rn侧
    @ReactMethod
    public void rnCallNative(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
