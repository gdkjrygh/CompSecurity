// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.collect.ImmutableMap;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.ads2.weatherfx:
//            ScatterShot

final class WeatherFxResponse
{

    private static final String CURRENT_KEY = "current";
    public static final String HZCS_KEY = "hzcs";
    public static final String NZCS_KEY = "nzcs";
    public static final String SCATTER_SEGS_KEY = "scatterSegs";
    public static final String SEGMENT_KEY = "segments";
    private static final String TAG = "WeatherFxResponse";
    private static final String WEATHER_FX_KEY = "wfxtg";
    public static final String ZCS_KEY = "zcs";
    public static final String ZIP_KEY = "zip";
    private final Map scatterShotMap;
    private final String weatherFxValue;

    WeatherFxResponse(String s)
    {
        String s1;
        Object obj;
        ImmutableMap immutablemap;
        LogUtil.d("WeatherFxResponse", LoggingMetaTags.TWC_AD, s, new Object[0]);
        obj = "nl";
        immutablemap = ImmutableMap.of();
        s1 = ((String) (obj));
        JSONObject jsonobject = (new JSONObject(s)).optJSONObject("wfxtg");
        s = immutablemap;
        s1 = ((String) (obj));
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s1 = ((String) (obj));
        s = extractTokens("current", jsonobject);
        s1 = s;
        obj = extractScatterShotMap(jsonobject);
        s1 = s;
        s = ((String) (obj));
_L2:
        weatherFxValue = s1;
        scatterShotMap = s;
        return;
        s;
        EventLog.w("WeatherFxResponse", s.toString(), s);
        s = immutablemap;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String convertNullToNl(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "nl";
        }
        return s1;
    }

    private static Map extractScatterShotMap(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = jsonobject.optJSONArray("scatterSegs");
        if (obj == null)
        {
            return ImmutableMap.of();
        }
        jsonobject = extractZipCodeToSegmentMap(findArrayForField(((JSONArray) (obj)), "zcs"));
        Map map = extractZipCodeToSegmentMap(findArrayForField(((JSONArray) (obj)), "hzcs"));
        obj = extractZipCodeToSegmentMap(findArrayForField(((JSONArray) (obj)), "nzcs"));
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        Object obj1 = new HashSet();
        ((Set) (obj1)).addAll(jsonobject.keySet());
        ((Set) (obj1)).addAll(map.keySet());
        ((Set) (obj1)).addAll(((Map) (obj)).keySet());
        String s;
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); builder.put(s, new ScatterShot(convertNullToNl((String)jsonobject.get(s)), convertNullToNl((String)map.get(s)), convertNullToNl((String)((Map) (obj)).get(s)))))
        {
            s = (String)((Iterator) (obj1)).next();
        }

        return builder.build();
    }

    private static String extractTokens(String s, JSONObject jsonobject)
        throws JSONException
    {
        if (!jsonobject.has(s) || jsonobject.isNull(s))
        {
            jsonobject = "nl";
        } else
        {
            jsonobject = jsonobject.getString(s);
            s = jsonobject;
            if (jsonobject.startsWith("["))
            {
                s = jsonobject;
                if (jsonobject.endsWith("]"))
                {
                    s = jsonobject.substring(1, jsonobject.length() - 1);
                }
            }
            jsonobject = s;
            if (s.isEmpty())
            {
                return "nl";
            }
        }
        return jsonobject;
    }

    private static Map extractZipCodeToSegmentMap(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        Object obj = ImmutableMap.of();
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap(jsonarray.length());
        int i = 0;
        do
        {
            obj = hashmap;
            if (i >= jsonarray.length())
            {
                continue;
            }
            obj = jsonarray.optJSONObject(i);
            if (obj != null && ((JSONObject) (obj)).has("zip") && !((JSONObject) (obj)).isNull("zip"))
            {
                hashmap.put(((JSONObject) (obj)).getString("zip"), extractTokens("segments", ((JSONObject) (obj))));
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static JSONArray findArrayForField(JSONArray jsonarray, String s)
    {
        for (int i = 0; i < jsonarray.length(); i++)
        {
            JSONObject jsonobject = jsonarray.optJSONObject(i);
            if (jsonobject != null && jsonobject.has(s))
            {
                return jsonobject.optJSONArray(s);
            }
        }

        return null;
    }

    public Map getScatterShotMap()
    {
        return ImmutableMap.copyOf(scatterShotMap);
    }

    public String getWeatherFxString()
    {
        return weatherFxValue;
    }
}
