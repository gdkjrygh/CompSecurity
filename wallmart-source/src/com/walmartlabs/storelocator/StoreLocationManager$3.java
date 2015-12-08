// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

class cationCallback
    implements android.content.Listener
{

    final StoreLocationManager this$0;
    final cationCallback val$callback;
    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        StoreLocationManager.access$1000(StoreLocationManager.this, val$context);
        if (val$callback != null)
        {
            val$callback.onError(2);
        }
    }

    cationCallback()
    {
        this$0 = final_storelocationmanager;
        val$context = context1;
        val$callback = cationCallback.this;
        super();
    }
}
