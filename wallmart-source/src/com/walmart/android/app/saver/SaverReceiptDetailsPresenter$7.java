// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.EReceiptImageContentProvider;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class val.callback
    implements com.walmartlabs.ereceipt.service..callback
{

    final SaverReceiptDetailsPresenter this$0;
    final AsyncCallbackOnThread val$callback;
    final String val$tcNbr;
    final String val$uuid;

    public volatile void onResult(Object obj)
    {
        onResult((String)obj);
    }

    public void onResult(String s)
    {
        EReceiptImageContentProvider.storeReceiptImage(SaverReceiptDetailsPresenter.access$1200(SaverReceiptDetailsPresenter.this), val$uuid, val$tcNbr, s, val$callback);
    }

    r()
    {
        this$0 = final_saverreceiptdetailspresenter;
        val$uuid = s;
        val$tcNbr = s1;
        val$callback = AsyncCallbackOnThread.this;
        super();
    }
}
