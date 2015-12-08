// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.app.Activity;
import android.os.Handler;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            r, q, s

public class p
{

    private static s f = new r();
    protected Activity a;
    protected s b;
    Handler c;
    Runnable d;
    private boolean e;

    public p(Activity activity)
    {
        e = true;
        b = f;
        c = new Handler();
        d = new q(this);
        a = activity;
    }

    public void a()
    {
    }

    public void a(int i)
    {
        c.removeCallbacks(d);
        c.postDelayed(d, i);
    }

    public void a(s s1)
    {
        s s2 = s1;
        if (s1 == null)
        {
            s2 = f;
        }
        b = s2;
    }

    public boolean b()
    {
        return e;
    }

    public void c()
    {
        e = false;
        b.a(e);
    }

    public void d()
    {
        e = true;
        b.a(e);
    }

    public void e()
    {
        if (b())
        {
            c();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void f()
    {
        c.removeCallbacks(d);
    }

    public void g()
    {
        c.postDelayed(d, 3000L);
    }

}
