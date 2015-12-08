// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.VolleyError;
import com.android.volley.l;
import java.util.HashMap;

// Referenced classes of package com.android.volley.toolbox:
//            k, j, l, m, 
//            n, o, h, i

public final class g
{

    private final l a;
    private int b;
    private final com.android.volley.toolbox.l c;
    private final HashMap d;
    private final HashMap e;
    private final Handler f;
    private Runnable g;

    static Runnable a(g g1, Runnable runnable)
    {
        g1.g = null;
        return null;
    }

    static HashMap a(g g1)
    {
        return g1.d;
    }

    static void a(g g1, String s, Bitmap bitmap)
    {
        Object obj = g1.c;
        obj = (k)g1.d.remove(s);
        if (obj != null)
        {
            k.a(((k) (obj)), bitmap);
            g1.a(s, ((k) (obj)));
        }
    }

    static void a(g g1, String s, VolleyError volleyerror)
    {
        k k1 = (k)g1.d.remove(s);
        k1.a(volleyerror);
        if (k1 != null)
        {
            g1.a(s, k1);
        }
    }

    private void a(String s, k k1)
    {
        e.put(s, k1);
        if (g == null)
        {
            g = new j(this);
            f.postDelayed(g, b);
        }
    }

    static HashMap b(g g1)
    {
        return g1.e;
    }

    public final m a(String s, n n1)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
        String s1 = (new StringBuilder(s.length() + 12)).append("#W").append(0).append("#H").append(0).append(s).toString();
        Object obj = c.a();
        if (obj != null)
        {
            s = new m(this, ((Bitmap) (obj)), s, null, null);
            n1.a(s, true);
            return s;
        }
        obj = new m(this, null, s, s1, n1);
        n1.a(((m) (obj)), true);
        n1 = (k)d.get(s1);
        if (n1 != null)
        {
            n1.a(((m) (obj)));
            return ((m) (obj));
        } else
        {
            s = new o(s, new h(this, s1), 0, 0, android.graphics.Bitmap.Config.RGB_565, new i(this, s1));
            a.a(s);
            d.put(s1, new k(this, s, ((m) (obj))));
            return ((m) (obj));
        }
    }
}
