// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.activity;

import android.content.Intent;
import android.os.Bundle;
import com.ubercab.payment.internal.model.PaymentEditOptions;
import com.ubercab.payment.internal.model.PaymentEditResult;
import com.ubercab.payment.model.PaymentProfile;
import gjz;
import gtu;

// Referenced classes of package com.ubercab.payment.internal.activity:
//            PaymentActivity

public abstract class EditPaymentActivity extends PaymentActivity
{

    private PaymentProfile a;
    private PaymentEditOptions b;

    public EditPaymentActivity()
    {
    }

    public final void a(PaymentProfile paymentprofile)
    {
        a(paymentprofile, PaymentEditResult.create());
    }

    public final void a(PaymentProfile paymentprofile, PaymentEditResult paymenteditresult)
    {
        Intent intent = new Intent();
        intent.putExtra("payment_profile", paymentprofile);
        intent.putExtra("payment_edit_result", paymenteditresult);
        setResult(-1, intent);
        finish();
    }

    public final PaymentProfile c()
    {
        return a;
    }

    public final PaymentEditOptions d()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (PaymentProfile)gjz.a(gtu.a(getIntent()));
        b = gtu.e(getIntent());
        if (b == null)
        {
            b = PaymentEditOptions.create(false, false, false);
        }
    }
}
