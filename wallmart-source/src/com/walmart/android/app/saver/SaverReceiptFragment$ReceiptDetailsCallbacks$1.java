// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFragment, SaverFeedbackPresenter

class val.receiptPrice
    implements acks
{

    final val.receipt this$1;
    final String val$imageUrl;
    final SaverReceipt val$receipt;
    final String val$receiptPrice;

    public void onShowFeedback(com.walmart.android.service.saver. )
    {
        PresenterStack presenterstack = SaverReceiptFragment.access$1100(_fld0);
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        String s;
        if (val$receipt.store != null)
        {
            s = val$receipt.store.receipt;
        } else
        {
            s = "";
        }
        presenterstack.pushPresenter(new SaverFeedbackPresenter(fragmentactivity, s, .receipt, val$imageUrl, .imageUrl(), val$receiptPrice, val$receipt.tcNumber, val$receipt.localDate, new val.receipt(_fld0, null)), true);
    }

    public void onShowItemDetails(com.walmart.android.service.saver. )
    {
        SaverReceiptFragment.access$900(_fld0).pushPresenter(cess._mth800(this._cls1.this, val$receipt, , false), true);
    }

    acks()
    {
        this$1 = final_acks;
        val$receipt = saverreceipt;
        val$imageUrl = s;
        val$receiptPrice = String.this;
        super();
    }
}
