// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;

public final class fyv
{

    private final PaymentProfile a;
    private final TripExpenseInfo b;
    private final boolean c;
    private final boolean d;

    public fyv(PaymentProfile paymentprofile, boolean flag, boolean flag1, TripExpenseInfo tripexpenseinfo)
    {
        a = paymentprofile;
        c = flag;
        d = flag1;
        b = tripexpenseinfo;
    }

    public final PaymentProfile a()
    {
        return a;
    }

    public final TripExpenseInfo b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }
}
