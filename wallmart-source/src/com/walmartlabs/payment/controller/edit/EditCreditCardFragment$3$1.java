// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.DialogInterface;
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
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            EditCreditCardFragment

class this._cls1
    implements android.content.ener
{

    final ctivity this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        EditCreditCardFragment.access$000(_fld0).setVisibility(0);
        PaymentServices.get().getCustomerService().deleteCreditCard(EditCreditCardFragment.access$400(_fld0).getId()).addCallback(new CallbackSameThread() {

            final EditCreditCardFragment._cls3._cls1 this$2;

            public void onResultSameThread(Request request, Result result)
            {
                WLog.d(EditCreditCardFragment.access$500(this$0), (new StringBuilder()).append("onResult: ").append(result).toString());
                EditCreditCardFragment.access$000(this$0).setVisibility(8);
                if (result.getStatusCode() == 204)
                {
                    WLog.d(EditCreditCardFragment.access$600(this$0), "Successfully updated credit card");
                    CreditCardsModel.get().deleteCreditCard(EditCreditCardFragment.access$400(this$0));
                    ((EditCreditCardFragment.Callbacks)EditCreditCardFragment.access$700(this$0)).onCreditCardDeleted();
                    return;
                } else
                {
                    ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment.R.string.pm_edit_credit_card_error);
                    return;
                }
            }

            
            {
                this$2 = EditCreditCardFragment._cls3._cls1.this;
                super();
            }
        });
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/edit/EditCreditCardFragment$3

/* anonymous class */
    class EditCreditCardFragment._cls3
        implements android.view.View.OnClickListener
    {

        final EditCreditCardFragment this$0;

        public void onClick(View view)
        {
            (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_delete_credit_card_title)).setMessage(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_delete_credit_card_msg)).setNegativeButton(0x1040000, new EditCreditCardFragment._cls3._cls2()).setPositiveButton(com.walmartlabs.android.payment.R.string.pm_delete_credit_card_remove, new EditCreditCardFragment._cls3._cls1()).show();
        }

            
            {
                this$0 = EditCreditCardFragment.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/payment/controller/edit/EditCreditCardFragment$3$2

/* anonymous class */
        class EditCreditCardFragment._cls3._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final EditCreditCardFragment._cls3 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = EditCreditCardFragment._cls3.this;
                        super();
                    }
        }

    }

}
