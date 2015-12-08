// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.mpay;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.service.mpay:
//            MobilePayManager

class this._cls0 extends CallbackSameThread
{

    final MobilePayManager this$0;

    public void onResultSameThread(Request request, Result result)
    {
        MobilePayManager.access$400(MobilePayManager.this).remove(request);
    }

    ()
    {
        this$0 = MobilePayManager.this;
        super();
    }
}
