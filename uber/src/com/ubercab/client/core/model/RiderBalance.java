// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RiderBalance

public abstract class RiderBalance
{

    public RiderBalance()
    {
    }

    public static RiderBalance create()
    {
        return new Shape_RiderBalance();
    }

    public static RiderBalance create(List list, List list1)
    {
        return create().setCreditBalanceStrings(list).setTripCreditBalanceStrings(list1);
    }

    public abstract List getCreditBalanceStrings();

    public abstract List getTripCreditBalanceStrings();

    abstract RiderBalance setCreditBalanceStrings(List list);

    abstract RiderBalance setTripCreditBalanceStrings(List list);
}
