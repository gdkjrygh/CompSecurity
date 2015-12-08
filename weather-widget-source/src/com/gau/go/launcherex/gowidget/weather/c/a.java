// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.gtp.a.a.a.c;
import com.jiubang.goweather.a.e;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{

    private static final String a = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/GOLauncherEX/GoWeatherWidget/cache/key_go_weather_data_cache").toString();

    public static com.jiubang.goweather.a.a a(Context context)
    {
        Object obj = null;
        String s = b(context);
        context = obj;
        if (!TextUtils.isEmpty(s))
        {
            context = a(s);
        }
        return context;
    }

    private static com.jiubang.goweather.a.a a(String s)
    {
        Object obj = null;
        com.jiubang.goweather.a.a a1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                s = new JSONObject(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = null;
            }
            a1 = obj;
            if (s != null)
            {
                com.jiubang.goweather.a.a a2 = a(((JSONObject) (s)));
                a1 = a2;
                if (a2 != null)
                {
                    a(((JSONObject) (s)), a2);
                    a1 = a2;
                }
            }
        }
        return a1;
    }

    private static com.jiubang.goweather.a.a a(JSONObject jsonobject)
    {
label0:
        {
            Object obj = null;
            JSONObject jsonobject1 = jsonobject.optJSONObject("city");
            jsonobject = obj;
            if (jsonobject1 != null)
            {
                jsonobject = jsonobject1.optString("cityId");
                Object obj1 = jsonobject1.optString("city");
                if (TextUtils.isEmpty(jsonobject) || TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    break label0;
                }
                obj1 = new com.jiubang.goweather.a.a(((String) (obj1)), jsonobject, 0L);
                Object obj2 = jsonobject1.optString("state");
                jsonobject = ((JSONObject) (obj2));
                if (TextUtils.isEmpty(((CharSequence) (obj2))))
                {
                    jsonobject = "--";
                }
                ((com.jiubang.goweather.a.a) (obj1)).a(jsonobject);
                obj2 = jsonobject1.optString("country");
                jsonobject = ((JSONObject) (obj2));
                if (TextUtils.isEmpty(((CharSequence) (obj2))))
                {
                    jsonobject = "--";
                }
                ((com.jiubang.goweather.a.a) (obj1)).b(jsonobject);
                ((com.jiubang.goweather.a.a) (obj1)).f((int)jsonobject1.optLong("timeZone", -10000L));
                jsonobject = jsonobject1.optString("latlng");
                ((com.jiubang.goweather.a.a) (obj1)).a(-10000F);
                ((com.jiubang.goweather.a.a) (obj1)).b(-10000F);
                int i;
                if (!TextUtils.isEmpty(jsonobject))
                {
                    try
                    {
                        jsonobject = jsonobject.split(",");
                        if (jsonobject.length == 2)
                        {
                            ((com.jiubang.goweather.a.a) (obj1)).a(Float.valueOf(jsonobject[0]).floatValue());
                            ((com.jiubang.goweather.a.a) (obj1)).b(Float.valueOf(jsonobject[1]).floatValue());
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONObject jsonobject)
                    {
                        jsonobject.printStackTrace();
                    }
                }
                if (jsonobject1.optBoolean("hasRadar", false))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                ((com.jiubang.goweather.a.a) (obj1)).a(i);
                if (jsonobject1.optBoolean("hasSatellite", false))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                ((com.jiubang.goweather.a.a) (obj1)).b(i);
                jsonobject = new double[2];
                JSONObject _tmp = jsonobject;
                jsonobject[0] = -10000D;
                jsonobject[1] = -10000D;
                obj2 = jsonobject1.optJSONArray("northeast");
                if (obj2 != null && ((JSONArray) (obj2)).length() == 2)
                {
                    try
                    {
                        jsonobject[0] = Double.valueOf(String.valueOf(((JSONArray) (obj2)).get(0))).doubleValue();
                        jsonobject[1] = Double.valueOf(String.valueOf(((JSONArray) (obj2)).get(1))).doubleValue();
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        numberformatexception.printStackTrace();
                    }
                    catch (JSONException jsonexception)
                    {
                        jsonexception.printStackTrace();
                    }
                    if (jsonobject[0] != -10000D && jsonobject[1] != -10000D)
                    {
                        ((com.jiubang.goweather.a.a) (obj1)).a(jsonobject);
                    }
                }
                jsonobject = new double[2];
                JSONObject _tmp1 = jsonobject;
                jsonobject[0] = -10000D;
                jsonobject[1] = -10000D;
                obj2 = jsonobject1.optJSONArray("southwest");
                if (obj2 != null && ((JSONArray) (obj2)).length() == 2)
                {
                    try
                    {
                        jsonobject[0] = Double.valueOf(String.valueOf(((JSONArray) (obj2)).get(0))).doubleValue();
                        jsonobject[1] = Double.valueOf(String.valueOf(((JSONArray) (obj2)).get(1))).doubleValue();
                    }
                    catch (NumberFormatException numberformatexception1)
                    {
                        numberformatexception1.printStackTrace();
                    }
                    catch (JSONException jsonexception1)
                    {
                        jsonexception1.printStackTrace();
                    }
                    if (jsonobject[0] != -10000D && jsonobject[1] != -10000D)
                    {
                        ((com.jiubang.goweather.a.a) (obj1)).b(jsonobject);
                    }
                }
                jsonobject = ((JSONObject) (obj1));
            }
            return jsonobject;
        }
        return null;
    }

    private static void a(JSONObject jsonobject, com.jiubang.goweather.a.a a1)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("current");
        if (jsonobject1 != null)
        {
            e e1 = new e();
            a1.g = e1;
            a1 = jsonobject1.optString("status");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.d(jsonobject);
            int j = jsonobject1.optInt("statusType");
            int i = j;
            if (j == -10000)
            {
                i = 1;
            }
            e1.h(i);
            e1.i((float)jsonobject1.optDouble("realTemp", -10000D));
            e1.b((float)jsonobject1.optDouble("feelLike", -10000D));
            e1.i(jsonobject1.optInt("humidity", -10000));
            e1.g((float)jsonobject1.optDouble("high", -10000D));
            e1.h((float)jsonobject1.optDouble("low", -10000D));
            a1 = jsonobject1.optString("windDir");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.c(jsonobject);
            e1.f(jsonobject1.optInt("windDirType", 1));
            e1.a((float)jsonobject1.optDouble("windStrengthInt", -10000D));
            e1.c((float)jsonobject1.optDouble("visibility", -10000D));
            e1.d((float)jsonobject1.optDouble("barometer", -10000D));
            e1.e((float)jsonobject1.optDouble("dewpoint", -10000D));
            a1 = jsonobject1.optString("sunrise");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.a(jsonobject);
            a1 = jsonobject1.optString("sunset");
            jsonobject = a1;
            if (TextUtils.isEmpty(a1))
            {
                jsonobject = "--";
            }
            e1.b(jsonobject);
            e1.f((float)jsonobject1.optDouble("uvIndex", -10000D));
            e1.g(jsonobject1.optInt("pop", -10000));
            e1.j((float)jsonobject1.optDouble("rainfall", -10000D));
        }
    }

    private static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static String b(Context context)
    {
        Object obj = null;
        if (a())
        {
            context = obj;
            if ((new File(a)).exists())
            {
                byte abyte0[] = com.gtp.a.a.a.c.a(a);
                context = obj;
                if (abyte0 != null)
                {
                    context = new String(abyte0);
                }
            }
        } else
        {
            Context context1;
            try
            {
                context1 = context.createPackageContext("com.gau.go.launcherex", 2);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                context1 = null;
            }
            context = obj;
            if (context1 != null)
            {
                return context1.getSharedPreferences("name_sharedpreferences_weather_data_cache", 1).getString("key_go_weather_data_cache", null);
            }
        }
        return context;
    }

    public static int[] c(Context context)
    {
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = -1;
        ai[1] = -1;
        try
        {
            context = context.createPackageContext("com.gau.go.launcherex", 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        if (context != null)
        {
            context = context.getSharedPreferences("name_sharedpreferences_weather_data_cache", 1);
            ai[0] = context.getInt("key_go_weather_tempunit_value", -1);
            ai[1] = context.getInt("key_go_weather_date_format_value", -1);
        }
        return ai;
    }

}
