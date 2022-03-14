package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * 县表
 */
public class County extends LitePalSupport {
    private int id;//县id
    private String countyName;//县名
    private String weatherId;//对应县天气
    private int cityId;//所属城市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityIdi) {
        this.cityId = cityIdi;
    }
}
