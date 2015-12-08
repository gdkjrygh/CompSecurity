// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import com.walmartlabs.payment.service.mpay.MobilePayNotificationManager;
import com.walmartlabs.payment.service.payment.Transaction;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PairFragment

class this._cls0
    implements com.walmartlabs.payment.service.mpay.cationManager.MobilePayPushListener
{

    final PairFragment this$0;

    public void onMobilePayPush(Transaction transaction)
    {
        PairFragment.access$002(PairFragment.this, false);
        ((llbacks)PairFragment.access$100(PairFragment.this)).onTransaction(transaction);
        MobilePayNotificationManager.get().unregisterMobilePayPushListener();
    }

    ionManager()
    {
        this$0 = PairFragment.this;
        super();
    }
}
