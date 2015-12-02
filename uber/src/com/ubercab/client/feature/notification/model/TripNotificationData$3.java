// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import gka;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            TripNotificationData

class val.id
    implements gka
{

    final TripNotificationData this$0;
    final String val$id;

    public boolean apply(reSplitClient resplitclient)
    {
        return resplitclient.getId().equals(val$id);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((reSplitClient)obj);
    }

    reSplitClient()
    {
        this$0 = final_tripnotificationdata;
        val$id = String.this;
        super();
    }
}
