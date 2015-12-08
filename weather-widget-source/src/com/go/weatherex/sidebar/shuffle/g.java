// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.gau.go.launcherex.gowidget.weather.service.a.i;
import com.google.android.gms.ads.AdLoader;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            c, d, n, m, 
//            l, h, j, k

public class g
{

    private static g a = null;
    private Context b;
    private i c;
    private long d;
    private long e;

    private g(Context context)
    {
        d = 0L;
        e = 0L;
        b = context;
    }

    static long a(g g1, long l1)
    {
        g1.d = l1;
        return l1;
    }

    static Context a(g g1)
    {
        return g1.b;
    }

    public static g a(Context context)
    {
        com/go/weatherex/sidebar/shuffle/g;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new g(context);
        }
        context = a;
        com/go/weatherex/sidebar/shuffle/g;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(NativeAd nativead)
    {
        (new Thread(new c(nativead, c))).start();
    }

    static void a(g g1, NativeAd nativead)
    {
        g1.a(nativead);
    }

    static void a(g g1, Object obj)
    {
        g1.a(obj);
    }

    private void a(Object obj)
    {
        (new Thread(new d(obj, c))).start();
    }

    static long b(g g1)
    {
        return g1.d;
    }

    static long c(g g1)
    {
        return g1.e;
    }

    public void a()
    {
        Log.i("lky", "loadAppInstalledAd");
        Object obj = new e(b, "2");
        ((e) (obj)).b("ad_requst");
        ((e) (obj)).d("ca-app-pub-6646759830189405/8928439175");
        ((e) (obj)).g("5");
        obj = ((e) (obj)).b();
        com.gau.go.a.e.a(b).a(((String) (obj)));
        obj = new com.google.android.gms.ads.formats.NativeAdOptions.Builder();
        ((com.google.android.gms.ads.formats.NativeAdOptions.Builder) (obj)).setImageOrientation(2);
        obj = (new com.google.android.gms.ads.AdLoader.Builder(b, "ca-app-pub-6646759830189405/8928439175")).forAppInstallAd(new n(this)).forContentAd(new m(this)).withAdListener(new l(this)).withNativeAdOptions(((com.google.android.gms.ads.formats.NativeAdOptions.Builder) (obj)).build()).build();
        e = System.currentTimeMillis();
        ((AdLoader) (obj)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
    }

    public void a(i i)
    {
        c = i;
    }

    public void a(String s)
    {
        Object obj = new e(b, "2");
        ((e) (obj)).b("ad_requst");
        ((e) (obj)).d(s);
        ((e) (obj)).g("5");
        obj = ((e) (obj)).b();
        com.gau.go.a.e.a(b).a(((String) (obj)));
        obj = new NativeAd(b, s);
        ((NativeAd) (obj)).setAdListener(new h(this, s));
        s = new Thread(new j(this, ((NativeAd) (obj))));
        s.setPriority(10);
        s.run();
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new k(this, ((NativeAd) (obj))), 25000L);
    }

    public void b()
    {
        if (c != null)
        {
            c = null;
        }
    }

}
