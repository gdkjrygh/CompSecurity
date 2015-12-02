// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            ShoppingCartChargesBreakdown

public final class Shape_ShoppingCartChargesBreakdown extends ShoppingCartChargesBreakdown
{

    private List charges;
    private List discounts;

    Shape_ShoppingCartChargesBreakdown()
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
            obj = (ShoppingCartChargesBreakdown)obj;
            if (((ShoppingCartChargesBreakdown) (obj)).getCharges() == null ? getCharges() != null : !((ShoppingCartChargesBreakdown) (obj)).getCharges().equals(getCharges()))
            {
                return false;
            }
            if (((ShoppingCartChargesBreakdown) (obj)).getDiscounts() == null ? getDiscounts() != null : !((ShoppingCartChargesBreakdown) (obj)).getDiscounts().equals(getDiscounts()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getCharges()
    {
        return charges;
    }

    public final List getDiscounts()
    {
        return discounts;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (charges == null)
        {
            i = 0;
        } else
        {
            i = charges.hashCode();
        }
        if (discounts != null)
        {
            j = discounts.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final ShoppingCartChargesBreakdown setCharges(List list)
    {
        charges = list;
        return this;
    }

    final ShoppingCartChargesBreakdown setDiscounts(List list)
    {
        discounts = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingCartChargesBreakdown{charges=")).append(charges).append(", discounts=").append(discounts).append("}").toString();
    }
}
