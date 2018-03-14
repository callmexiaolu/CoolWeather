package com.example.mrlu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Mr.ic_lu on 2018/3/14.
 */

public class Weather {

    public String status;//若为OK则从接口接收天气信息成功

    public Basic basic;//当前城市和天气更新时间

    public AQI aqi;//空气状况

    public Now now;//当前天气

    public Suggestion suggestion;//天气建议

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;//未来的天气信息
}
