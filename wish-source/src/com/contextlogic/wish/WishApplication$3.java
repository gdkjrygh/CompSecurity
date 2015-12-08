// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish;

import com.contextlogic.wish.api.service.ServerPingService;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

// Referenced classes of package com.contextlogic.wish:
//            WishApplication

class this._cls0
    implements Runnable
{

    final WishApplication this$0;

    public void run()
    {
        try
        {
            com.google.android.gms.ads.identifier.t.Info info = AdvertisingIdClient.getAdvertisingIdInfo(WishApplication.getAppInstance());
            String s = info.getId();
            if (!info.isLimitAdTrackingEnabled())
            {
                (new ServerPingService()).requestService(null, s, null, null);
            }
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    PingService()
    {
        this$0 = WishApplication.this;
        super();
    }
}
