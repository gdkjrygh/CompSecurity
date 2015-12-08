// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.customer.CardResponse;
import com.walmartlabs.ui.LoadingContainerView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            PaymentMethodsController

class this._cls0 extends CallbackSameThread
{

    final PaymentMethodsController this$0;

    public void onCancelledSameThread(Request request)
    {
        WLog.d(PaymentMethodsController.access$600(), "Cancelled request");
    }

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData() && !((CardResponse)result.getData()).hasClientErrorMessage())
        {
            PaymentMethodsController.access$400(PaymentMethodsController.this).setContentState();
            CreditCardsModel.get().setCreditCards(((CardResponse)result.getData()).getCreditCards());
            GiftCardsModel.get().setGiftCards(((CardResponse)result.getData()).getGiftCards());
            PaymentMethodsController.access$500(PaymentMethodsController.this);
            return;
        } else
        {
            PaymentMethodsController.access$400(PaymentMethodsController.this).setEmptyState();
            return;
        }
    }

    ()
    {
        this$0 = PaymentMethodsController.this;
        super();
    }
}
