// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.edit.PaymentMethodsController;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.payment.UserCardsResponse;
import com.walmartlabs.payment.view.SlidingUpPanelLayout;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentDrawerController

class this._cls1
    implements android.view.aymentDrawerController._cls1._cls1
{

    final is._cls0 this$1;

    public void onClick(View view)
    {
        PaymentMethodsController.addCard(PaymentDrawerController.access$600(_fld0));
        PaymentDrawerController.access$702(_fld0, true);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/mpay/PaymentDrawerController$1

/* anonymous class */
    class PaymentDrawerController._cls1 extends CallbackSameThread
    {

        final PaymentDrawerController this$0;

        public void onResultSameThread(Request request, Result result)
        {
            if (result.successful() && result.hasData() && !((UserCardsResponse)result.getData()).hasClientErrorMessage())
            {
                CreditCardsModel.get().setCreditCards(((UserCardsResponse)result.getData()).getCreditCards());
                GiftCardsModel.get().setGiftCards(true, ((UserCardsResponse)result.getData()).getGiftCards());
                updateData();
                WLog.d(PaymentDrawerController.access$100(), "Setting gift card switch listener");
                PaymentDrawerController.access$300(PaymentDrawerController.this).setOnCheckedChangeListener(new PaymentDrawerController.GiftCardSwitchListener(PaymentDrawerController.this, null));
                PaymentDrawerController.access$500(PaymentDrawerController.this).setOnCheckedChangeListener(new PaymentDrawerController.CreditCardSwitchListener(PaymentDrawerController.this, null));
                PaymentDrawerController.access$800(PaymentDrawerController.this).setOnClickListener(new PaymentDrawerController._cls1._cls1());
                PaymentDrawerController.access$902(PaymentDrawerController.this, ((UserCardsResponse)result.getData()).data.isAssociate);
                if (!PaymentDrawerController.access$900(PaymentDrawerController.this))
                {
                    PaymentDrawerController.access$1000(PaymentDrawerController.this).setVisibility(8);
                }
                PaymentDrawerController.access$1100(PaymentDrawerController.this).setVisibility(8);
                PaymentDrawerController.access$1300(PaymentDrawerController.this).setPanelHeight(PaymentDrawerController.access$1200(PaymentDrawerController.this));
                return;
            }
            TextView textview = (TextView)PaymentDrawerController.access$600(PaymentDrawerController.this).findViewById(com.walmartlabs.android.payment.R.id.loading_text);
            if (result.hasData() && ((UserCardsResponse)result.getData()).hasClientErrorMessage())
            {
                request = ((UserCardsResponse)result.getData()).getClientErrorMessage();
            } else
            {
                request = PaymentDrawerController.access$600(PaymentDrawerController.this).getResources().getString(com.walmartlabs.android.payment.R.string.mpan_scan_error_loading);
            }
            textview.setText(request);
            ((ProgressBar)PaymentDrawerController.access$600(PaymentDrawerController.this).findViewById(com.walmartlabs.android.payment.R.id.loading_progress_spinner)).setVisibility(8);
        }

            
            {
                this$0 = PaymentDrawerController.this;
                super();
            }
    }

}
