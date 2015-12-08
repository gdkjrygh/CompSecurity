// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyHomePresenter

class this._cls0
    implements resenter.RefillListener
{

    final PharmacyHomePresenter this$0;

    public void refill()
    {
        startEasyRefill();
    }

    resenter.RefillListener()
    {
        this$0 = PharmacyHomePresenter.this;
        super();
    }
}
