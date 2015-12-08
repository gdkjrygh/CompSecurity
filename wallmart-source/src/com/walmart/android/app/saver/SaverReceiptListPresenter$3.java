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
//            SaverReceiptListPresenter, SaverReceiptFilteredListAdapter, EReceiptSearchManager, SaverReceiptListAdapter

class this._cls0 extends OnItemSingleClickListener
{

    final SaverReceiptListPresenter this$0;

    public void onItemSingleClick(final AdapterView receipt, View view, int i, long l)
    {
        int j = SaverReceiptListPresenter.access$100(SaverReceiptListPresenter.this).getHeaderViewsCount();
        receipt = (EReceipt)SaverReceiptListPresenter.access$600(SaverReceiptListPresenter.this).getItem(i - j);
        SaverManager.get().getReceipt(((EReceipt) (receipt)).uuid, new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverReceiptListPresenter._cls3 this$1;
            final EReceipt val$receipt;

            public void onResult(SaverReceipt saverreceipt)
            {
                if (saverreceipt.needsConfirmation() && SaverReceiptListPresenter.access$200(this$0).hasSaverData())
                {
                    SaverReceiptListPresenter.access$300(this$0, saverreceipt);
                    return;
                } else
                {
                    SaverReceiptListPresenter.access$400(this$0).launchDetails(this$0, receipt.tcNumber);
                    return;
                }
            }

            public volatile void onResult(Object obj)
            {
                onResult((SaverReceipt)obj);
            }

            
            {
                this$1 = SaverReceiptListPresenter._cls3.this;
                receipt = ereceipt;
                super();
            }
        });
        SaverReceiptListPresenter.access$700(SaverReceiptListPresenter.this).saveFocusState();
        SaverReceiptListPresenter.access$700(SaverReceiptListPresenter.this).requestSearch();
    }

    _cls1.val.receipt(Presenter presenter)
    {
        this$0 = SaverReceiptListPresenter.this;
        super(presenter);
    }
}
