package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 基本信息类
 */
public class Basic {
    @SerializedName("city")//序列号名称转换
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    //更新时间
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
