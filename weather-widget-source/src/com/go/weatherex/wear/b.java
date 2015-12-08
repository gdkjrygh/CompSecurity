// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.jiubang.core.b.a;

public class b
{

    private static b a;
    private Context b;
    private SharedPreferences c;

    private b(Context context)
    {
        b = context.getApplicationContext();
        c = GoWidgetApplication.c(b).a();
    }

    public static b a(Context context)
    {
        if (a == null)
        {
            a = new b(context);
        }
        return a;
    }

    public String a()
    {
        String s1;
label0:
        {
            String s = c.getString("key_wear_city_id", "");
            if (TextUtils.isEmpty(s))
            {
                s1 = b();
                if (!TextUtils.isEmpty(s1))
                {
                    break label0;
                }
            }
            return s;
        }
        return s1;
    }

    public String a(String s, String s1)
    {
        String s2 = a();
        if (!TextUtils.isEmpty(s2) && s2.equals(s))
        {
            a(s1);
            return s1;
        } else
        {
            return s2;
        }
    }

    public void a(String s)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("key_wear_city_id", s);
        editor.commit();
    }

    public String b()
    {
        Object obj = null;
        Object obj1 = com.gau.go.launcherex.gowidget.weather.c.c.a(b).h();
        String s = ((f) (obj1)).h();
        if (!TextUtils.isEmpty(s))
        {
            a(s);
        } else
        {
            s = obj;
            if (((f) (obj1)).e() > 0)
            {
                obj1 = ((f) (obj1)).b(0);
                s = obj;
                if (obj1 != null)
                {
                    String s1 = ((WeatherBean) (obj1)).c();
                    a(s1);
                    return s1;
                }
            }
        }
        return s;
    }
}
