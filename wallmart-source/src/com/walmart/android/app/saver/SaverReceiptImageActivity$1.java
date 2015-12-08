// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptImageActivity, SaverReceiptImagePresenter

class this._cls0
    implements com.walmartlabs.ereceipt.service.ck
{

    final SaverReceiptImageActivity this$0;

    public void onResult(EReceipt ereceipt)
    {
        if (!isFinishing())
        {
            SaverReceiptImageActivity.access$000(SaverReceiptImageActivity.this).setReceipt(ereceipt);
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((EReceipt)obj);
    }

    lback()
    {
        this$0 = SaverReceiptImageActivity.this;
        super();
    }
}
