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

class erInfoInterface extends CallbackSameThread
{

    final MobilePayManager this$0;
    final String val$cid;
    final erInfoInterface val$userInfoInterface;

    public void onResultSameThread(Request request, Result result)
    {
        MobilePayManager.access$400(MobilePayManager.this).remove(request);
        MobilePayManager.access$500(MobilePayManager.this, result, val$cid);
        if (val$userInfoInterface != null)
        {
            val$userInfoInterface.onGetUserInfo(MobilePayManager.access$600(MobilePayManager.this));
        }
    }

    erInfoInterface()
    {
        this$0 = final_mobilepaymanager;
        val$cid = s;
        val$userInfoInterface = erInfoInterface.this;
        super();
    }
}
