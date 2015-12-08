// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupService

class llback
    implements com.walmart.android.wmservice.allback
{

    final FastPickupService this$0;
    final llback val$callback;

    public void onFailure(int i)
    {
        WLog.d(FastPickupService.access$100(), "renewSession.onFailure()");
        val$callback.onFailure(Integer.valueOf(i), null);
    }

    public void onSuccess()
    {
        WLog.d(FastPickupService.access$100(), "renewSession.onSuccess()");
        Services.get().getWalmartService().getFastPickupOrders(val$callback);
    }

    llback()
    {
        this$0 = final_fastpickupservice;
        val$callback = llback.this;
        super();
    }
}
