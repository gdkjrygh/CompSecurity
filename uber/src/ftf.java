// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Trip;

final class ftf
    implements ide
{

    final fte a;

    private ftf(fte fte1)
    {
        a = fte1;
        super();
    }

    ftf(fte fte1, byte byte0)
    {
        this(fte1);
    }

    private void a(ftg ftg1)
    {
        if (fte.a(a).n())
        {
            City city = (City)ftg1.a.d();
            ClientStatus clientstatus = (ClientStatus)ftg1.b.d();
            ftg1 = (Trip)ftg1.c.d();
            if (clientstatus != null)
            {
                if (!"Looking".equals(clientstatus.getStatus()))
                {
                    a.r();
                }
                a.a(city, ftg1);
                if (ftg1 == null)
                {
                    fte.b(a);
                    a.t();
                    return;
                } else
                {
                    fte.c(a);
                    fte.a(a, ftg1);
                    return;
                }
            }
        }
    }

    public final void call(Object obj)
    {
        a((ftg)obj);
    }
}
