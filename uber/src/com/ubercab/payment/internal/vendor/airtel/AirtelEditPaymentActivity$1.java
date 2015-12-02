// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ubercab.payment.internal.network.model.CheckBalanceResponse;
import cwm;
import gsg;
import gtb;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelEditPaymentActivity

final class a extends gtb
{

    final AirtelEditPaymentActivity a;

    private void a(CheckBalanceResponse checkbalanceresponse)
    {
        AirtelEditPaymentActivity.b(a).setText(checkbalanceresponse.getDisplayAmount());
    }

    protected final void a()
    {
        AirtelEditPaymentActivity.a(a).setVisibility(8);
    }

    protected final volatile void a(Object obj)
    {
        a((CheckBalanceResponse)obj);
    }

    protected final void a(RetrofitError retrofiterror)
    {
        cwm.a(a, gsg.ub__payment_add_funds_check_balance_error);
    }

    (AirtelEditPaymentActivity airteleditpaymentactivity, Activity activity)
    {
        a = airteleditpaymentactivity;
        super(activity);
    }
}
