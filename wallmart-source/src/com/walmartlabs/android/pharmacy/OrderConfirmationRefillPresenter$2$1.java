// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationRefillPresenter, PrescriptionPresenter, PharmacyManager

class this._cls1
    implements this._cls1
{

    final is._cls0 this$1;

    public void onFlowCompleted()
    {
        getPresenterStack().popToRoot();
        PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity, true);
        OrderConfirmationRefillPresenter.access$200(_fld0, prescriptionpresenter);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/pharmacy/OrderConfirmationRefillPresenter$2

/* anonymous class */
    class OrderConfirmationRefillPresenter._cls2
        implements android.view.View.OnClickListener
    {

        final OrderConfirmationRefillPresenter this$0;

        public void onClick(View view)
        {
            view = new OrderConfirmationRefillPresenter._cls2._cls1();
            PharmacyManager.get().accessPharmacyAuthRequiredFlow(mActivity, getPresenterStack(), view);
        }

            
            {
                this$0 = OrderConfirmationRefillPresenter.this;
                super();
            }
    }

}
