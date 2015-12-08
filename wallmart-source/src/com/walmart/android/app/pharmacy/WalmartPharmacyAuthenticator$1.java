// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;


// Referenced classes of package com.walmart.android.app.pharmacy:
//            WalmartPharmacyAuthenticator

class llback
    implements com.walmart.android.wmservice.._cls1
{

    final WalmartPharmacyAuthenticator this$0;
    final com.walmartlabs.android.pharmacy.llback val$callback;

    public void onFailure(int i)
    {
        val$callback.onSessionUnavailable();
    }

    public void onSuccess()
    {
        val$callback.onSessionAvailable();
    }

    llback()
    {
        this$0 = final_walmartpharmacyauthenticator;
        val$callback = com.walmartlabs.android.pharmacy.llback.this;
        super();
    }
}
