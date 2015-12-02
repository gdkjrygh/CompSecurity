// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;


// Referenced classes of package com.ubercab.client.core.app:
//            RiderApplication, RiderActivity

final class a
    implements Runnable
{

    final RiderActivity a;
    final RiderApplication b;

    public final void run()
    {
        RiderApplication.a(b, a);
    }

    (RiderApplication riderapplication, RiderActivity rideractivity)
    {
        b = riderapplication;
        a = rideractivity;
        super();
    }
}
