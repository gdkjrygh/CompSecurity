// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.home.current:
//            l

class m
    implements Runnable
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void run()
    {
        double ad[];
        double ad1[];
        ad = l.a(a).l.z();
        ad1 = l.a(a).l.A();
        if (!r.a(ad) || !r.a(ad1))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        l.b(a).moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(ad1[0], ad1[1]), new LatLng(ad[0], ad[1])), 0));
_L2:
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        if (!c.a()) goto _L2; else goto _L1
_L1:
        illegalstateexception.printStackTrace();
        return;
        float f = l.a(a).l.w();
        float f1 = l.a(a).l.v();
        if (f != -10000F && f1 != -10000F)
        {
            try
            {
                l.b(a).moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(f, f1), 7F));
                return;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                if (c.a())
                {
                    illegalstateexception1.printStackTrace();
                    return;
                }
            }
        }
          goto _L2
    }
}
