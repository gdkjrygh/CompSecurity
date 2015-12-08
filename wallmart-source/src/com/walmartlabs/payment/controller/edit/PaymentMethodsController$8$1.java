// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmartlabs.payment.controller.PaymentNavigationUtil;
import com.walmartlabs.payment.model.GiftCardsModel;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            PaymentMethodsController

class this._cls0
    implements android.content.er
{

    final this._cls0 this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    l.context()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/edit/PaymentMethodsController$8

/* anonymous class */
    static final class PaymentMethodsController._cls8
        implements android.content.DialogInterface.OnClickListener
    {

        final Context val$context;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
            if (i == 0)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("paymentMethodAddCard")).putString("cardType", "credit or debit card"));
                PaymentNavigationUtil.launchAddCreditCard(context);
            } else
            if (i == 1)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("paymentMethodAddCard")).putString("cardType", "gift card"));
                if (GiftCardsModel.get().hasGiftCards() && GiftCardsModel.get().getAllGiftCards().size() >= 5)
                {
                    (new com.walmart.android.ui.dialog.AlertDialog.Builder(context)).setTitle(context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_gift_card_err_max_title)).setMessage(context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_gift_card_err_max_msg)).setPositiveButton(0x104000a, new PaymentMethodsController._cls8._cls1()).create().show();
                    return;
                } else
                {
                    PaymentNavigationUtil.launchAddGiftCard(context);
                    return;
                }
            }
        }

            
            {
                context = context1;
                super();
            }
    }

}
