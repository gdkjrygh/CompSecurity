// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.app.Activity;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.text.format.Time;
import android.view.View;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.gtp.a.a.a.a;

// Referenced classes of package com.go.weatherex.ad.a:
//            a, b, d

public class c extends com.go.weatherex.ad.a.a
{

    private LocationManager c;
    private AdView d;
    private long e;

    public c(Activity activity)
    {
        super(activity);
        c = (LocationManager)a.getSystemService("location");
    }

    static long a(c c1)
    {
        return c1.e;
    }

    public b a()
    {
        return b.b;
    }

    public void a(boolean flag)
    {
        if (d != null)
        {
            d.destroy();
            d = null;
        }
        if (!flag)
        {
            String s = (new e("a000", i(), "1", "", "", "", "")).b();
            com.gau.go.a.e.a(GoWidgetApplication.b()).a(s);
        }
    }

    public View b()
    {
        if (d == null)
        {
            d = new AdView(a);
            AdView adview = d;
            AdSize adsize;
            if (h())
            {
                adsize = AdSize.FULL_BANNER;
            } else
            {
                adsize = AdSize.BANNER;
            }
            adview.setAdSize(adsize);
            d.setAdUnitId(i());
            d.setAdListener(new d(this));
        }
        return d;
    }

    public void c()
    {
        Object obj;
        com.google.android.gms.ads.AdRequest.Builder builder;
        obj = null;
        builder = new com.google.android.gms.ads.AdRequest.Builder();
        Location location1 = c.getLastKnownLocation("gps");
        Location location;
        location = location1;
        if (location1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        location = c.getLastKnownLocation("network");
        location1 = location;
        Time time = new Time();
        location1 = location;
        long l = time.toMillis(true);
        location1 = location;
        long l1 = time.gmtoff;
        location1 = location;
        long l2 = location.getTime();
        if (l - l1 - l2 >= 0x36ee80L)
        {
            location = obj;
        }
_L2:
        if (location != null)
        {
            builder.setLocation(location);
        }
        e = System.currentTimeMillis();
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("Ad start load : ").append(e).toString(), "ad_log.txt");
        if (d == null)
        {
            b();
        }
        if (d != null)
        {
            d.loadAd(builder.build());
        }
        com.gtp.a.a.b.c.a("ad_banner", "\u542F\u52A8admob\u8BF7\u6C42\u3002");
        return;
        Exception exception;
        exception;
        location1 = null;
_L3:
        exception = location1;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
          goto _L3
    }

    public void d()
    {
        if (d != null)
        {
            d.resume();
        }
    }

    public void e()
    {
        if (d != null)
        {
            d.pause();
        }
    }

    public boolean f()
    {
        return android.os.Build.VERSION.SDK_INT >= 9;
    }

    public boolean g()
    {
        return true;
    }

    public String i()
    {
        String s1 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.b.a.a(GoWidgetApplication.c(a).a().getString("key_adid_location_1", ""), 2);
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = a.getString(0x7f080036);
        }
        return s;
    }
}
