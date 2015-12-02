// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

final class elh
    implements ide
{

    final elg a;

    private elh(elg elg1)
    {
        a = elg1;
        super();
    }

    elh(elg elg1, byte byte0)
    {
        this(elg1);
    }

    private void a(eli eli1)
    {
        Object obj = eli1.b;
        if (obj == null)
        {
            return;
        } else
        {
            String s = ((ClientStatus) (obj)).getStatus();
            Trip trip = (Trip)eli1.d.d();
            obj = dre.a(((ClientStatus) (obj)), (Eyeball)eli1.c.d(), trip);
            boolean flag = dre.a(((com.ubercab.rider.realtime.model.FareSplit) (obj)));
            elg.a(a, (City)eli1.a.d(), s, ((com.ubercab.rider.realtime.model.FareSplit) (obj)), flag, trip);
            return;
        }
    }

    public final void call(Object obj)
    {
        a((eli)obj);
    }
}
