// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.shared;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;
import gsg;
import gtb;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.shared:
//            SharedVerifyPaymentActivity

final class a extends gtb
{

    final SharedVerifyPaymentActivity a;

    private void b()
    {
        SharedVerifyPaymentActivity.b(a).dismiss();
    }

    public final void a(Object obj)
    {
        b();
    }

    public final void a(RetrofitError retrofiterror)
    {
        SharedVerifyPaymentActivity.b(a).dismiss();
        Toast.makeText(a, a.getString(gsg.ub__payment_resend_sms_failure), 1).show();
    }

    (SharedVerifyPaymentActivity sharedverifypaymentactivity, Activity activity)
    {
        a = sharedverifypaymentactivity;
        super(activity);
    }
}
