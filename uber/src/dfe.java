// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;
import java.util.Collection;

public final class dfe
{

    private final RiderActivity a;

    public dfe(RiderActivity rideractivity)
    {
        a = rideractivity;
    }

    static czl a(RiderActivity rideractivity)
    {
        return new czl(rideractivity);
    }

    static czo a(dqx dqx, dqw dqw, dcs dcs, cyh cyh, dcr dcr)
    {
        return new czo(new dcq[] {
            dcs, dqw, dqx, cyh, dcr
        });
    }

    static Collection a(Collection collection, czl czl1, czn czn1, czp czp1, dot dot, dov dov, czo czo1, czm czm1)
    {
        return (new gkf()).a(czl1).a(czn1).a(czp1).a(dot).a(dov).a(czo1).a(czm1).a(collection).a();
    }

    final RiderActivity a()
    {
        return a;
    }

    final czm a(chp chp)
    {
        return new czm(chp, a);
    }

    final czn a(cev cev)
    {
        return new czn(a, cev);
    }

    final czp a(gqd gqd)
    {
        return new czp(a, gqd);
    }

    protected final czq a(daj daj, dpg dpg, hkr hkr)
    {
        return new czq(a, daj, dpg, hkr);
    }
}
