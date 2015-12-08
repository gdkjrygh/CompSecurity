// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.gtp.go.weather.sharephoto.b.d;
import com.jiubang.core.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            l, n, o, w, 
//            t, u, a, v, 
//            q, m, p

public class k
{

    private Context a;
    private n b;
    private final List c = new ArrayList();
    private SharedPreferences d;
    private final g e = new l(this);

    public k(Context context)
    {
        a = context.getApplicationContext();
        b = new n(a.getContentResolver(), this);
        d = GoWidgetApplication.c(a.getApplicationContext()).a();
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(e);
    }

    private void a(int i, boolean flag, String s)
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((o)iterator.next()).a(i, flag, s)) { }
    }

    public static void a(Context context)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new w(context));
    }

    public static void a(Context context, long l1, long l2)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new t(context, l1, l2));
    }

    public static void a(Context context, d d1)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new u(context, d1));
    }

    public static void a(Context context, String s)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new com.gtp.go.weather.sharephoto.award.a(context, s));
    }

    static void a(k k1)
    {
        k1.d();
    }

    static void a(k k1, int i, boolean flag, String s)
    {
        k1.a(i, flag, s);
    }

    static void a(k k1, d d1)
    {
        k1.a(d1);
    }

    static void a(k k1, d d1, List list)
    {
        k1.a(d1, list);
    }

    static void a(k k1, List list)
    {
        k1.b(list);
    }

    static void a(k k1, boolean flag, int i)
    {
        k1.a(flag, i);
    }

    static void a(k k1, boolean flag, long l1, long l2)
    {
        k1.a(flag, l1, l2);
    }

    private void a(d d1)
    {
        long l1 = d1.a();
        b.a(2, d1, WeatherContentProvider.A, null, "user_award_id=?", new String[] {
            String.valueOf(l1)
        }, "_id");
    }

    private void a(d d1, List list)
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((o)iterator.next()).a(d1, list)) { }
    }

    private void a(boolean flag, int i)
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((o)iterator.next()).a(flag, i)) { }
    }

    private void a(boolean flag, long l1, long l2)
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((o)iterator.next()).a(flag, l1, l2)) { }
    }

    public static void b(Context context)
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new v(context));
    }

    static void b(k k1)
    {
        k1.c();
    }

    static void b(k k1, List list)
    {
        k1.d(list);
    }

    private void b(List list)
    {
        (new q(this)).execute(new List[] {
            list
        });
    }

    static SharedPreferences c(k k1)
    {
        return k1.d;
    }

    private void c()
    {
        b.a(1, null, WeatherContentProvider.z, null, null, null, "award_time");
    }

    static void c(k k1, List list)
    {
        k1.c(list);
    }

    private void c(List list)
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((o)iterator.next()).a(list)) { }
    }

    static Context d(k k1)
    {
        return k1.a;
    }

    private void d()
    {
        b.a(3, null, WeatherContentProvider.B, null, null, null, "_id");
    }

    private void d(List list)
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((o)iterator.next()).b(list)) { }
    }

    public void a()
    {
        c.clear();
        com.gau.go.launcherex.gowidget.weather.service.a.b.b(e);
    }

    public void a(o o1)
    {
        if (c.contains(o1))
        {
            return;
        } else
        {
            c.add(o1);
            return;
        }
    }

    public void a(com.gtp.go.weather.sharephoto.b.k k1)
    {
        k1.a(false);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("need_show", Integer.valueOf(0));
        int i = k1.b();
        b.a(-1, k1, WeatherContentProvider.B, contentvalues, "prompt_id=?", new String[] {
            String.valueOf(i)
        });
    }

    public void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(Long.valueOf(((d)list.next()).a()))) { }
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new m(this, arraylist));
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            b(a);
            return;
        } else
        {
            c();
            return;
        }
    }

    public void a(boolean flag, d d1)
    {
        if (flag)
        {
            a(a, d1);
            return;
        } else
        {
            a(d1);
            return;
        }
    }

    public void b()
    {
        (new p(this, null)).execute(new Void[0]);
    }

    public void b(o o1)
    {
        c.remove(o1);
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            a(a);
            return;
        } else
        {
            d();
            return;
        }
    }
}
