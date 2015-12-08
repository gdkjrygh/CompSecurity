// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter, PrescriptionPresenter

class this._cls0
    implements this._cls0
{

    final OrderConfirmationBasePresenter this$0;

    public void onFlowCompleted()
    {
        PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity);
        OrderConfirmationBasePresenter.access$000(OrderConfirmationBasePresenter.this, prescriptionpresenter);
    }

    ()
    {
        this$0 = OrderConfirmationBasePresenter.this;
        super();
    }
}
