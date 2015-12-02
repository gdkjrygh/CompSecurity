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

    public final void a(Object obj)
    {
        SharedVerifyPaymentActivity.b(a).dismiss();
        SharedVerifyPaymentActivity.a(a, a.h());
        a.a(true);
        SharedVerifyPaymentActivity.a(a, SharedVerifyPaymentActivity.c(a));
    }

    public final void a(RetrofitError retrofiterror)
    {
        SharedVerifyPaymentActivity.b(a).dismiss();
        SharedVerifyPaymentActivity.a(a, a.f());
        Toast.makeText(a, a.getString(gsg.ub__payment_verify_code_failure), 1).show();
        a.a(false);
    }

    (SharedVerifyPaymentActivity sharedverifypaymentactivity, Activity activity)
    {
        a = sharedverifypaymentactivity;
        super(activity);
    }
}
