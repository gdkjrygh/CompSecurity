// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationRefillPresenter, PharmacyManager, PrescriptionPresenter

class this._cls0
    implements android.view.onRefillPresenter._cls2
{

    final OrderConfirmationRefillPresenter this$0;

    public void onClick(View view)
    {
        view = new PharmacyManager.OnFlowCompleted() {

            final OrderConfirmationRefillPresenter._cls2 this$1;

            public void onFlowCompleted()
            {
                getPresenterStack().popToRoot();
                PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity, true);
                OrderConfirmationRefillPresenter.access$200(this$0, prescriptionpresenter);
            }

            
            {
                this$1 = OrderConfirmationRefillPresenter._cls2.this;
                super();
            }
        };
        PharmacyManager.get().accessPharmacyAuthRequiredFlow(mActivity, getPresenterStack(), view);
    }

    _cls1.this._cls1()
    {
        this$0 = OrderConfirmationRefillPresenter.this;
        super();
    }
}
