// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

class val.callback extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;
    final AsyncCallbackOnThread val$callback;
    final String val$localDate;
    final String val$tcNumber;

    public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service. )
    {
        if (404 == integer.intValue())
        {
            (new nit>(_fld0, null)).ecute(new String[] {
                val$tcNumber, val$localDate
            });
        }
        val$callback.onFailure(integer, );
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service..onFailureSameThread)obj1);
    }

    public void onSuccessSameThread(com.walmartlabs.ereceipt.service. )
    {
        val$callback.onSuccessSameThread();
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((com.walmartlabs.ereceipt.service..onSuccessSameThread)obj);
    }

    (AsyncCallbackOnThread asynccallbackonthread)
    {
        this$1 = final_;
        val$tcNumber = s;
        val$localDate = String.this;
        val$callback = asynccallbackonthread;
        super(final_handler);
    }
}
