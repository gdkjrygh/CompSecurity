// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.braintreegateway.encryption.Braintree;
import com.ubercab.payment.internal.vendor.bankcard.BankCardApi;

public final class gxo
{

    private final Activity a;

    public gxo(Activity activity)
    {
        a = activity;
    }

    static BankCardApi a(grs grs1)
    {
        return (BankCardApi)grs1.a(com/ubercab/payment/internal/vendor/bankcard/BankCardApi);
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
