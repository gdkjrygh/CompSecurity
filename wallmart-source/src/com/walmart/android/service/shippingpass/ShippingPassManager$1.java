// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.shippingpass;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.service.shippingpass:
//            ShippingPassManager

class this._cls0
    implements com.walmart.android.wmservice.lback
{

    final ShippingPassManager this$0;

    public void onFailure(int i)
    {
        WLog.d(ShippingPassManager.access$000(), "onFailure(): Failed to refresh ShippingPass status");
    }

    public void onSuccess()
    {
        WLog.d(ShippingPassManager.access$000(), "onSuccess(): ShippingPass status refreshed");
    }

    ()
    {
        this$0 = ShippingPassManager.this;
        super();
    }
}
