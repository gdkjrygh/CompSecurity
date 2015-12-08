// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentConfirmationFragment

class this._cls0 extends CallbackSameThread
{

    final PaymentConfirmationFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData())
        {
            WLog.d(PaymentConfirmationFragment.access$100(PaymentConfirmationFragment.this), (new StringBuilder()).append("Client notified transaction ").append(PaymentConfirmationFragment.access$200(PaymentConfirmationFragment.this).id).append(" as seen.").toString());
            return;
        } else
        {
            WLog.d(PaymentConfirmationFragment.access$300(PaymentConfirmationFragment.this), (new StringBuilder()).append("Failed to notify transaction ").append(PaymentConfirmationFragment.access$200(PaymentConfirmationFragment.this).id).append(": ").append(result.getError()).toString());
            return;
        }
    }

    ()
    {
        this$0 = PaymentConfirmationFragment.this;
        super();
    }
}
