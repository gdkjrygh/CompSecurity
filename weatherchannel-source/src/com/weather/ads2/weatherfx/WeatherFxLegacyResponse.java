// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.base.Joiner;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class WeatherFxLegacyResponse
{

    private static final String TAG = "WeatherFxResponse";
    private static final String WEATHER_FX_KEY = "wfxtg";
    private final String weatherFxValue;

    WeatherFxLegacyResponse(String s)
    {
        LogUtil.d("WeatherFxResponse", LoggingMetaTags.TWC_AD, s, new Object[0]);
        weatherFxValue = determineWeatherFxValue(s);
    }

    private static String determineWeatherFxValue(String s)
    {
        String s1 = "nl";
        JSONArray jsonarray;
        ArrayList arraylist;
        int i;
        int j;
        try
        {
            jsonarray = (new JSONObject(s)).optJSONArray("wfxtg");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.d("WeatherFxResponse", LoggingMetaTags.TWC_AD, "Unable to parse legacy weather fx response: %s", new Object[] {
                s.toString()
            });
            return "nl";
        }
        s = s1;
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        j = jsonarray.length();
        arraylist = new ArrayList(j);
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Integer.valueOf(jsonarray.getInt(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s = s1;
        if (!arraylist.isEmpty())
        {
            s = Joiner.on(',').join(arraylist);
        }
        return s;
    }

    public String getWeatherFxString()
    {
        return weatherFxValue;
    }
}
