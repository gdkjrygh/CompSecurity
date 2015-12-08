// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.b.a;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.InterstitialAd;
import com.go.weatherex.ad.c.e;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.h.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.go.weatherex.b.a:
//            b, c, d, e

public class a
{

    private static a a = null;
    private Context b;
    private Activity c;
    private HashMap d;
    private ArrayList e;
    private InterstitialAd f;
    private com.google.android.gms.ads.InterstitialAd g;
    private b h;

    private a(Activity activity)
    {
        d = new HashMap();
        e = new ArrayList();
        c = activity;
    }

    private a(Context context)
    {
        d = new HashMap();
        e = new ArrayList();
        b = context;
    }

    static InterstitialAd a(a a1, InterstitialAd interstitialad)
    {
        a1.f = interstitialad;
        return interstitialad;
    }

    public static a a(Activity activity)
    {
        if (a == null)
        {
            a = new a(activity);
        }
        return a;
    }

    public static a a(Context context)
    {
        if (a == null)
        {
            a = new a(context);
        }
        return a;
    }

    static com.google.android.gms.ads.InterstitialAd a(a a1, com.google.android.gms.ads.InterstitialAd interstitialad)
    {
        a1.g = interstitialad;
        return interstitialad;
    }

    static b a(a a1, b b1)
    {
        a1.h = b1;
        return b1;
    }

    static HashMap a(a a1)
    {
        return a1.d;
    }

    static Activity b(a a1)
    {
        return a1.c;
    }

    static b c(a a1)
    {
        return a1.h;
    }

    public void a()
    {
        c c1 = new c(b, 498, "", new com.go.weatherex.b.a.b(this));
        c1.b(false);
        c1.a(true);
        c1.c(true);
        c1.d(false);
        c1.e(false);
        c1.a(10);
        com.jiubang.commerce.ad.a.a(c1.a());
    }

    public void a(com.go.weatherex.b.a.e e1, int i)
    {
        if (d == null)
        {
            d = new HashMap();
        }
        if (d.get(Integer.valueOf(i)) == null)
        {
            d.put(Integer.valueOf(i), new ArrayList());
        }
        if (!((ArrayList)d.get(Integer.valueOf(i))).contains(e1))
        {
            ((ArrayList)d.get(Integer.valueOf(i))).add(e1);
        }
    }

    public void b()
    {
        c c1 = new c(b, 700, "", new com.go.weatherex.b.a.c(this));
        c1.b(false);
        c1.a(true);
        c1.c(true);
        c1.d(false);
        c1.e(false);
        c1.a(10);
        com.jiubang.commerce.ad.a.a(c1.a());
    }

    public void b(com.go.weatherex.b.a.e e1, int i)
    {
        if (d.get(Integer.valueOf(i)) != null && ((ArrayList)d.get(Integer.valueOf(i))).contains(e1))
        {
            ((ArrayList)d.get(Integer.valueOf(i))).remove(e1);
        }
    }

    public void c()
    {
        if (f != null || g != null)
        {
            return;
        } else
        {
            c c1 = new c(c, 1032, "", new d(this));
            c1.b(false);
            c1.c(true);
            c1.d(false);
            c1.e(false);
            c1.a(1);
            com.jiubang.commerce.ad.a.a(c1.a());
            return;
        }
    }

    public boolean d()
    {
        return !com.go.weatherex.ad.c.e.a(c) && (f != null || g != null);
    }

    public void e()
    {
        if (f != null)
        {
            if (c != null && h != null)
            {
                b(c, h.g(), (com.jiubang.commerce.ad.i.a.b)h.d().a().get(0), "1032");
            }
            f.show();
        } else
        if (g != null)
        {
            if (c != null && h != null)
            {
                b(c, h.g(), (com.jiubang.commerce.ad.i.a.b)h.d().a().get(0), "1032");
            }
            g.show();
            return;
        }
    }

    public void f()
    {
        if (f != null)
        {
            f.destroy();
            f = null;
        }
        if (g != null)
        {
            g = null;
        }
    }

}
