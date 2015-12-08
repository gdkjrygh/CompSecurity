// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import android.widget.AdapterView;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.android.pharmacy.ui.HistoryListWrapperAdapter;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, OrderDetailsPresenter

class this._cls0 extends OnItemSingleClickListener
{

    final PrescriptionPresenter this$0;

    public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (com.walmartlabs.android.pharmacy.service.)PrescriptionPresenter.access$300(PrescriptionPresenter.this).getItem(i);
        if (adapterview != null)
        {
            PrescriptionPresenter.access$500(PrescriptionPresenter.this, new OrderDetailsPresenter(PrescriptionPresenter.access$400(PrescriptionPresenter.this), adapterview));
        }
    }

    Fill(Presenter presenter)
    {
        this$0 = PrescriptionPresenter.this;
        super(presenter);
    }
}
