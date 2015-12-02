// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.PayPalConfiguration;

final class ng.Object
    implements hst
{

    final eof a;
    final eoe b;

    private PayPalConfiguration b()
    {
        PayPalConfiguration paypalconfiguration = eof.a(a).g();
        if (paypalconfiguration == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return paypalconfiguration;
        }
    }

    public final Object a()
    {
        return b();
    }

    ct(eoe eoe1, eof eof1)
    {
        b = eoe1;
        a = eof1;
        super();
    }
}
