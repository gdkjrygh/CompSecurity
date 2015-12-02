// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.app.ProgressDialog;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelChargeBillErrorResponse;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelChargePaymentActivity

final class a extends gtc
{

    final AirtelChargePaymentActivity a;

    private void a(AirtelChargeBillErrorResponse airtelchargebillerrorresponse)
    {
        AirtelChargePaymentActivity.a(a, airtelchargebillerrorresponse);
    }

    public final void a(Exception exception)
    {
        super.a(exception);
        AirtelChargePaymentActivity.a(a, 0);
    }

    public final void a(Object obj)
    {
        AirtelChargePaymentActivity.a(a, -1);
    }

    public final void a(RetrofitError retrofiterror)
    {
        super.a(retrofiterror);
        AirtelChargePaymentActivity.a(a, 0);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        if (AirtelChargePaymentActivity.a(a) != null)
        {
            AirtelChargePaymentActivity.a(a).dismiss();
        }
    }

    public final void b(Object obj)
    {
        a((AirtelChargeBillErrorResponse)obj);
    }

    lErrorResponse(AirtelChargePaymentActivity airtelchargepaymentactivity, Activity activity, Class class1)
    {
        a = airtelchargepaymentactivity;
        super(activity, class1);
    }
}
