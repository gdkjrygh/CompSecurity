// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.c;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.text.format.Time;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.google.android.gms.ads.InterstitialAd;

// Referenced classes of package com.go.weatherex.ad.c:
//            c, b

public class a extends c
{

    private InterstitialAd c;
    private LocationManager d;

    public a(Activity activity)
    {
        super(activity);
        d = (LocationManager)activity.getSystemService("location");
    }

    protected String a()
    {
        return a(0x7f080038);
    }

    protected void a(Context context)
    {
        c = new InterstitialAd(context);
        c.setAdUnitId(a());
        c.setAdListener(new b(this));
    }

    public void b()
    {
        Object obj1 = null;
        com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        Location location;
        Object obj;
        Location location1;
        long l;
        long l1;
        try
        {
            location1 = d.getLastKnownLocation("gps");
        }
        catch (Exception exception)
        {
            exception = null;
            continue; /* Loop/switch isn't completed */
        }
        location = location1;
        obj = new Time();
        location = location1;
        l = ((Time) (obj)).toMillis(true) - ((Time) (obj)).gmtoff;
        obj = location1;
        if (location1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = location1;
        location = location1;
        if (l - location1.getTime() >= 0x36ee80L)
        {
            obj = null;
        }
        location = ((Location) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        location = ((Location) (obj));
        obj = d.getLastKnownLocation("network");
        location = ((Location) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        location = ((Location) (obj));
        l1 = ((Location) (obj)).getTime();
        location = ((Location) (obj));
        if (l - l1 >= 0x36ee80L)
        {
            location = obj1;
        }
_L2:
        if (location != null)
        {
            builder.setLocation(location);
        }
        c.loadAd(builder.build());
        return;
        Exception exception1;
        exception1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean c()
    {
        return c.isLoaded();
    }

    public void d()
    {
        c.show();
        String s = (new e("f000", a(), "4", "", "8", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(s);
    }

    public void e()
    {
        if (c != null)
        {
            c.setAdListener(null);
            c = null;
        }
    }
}
