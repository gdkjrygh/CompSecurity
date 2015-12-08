// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.widget.CompoundButton;
import com.walmartlabs.payment.controller.methods.DrawerCreditCardAdapter;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentDrawerController

private class <init>
    implements android.widget.CreditCardSwitchListener
{

    final PaymentDrawerController this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        PaymentDrawerController.access$2302(PaymentDrawerController.this, flag);
        PaymentDrawerController.access$1500(PaymentDrawerController.this).setShowSelectedCard(PaymentDrawerController.access$2300(PaymentDrawerController.this));
        PaymentDrawerController.access$1600(PaymentDrawerController.this);
    }

    private ()
    {
        this$0 = PaymentDrawerController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
