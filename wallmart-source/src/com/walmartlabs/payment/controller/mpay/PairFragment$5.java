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
//            PairFragment

class this._cls0 extends CallbackSameThread
{

    final PairFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData())
        {
            WLog.d(PairFragment.access$200(), "Obtained transaction");
            request = (Transaction)result.getData();
            if (!((Transaction) (request)).clientSeen && ((Transaction) (request)).tc != null && !((Transaction) (request)).tc.isEmpty())
            {
                ((llbacks)PairFragment.access$700(PairFragment.this)).onTransaction(request);
            }
            return;
        } else
        {
            WLog.d(PairFragment.access$200(), (new StringBuilder()).append("Did not find transaction: ").append(result.getError()).toString());
            PairFragment.access$002(PairFragment.this, true);
            return;
        }
    }

    llbacks()
    {
        this$0 = PairFragment.this;
        super();
    }
}
