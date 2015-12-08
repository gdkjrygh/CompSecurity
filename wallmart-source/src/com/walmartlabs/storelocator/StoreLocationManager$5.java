// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

class this._cls0
    implements Runnable
{

    final StoreLocationManager this$0;

    public void run()
    {
        WLog.d(StoreLocationManager.TAG, "onConnectionSuspended");
        if (StoreLocationManager.access$000(StoreLocationManager.this) == null)
        {
            return;
        }
        for (Iterator iterator = goingRequest.access._mth800(StoreLocationManager.access$000(StoreLocationManager.this)).iterator(); iterator.hasNext(); ((cationCallback)iterator.next()).onError(1)) { }
        StoreLocationManager.access$200(StoreLocationManager.this);
    }

    cationCallback()
    {
        this$0 = StoreLocationManager.this;
        super();
    }
}
