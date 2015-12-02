// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.content.DialogInterface;
import com.ubercab.payment.model.PaymentProfile;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelHandlePaymentErrorActivity, AirtelAddFundsActivity

final class a
    implements android.content.ndlePaymentErrorActivity._cls2
{

    final AirtelHandlePaymentErrorActivity a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.startActivity(AirtelAddFundsActivity.a(a, AirtelHandlePaymentErrorActivity.a(a).getUuid(), true));
        AirtelHandlePaymentErrorActivity.a(a, -1);
    }

    (AirtelHandlePaymentErrorActivity airtelhandlepaymenterroractivity)
    {
        a = airtelhandlepaymenterroractivity;
        super();
    }
}
