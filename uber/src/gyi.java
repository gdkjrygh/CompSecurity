// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.braintreegateway.encryption.Braintree;
import com.ubercab.payment.internal.vendor.creditcard.CreditCardApi;

public final class gyi
{

    private final Activity a;

    public gyi(Activity activity)
    {
        a = activity;
    }

    static CreditCardApi a(grs grs1)
    {
        return (CreditCardApi)grs1.a(com/ubercab/payment/internal/vendor/creditcard/CreditCardApi);
    }

    final Braintree a()
    {
        return new Braintree(a.getString(gsg.ub__payment_braintree_key_production));
    }

    final gsm b()
    {
        return new gsm(a.getString(gsg.ub__payment_zaakpay_key_production), "RSA/ECB/PKCS1Padding");
    }
}
