// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.analytics.AnalyticsEvent;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptDetailPresenter, EReceiptItemListAdapter, EReceiptItemPresenterFactory

class nit> extends OnItemSingleClickListener
{

    final EReceiptDetailPresenter this$0;

    public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (EReceiptDetailPresenter.access$1200(EReceiptDetailPresenter.this) != null)
        {
            adapterview = (com.walmartlabs.ereceipt.service._cls0)EReceiptDetailPresenter.access$800(EReceiptDetailPresenter.this).getItem(i);
            if (adapterview != null)
            {
                view = EReceiptDetailPresenter.access$1200(EReceiptDetailPresenter.this).createPresenter(adapterview, EReceiptDetailPresenter.access$400(EReceiptDetailPresenter.this).getTimeInMs());
                flag = flag1;
                if (view != null)
                {
                    flag = true;
                    EReceiptDetailPresenter.access$1300(EReceiptDetailPresenter.this, view);
                    MessageBus.getBus().post(new AnalyticsEvent("Ereceipt", "Item view", ((com.walmartlabs.ereceipt.service._cls0) (adapterview))._fld0));
                }
            } else
            {
                Log.e(EReceiptDetailPresenter.access$1400(), (new StringBuilder()).append("Invalid item at position ").append(i).toString());
                flag = flag1;
            }
        }
        if (!flag)
        {
            clearSingleClickFlag();
        }
    }

    ry(Presenter presenter)
    {
        this$0 = EReceiptDetailPresenter.this;
        super(presenter);
    }
}
