// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mobileapptracker.MobileAppTracker;
import cyl;
import java.io.IOException;
import rx;
import ry;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderApplication

final class a
    implements Runnable
{

    final RiderApplication a;

    public final void run()
    {
        com.google.android.gms.ads.identifier..Info info = AdvertisingIdClient.getAdvertisingIdInfo(a);
        a.m.setGoogleAdvertisingId(info.getId(), info.isLimitAdTrackingEnabled());
_L1:
        return;
        Object obj;
        obj;
        a.m.setDeviceId(a.G.a());
        if (a.S != null)
        {
            a.m.setAndroidId(android.provider.String(a.S, "android_id"));
            return;
        }
          goto _L1
        obj;
        return;
        obj;
    }

    ngIdClient.Info(RiderApplication riderapplication)
    {
        a = riderapplication;
        super();
    }
}
