// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import gka;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            TripNotificationData

class val.lastData
    implements gka
{

    final TripNotificationData this$0;
    final TripNotificationData val$lastData;

    public boolean apply(reSplitClient resplitclient)
    {
        reSplitClient resplitclient1 = val$lastData.findClient(resplitclient.getId());
        return resplitclient1 != null && resplitclient.getStatus().equals("Accepted") && !resplitclient1.getStatus().equals("Accepted");
    }

    public volatile boolean apply(Object obj)
    {
        return apply((reSplitClient)obj);
    }

    reSplitClient()
    {
        this$0 = final_tripnotificationdata;
        val$lastData = TripNotificationData.this;
        super();
    }
}
