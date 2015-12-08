// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.a.a.m;
import com.android.a.aa;
import com.android.a.p;
import com.android.a.s;
import java.util.HashMap;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            i, h, g, j, 
//            k, e, f

public class d
{

    private final s a;
    private int b;
    private final i c;
    private final HashMap d = new HashMap();
    private final HashMap e = new HashMap();
    private final Handler f = new Handler(Looper.getMainLooper());
    private Runnable g;

    public d(s s1, i l)
    {
        b = 100;
        a = s1;
        c = l;
    }

    static Runnable a(d d1, Runnable runnable)
    {
        d1.g = runnable;
        return runnable;
    }

    private static String a(String s1, int l, int i1)
    {
        return (new StringBuilder(s1.length() + 12)).append("#W").append(l).append("#H").append(i1).append(s1).toString();
    }

    static HashMap a(d d1)
    {
        return d1.d;
    }

    private void a()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        } else
        {
            return;
        }
    }

    static void a(d d1, String s1, Bitmap bitmap, boolean flag)
    {
        d1.a(s1, bitmap, flag);
    }

    static void a(d d1, String s1, aa aa)
    {
        d1.a(s1, aa);
    }

    private void a(String s1, Bitmap bitmap, boolean flag)
    {
        if (flag)
        {
            c.a(s1, bitmap);
        }
        h h1 = (h)d.remove(s1);
        if (h1 != null)
        {
            h.a(h1, bitmap);
            a(s1, h1);
        }
    }

    private void a(String s1, aa aa)
    {
        h h1 = (h)d.remove(s1);
        if (h1 != null)
        {
            h1.a(aa);
            a(s1, h1);
        }
    }

    private void a(String s1, h h1)
    {
        e.put(s1, h1);
        if (g == null)
        {
            g = new g(this);
            f.postDelayed(g, b);
        }
    }

    static HashMap b(d d1)
    {
        return d1.e;
    }

    public j a(String s1, k k1, int l, int i1, boolean flag, boolean flag1)
    {
        a();
        String s2 = a(s1, l, i1);
        Object obj = c.a(s2);
        if (obj != null)
        {
            s1 = new j(this, ((Bitmap) (obj)), s1, null, null);
            k1.a(s1, true);
            return s1;
        }
        obj = new j(this, null, s1, s2, k1);
        k1.a(((j) (obj)), true);
        k1 = (h)d.get(s2);
        if (k1 != null)
        {
            k1.a(((j) (obj)));
            return ((j) (obj));
        } else
        {
            s1 = new m(s1, new e(this, s2, flag), l, i1, android.graphics.Bitmap.Config.RGB_565, new f(this, s2));
            s1.a(flag1);
            a.a(s1);
            d.put(s2, new h(this, s1, ((j) (obj))));
            return ((j) (obj));
        }
    }

    public j a(String s1, k k1, boolean flag, boolean flag1)
    {
        return a(s1, k1, 0, 0, flag, flag1);
    }
}
