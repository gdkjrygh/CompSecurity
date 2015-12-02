// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.shared;

import android.app.Activity;
import cwm;
import gsg;
import gtb;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.shared:
//            SharedDeletePaymentActivity

final class a extends gtb
{

    final SharedDeletePaymentActivity a;

    public final void a(Object obj)
    {
        SharedDeletePaymentActivity.a(a, a.d());
        SharedDeletePaymentActivity.a(a, SharedDeletePaymentActivity.a(a));
    }

    public final void a(RetrofitError retrofiterror)
    {
        SharedDeletePaymentActivity.a(a, a.e());
        cwm.a(a, a.getString(gsg.ub__payment_delete_failed));
        a.setResult(0);
        a.finish();
    }

    (SharedDeletePaymentActivity shareddeletepaymentactivity, Activity activity)
    {
        a = shareddeletepaymentactivity;
        super(activity);
    }
}
