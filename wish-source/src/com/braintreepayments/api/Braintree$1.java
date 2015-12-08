// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.braintreepayments.api:
//            Braintree

class t> extends BroadcastReceiver
{

    final Braintree this$0;

    public void onReceive(Context context, Intent intent)
    {
        int i = intent.getIntExtra("com.braintreepayments.api.messages.EXTRA_RESULT_CODE", -1);
        context = (Intent)intent.getParcelableExtra("com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT");
        finishPayWithPayPal(Braintree.access$000(Braintree.this), i, context);
    }

    ()
    {
        this$0 = Braintree.this;
        super();
    }
}
