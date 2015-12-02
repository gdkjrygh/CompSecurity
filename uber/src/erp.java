// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;

public final class erp
{

    private final TripExpenseInfo a;
    private final PaymentProfile b;
    private final boolean c;

    public erp(PaymentProfile paymentprofile, TripExpenseInfo tripexpenseinfo)
    {
        a = tripexpenseinfo;
        c = true;
        b = paymentprofile;
    }

    public erp(PaymentProfile paymentprofile, boolean flag)
    {
        a = null;
        b = paymentprofile;
        c = flag;
    }

    public final boolean a()
    {
        return c;
    }

    public final TripExpenseInfo b()
    {
        return a;
    }

    public final PaymentProfile c()
    {
        return b;
    }
}
