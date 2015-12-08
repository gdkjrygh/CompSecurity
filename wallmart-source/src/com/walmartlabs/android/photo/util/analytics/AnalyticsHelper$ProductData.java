// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.analytics;


// Referenced classes of package com.walmartlabs.android.photo.util.analytics:
//            AnalyticsHelper

private static class itemPrice
{

    private int count;
    private double itemPrice;
    private String sku;

    public void addQuantity(int i)
    {
        count = count + i;
    }

    public int getCount()
    {
        return count;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public String getSku()
    {
        return sku;
    }

    public (String s, double d)
    {
        sku = s;
        itemPrice = d;
    }
}
