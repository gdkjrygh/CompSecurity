// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverPresenterSyncCallback, SaverReceiptListPresenter

class init> extends SaverPresenterSyncCallback
{

    final SaverReceiptListPresenter this$0;

    protected void onSyncResult(Integer integer)
    {
        if (!isPopped())
        {
            SaverReceiptListPresenter.access$1000(SaverReceiptListPresenter.this, true, true);
            SaverReceiptListPresenter.access$1100(SaverReceiptListPresenter.this);
            SaverReceiptListPresenter.access$1200(SaverReceiptListPresenter.this);
        }
    }

    protected void showNoNetworkDialog()
    {
        SaverReceiptListPresenter.access$1300(SaverReceiptListPresenter.this, 0);
    }

    protected void showUnknownErrorDialog()
    {
        SaverReceiptListPresenter.access$1400(SaverReceiptListPresenter.this, 1);
    }

    (Presenter presenter)
    {
        this$0 = SaverReceiptListPresenter.this;
        super(presenter);
    }
}
