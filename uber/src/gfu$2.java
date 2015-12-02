// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.model.PaymentProfile;

final class ang.Object
    implements gka
{

    final gfu a;

    private static boolean a(PaymentProfile paymentprofile)
    {
        return "alipay".equals(paymentprofile.getTokenType());
    }

    public final boolean apply(Object obj)
    {
        return a((PaymentProfile)obj);
    }

    (gfu gfu1)
    {
        a = gfu1;
        super();
    }
}
