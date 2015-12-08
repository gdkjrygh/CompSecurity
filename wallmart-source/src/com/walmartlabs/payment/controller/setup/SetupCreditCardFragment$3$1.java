// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.view.View;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CreditCardRequest;
import com.walmartlabs.payment.service.customer.CustomerService;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupCreditCardFragment, SetupCreditCardAdapter

class this._cls1 extends CallbackSameThread
{

    final ctivity this$1;

    public void onResultSameThread(Request request, Result result)
    {
        SetupCreditCardFragment.access$300(_fld0).setVisibility(8);
        if (result.successful())
        {
            SetupCreditCardFragment.access$400(_fld0);
            return;
        } else
        {
            ErrorHandlingUtil.handleResponseError(getActivity(), result);
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/setup/SetupCreditCardFragment$3

/* anonymous class */
    class SetupCreditCardFragment._cls3
        implements android.view.View.OnClickListener
    {

        final SetupCreditCardFragment this$0;

        public void onClick(View view)
        {
            if (SetupCreditCardFragment.access$000(SetupCreditCardFragment.this) != null && SetupCreditCardFragment.access$000(SetupCreditCardFragment.this).getItemCount() > 0)
            {
                view = SetupCreditCardFragment.access$000(SetupCreditCardFragment.this).getSelectedItem().getId();
                if (!view.equals(SetupCreditCardFragment.access$200(SetupCreditCardFragment.this)))
                {
                    SetupCreditCardFragment.access$300(SetupCreditCardFragment.this).setVisibility(0);
                    CreditCardRequest creditcardrequest = new CreditCardRequest();
                    creditcardrequest.isDefault = true;
                    PaymentServices.get().getCustomerService().updateCreditCard(view, creditcardrequest).addCallback(new SetupCreditCardFragment._cls3._cls1());
                    return;
                } else
                {
                    SetupCreditCardFragment.access$400(SetupCreditCardFragment.this);
                    return;
                }
            } else
            {
                SetupCreditCardFragment.access$400(SetupCreditCardFragment.this);
                return;
            }
        }

            
            {
                this$0 = SetupCreditCardFragment.this;
                super();
            }
    }

}
