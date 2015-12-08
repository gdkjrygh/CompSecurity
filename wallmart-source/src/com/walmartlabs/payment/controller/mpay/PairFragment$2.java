// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.widget.RelativeLayout;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PairFragment

class this._cls0 extends CallbackSameThread
{

    final PairFragment this$0;

    public void onResultSameThread(Request request, Result result)
    {
        WLog.d(PairFragment.access$200(), (new StringBuilder()).append("result code = ").append(result.getStatusCode()).toString());
        if (result.successful() && result.hasData())
        {
            PairFragment.access$300(PairFragment.this).setVisibility(8);
            PairFragment.access$002(PairFragment.this, true);
            return;
        } else
        {
            PairFragment.access$400(PairFragment.this, result.getError());
            return;
        }
    }

    ()
    {
        this$0 = PairFragment.this;
        super();
    }
}
