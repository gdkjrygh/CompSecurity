// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.wear.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.setting:
//            ca, cb

public class bz
{

    private static a a(Activity activity, String s)
    {
        a a1 = new a();
        boolean flag;
        if ("none".equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.b = flag;
        a1.a = activity.getResources().getString(0x7f080513);
        a1.c = "none";
        return a1;
    }

    private static ArrayList a(Activity activity)
    {
        ArrayList arraylist = new ArrayList();
        String s = com.go.weatherex.wear.b.a(activity).a();
        f f1 = com.gau.go.launcherex.gowidget.weather.c.c.a(activity.getApplicationContext()).h();
        arraylist.add(a(activity, s));
        activity = f1.d().iterator();
        while (activity.hasNext()) 
        {
            WeatherBean weatherbean = (WeatherBean)activity.next();
            a a1 = new a();
            boolean flag;
            if (weatherbean.c().equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.b = flag;
            a1.a = weatherbean.d();
            a1.c = weatherbean.c();
            arraylist.add(a1);
        }
        return arraylist;
    }

    public static void a(com.go.weatherex.framework.fragment.a a1)
    {
        SharedPreferences sharedpreferences = GoWidgetApplication.c(a1.getActivity()).a();
        if (sharedpreferences.getBoolean("key_wear_is_choose_city_tips_shown", false))
        {
            c(a1);
            return;
        } else
        {
            a(a1, sharedpreferences);
            return;
        }
    }

    private static void a(com.go.weatherex.framework.fragment.a a1, SharedPreferences sharedpreferences)
    {
        y y1 = new y(a1.getActivity());
        y1.a(0x7f0804fb);
        y1.b(0x7f080304);
        y1.c(0x7f08019b);
        y1.a(new ca(sharedpreferences, a1));
        y1.a();
    }

    static void b(com.go.weatherex.framework.fragment.a a1)
    {
        c(a1);
    }

    private static void c(com.go.weatherex.framework.fragment.a a1)
    {
        t t1 = new t(a1.getActivity());
        t1.a(0x7f080445);
        t1.a(a(a1.getActivity()));
        t1.b(0);
        t1.a(new cb(a1));
        t1.a();
    }
}
