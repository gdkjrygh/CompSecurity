// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Timer;

// Referenced classes of package com.jiubang.commerce.ad.d:
//            i, g, j, h

public class e
{

    private long a;
    private Context b;
    private h c;
    private i d;
    private j e;
    private Timer f;
    private g g;
    private boolean h;
    private long i;

    public e(Context context, h h1)
    {
        a = 350L;
        h = false;
        b = context;
        c = h1;
    }

    static long a(e e1, long l)
    {
        e1.i = l;
        return l;
    }

    static Context a(e e1)
    {
        return e1.b;
    }

    static boolean a(e e1, boolean flag)
    {
        e1.h = flag;
        return flag;
    }

    static boolean b(e e1)
    {
        return e1.h;
    }

    static h c(e e1)
    {
        return e1.c;
    }

    private void d()
    {
        if (d == null)
        {
            d = new i(this, null);
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        b.registerReceiver(d, intentfilter);
    }

    static void d(e e1)
    {
        e1.f();
    }

    private void e()
    {
        b.unregisterReceiver(d);
        d = null;
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        d = null;
        return;
        obj;
        d = null;
        throw obj;
    }

    static void e(e e1)
    {
        e1.g();
    }

    static long f(e e1)
    {
        return e1.i;
    }

    private void f()
    {
        g();
        if (g == null)
        {
            g = new g(this, null);
        }
        if (f == null)
        {
            f = new Timer();
        }
        if (f != null && g != null)
        {
            f.schedule(g, 0L, a);
        }
    }

    private void g()
    {
        if (g != null)
        {
            g.cancel();
            g = null;
        }
        if (f != null)
        {
            f.cancel();
            f = null;
        }
    }

    private void h()
    {
        if (e == null)
        {
            e = new j(this, null);
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.TIME_SET");
        b.registerReceiver(e, intentfilter);
    }

    private void i()
    {
        if (e != null)
        {
            b.unregisterReceiver(e);
            e = null;
        }
    }

    public void a()
    {
        d();
        h();
        f();
    }

    public void b()
    {
        e();
        i();
        g();
    }

    public long c()
    {
        return a;
    }
}
