// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.analytics:
//            k, x, p, s, 
//            g, l, f, a, 
//            w, i, e, d

public final class j
{

    private static j a = new j();
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private String g;
    private Context h;
    private ConnectivityManager i;
    private String j;
    private String k;
    private String l;
    private int m;
    private p n;
    private g o;
    private boolean p;
    private boolean q;
    private a r;
    private w s;
    private e t;
    private Map u;
    private Map v;
    private Handler w;
    private Runnable x;

    private j()
    {
        b = false;
        c = false;
        d = false;
        e = false;
        f = 100;
        j = "GoogleAnalytics";
        k = "1.5.1";
        l = null;
        u = new HashMap();
        v = new HashMap();
        x = new k(this);
    }

    static Handler a(j j1)
    {
        return j1.w;
    }

    public static j a()
    {
        return a;
    }

    static p b(j j1)
    {
        return j1.n;
    }

    private void e()
    {
        while (m < 0 || !w.postDelayed(x, m * 1000) || !b) 
        {
            return;
        }
        Log.v("GoogleAnalyticsTracker", "Scheduled next dispatch");
    }

    private void f()
    {
        if (w != null)
        {
            w.removeCallbacks(x);
        }
    }

    public final void a(String s1, int i1, Context context)
    {
        if (context == null)
        {
            throw new NullPointerException("Context cannot be null");
        }
        Context context1 = context.getApplicationContext();
        Object obj;
        l l1;
        if (n == null)
        {
            context = new x(context1);
            context.a(d);
            context.a(f);
        } else
        {
            context = n;
        }
        if (o == null)
        {
            obj = new s(j, k);
            ((g) (obj)).a(c);
        } else
        {
            obj = o;
        }
        l1 = new l(this);
        g = s1;
        if (context1 == null)
        {
            throw new NullPointerException("Context cannot be null");
        }
        s1 = context1.getApplicationContext();
        h = s1;
        s = new f(s1.getPackageManager());
        n = context;
        r = new a();
        n.c();
        o = ((g) (obj));
        o.a(l1);
        q = false;
        if (i == null)
        {
            i = (ConnectivityManager)h.getSystemService("connectivity");
        }
        int j1;
        if (w == null)
        {
            w = new Handler(s1.getMainLooper());
        } else
        {
            f();
        }
        j1 = m;
        m = i1;
        if (j1 <= 0)
        {
            e();
        } else
        if (j1 > 0)
        {
            f();
            e();
            return;
        }
    }

    public final void a(String s1, String s2)
    {
        j = s1;
        k = s2;
    }

    public final void a(String s1, String s2, String s3, int i1)
    {
        if (!s.a())
        {
            if (s1 == null)
            {
                throw new IllegalArgumentException("category cannot be null");
            }
            if (s2 == null)
            {
                throw new IllegalArgumentException("action cannot be null");
            }
            s1 = new i(g, l, s1, s2, s3, i1, h.getResources().getDisplayMetrics().widthPixels, h.getResources().getDisplayMetrics().heightPixels);
            s1.j = t;
            s1.b(r.a());
            s1.b(e);
            t = new e();
            n.a(s1);
            if (p)
            {
                p = false;
                e();
                return;
            }
        }
    }

    public final boolean a(int i1, String s1, String s2, int j1)
    {
        try
        {
            s1 = new d(i1, s1, s2, j1);
            if (t == null)
            {
                t = new e();
            }
            t.a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        return true;
    }

    public final boolean b()
    {
        if (b)
        {
            Log.v("GoogleAnalyticsTracker", "Called dispatch");
        }
        if (q)
        {
            if (b)
            {
                Log.v("GoogleAnalyticsTracker", "...but dispatcher was busy");
            }
            e();
        } else
        {
            NetworkInfo networkinfo = i.getActiveNetworkInfo();
            if (networkinfo == null || !networkinfo.isConnected())
            {
                if (b)
                {
                    Log.v("GoogleAnalyticsTracker", "...but there was no network connected");
                }
                e();
                return false;
            }
            if (n.b() != 0)
            {
                n an[] = n.a();
                o.a(an);
                q = true;
                e();
                if (b)
                {
                    Log.v("GoogleAnalyticsTracker", (new StringBuilder("Sending ")).append(an.length).append(" hits to dispatcher").toString());
                }
                return true;
            }
            p = true;
            if (b)
            {
                Log.v("GoogleAnalyticsTracker", "...but there was nothing to dispatch");
                return false;
            }
        }
        return false;
    }

    final void c()
    {
        q = false;
    }

    public final boolean d()
    {
        return b;
    }

}
