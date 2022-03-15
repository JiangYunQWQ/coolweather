package com.coolweather.android.gson;

/**
 * 空气质量指数类
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
