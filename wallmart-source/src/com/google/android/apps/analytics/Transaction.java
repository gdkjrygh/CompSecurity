// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


public class Transaction
{
    public static class Builder
    {

        private final String orderId;
        private double shippingCost;
        private String storeName;
        private final double totalCost;
        private double totalTax;

        public Transaction build()
        {
            return new Transaction(this);
        }

        public Builder setShippingCost(double d)
        {
            shippingCost = d;
            return this;
        }

        public Builder setStoreName(String s)
        {
            storeName = s;
            return this;
        }

        public Builder setTotalTax(double d)
        {
            totalTax = d;
            return this;
        }






        public Builder(String s, double d)
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


    private final String orderId;
    private final double shippingCost;
    private final String storeName;
    private final double totalCost;
    private final double totalTax;

    private Transaction(Builder builder)
    {
        orderId = builder.orderId;
        totalCost = builder.totalCost;
        storeName = builder.storeName;
        totalTax = builder.totalTax;
        shippingCost = builder.shippingCost;
    }


    String getOrderId()
    {
        return orderId;
    }

    double getShippingCost()
    {
        return shippingCost;
    }

    String getStoreName()
    {
        return storeName;
    }

    double getTotalCost()
    {
        return totalCost;
    }

    double getTotalTax()
    {
        return totalTax;
    }
}
