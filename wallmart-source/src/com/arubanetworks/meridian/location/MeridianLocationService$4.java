// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import com.arubanetworks.meridian.log.MeridianLogger;

// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocationService

class a
    implements Runnable
{

    final MeridianLocationService a;

    public void run()
    {
        MeridianLocationService.a().d((new StringBuilder()).append("Updating delegate with previously-cached location: ").append(MeridianLocationService.e(a)).toString());
        cationManagerBinder.a(MeridianLocationService.f(a), MeridianLocationService.e(a));
    }

    cationManagerBinder(MeridianLocationService meridianlocationservice)
    {
        a = meridianlocationservice;
        super();
    }
}
