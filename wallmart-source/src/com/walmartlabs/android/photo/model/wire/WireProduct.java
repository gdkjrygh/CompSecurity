// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;


public class WireProduct
{

    private String description;
    private int dpi;
    private int height;
    private int price;
    private String shortDescription;
    private String sku;
    private int width;

    public WireProduct()
    {
    }

    public String getDescription()
    {
        return description;
    }

    public int getDpi()
    {
        return dpi;
    }

    public int getHeight()
    {
        return height;
    }

    public int getPrice()
    {
        return price;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getSku()
    {
        return sku;
    }

    public int getWidth()
    {
        return width;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDpi(int i)
    {
        dpi = i;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setPrice(int i)
    {
        price = i;
    }

    public void setShortDescription(String s)
    {
        shortDescription = s;
    }

    public void setSku(String s)
    {
        sku = s;
    }

    public void setWidth(int i)
    {
        width = i;
    }
}
