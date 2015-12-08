// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import com.walmart.android.app.account.AccountListener;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            WalmartPharmacyAuthenticator

class 
    implements AccountListener
{

    final WalmartPharmacyAuthenticator this$0;
    final com.walmartlabs.android.pharmacy. val$callback;

    public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
    {
        val$callback.onFlowCompleted();
    }

    ()
    {
        this$0 = final_walmartpharmacyauthenticator;
        val$callback = com.walmartlabs.android.pharmacy..this;
        super();
    }
}
