// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

class cationCallback
    implements android.content.Listener
{

    final StoreLocationManager this$0;
    final cationCallback val$callback;
    final boolean val$requestOnCancel;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$requestOnCancel)
        {
            StoreLocationManager.access$900(StoreLocationManager.this, val$callback);
        } else
        if (val$callback != null)
        {
            val$callback.onError(1);
            return;
        }
    }

    cationCallback()
    {
        this$0 = final_storelocationmanager;
        val$requestOnCancel = flag;
        val$callback = cationCallback.this;
        super();
    }
}
