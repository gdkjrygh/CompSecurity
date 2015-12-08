// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.service.storesearch.AisleLocations;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapLoader

class sleLoadCallback extends CallbackSameThread
{

    final InStoreMapLoader this$0;
    final sleLoadCallback val$aisleLoadCallback;

    public void onResultSameThread(Request request, Result result)
    {
        InStoreMapLoader.access$000(InStoreMapLoader.this).remove(request);
        if (result.successful() && result.hasData())
        {
            val$aisleLoadCallback.onAisleLocations((AisleLocations)result.getData());
            return;
        } else
        {
            val$aisleLoadCallback.onAisleFailed();
            return;
        }
    }

    sleLoadCallback()
    {
        this$0 = final_instoremaploader;
        val$aisleLoadCallback = sleLoadCallback.this;
        super();
    }
}
