// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.bankcard;

import android.app.Activity;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import cwm;
import e;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.bankcard:
//            BankCardAddPaymentActivity

final class a extends gtc
{

    final BankCardAddPaymentActivity a;

    private void a(ApiError apierror)
    {
        cwm.a(a, apierror.getErrorMessage());
        a.a.a(e.Q);
    }

    public final void a(Exception exception)
    {
        super.a(exception);
        a.a.a(e.Q);
    }

    public final void a(Object obj)
    {
        a.a.a(e.R);
        a.setResult(-1);
        a.finish();
    }

    public final void a(RetrofitError retrofiterror)
    {
        super.a(retrofiterror);
        a.a.a(e.Q);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        BankCardAddPaymentActivity.b(a).a(true);
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    (BankCardAddPaymentActivity bankcardaddpaymentactivity, Activity activity, Class class1)
    {
        a = bankcardaddpaymentactivity;
        super(activity, class1);
    }
}
