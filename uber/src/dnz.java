// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.ubercab.payment.internal.vendor.creditcard.CreditCardAddPaymentActivity;

public final class dnz extends gsa
{

    private final Class a;
    private final String b;
    private final int c;
    private final int d;

    private dnz(Context context, String s, int l, int i1, Class class1)
    {
        super(context);
        b = s;
        c = l;
        d = i1;
        a = class1;
    }

    public static dnz a(Context context)
    {
        return new dnz(context, "paytm", 0x7f07033f, 0x7f020275, null);
    }

    public static dnz b(Context context)
    {
        return new dnz(context, "alipay", 0x7f070053, 0x7f02026e, null);
    }

    public static dnz c(Context context)
    {
        return new dnz(context, "braintree", 0x7f070281, 0x7f020271, com/ubercab/payment/internal/vendor/creditcard/CreditCardAddPaymentActivity);
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return m().getString(c);
    }

    public final Drawable c()
    {
        return m().getDrawable(d);
    }

    public final Drawable d()
    {
        return null;
    }

    protected final Class e()
    {
        return a;
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
        return null;
    }

    protected final Class i()
    {
        return null;
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
