// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

class cationData
    implements StoresLoadedCallback
{

    final WalmartLocationService this$0;
    final cationData val$locationData;

    public void onStoresLoaded(oreResult oreresult)
    {
        if (!WalmartLocationService.access$100(WalmartLocationService.this))
        {
            return;
        }
        if (oreresult != null)
        {
            WLog.d(WalmartLocationService.TAG, "using cached stores");
            WalmartLocationService.access$600(WalmartLocationService.this, oreResult.access._mth500(oreresult), val$locationData);
            WalmartLocationService.access$300(WalmartLocationService.this);
            return;
        } else
        {
            WalmartLocationService.access$700(WalmartLocationService.this, val$locationData);
            return;
        }
    }

    cationData()
    {
        this$0 = final_walmartlocationservice;
        val$locationData = cationData.this;
        super();
    }
}
