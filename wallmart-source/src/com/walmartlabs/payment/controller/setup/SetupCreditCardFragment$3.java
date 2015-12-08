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

class this._cls0
    implements android.view.p.SetupCreditCardFragment._cls3
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
                PaymentServices.get().getCustomerService().updateCreditCard(view, creditcardrequest).addCallback(new CallbackSameThread() {

                    final SetupCreditCardFragment._cls3 this$1;

                    public void onResultSameThread(Request request, Result result)
                    {
                        SetupCreditCardFragment.access$300(this$0).setVisibility(8);
                        if (result.successful())
                        {
                            SetupCreditCardFragment.access$400(this$0);
                            return;
                        } else
                        {
                            ErrorHandlingUtil.handleResponseError(getActivity(), result);
                            return;
                        }
                    }

            
            {
                this$1 = SetupCreditCardFragment._cls3.this;
                super();
            }
                });
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

    _cls1.this._cls1()
    {
        this$0 = SetupCreditCardFragment.this;
        super();
    }
}
