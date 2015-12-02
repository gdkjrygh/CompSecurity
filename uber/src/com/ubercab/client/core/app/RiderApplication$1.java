// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.os.Handler;
import dop;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderApplication, RiderActivity

final class b
    implements dop
{

    final Handler a;
    final RiderActivity b;
    final RiderApplication c;

    public final void a(Exception exception)
    {
        RiderApplication.a(c, a, b);
    }

    public final void a(String s, String s1)
    {
        RiderApplication.a(c, a, b);
    }

    (RiderApplication riderapplication, Handler handler, RiderActivity rideractivity)
    {
        c = riderapplication;
        a = handler;
        b = rideractivity;
        super();
    }
}
