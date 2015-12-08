// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Transaction

public static class totalCost
{

    private final String orderId;
    private double shippingCost;
    private String storeName;
    private final double totalCost;
    private double totalTax;

    public Transaction build()
    {
        return new Transaction(this, null);
    }

    public totalCost setShippingCost(double d)
    {
        shippingCost = d;
        return this;
    }

    public shippingCost setStoreName(String s)
    {
        storeName = s;
        return this;
    }

    public storeName setTotalTax(double d)
    {
        totalTax = d;
        return this;
    }






    public (String s, double d)
    {
        storeName = null;
        totalTax = 0.0D;
        shippingCost = 0.0D;
        if (s == null || s.trim().length() == 0)
        {
            throw new IllegalArgumentException("orderId must not be empty or null");
        } else
        {
            orderId = s;
            totalCost = d;
            return;
        }
    }
}
