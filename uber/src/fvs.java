// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.address.GuidedPickupBannerView;

public final class fvs
    implements fty
{

    private final RiderActivity a;
    private GuidedPickupBannerView b;
    private fvt c;
    private fvt d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private ViewGroup i;

    public fvs(RiderActivity rideractivity)
    {
        g = false;
        h = false;
        a = rideractivity;
    }

    private void b(fvt fvt1, String s, String s1)
    {
        c = fvt1;
        b.a(s);
        b.b(s1);
        b.a();
    }

    private void g()
    {
        d = null;
        e = null;
        f = null;
    }

    public final void a()
    {
        h = true;
    }

    public final void a(ViewGroup viewgroup)
    {
        i = viewgroup;
    }

    public final void a(fvt fvt1)
    {
        if (b != null && fvt1.equals(c) && !g)
        {
            b.b();
        }
        if (fvt1.equals(d))
        {
            g();
        }
    }

    public final void a(fvt fvt1, String s, String s1)
    {
        if (b == null)
        {
            b = (GuidedPickupBannerView)a.getLayoutInflater().inflate(0x7f030074, i, false);
            b.a(this);
            i.addView(b);
        }
        if (c == null)
        {
            b(fvt1, s, s1);
        } else
        if (!c.equals(fvt1) || g)
        {
            d = fvt1;
            e = s;
            f = s1;
            if (!g && !h)
            {
                b.b();
                return;
            }
        }
    }

    public final void b()
    {
        h = false;
        if (d != null)
        {
            b.b();
        }
    }

    public final void c()
    {
        g = true;
    }

    public final void d()
    {
        g = false;
        c = null;
        if (d != null)
        {
            b(d, e, f);
            g();
        }
    }

    public final int e()
    {
        int j = 0;
        if (b != null)
        {
            j = android.view.View.MeasureSpec.makeMeasureSpec(i.getWidth(), 0x40000000);
            int k = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            b.measure(j, k);
            j = b.c();
        }
        return j;
    }

    public final void f()
    {
        i.removeView(b);
        b = null;
    }
}
