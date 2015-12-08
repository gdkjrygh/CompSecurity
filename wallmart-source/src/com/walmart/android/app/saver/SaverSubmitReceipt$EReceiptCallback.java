// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverSubmitReceipt

public static abstract class  extends SaverSubmitReceipt
{

    public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service. )
    {
label0:
        {
            if (isTop())
            {
                dismissDialog(1001);
                if (404 != integer.intValue())
                {
                    break label0;
                }
                onNotFoundFailure();
            }
            return;
        }
        showDialog(1003);
        trackError("General Server Error");
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.ailureSameThread)obj1);
    }

    protected abstract void onNotFoundFailure();

    protected abstract void onReceipt(com.walmartlabs.ereceipt.service.ailureSameThread ailuresamethread);

    public void onSuccessSameThread(com.walmartlabs.ereceipt.service.ailureSameThread ailuresamethread)
    {
        if (isTop())
        {
            onReceipt(ailuresamethread);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((com.walmartlabs.ereceipt.service.uccessSameThread)obj);
    }

    public (Handler handler)
    {
        super(handler);
    }
}
