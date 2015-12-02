// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.about.OtherFragment;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Trip;

final class dxo
    implements ide
{

    final dxm a;

    private dxo(dxm dxm1)
    {
        a = dxm1;
        super();
    }

    dxo(dxm dxm1, byte byte0)
    {
        this(dxm1);
    }

    private void a(dxp dxp1)
    {
        Object obj = (Trip)dxp1.b.d();
        boolean flag;
        boolean flag1;
        if (obj != null && ((Trip) (obj)).getIsZeroTolerance())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = a.f.c();
        if (obj != null)
        {
            obj = ((RiderLocation) (obj)).getLocation();
        } else
        {
            obj = null;
        }
        flag1 = OtherFragment.a(a.c, (City)dxp1.a.d(), ((com.ubercab.android.location.UberLocation) (obj)));
        if (!dxm.a(a).isEmpty() && dxm.b(a) == flag1 && dxm.c(a) == flag)
        {
            return;
        } else
        {
            dxm.a(a, flag1);
            dxm.b(a, flag);
            dxm.d(a);
            return;
        }
    }

    public final void call(Object obj)
    {
        a((dxp)obj);
    }
}
