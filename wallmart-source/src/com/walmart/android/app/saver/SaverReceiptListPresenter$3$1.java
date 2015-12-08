// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter, SaverReceiptListAdapter, SaverReceiptFilteredListAdapter, EReceiptSearchManager

class val.receipt
    implements com.walmart.android.service.saver.receipt
{

    final onResult this$1;
    final EReceipt val$receipt;

    public void onResult(SaverReceipt saverreceipt)
    {
        if (saverreceipt.needsConfirmation() && SaverReceiptListPresenter.access$200(_fld0).hasSaverData())
        {
            SaverReceiptListPresenter.access$300(_fld0, saverreceipt);
            return;
        } else
        {
            SaverReceiptListPresenter.access$400(_fld0).launchDetails(_fld0, val$receipt.tcNumber);
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((SaverReceipt)obj);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$receipt = EReceipt.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverReceiptListPresenter$3

/* anonymous class */
    class SaverReceiptListPresenter._cls3 extends OnItemSingleClickListener
    {

        final SaverReceiptListPresenter this$0;

        public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
        {
            int j = SaverReceiptListPresenter.access$100(SaverReceiptListPresenter.this).getHeaderViewsCount();
            adapterview = (EReceipt)SaverReceiptListPresenter.access$600(SaverReceiptListPresenter.this).getItem(i - j);
            SaverManager.get().getReceipt(((EReceipt) (adapterview)).uuid, adapterview. new SaverReceiptListPresenter._cls3._cls1());
            SaverReceiptListPresenter.access$700(SaverReceiptListPresenter.this).saveFocusState();
            SaverReceiptListPresenter.access$700(SaverReceiptListPresenter.this).requestSearch();
        }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super(presenter);
            }
    }

}
