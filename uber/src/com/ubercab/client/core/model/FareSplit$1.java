// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareSplitClient;
import gka;

// Referenced classes of package com.ubercab.client.core.model:
//            FareSplit

class this._cls0
    implements gka
{

    final FareSplit this$0;

    public boolean apply(FareSplitClient faresplitclient)
    {
        return faresplitclient.getIsInitiator();
    }

    public volatile boolean apply(Object obj)
    {
        return apply((FareSplitClient)obj);
    }

    Client()
    {
        this$0 = FareSplit.this;
        super();
    }
}
