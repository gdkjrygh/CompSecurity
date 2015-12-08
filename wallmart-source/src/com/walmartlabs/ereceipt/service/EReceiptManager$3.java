// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

class init> extends AsyncCallbackOnThread
{

    final EReceiptManager this$0;
    final AsyncCallbackOnThread val$callback;

    public void onFailureSameThread(Integer integer, Receipt receipt)
    {
        val$callback.onFailureSameThread(integer, receipt);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Receipt)obj1);
    }

    public void onSuccessSameThread(Receipt receipt)
    {
        val$callback.onSuccessSameThread(receipt);
        (new iteLocalEReceiptsTask(EReceiptManager.this, true, true)).execute(new Receipt[] {
            receipt
        });
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Receipt)obj);
    }

    Receipt(AsyncCallbackOnThread asynccallbackonthread)
    {
        this$0 = final_ereceiptmanager;
        val$callback = asynccallbackonthread;
        super(Handler.this);
    }
}
