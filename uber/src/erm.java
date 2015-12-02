// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.PaymentProfile;

public final class erm
{

    private final boolean a;
    private final PaymentProfile b;

    public erm(PaymentProfile paymentprofile)
    {
        this(paymentprofile, false);
    }

    public erm(PaymentProfile paymentprofile, boolean flag)
    {
        b = paymentprofile;
        a = flag;
    }

    public final PaymentProfile a()
    {
        return b;
    }

    public final boolean b()
    {
        return a;
    }
}
