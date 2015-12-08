// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.c;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.q;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            x

class z
{

    int a;
    boolean b;
    boolean c;
    boolean d;
    int e;
    int f;
    int g;
    String h;
    int i;
    int j;
    int k;
    int l;
    String m;
    String n;
    c o;
    final x p;

    z(x x1, WeatherBean weatherbean)
    {
        Object obj1 = null;
        p = x1;
        super();
        b = false;
        o = new c();
        a = x.a();
        g = x.a(x1).g;
        e = x.a(x1).w;
        f = x.a(x1).v;
        if (weatherbean == null)
        {
            i = -10000;
            j = -10000;
            k = -10000;
            l = -10000;
            m = com.gau.go.launcherex.gowidget.weather.b.x.b(x1).getString(0x7f080514);
            n = "";
            return;
        }
        o.g(weatherbean.c());
        o.a(weatherbean.l.n());
        long l1 = weatherbean.l.f();
        o.a(x.a(x1, l1));
        o.b(x.a(x1, l1 + 0x5265c00L));
        n = weatherbean.c();
        m = weatherbean.d();
        Object obj = Calendar.getInstance();
        Object obj2 = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
        String s = ((SimpleDateFormat) (obj2)).format(((Calendar) (obj)).getTime());
        ((Calendar) (obj)).add(5, 1);
        obj2 = ((SimpleDateFormat) (obj2)).format(((Calendar) (obj)).getTime());
        Iterator iterator = weatherbean.g.iterator();
        obj = null;
        weatherbean = obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ForecastBean forecastbean = (ForecastBean)iterator.next();
            if (s.equals(forecastbean.c()))
            {
                obj = forecastbean;
            }
            if (((String) (obj2)).equals(forecastbean.c()))
            {
                weatherbean = forecastbean;
            }
        } while (true);
        if (obj != null && weatherbean != null)
        {
            if (g == 2)
            {
                i = q.a(((ForecastBean) (obj)).b(2));
                j = q.a(((ForecastBean) (obj)).a(2));
                k = q.a(weatherbean.b(2));
                l = q.a(weatherbean.a(2));
                h = "\260F";
            } else
            {
                e = q.a(e);
                f = q.a(f);
                i = q.a(((ForecastBean) (obj)).b(1));
                j = q.a(((ForecastBean) (obj)).a(1));
                k = q.a(weatherbean.b(1));
                l = q.a(weatherbean.a(1));
                h = "\260C";
            }
        }
        d = x.a(x1, k, i, e);
        c = x.a(x1, j, l, f);
    }

    static boolean a(z z1, ArrayList arraylist)
    {
        return z1.a(arraylist);
    }

    private boolean a(ArrayList arraylist)
    {
        while (!d && !c || TextUtils.isEmpty(o.j())) 
        {
            return false;
        }
        o.d(com.gau.go.launcherex.gowidget.weather.b.x.b(p).getResources().getString(0x7f0803fb));
        o.b(1);
        o.f(d());
        o.e("TC");
        o.c("TEMP");
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("cityId", o.j());
        contentvalues.put("description", o.f());
        contentvalues.put("exp_time", o.d());
        contentvalues.put("alert_id", Integer.valueOf(o.k()));
        contentvalues.put("level", Integer.valueOf(o.h()));
        contentvalues.put("message", o.i());
        contentvalues.put("phenomena", o.g());
        contentvalues.put("publish_time", o.c());
        contentvalues.put("type", o.e());
        contentvalues.put("tz_offset", Integer.valueOf(o.a()));
        contentvalues.put("has_read", Integer.valueOf(0));
        arraylist.add(ContentProviderOperation.newInsert(WeatherContentProvider.k).withValues(contentvalues).build());
        return true;
    }

    private Notification b()
    {
        boolean flag = true;
        Notification notification = new Notification();
        notification.flags = notification.flags | 0x10;
        if (x.a(p).s != 1)
        {
            flag = false;
        }
        if (!flag)
        {
            notification.defaults = 7;
        } else
        {
            notification.defaults = 6;
        }
        notification.icon = 0x7f020391;
        return notification;
    }

    private String c()
    {
        String s = null;
        String s2 = (new StringBuilder()).append(k - i).append(h).toString();
        String s1 = (new StringBuilder()).append(j - l).append(h).toString();
        b b1 = com.gau.go.launcherex.gowidget.language.e.a(com.gau.go.launcherex.gowidget.weather.b.x.b(p)).a();
        if (d && c)
        {
            s = b1.getString(0x7f080410, new Object[] {
                s2, s1
            });
        } else
        {
            if (d)
            {
                return b1.getString(0x7f08040e, new Object[] {
                    s2
                });
            }
            if (c)
            {
                return b1.getString(0x7f08040f, new Object[] {
                    s1
                });
            }
        }
        return s;
    }

    private String d()
    {
        StringBuffer stringbuffer;
        String s;
        String s1;
        String s2;
        String s3;
        b b1;
        stringbuffer = new StringBuffer();
        s = (new StringBuilder()).append(k).append(h).toString();
        s1 = (new StringBuilder()).append(l).append(h).toString();
        s2 = (new StringBuilder()).append(k - i).append(h).toString();
        s3 = (new StringBuilder()).append(j - l).append(h).toString();
        b1 = com.gau.go.launcherex.gowidget.language.e.a(com.gau.go.launcherex.gowidget.weather.b.x.b(p)).a();
        if (!d || !c) goto _L2; else goto _L1
_L1:
        stringbuffer.append(b1.getString(0x7f080411, new Object[] {
            s2, s
        }));
        stringbuffer.append("\n");
        stringbuffer.append(b1.getString(0x7f080412, new Object[] {
            s3, s1
        }));
_L4:
        return stringbuffer.toString();
_L2:
        if (d)
        {
            stringbuffer.append(b1.getString(0x7f080411, new Object[] {
                s2, s
            }));
        } else
        if (c)
        {
            stringbuffer.append(b1.getString(0x7f080412, new Object[] {
                s3, s1
            }));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a()
    {
        if (!b || !d && !c) goto _L2; else goto _L1
_L1:
        Notification notification;
        String s;
        String s1;
        RemoteViews remoteviews;
        int i1;
        notification = b();
        notification.contentIntent = x.a(p, com.gau.go.launcherex.gowidget.weather.b.x.b(p), n, a);
        s = (new StringBuilder()).append(" - ").append(com.gau.go.launcherex.gowidget.weather.b.x.b(p).getResources().getString(0x7f0803fb)).toString();
        s1 = c();
        notification.tickerText = com.gau.go.launcherex.gowidget.weather.b.x.b(p).getResources().getString(0x7f0803fb);
        remoteviews = new RemoteViews(com.gau.go.launcherex.gowidget.weather.b.x.b(p).getPackageName(), 0x7f0300d8);
        remoteviews.setImageViewResource(0x7f090473, 0x7f020390);
        remoteviews.setViewVisibility(0x7f090477, 0);
        if (x.a(p).C.equals("notification_style_default"))
        {
            x.a(p, x.a(p));
        }
        i1 = 0x106000b;
        if (!x.a(p).C.equals("notification_style_default_black")) goto _L4; else goto _L3
_L3:
        i1 = 0xffeeeeee;
_L6:
        remoteviews.setTextColor(0x7f090476, i1);
        remoteviews.setTextColor(0x7f090477, i1);
        remoteviews.setTextViewText(0x7f090475, m);
        remoteviews.setTextViewText(0x7f090476, s);
        remoteviews.setTextViewText(0x7f090477, s1);
        notification.contentView = remoteviews;
        com.gau.go.launcherex.gowidget.weather.b.x.c(p).notify("notification_tag_temp_change", a, notification);
_L2:
        return;
_L4:
        if (x.a(p).C.equals("notification_style_default_white"))
        {
            i1 = 0xff535353;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
