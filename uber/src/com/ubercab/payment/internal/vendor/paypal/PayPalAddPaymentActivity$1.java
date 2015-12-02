// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.paypal;

import android.app.Activity;
import android.app.ProgressDialog;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.model.PaymentProfile;
import cwm;
import e;
import gsg;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.paypal:
//            PayPalAddPaymentActivity

final class a extends gtc
{

    final PayPalAddPaymentActivity a;

    private void a(ApiError apierror)
    {
        PayPalAddPaymentActivity.a(a).dismiss();
        cwm.a(a, apierror.getErrorMessage());
        a.a.a(e.aq);
        a.finish();
    }

    private void a(PaymentProfile paymentprofile)
    {
        PayPalAddPaymentActivity.a(a).dismiss();
        a.a.a(e.as);
        PayPalAddPaymentActivity.a(a, paymentprofile);
    }

    public final volatile void a(Object obj)
    {
        a((PaymentProfile)obj);
    }

    public final void a(RetrofitError retrofiterror)
    {
        PayPalAddPaymentActivity.a(a).dismiss();
        cwm.a(a, gsg.ub__payment_network_error);
        a.a.a(e.ar);
        a.finish();
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    (PayPalAddPaymentActivity paypaladdpaymentactivity, Activity activity, Class class1)
    {
        a = paypaladdpaymentactivity;
        super(activity, class1);
    }
}
