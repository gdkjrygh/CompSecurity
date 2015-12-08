// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CustomerService;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            AddCreditCardFragment

class this._cls1 extends CallbackSameThread
{

    final ctivity this$1;

    public void onResultSameThread(Request request, Result result)
    {
        AddCreditCardFragment.access$300(_fld0).setVisibility(8);
        if (result.successful() && result.hasData() && !((CreditCard)result.getData()).hasClientErrorMessage())
        {
            CreditCardsModel.get().updateCreditCard((CreditCard)result.getData());
            ((backs)AddCreditCardFragment.access$400(_fld0)).onCreditCardAdded();
            return;
        }
        AddCreditCardFragment.access$300(_fld0).setVisibility(8);
        if (result.hasError())
        {
            if (result.getError()._mth0(com.walmartlabs.kangaroo.) || result.getError().(com.walmartlabs.kangaroo._UNCLASSIFIED))
            {
                ErrorHandlingUtil.showError(getActivity(), getString(com.walmartlabs.android.payment.d_err_timeout));
                return;
            } else
            {
                ErrorHandlingUtil.handleResponseError(getActivity(), result);
                return;
            }
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

    // Unreferenced inner class com/walmartlabs/payment/controller/edit/AddCreditCardFragment$5

/* anonymous class */
    class AddCreditCardFragment._cls5
        implements com.walmartlabs.payment.service.customer.EncryptCreditCardService.Callback
    {

        final AddCreditCardFragment this$0;

        public void onError(com.walmartlabs.kangaroo.Result.Error error)
        {
            AddCreditCardFragment.access$300(AddCreditCardFragment.this).setVisibility(8);
            if (getActivity() != null)
            {
                if (error.equals(com.walmartlabs.kangaroo.Result.Error.ERROR_TIMEOUT) || error.equals(com.walmartlabs.kangaroo.Result.Error.ERROR_CONNECT_UNCLASSIFIED))
                {
                    ErrorHandlingUtil.showError(getActivity(), getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_timeout));
                } else
                {
                    ErrorHandlingUtil.handleServiceError(getActivity(), error);
                }
            }
            AddCreditCardFragment.access$500(AddCreditCardFragment.this);
        }

        public void onResult(com.walmartlabs.payment.service.customer.EncryptCreditCardService.EncryptedCc encryptedcc)
        {
            encryptedcc = AddCreditCardFragment.access$200(AddCreditCardFragment.this, encryptedcc);
            PaymentServices.get().getCustomerService().createCreditCard(encryptedcc).addCallback(new AddCreditCardFragment._cls5._cls1());
            AddCreditCardFragment.access$500(AddCreditCardFragment.this);
        }

            
            {
                this$0 = AddCreditCardFragment.this;
                super();
            }
    }

}
