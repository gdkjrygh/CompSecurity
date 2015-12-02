// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.config.AppConfigKey;
import com.ubercab.client.feature.music.overlay.AddMusicOverlayView;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;

public final class ekk
    implements ekl
{

    private final chp a;
    private final dqt b;
    private final hkr c;
    private final LayoutInflater d;
    private final czf e;
    private final fte f;
    private AddMusicOverlayView g;
    private ViewGroup h;

    public ekk(chp chp1, dqt dqt1, hkr hkr1, RiderActivity rideractivity, czf czf1, fte fte1)
    {
        a = chp1;
        b = dqt1;
        c = hkr1;
        d = rideractivity.getLayoutInflater();
        e = czf1;
        f = fte1;
    }

    private void c()
    {
        if (!d())
        {
            e();
        } else
        if (g == null)
        {
            g = (AddMusicOverlayView)d.inflate(0x7f0300c0, h, false);
            h.addView(g);
            a.a(l.de);
            g.a(this);
            return;
        }
    }

    private boolean d()
    {
        if (!e.G() && f.g() == 5 && fte.a(f.f()))
        {
            Object obj = c.f();
            boolean flag;
            boolean flag1;
            if (obj != null)
            {
                obj = ((Trip) (obj)).getDriver();
            } else
            {
                obj = null;
            }
            if (obj != null && ((TripDriver) (obj)).getCapabilities() != null && ((TripDriver) (obj)).getCapabilities().getMusic())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = b.a(AppConfigKey.g, false);
            if (flag && flag1)
            {
                return true;
            }
        }
        return false;
    }

    private void e()
    {
        if (g != null)
        {
            g.b(this);
            h.removeView(g);
            g = null;
        }
    }

    public final void a()
    {
        e.n(true);
        e();
    }

    public final void a(ViewGroup viewgroup)
    {
        h = viewgroup;
    }

    public final void b()
    {
        c();
    }
}
