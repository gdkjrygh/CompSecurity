// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.creditcard;

import android.app.ProgressDialog;
import chp;
import com.ubercab.payment.internal.model.ApiError;
import cwm;
import e;
import gsg;
import gtc;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.creditcard:
//            CreditCardAddPaymentActivity

final class a extends gtc
{

    final CreditCardAddPaymentActivity a;

    private void a(ApiError apierror)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            CreditCardAddPaymentActivity.c(a).dismiss();
            cwm.a(a, apierror.getErrorMessage());
            return;
        }
    }

    public final void a(Exception exception)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            CreditCardAddPaymentActivity.c(a).dismiss();
            cwm.a(a, gsg.ub__payment_unexpected_error);
            return;
        }
    }

    public final void a(Object obj)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            CreditCardAddPaymentActivity.c(a).dismiss();
            a.setResult(-1);
            a.finish();
            return;
        }
    }

    public final void a(RetrofitError retrofiterror)
    {
        if (a.isFinishing())
        {
            return;
        } else
        {
            CreditCardAddPaymentActivity.c(a).dismiss();
            cwm.a(a, gsg.ub__payment_network_error);
            return;
        }
    }

    public final void a(boolean flag)
    {
        chp chp1 = a.a;
        e e1;
        if (flag)
        {
            e1 = e.X;
        } else
        {
            e1 = e.W;
        }
        chp1.a(e1);
    }

    public final void b(Object obj)
    {
        a((ApiError)obj);
    }

    (CreditCardAddPaymentActivity creditcardaddpaymentactivity, Class class1)
    {
        a = creditcardaddpaymentactivity;
        super(class1);
    }
}
