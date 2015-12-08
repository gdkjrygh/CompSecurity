// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.giq;


public class GiqProductItem
{

    public String brand;
    public String description;
    public String itemDetail;
    public String manufacturer;
    public String size;
    public String upc;

    public GiqProductItem()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append("GiqProductItem [upc=").append(upc).append(", brand=").append(brand).append(", description=").append(description).append(", itemDetail=").append(itemDetail).append(", size=").append(size).append(", manufacturer=").append(manufacturer).append("]").toString();
    }
}
