// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            RiderBalance

public final class Shape_RiderBalance extends RiderBalance
{

    private List creditBalanceStrings;
    private List tripCreditBalanceStrings;

    Shape_RiderBalance()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RiderBalance)obj;
            if (((RiderBalance) (obj)).getCreditBalanceStrings() == null ? getCreditBalanceStrings() != null : !((RiderBalance) (obj)).getCreditBalanceStrings().equals(getCreditBalanceStrings()))
            {
                return false;
            }
            if (((RiderBalance) (obj)).getTripCreditBalanceStrings() == null ? getTripCreditBalanceStrings() != null : !((RiderBalance) (obj)).getTripCreditBalanceStrings().equals(getTripCreditBalanceStrings()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getCreditBalanceStrings()
    {
        return creditBalanceStrings;
    }

    public final List getTripCreditBalanceStrings()
    {
        return tripCreditBalanceStrings;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (creditBalanceStrings == null)
        {
            i = 0;
        } else
        {
            i = creditBalanceStrings.hashCode();
        }
        if (tripCreditBalanceStrings != null)
        {
            j = tripCreditBalanceStrings.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final RiderBalance setCreditBalanceStrings(List list)
    {
        creditBalanceStrings = list;
        return this;
    }

    final RiderBalance setTripCreditBalanceStrings(List list)
    {
        tripCreditBalanceStrings = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderBalance{creditBalanceStrings=")).append(creditBalanceStrings).append(", tripCreditBalanceStrings=").append(tripCreditBalanceStrings).append("}").toString();
    }
}
