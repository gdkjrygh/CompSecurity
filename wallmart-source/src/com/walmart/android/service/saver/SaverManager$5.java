// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

class  extends AsyncCallbackOnThread
{

    final SaverManager this$0;
    final AsyncCallbackOnThread val$eReceiptCallback;
    final AsyncCallbackOnThread val$saverCallback;
    final String val$source;

    public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service.se.Receipt receipt)
    {
        val$eReceiptCallback.onFailure(integer, receipt);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.se.Receipt)obj1);
    }

    public void onSuccessSameThread(com.walmartlabs.ereceipt.service.se.Receipt receipt)
    {
        SaverManager.access$700(SaverManager.this, receipt, val$source, val$eReceiptCallback, val$saverCallback);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((com.walmartlabs.ereceipt.service.se.Receipt)obj);
    }

    (AsyncCallbackOnThread asynccallbackonthread1)
    {
        this$0 = final_savermanager;
        val$eReceiptCallback = asynccallbackonthread;
        val$source = String.this;
        val$saverCallback = asynccallbackonthread1;
        super(final_handler);
    }
}
