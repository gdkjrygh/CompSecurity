// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;


// Referenced classes of package com.walmart.android.app.pharmacy:
//            WalmartPharmacyAuthenticator

class val.callback
    implements com.walmartlabs.android.pharmacy.val.callback
{

    final val.callback this$0;
    final com.walmart.android.app.account..val.callback val$callback;

    public void onFlowCompleted()
    {
        if (val$callback != null)
        {
            val$callback.callback();
        }
    }

    ()
    {
        this$0 = final_;
        val$callback = com.walmart.android.app.account..val.callback.this;
        super();
    }
}
