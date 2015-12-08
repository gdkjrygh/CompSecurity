// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.MenuItem;
import android.view.View;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class val.receipt extends OnSingleClickListener
{

    final SaverReceiptDetailsPresenter this$0;
    final SaverReceipt val$receipt;
    final MenuItem val$shareAction;

    public void onSingleClick(View view)
    {
        SaverReceiptDetailsPresenter.access$900(SaverReceiptDetailsPresenter.this, val$shareAction, val$receipt);
    }

    (SaverReceipt saverreceipt)
    {
        this$0 = final_saverreceiptdetailspresenter;
        val$shareAction = MenuItem.this;
        val$receipt = saverreceipt;
        super(final_presenter);
    }
}
