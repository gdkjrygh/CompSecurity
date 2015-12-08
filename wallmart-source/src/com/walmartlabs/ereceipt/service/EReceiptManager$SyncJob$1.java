// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptsResponse

class val.this._cls0 extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;
    final EReceiptManager val$this$0;

    public void onFailureSameThread(Integer integer, EReceiptsResponse ereceiptsresponse)
    {
        cess._mth3800(this._cls1.this, integer);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (EReceiptsResponse)obj1);
    }

    public void onSuccessSameThread(EReceiptsResponse ereceiptsresponse)
    {
        if (cess._mth3900(this._cls1.this))
        {
            cess._mth3800(this._cls1.this, Integer.valueOf(-1));
            return;
        }
        if (ereceiptsresponse == null || ereceiptsresponse.receipts == null)
        {
            cess._mth3800(this._cls1.this, Integer.valueOf(0x15f91));
            return;
        } else
        {
            cess._mth4000(this._cls1.this, ereceiptsresponse);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((EReceiptsResponse)obj);
    }

    (EReceiptManager ereceiptmanager)
    {
        this$1 = final_;
        val$this$0 = ereceiptmanager;
        super(Handler.this);
    }
}
