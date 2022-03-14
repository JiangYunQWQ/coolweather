package com.coolweather.android.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Http工具类
 */
public class HttpUtil {
    /**
     * 发送请求
     * @param address 请求的URL地址
     * @param callback OkHttp库自带的回调接口
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();//获取客户对象实例化
        Request request = new Request.Builder().url(address).build();//获取一个请求对象实例化，并传入url地址
        client.newCall(request).enqueue(callback);//将请求和回调传入注册机
    }
}
