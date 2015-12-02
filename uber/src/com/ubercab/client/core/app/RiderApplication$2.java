// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.os.Handler;
import hay;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderApplication, RiderActivity

final class b
    implements hay
{

    final Handler a;
    final RiderActivity b;
    final RiderApplication c;

    public final void a()
    {
        RiderApplication.a(c, a, b);
    }

    public final void b()
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
