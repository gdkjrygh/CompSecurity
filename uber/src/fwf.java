// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.overlay.NoLocationOverlayView;

public final class fwf
{

    private final chp a;
    private final RiderActivity b;
    private final fte c;
    private ViewGroup d;
    private NoLocationOverlayView e;

    public fwf(chp chp1, RiderActivity rideractivity, fte fte1)
    {
        a = chp1;
        b = rideractivity;
        c = fte1;
    }

    private void c()
    {
        if (c.g() == 0 && c.h() == null)
        {
            if (e != null)
            {
                return;
            }
            if (d == null)
            {
                throw new IllegalStateException("Root view cannot be null");
            } else
            {
                e = (NoLocationOverlayView)b.getLayoutInflater().inflate(0x7f0301e7, d, false);
                d.addView(e);
                AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.dr);
                a.a(analyticsevent);
                return;
            }
        } else
        {
            d();
            return;
        }
    }

    private void d()
    {
        if (e != null)
        {
            d.removeView(e);
            e = null;
        }
    }

    public final void a()
    {
        c();
    }

    public final void a(ViewGroup viewgroup)
    {
        d = viewgroup;
    }

    public final void b()
    {
        c();
    }
}
