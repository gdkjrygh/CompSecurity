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

static final class val.context
    implements android.content.ener
{

    final Context val$context;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (i == 0)
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.init>("paymentMethodAddCard")).utString("cardType", "credit or debit card"));
            PaymentNavigationUtil.launchAddCreditCard(val$context);
        } else
        if (i == 1)
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.init>("paymentMethodAddCard")).utString("cardType", "gift card"));
            if (GiftCardsModel.get().hasGiftCards() && GiftCardsModel.get().getAllGiftCards().size() >= 5)
            {
                (new com.walmart.android.ui.dialog.rds(val$context)).e(val$context.getResources().getString(com.walmartlabs.android.payment.rr_max_title)).age(val$context.getResources().getString(com.walmartlabs.android.payment.rr_max_msg)).tiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final PaymentMethodsController._cls8 this$0;

                    public void onClick(DialogInterface dialoginterface1, int j)
                    {
                        dialoginterface1.dismiss();
                    }

            
            {
                this$0 = PaymentMethodsController._cls8.this;
                super();
            }
                })._mth8().show();
                return;
            } else
            {
                PaymentNavigationUtil.launchAddGiftCard(val$context);
                return;
            }
        }
    }

    _cls1.this._cls0(Context context1)
    {
        val$context = context1;
        super();
    }
}
