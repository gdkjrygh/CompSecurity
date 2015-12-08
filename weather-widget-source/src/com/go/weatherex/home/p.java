// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.home:
//            q

public class p
{

    public p()
    {
    }

    private void a(Activity activity)
    {
        Object obj = c.a(activity.getApplicationContext());
        ArrayList arraylist;
        for (arraylist = ((c) (obj)).h().d(); arraylist.size() == 0 || !((c) (obj)).f().g();)
        {
            return;
        }

        obj = activity.getApplicationContext().getSharedPreferences("weather_info_file", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("KEY_REFRESH_WEATHER_IN_PROGRESS", true);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        obj = new ArrayList();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            WeatherBean weatherbean = (WeatherBean)arraylist.get(i);
            RequestBean requestbean = new RequestBean();
            requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
            ((ArrayList) (obj)).add(requestbean);
        }

        a(activity, ((ArrayList) (obj)), 22, 3);
    }

    private void a(Activity activity, ArrayList arraylist, int i, int j)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", i);
        intent.putParcelableArrayListExtra("req_arg", arraylist);
        intent.putExtra("updateWay", j);
        activity.getApplicationContext().startService(intent);
    }

    static void a(p p1, Activity activity)
    {
        p1.a(activity);
    }

    public void a(Activity activity, Intent intent)
    {
        if (c.a(activity.getApplicationContext()).b())
        {
            a(activity);
        }
    }

    public void a(Activity activity, Bundle bundle)
    {
        bundle = c.a(activity.getApplicationContext());
        if (bundle.b())
        {
            a(activity);
            return;
        } else
        {
            bundle.a(new q(this, activity, bundle));
            return;
        }
    }
}
