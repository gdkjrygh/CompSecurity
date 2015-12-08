// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PaymentDrawerController

class this._cls0
    implements android.content.tener
{

    final PaymentDrawerController this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (PaymentDrawerController.access$1400(PaymentDrawerController.this) != null)
        {
            PaymentDrawerController.access$1400(PaymentDrawerController.this).onCancel();
        }
    }

    llback()
    {
        this$0 = PaymentDrawerController.this;
        super();
    }
}
