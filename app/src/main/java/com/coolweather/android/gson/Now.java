package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 现在天气情况类
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
