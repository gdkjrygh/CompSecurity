// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class val.receipt
    implements com.walmart.android.wmservice.val.receipt
{

    final SaverReceiptDetailsPresenter this$0;
    final SaverReceipt val$receipt;

    public void onFailure(int i)
    {
        if (isTop())
        {
            dismissDialog(1001);
            SaverReceiptDetailsPresenter.access$400(SaverReceiptDetailsPresenter.this).launchSignIn();
        }
    }

    public void onSuccess()
    {
        SaverManager.get().addReceiptToSaver(val$receipt, "existing", new erCallback(SaverReceiptDetailsPresenter.this, new Handler(), val$receipt));
    }

    erCallback()
    {
        this$0 = final_saverreceiptdetailspresenter;
        val$receipt = SaverReceipt.this;
        super();
    }
}
