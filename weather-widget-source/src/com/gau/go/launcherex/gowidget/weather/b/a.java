// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            b, r

public class a
{

    private int a;
    private Context b;
    private BroadcastReceiver c;

    public a(Context context)
    {
        c = new b(this);
        b = context;
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        context.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b.registerReceiver(c, context);
    }

    static int a(a a1)
    {
        return a1.a;
    }

    static int a(a a1, int i)
    {
        i = a1.a | i;
        a1.a = i;
        return i;
    }

    private void a(Context context)
    {
        ArrayList arraylist = f.a(context).f();
        ArrayList arraylist1 = new ArrayList();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            WeatherBean weatherbean = (WeatherBean)arraylist.get(i);
            RequestBean requestbean = new RequestBean();
            requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
            arraylist1.add(requestbean);
        }

        r.a(context).a(arraylist1, 2);
        a = 0;
        b();
    }

    static void a(a a1, Context context)
    {
        a1.a(context);
    }

    static int b(a a1, int i)
    {
        a1.a = i;
        return i;
    }

    private void b()
    {
        b.unregisterReceiver(c);
    }

    public void a()
    {
        a = a | 1;
        if (a == 7)
        {
            a(b);
        }
    }
}
