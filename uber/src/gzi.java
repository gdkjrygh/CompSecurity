// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.ubercab.payment.internal.vendor.creditcard.CreditCardAddPaymentActivity;
import com.ubercab.payment.internal.vendor.shared.SharedDeletePaymentActivity;
import com.ubercab.payment.internal.vendor.zaakpay.ZaakpayChargeActivity;

public final class gzi extends gsa
{

    public gzi(Context context)
    {
        super(context);
    }

    public final String a()
    {
        return "zaakpay";
    }

    public final String b()
    {
        return m().getString(gsg.ub__payment_credit_or_debit_card);
    }

    public final Drawable c()
    {
        return m().getDrawable(gsc.ub__payment_type_cc);
    }

    public final Drawable d()
    {
        return null;
    }

    protected final Class e()
    {
        return com/ubercab/payment/internal/vendor/creditcard/CreditCardAddPaymentActivity;
    }

    protected final Class f()
    {
        return null;
    }

    protected final Class g()
    {
        return null;
    }

    protected final Class h()
    {
        return com/ubercab/payment/internal/vendor/shared/SharedDeletePaymentActivity;
    }

    protected final Class i()
    {
        return com/ubercab/payment/internal/vendor/zaakpay/ZaakpayChargeActivity;
    }

    protected final Class j()
    {
        return null;
    }

    protected final Class k()
    {
        return null;
    }
}
