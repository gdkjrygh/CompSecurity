// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.view.View;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CreditCardRequest;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.view.CreditCardView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            EditCreditCardFragment, CreditCardValidator

class this._cls1 extends CallbackSameThread
{

    final ctivity this$1;

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData() && !((CreditCard)result.getData()).hasClientErrorMessage())
        {
            WLog.d(EditCreditCardFragment.access$100(_fld0), "Successfully updated credit card");
            EditCreditCardFragment.access$000(_fld0).setVisibility(8);
            request = (CreditCard)result.getData();
            CreditCardsModel.get().updateCreditCard(request);
            ((backs)EditCreditCardFragment.access$200(_fld0)).onCreditCardUpdated();
            return;
        } else
        {
            WLog.d(EditCreditCardFragment.access$300(_fld0), (new StringBuilder()).append("Failed to update credit card: status = ").append(result.getStatusCode()).toString());
            EditCreditCardFragment.access$000(_fld0).setVisibility(8);
            ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment.d_error);
            return;
        }
    }

    l.creditCardView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/edit/EditCreditCardFragment$2

/* anonymous class */
    class EditCreditCardFragment._cls2
        implements android.view.View.OnClickListener
    {

        final EditCreditCardFragment this$0;
        final CreditCardView val$creditCardView;

        public void onClick(View view)
        {
            if (CreditCardValidator.validateCreditCard(creditCardView))
            {
                EditCreditCardFragment.access$000(EditCreditCardFragment.this).setVisibility(0);
                view = new CreditCardRequest();
                view.firstName = creditCardView.getFirstName();
                view.lastName = creditCardView.getLastName();
                if (!creditCardView.getCardType().equals("WMUSGESTORECARD"))
                {
                    view.expiryMonth = creditCardView.getExpiryMonth();
                    view.expiryYear = creditCardView.getExpiryYear();
                }
                view.addressLineOne = creditCardView.getAddress1();
                view.addressLineTwo = creditCardView.getAddress2();
                view.city = creditCardView.getCity();
                view.state = creditCardView.getState();
                view.postalCode = creditCardView.getZipCode();
                view.phone = creditCardView.getPhoneNumber();
                PaymentServices.get().getCustomerService().updateCreditCard(EditCreditCardFragment.access$400(EditCreditCardFragment.this).getId(), view).addCallback(new EditCreditCardFragment._cls2._cls1());
            }
        }

            
            {
                this$0 = final_editcreditcardfragment;
                creditCardView = CreditCardView.this;
                super();
            }
    }

}
