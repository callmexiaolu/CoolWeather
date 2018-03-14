package com.example.mrlu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.ic_lu on 2018/3/14.
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
