// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;


public class b
{

    public static final String a;

    public static String[] a()
    {
        return (new String[] {
            "cityId", "cityName", "updateTime", "nowTempValue", "highTempValue", "lowTempValue", "humidityValue", "type", "nowDesp", "windType", 
            "windDirection", "windStrength", "windStrengthValue", "visibilityValue", "barometerValue", "dewpointValue", "uvIndexValue", "sunrise", "sunset", "sequence", 
            "city_my_location", "tz_offset", "feelslikeValue", "pop", "state", "country", "_id", "oldCityId", "timestamp", "rainFall", 
            "aqi", "qualityType", "pm25", "pm10", "so2", "no2", "latitude", "longitude", "hasRadar", "hasSatellite", 
            "northeast", "southwest", "golife", "radar_map_url"
        });
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CREATE TABLE IF NOT EXISTS citynow");
        stringbuilder.append(" (_id INTEGER PRIMARY KEY, ");
        stringbuilder.append("oldCityId TEXT, ");
        stringbuilder.append("cityType INTEGER, ");
        stringbuilder.append("nowTemp TEXT, ");
        stringbuilder.append("highTemp TEXT, ");
        stringbuilder.append("lowTemp TEXT, ");
        stringbuilder.append("humidity TEXT, ");
        stringbuilder.append("windStrengthInt INTEGER, ");
        stringbuilder.append("visibility TEXT, ");
        stringbuilder.append("barometer TEXT, ");
        stringbuilder.append("dewpoint TEXT, ");
        stringbuilder.append("uvIndex TEXT, ");
        stringbuilder.append("myLocation INTEGER, ");
        stringbuilder.append("language INTEGER, ");
        stringbuilder.append("wind INTEGER, ");
        stringbuilder.append("feels_like INTEGER, ");
        stringbuilder.append("cityId TEXT, ");
        stringbuilder.append("cityName TEXT, ");
        stringbuilder.append("updateTime INTEGER, ");
        stringbuilder.append("type INTEGER, ");
        stringbuilder.append("nowDesp TEXT, ");
        stringbuilder.append("windType INTEGER, ");
        stringbuilder.append("windDirection TEXT, ");
        stringbuilder.append("windStrength TEXT, ");
        stringbuilder.append("sunrise TEXT, ");
        stringbuilder.append("sunset TEXT, ");
        stringbuilder.append("sequence INTEGER, ");
        stringbuilder.append("city_my_location INTEGER, ");
        stringbuilder.append("tz_offset INTEGER, ");
        stringbuilder.append("pop INTEGER, ");
        stringbuilder.append("rainFall REAL, ");
        stringbuilder.append("state TEXT, ");
        stringbuilder.append("country TEXT, ");
        stringbuilder.append("nowTempValue REAL, ");
        stringbuilder.append("highTempValue REAL, ");
        stringbuilder.append("lowTempValue REAL, ");
        stringbuilder.append("humidityValue INTEGER, ");
        stringbuilder.append("windStrengthValue REAL, ");
        stringbuilder.append("visibilityValue REAL, ");
        stringbuilder.append("barometerValue REAL, ");
        stringbuilder.append("dewpointValue REAL, ");
        stringbuilder.append("uvIndexValue REAL, ");
        stringbuilder.append("feelslikeValue REAL, ");
        stringbuilder.append("timestamp INTEGER, ");
        stringbuilder.append("aqi INTEGER, ");
        stringbuilder.append("qualityType INTEGER, ");
        stringbuilder.append("pm25 INTEGER, ");
        stringbuilder.append("pm10 INTEGER, ");
        stringbuilder.append("so2 INTEGER, ");
        stringbuilder.append("no2 INTEGER, ");
        stringbuilder.append("latitude TEXT, ");
        stringbuilder.append("longitude TEXT, ");
        stringbuilder.append("hasRadar INTEGER, ");
        stringbuilder.append("hasSatellite INTEGER, ");
        stringbuilder.append("northeast TEXT, ");
        stringbuilder.append("southwest TEXT, ");
        stringbuilder.append("cityJsonString TEXT, ");
        stringbuilder.append("golife TEXT, ");
        stringbuilder.append("radar_map_url TEXT)");
        a = stringbuilder.toString();
    }
}
