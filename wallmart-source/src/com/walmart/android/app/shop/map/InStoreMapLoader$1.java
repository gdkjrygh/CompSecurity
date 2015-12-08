// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.service.storesearch.StoreMapMapping;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapLoader

class abledCallback extends CallbackSameThread
{

    final InStoreMapLoader this$0;
    final abledCallback val$enabledCallback;
    final String val$storeId;

    public void onResultSameThread(Request request, Result result)
    {
        InStoreMapLoader.access$000(InStoreMapLoader.this).remove(request);
        if (result.successful() && result.hasData())
        {
            request = ((StoreMapMapping)result.getData()).mapping;
            if (request.get(val$storeId) != null)
            {
                val$enabledCallback.onEnabled((String)request.get(val$storeId));
                return;
            } else
            {
                WLog.e(InStoreMapLoader.access$100(), (new StringBuilder()).append("Failed to load store id - map id mappings, no data for store ").append(val$storeId).toString());
                val$enabledCallback.onEnabled(null);
                return;
            }
        } else
        {
            WLog.e(InStoreMapLoader.access$100(), "Failed to load store id - map id mappings");
            val$enabledCallback.onEnabled(null);
            return;
        }
    }

    abledCallback()
    {
        this$0 = final_instoremaploader;
        val$storeId = s;
        val$enabledCallback = abledCallback.this;
        super();
    }
}
