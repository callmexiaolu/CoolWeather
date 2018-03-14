package com.example.mrlu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.ic_lu on 2018/3/14.
 */

public class Basic {

    @SerializedName("city")
    /*由于JSON中一些字段可能不太适合直接作为JAVA字段来命名,
    因此使用@SerializedName注解的方式来让JSON字段和JAVA字段之间建立映射关系*/
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
