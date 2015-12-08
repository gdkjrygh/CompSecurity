// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter

class val.isLastInList
    implements com.walmart.android.wmservice.val.isLastInList
{

    final SaverReceiptListPresenter this$0;
    final boolean val$isLastInList;
    final boolean val$isList;
    final SaverReceipt val$receipt;

    public void onFailure(int i)
    {
        if (isTop())
        {
            SaverReceiptListPresenter.access$1700(SaverReceiptListPresenter.this, 1001);
            SaverReceiptListPresenter.access$1000(SaverReceiptListPresenter.this, false, false);
            SaverReceiptListPresenter.access$400(SaverReceiptListPresenter.this).launchSignIn();
        }
    }

    public void onSuccess()
    {
        SaverManager.get().addReceiptToSaver(val$receipt, "existing", new erCallback(SaverReceiptListPresenter.this, new Handler(), val$receipt, val$isList, val$isLastInList));
    }

    erCallback()
    {
        this$0 = final_saverreceiptlistpresenter;
        val$receipt = saverreceipt;
        val$isList = flag;
        val$isLastInList = Z.this;
        super();
    }
}
