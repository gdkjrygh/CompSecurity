// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverPresenterSyncCallback, SaverReceiptDetailsPresenter

class t> extends SaverPresenterSyncCallback
{

    final SaverReceiptDetailsPresenter this$0;
    final com.walmart.android.service.saver.._cls0 val$allReceiptCallback;

    protected void onSyncResult(Integer integer)
    {
        if (!isPopped())
        {
            SaverManager.get().getAllReceipts(val$allReceiptCallback);
        }
    }

    protected void showNoNetworkDialog()
    {
        SaverReceiptDetailsPresenter.access$2100(SaverReceiptDetailsPresenter.this, 1);
    }

    protected void showUnknownErrorDialog()
    {
        SaverReceiptDetailsPresenter.access$2200(SaverReceiptDetailsPresenter.this, 2);
    }

    (com.walmart.android.service.saver. )
    {
        this$0 = final_saverreceiptdetailspresenter;
        val$allReceiptCallback = ;
        super(Presenter.this);
    }
}
