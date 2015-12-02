// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import gka;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            TripNotificationData

class this._cls0
    implements gka
{

    final TripNotificationData this$0;

    public boolean apply(reSplitClient resplitclient)
    {
        return resplitclient.getStatus().equals("Accepted");
    }

    public volatile boolean apply(Object obj)
    {
        return apply((reSplitClient)obj);
    }

    reSplitClient()
    {
        this$0 = TripNotificationData.this;
        super();
    }
}
