// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import com.ubercab.client.core.model.Ping;
import dal;
import dbf;
import dul;
import ijg;
import ijj;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderActivity

final class a
    implements Runnable
{

    final Ping a;
    final RiderActivity b;

    public final void run()
    {
        b.a_(a.getDescription());
        if (dul.a(a, 0) && b.c.v())
        {
            ijg.a(dbf.af.name()).d("DispatchResponse_ERROR_LOGOUT", new Object[0]);
            b.c.P();
            b.v();
        }
    }

    (RiderActivity rideractivity, Ping ping)
    {
        b = rideractivity;
        a = ping;
        super();
    }
}
