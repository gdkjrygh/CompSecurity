// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.app.Activity;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.go.weatherex.themeconfig.c;
import com.google.android.gms.ads.AdView;

public class k
    implements c
{

    private static k a;
    private NativeAd b;
    private InterstitialAd c;
    private com.google.android.gms.ads.InterstitialAd d;
    private Activity e;
    private AdView f;
    private com.facebook.ads.AdView g;

    private k()
    {
    }

    public static k a()
    {
        if (a == null)
        {
            a = new k();
        }
        return a;
    }

    public void a(Activity activity)
    {
        e = activity;
        if (c != null)
        {
            c.show();
            return;
        }
        try
        {
            if (e != null)
            {
                e.finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
        }
        return;
    }

    public void a(com.facebook.ads.AdView adview)
    {
        if (g != null)
        {
            g = null;
        }
        g = adview;
    }

    public void a(InterstitialAd interstitialad)
    {
        c = interstitialad;
    }

    public void a(AdView adview)
    {
        if (f != null)
        {
            f = null;
        }
        f = adview;
    }

    public void a(com.google.android.gms.ads.InterstitialAd interstitialad)
    {
        d = interstitialad;
    }

    public NativeAd b()
    {
        return b;
    }

    public InterstitialAd c()
    {
        return c;
    }

    public void d()
    {
        if (b != null)
        {
            b.destroy();
        }
        if (c != null)
        {
            c.destroy();
        }
        if (d != null)
        {
            d = null;
        }
    }

    public com.google.android.gms.ads.InterstitialAd e()
    {
        return d;
    }

    public AdView f()
    {
        return f;
    }

    public com.facebook.ads.AdView g()
    {
        return g;
    }

    public void h()
    {
        if (c != null)
        {
            c.destroy();
            c = null;
        }
        if (d != null)
        {
            d = null;
        }
    }
}
