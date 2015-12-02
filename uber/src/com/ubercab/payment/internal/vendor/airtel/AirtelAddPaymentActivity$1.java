// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.app.ProgressDialog;
import com.ubercab.payment.model.PaymentProfile;
import cwm;
import gsg;
import gtb;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddPaymentActivity

final class a extends gtb
{

    final AirtelAddPaymentActivity a;

    private void a(PaymentProfile paymentprofile)
    {
        AirtelAddPaymentActivity.a(a).dismiss();
        if (paymentprofile == null)
        {
            cwm.a(a, gsg.ub__payment_add_failed);
            return;
        } else
        {
            AirtelAddPaymentActivity.a(a, paymentprofile);
            AirtelAddPaymentActivity.a(a, paymentprofile.getUuid());
            return;
        }
    }

    protected final void a()
    {
        AirtelAddPaymentActivity.a(a).dismiss();
    }

    public final volatile void a(Object obj)
    {
        a((PaymentProfile)obj);
    }

    public final void a(RetrofitError retrofiterror)
    {
        cwm.a(a, gsg.ub__payment_add_failed);
    }

    (AirtelAddPaymentActivity airteladdpaymentactivity, Activity activity)
    {
        a = airteladdpaymentactivity;
        super(activity);
    }
}
