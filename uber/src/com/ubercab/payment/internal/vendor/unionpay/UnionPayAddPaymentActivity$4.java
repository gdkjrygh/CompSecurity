// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay;

import android.app.Activity;
import android.app.ProgressDialog;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.model.PaymentProfile;
import e;
import gtb;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.payment.internal.vendor.unionpay:
//            UnionPayAddPaymentActivity

final class a extends gtb
{

    final UnionPayAddPaymentActivity a;

    private void a(PaymentProfile paymentprofile)
    {
        UnionPayAddPaymentActivity.e(a).a(e.ad);
        UnionPayAddPaymentActivity.f(a).dismiss();
        if (paymentprofile != null)
        {
            UnionPayAddPaymentActivity.a(a, paymentprofile);
        }
    }

    protected final volatile void a(Object obj)
    {
        a((PaymentProfile)obj);
    }

    protected final void a(RetrofitError retrofiterror)
    {
        int i;
        UnionPayAddPaymentActivity.f(a).dismiss();
        i = 0;
        int j = retrofiterror.getResponse().getStatus();
        i = j;
        try
        {
            retrofiterror = ((ApiError)retrofiterror.getBodyAs(com/ubercab/payment/internal/model/ApiError)).getErrorMessage();
        }
        // Misplaced declaration of an exception variable
        catch (RetrofitError retrofiterror)
        {
            retrofiterror = null;
            j = i;
        }
        UnionPayAddPaymentActivity.a(a, j, retrofiterror);
        return;
    }

    (UnionPayAddPaymentActivity unionpayaddpaymentactivity, Activity activity)
    {
        a = unionpayaddpaymentactivity;
        super(activity);
    }
}
