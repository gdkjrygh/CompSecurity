// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter, PharmacyManager

class ntCallback
    implements back
{

    final OrderConfirmationBasePresenter this$0;
    final ntCallback val$hasRxEnabledAccountCallback;

    public void onSessionAvailable()
    {
        PharmacyManager.get().hasRxEnabledAccount(val$hasRxEnabledAccountCallback);
    }

    public void onSessionUnavailable()
    {
        populateAccountSections(false, false);
    }

    ntCallback()
    {
        this$0 = final_orderconfirmationbasepresenter;
        val$hasRxEnabledAccountCallback = ntCallback.this;
        super();
    }
}
