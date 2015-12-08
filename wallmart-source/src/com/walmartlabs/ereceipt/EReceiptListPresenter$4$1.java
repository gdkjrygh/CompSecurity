// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptListAdapter, EReceiptDetailPresenter

class val.receipt
    implements leteHandler
{

    final is._cls0 this$1;
    final EReceipt val$receipt;

    public void deleteReceipt(String s, boolean flag)
    {
        EReceiptListPresenter.access$502(_fld0, val$receipt);
        EReceiptListPresenter.access$1000(_fld0);
    }

    nit>()
    {
        this$1 = final_nit>;
        val$receipt = EReceipt.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/ereceipt/EReceiptListPresenter$4

/* anonymous class */
    class EReceiptListPresenter._cls4 extends OnItemSingleClickListener
    {

        final EReceiptListPresenter this$0;

        public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (EReceipt)EReceiptListPresenter.access$400(EReceiptListPresenter.this).getItem(i);
            if (adapterview != null)
            {
                view = new EReceiptDetailPresenter(EReceiptListPresenter.access$700(EReceiptListPresenter.this), adapterview, EReceiptListPresenter.access$800(EReceiptListPresenter.this));
                view.setDialogConfiguration(EReceiptListPresenter.access$900(EReceiptListPresenter.this));
                if (EReceiptListPresenter.access$300(EReceiptListPresenter.this) != null)
                {
                    view.setItemPresenterFactory(EReceiptListPresenter.access$300(EReceiptListPresenter.this));
                }
                view.setDeleteHandler(adapterview. new EReceiptListPresenter._cls4._cls1());
                EReceiptListPresenter.access$1100(EReceiptListPresenter.this, view);
                return;
            } else
            {
                Log.e(EReceiptListPresenter.access$1200(), (new StringBuilder()).append("Invalid eReceipt at position ").append(i).toString());
                return;
            }
        }

            
            {
                this$0 = EReceiptListPresenter.this;
                super(presenter);
            }
    }

}
