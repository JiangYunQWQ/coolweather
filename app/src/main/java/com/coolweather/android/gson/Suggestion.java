package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 建议类
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    //舒适情况
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    //洗车
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    //运动
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
