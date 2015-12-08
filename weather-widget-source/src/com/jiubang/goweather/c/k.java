// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;

// Referenced classes of package com.jiubang.goweather.c:
//            s, j

class k
    implements s
{

    final int a;
    final int b;
    final j c;

    k(j j1, int i, int l)
    {
        c = j1;
        a = i;
        b = l;
        super();
    }

    public void a()
    {
        j.a(c).sendEmptyMessage(3);
    }

    public void a(int i)
    {
        if (i == 3)
        {
            j.a(c).sendEmptyMessage(2);
            return;
        } else
        {
            j.a(c, a, b, 9);
            return;
        }
    }

    public void a(Location location)
    {
        Message message = Message.obtain();
        message.obj = location;
        message.what = 1;
        j.a(c).sendMessage(message);
        if (j.b(c))
        {
            j.a(c, false);
            c.a(location);
        }
    }

    public void a(CityBean citybean, Location location)
    {
        location = Message.obtain();
        location.obj = citybean;
        location.what = 4;
        j.a(c).sendMessage(location);
    }

    public void b(int i)
    {
    }

    public void c(int i)
    {
        j.a(c, a, b, i);
    }
}
