// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.g;
import com.gau.go.launcherex.gowidget.statistics.i;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x
{

    public static List a(Context context, Location location, f f1, String s)
    {
        Object obj1 = null;
        Object obj = null;
        e e1 = new e("http://goweatherex.3g.cn/goweatherex/city/gps");
        c.a("LJL", (new StringBuilder()).append(location.getLatitude()).append("---").append(location.getLongitude()).toString());
        e1.a("latlng", (new StringBuilder()).append(location.getLatitude()).append(",").append(location.getLongitude()).toString());
        e1.a("lang", s);
        e1.a("sys", android.os.Build.VERSION.RELEASE);
        e1.a("ps", "2.0");
        e1.a("chan", String.valueOf(100));
        e1.a("cliId", w.v(context));
        e1.a("gliId", com.gau.go.a.e.b(context));
        e1.a("chanId", w.f(context));
        try
        {
            s = e1.i();
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            f1.a(location);
            if (c.a())
            {
                location.printStackTrace();
            }
            s = null;
        }
        location = obj1;
        if (s != null)
        {
            com.jiubang.goweather.b.c c1 = d.a();
            location = obj1;
            if (c1.a(f1, context))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u670D\u52A1\u5668\u5B9A\u4F4D\uFF1A").append(s).toString(), "location.txt");
                c.a("Location", (new StringBuilder()).append("\u670D\u52A1\u5668\u5B9A\u4F4D\uFF1A").append(s).toString());
                f1.d(2);
                f1.a(SystemClock.elapsedRealtime());
                String s1 = c1.b(s, e1, f1);
                f1.b(SystemClock.elapsedRealtime());
                if (s1 != null)
                {
                    f1.b(s1);
                    f1.c(SystemClock.elapsedRealtime());
                    com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u670D\u52A1\u5668\u5B9A\u4F4D\u7ED3\u679C\uFF1A").append(s1).toString(), "location.txt");
                    c.a("Location", (new StringBuilder()).append("\u670D\u52A1\u5668\u5B9A\u4F4D\u7ED3\u679C\uFF1A").append(s1).toString());
                    location = new ArrayList();
                    a(((List) (location)), s1, true, f1, s);
                    f1.d(SystemClock.elapsedRealtime());
                } else
                {
                    com.gtp.a.a.a.a.a().a("\u670D\u52A1\u5668\u5B9A\u4F4D\u5931\u8D25", "location.txt");
                    c.a("Location", "\u670D\u52A1\u5668\u5B9A\u4F4D\u5931\u8D25");
                    location = obj;
                }
                i.a(context).a(f1);
            }
        }
        (new g(context)).c(s, f1);
        return location;
    }

    private static void a(List list, String s, boolean flag, f f1, String s1)
    {
        JSONObject jsonobject1;
        int j;
        int l;
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            f1.b(11);
            f1.c(10);
            f1.a(s);
            if (c.a())
            {
                s.printStackTrace();
            }
            s = null;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = s.optJSONObject("head");
        j = jsonobject.optInt("result", -1);
        f1.e(jsonobject.optInt("costTime", 0));
        if (j != 1) goto _L4; else goto _L3
_L3:
        f1.b(1);
        s = s.optJSONArray("cities");
        if (s == null) goto _L2; else goto _L5
_L5:
        l = s.length();
        j = 0;
_L11:
        if (j >= l) goto _L2; else goto _L6
_L6:
        f1 = new CityBean();
        jsonobject1 = s.optJSONObject(j);
        if (jsonobject1 == null) goto _L8; else goto _L7
_L7:
        f1.a(jsonobject1.optString("cityId", "--"));
        f1.b(jsonobject1.optString("city", "--"));
        f1.g(jsonobject1.optString("oldId", "--"));
        f1.d(jsonobject1.optString("state", "--"));
        f1.c(jsonobject1.optString("country", "--"));
        f1.e(jsonobject1.optString("timeZone", "--"));
        f1.h(s1);
        String s2 = jsonobject1.optString("latlng");
        f1.a(-10000F);
        f1.b(-10000F);
        int k;
        if (!TextUtils.isEmpty(s2))
        {
            try
            {
                String as[] = s2.split(",");
                if (as.length == 2)
                {
                    f1.a(Float.valueOf(as[0]).floatValue());
                    f1.b(Float.valueOf(as[1]).floatValue());
                }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (jsonobject1.optBoolean("hasRadar", false))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        f1.b(k);
        if (jsonobject1.optBoolean("hasSatellite", false))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        f1.c(k);
        list.add(f1);
        if (!flag) goto _L8; else goto _L2
_L2:
        return;
_L8:
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == -1)
        {
            f1.b(11);
            f1.c(5);
            return;
        }
        if (j != 0) goto _L2; else goto _L9
_L9:
        f1.b(11);
        f1.c(4);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
