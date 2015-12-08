// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.fragments:
//            PaymentFragment

class this._cls0
    implements com.walmart.android.wmservice.hCallback
{

    final PaymentFragment this$0;

    public void onFailure(int i)
    {
        WLog.e(PaymentFragment.access$000(), "Unable to renew session");
        PaymentFragment.access$100(PaymentFragment.this);
    }

    public void onSuccess()
    {
        WLog.d(PaymentFragment.access$000(), "Successfully renewed session");
    }

    hCallback()
    {
        this$0 = PaymentFragment.this;
        super();
    }
}
