// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import android.widget.AdapterView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, RefillsListAdapter

class this._cls0 extends OnItemSingleClickListener
{

    final PrescriptionPresenter this$0;

    public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = (com.walmartlabs.android.pharmacy.service.on)PrescriptionPresenter.access$000(PrescriptionPresenter.this).getItem(i);
            if (adapterview != null)
            {
                if (!adapterview.canBeRefilled())
                {
                    break label0;
                }
                PrescriptionPresenter.access$100(PrescriptionPresenter.this, adapterview);
                MessageBus.getBus().post((new com.walmartlabs.anivia.r("pharmRefillAttemptMethod")).putBoolean("loggedIn", true).putString("refillType", "historyRefill"));
            }
            return;
        }
        PrescriptionPresenter.access$200(PrescriptionPresenter.this, 3);
    }

    escription(Presenter presenter)
    {
        this$0 = PrescriptionPresenter.this;
        super(presenter);
    }
}
