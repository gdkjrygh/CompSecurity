// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

class this._cls0
    implements Runnable
{

    final StoreLocationManager this$0;

    public void run()
    {
        WLog.i(StoreLocationManager.TAG, "Location fix timed out.");
        if (StoreLocationManager.access$000(StoreLocationManager.this) == null)
        {
            return;
        } else
        {
            StoreLocationManager.access$100(StoreLocationManager.this);
            StoreLocationManager.access$200(StoreLocationManager.this);
            return;
        }
    }

    _cls9()
    {
        this$0 = StoreLocationManager.this;
        super();
    }
}
