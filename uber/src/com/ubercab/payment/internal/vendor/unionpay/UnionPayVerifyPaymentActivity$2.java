// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay;

import android.content.DialogInterface;
import chp;
import f;

// Referenced classes of package com.ubercab.payment.internal.vendor.unionpay:
//            UnionPayVerifyPaymentActivity

final class a
    implements android.content.onPayVerifyPaymentActivity._cls2
{

    final UnionPayVerifyPaymentActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        UnionPayVerifyPaymentActivity.b(a).a(f.aq);
        UnionPayVerifyPaymentActivity.c(a);
    }

    (UnionPayVerifyPaymentActivity unionpayverifypaymentactivity)
    {
        a = unionpayverifypaymentactivity;
        super();
    }
}
