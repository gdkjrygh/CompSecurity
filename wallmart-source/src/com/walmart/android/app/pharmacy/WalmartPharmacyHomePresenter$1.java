// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;


// Referenced classes of package com.walmart.android.app.pharmacy:
//            WalmartPharmacyHomePresenter

class this._cls0
    implements com.walmartlabs.android.pharmacy.r.RefillListener
{

    final WalmartPharmacyHomePresenter this$0;

    public void refill()
    {
        startEasyRefill();
    }

    r.RefillListener()
    {
        this$0 = WalmartPharmacyHomePresenter.this;
        super();
    }
}
