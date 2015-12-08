// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.b.c;
import com.gtp.go.weather.sharephoto.b.j;
import com.gtp.go.weather.sharephoto.b.o;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            k, g, h, i, 
//            j

public class d
{

    private static volatile d j;
    private ConcurrentHashMap a;
    private ConcurrentHashMap b;
    private ConcurrentHashMap c;
    private AlarmManager d;
    private ConnectivityManager e;
    private Context f;
    private boolean g;
    private boolean h;
    private k i;

    private d(Context context)
    {
        f = context;
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = (AlarmManager)context.getSystemService("alarm");
        e = (ConnectivityManager)context.getSystemService("connectivity");
        g = false;
        i = new k(this);
        (new com.gtp.go.weather.sharephoto.c.g(this, null)).execute(new Object[0]);
    }

    static Context a(d d1)
    {
        return d1.f;
    }

    public static d a(Context context)
    {
        if (j == null)
        {
            j = new d(context);
        }
        return j;
    }

    private void a()
    {
label0:
        {
            if (!g)
            {
                g = true;
                Object obj = new IntentFilter();
                ((IntentFilter) (obj)).addAction("LIKE_OR_BG_UPLOAD");
                ((IntentFilter) (obj)).addAction("android.net.conn.CONNECTIVITY_CHANGE");
                f.registerReceiver(i, ((IntentFilter) (obj)));
                obj = e.getActiveNetworkInfo();
                if (obj == null || !((NetworkInfo) (obj)).isConnected())
                {
                    break label0;
                }
                b(System.currentTimeMillis() + 5000L);
            }
            return;
        }
        h = true;
    }

    static void a(d d1, long l)
    {
        d1.b(l);
    }

    static void a(d d1, j j1)
    {
        d1.b(j1);
    }

    static void a(d d1, String s, long l, int i1)
    {
        d1.a(s, l, i1);
    }

    static void a(d d1, String s, j j1)
    {
        d1.a(s, j1);
    }

    private void a(String s, long l, int i1)
    {
        if (i1 == 2)
        {
            s = new c(s, l, 2, i1);
            a.put(Long.valueOf(l), s);
        } else
        if (i1 == 1 || i1 == -1)
        {
            c c1 = (c)b.get(Long.valueOf(l));
            if (c1 != null)
            {
                if (c1.c() + i1 == 0)
                {
                    c1.a(i1);
                    return;
                }
            } else
            {
                s = new c(s, l, 1, i1);
                b.put(Long.valueOf(l), s);
                return;
            }
        }
    }

    private void a(String s, j j1)
    {
        s = new c(com.gtp.go.weather.sharephoto.a.g.a(f).b().a(), j1.a(), 3, j1.c());
        c.put(Long.valueOf(j1.a()), s);
    }

    static boolean a(d d1, boolean flag)
    {
        d1.g = flag;
        return flag;
    }

    private void b(long l)
    {
        Object obj = new Intent("LIKE_OR_BG_UPLOAD");
        obj = PendingIntent.getBroadcast(f, 100, ((Intent) (obj)), 0x8000000);
        d.set(0, l, ((PendingIntent) (obj)));
    }

    private void b(j j1)
    {
        a(com.gtp.go.weather.sharephoto.a.g.a(f).b().a(), j1);
        a();
    }

    static void b(d d1)
    {
        d1.a();
    }

    static void b(d d1, String s, long l, int i1)
    {
        d1.b(s, l, i1);
    }

    private void b(String s, long l, int i1)
    {
        a(s, l, i1);
        a();
    }

    static boolean b(d d1, boolean flag)
    {
        d1.h = flag;
        return flag;
    }

    static ConcurrentHashMap c(d d1)
    {
        return d1.a;
    }

    static ConcurrentHashMap d(d d1)
    {
        return d1.b;
    }

    static ConcurrentHashMap e(d d1)
    {
        return d1.c;
    }

    static k f(d d1)
    {
        return d1.i;
    }

    static ConnectivityManager g(d d1)
    {
        return d1.e;
    }

    static boolean h(d d1)
    {
        return d1.h;
    }

    public void a(long l)
    {
        if (l != 0L)
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_FAVOUR_OR_BACKCOUNT");
            intent.putExtra("extra_change_photo_id", l);
            intent.putExtra("extra_change_type", 2);
            f.sendBroadcast(intent);
            (new h(this, null)).execute(new Object[] {
                Long.valueOf(l)
            });
        }
    }

    public void a(com.gtp.go.weather.sharephoto.b.g g1)
    {
        if (g1 != null)
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_FAVOUR_OR_BACKCOUNT");
            intent.putExtra("extra_change_photo_id", g1.a());
            intent.putExtra("extra_change_type", 1);
            int l;
            if (g1.h())
            {
                l = 1;
            } else
            {
                l = -1;
            }
            intent.putExtra("extra_change_value", l);
            f.sendBroadcast(intent);
            (new i(this, null)).execute(new Object[] {
                g1
            });
        }
    }

    public void a(j j1)
    {
        if (j1 != null)
        {
            (new com.gtp.go.weather.sharephoto.c.j(this, null)).execute(new Object[] {
                j1
            });
        }
    }
}
