package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 解析和处理服务器返回数据
 */
public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);//定义JSON数组将服务器返回的数据传入数组对象中
                for (int i = 0; i < allProvinces.length(); i++) {//循环遍历这个数组
                    JSONObject provinceObject = allProvinces.getJSONObject(i);//从中去除每一个JSON对象
                    /**组装成实体类对象**/
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();//存储到数据库中
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCitys = new JSONArray(response);//定义JSON数组将服务器返回的数据传入数组对象中
                for (int i = 0; i < allCitys.length(); i++) {//循环遍历这个数组
                    JSONObject cityObject = allCitys.getJSONObject(i);//从中去除每一个JSON对象
                    /**组装成实体类对象**/
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();//存储到数据库中
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCountys = new JSONArray(response);//定义JSON数组将服务器返回的数据传入数组对象中
                for (int i = 0; i < allCountys.length(); i++) {//循环遍历这个数组
                    JSONObject CountyObject = allCountys.getJSONObject(i);//从中去除每一个JSON对象
                    /**组装成实体类对象**/
                    County county = new County();
                    county.setCountyName(CountyObject.getString("name"));
                    county.setWeatherId(CountyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();//存储到数据库中
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
