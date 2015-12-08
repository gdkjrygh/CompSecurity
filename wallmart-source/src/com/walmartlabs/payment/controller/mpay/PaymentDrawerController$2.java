// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.DialogInterface;
import com.walmartlabs.payment.controller.edit.PaymentMethodsController;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentDrawerController

class this._cls0
    implements android.content.tener
{

    final PaymentDrawerController this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        PaymentMethodsController.addCard(PaymentDrawerController.access$600(PaymentDrawerController.this));
        PaymentDrawerController.access$702(PaymentDrawerController.this, true);
    }

    ()
    {
        this$0 = PaymentDrawerController.this;
        super();
    }
}
