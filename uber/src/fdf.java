// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

public final class fdf
{

    private final hkr a;
    private final gmg b;
    private final fcx c;
    private final fdl d;

    public fdf(hkr hkr1, gmg gmg1, fcx fcx1, fdl fdl1)
    {
        a = hkr1;
        b = gmg1;
        c = fcx1;
        d = fdl1;
    }

    private boolean c()
    {
        if (!b.b(dbf.H))
        {
            Object obj = a.d();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((ClientStatus) (obj)).getTripPendingRating();
            }
            if (obj != null)
            {
                obj = ((TripPendingRating) (obj)).getMarketplace();
                if (obj != null && ((String) (obj)).equals("eats"))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a()
    {
        if (c())
        {
            c.a();
            return;
        } else
        {
            d.a();
            return;
        }
    }

    public final void a(erk erk)
    {
        d.a(erk);
    }

    public final void b()
    {
        d.b();
    }
}
