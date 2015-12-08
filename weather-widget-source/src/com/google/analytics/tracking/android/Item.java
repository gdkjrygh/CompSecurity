// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;

public class Item
{
    public static class Builder
    {

        private final long itemPriceInMicros;
        private final long itemQuantity;
        private String productCategory;
        private final String productName;
        private final String productSKU;

        public Item build()
        {
            return new Item(this);
        }

        public Builder setProductCategory(String s)
        {
            productCategory = s;
            return this;
        }






        public Builder(String s, String s1, long l, long l1)
        {
            productCategory = null;
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("productSKU must not be empty or null");
            }
            if (TextUtils.isEmpty(s1))
            {
                throw new IllegalArgumentException("itemName must not be empty or null");
            } else
            {
                productSKU = s;
                productName = s1;
                itemPriceInMicros = l;
                itemQuantity = l1;
                return;
            }
        }
    }


    private final long itemPriceInMicros;
    private final long itemQuantity;
    private final String productCategory;
    private final String productName;
    private final String productSKU;

    private Item(Builder builder)
    {
        productSKU = builder.productSKU;
        itemPriceInMicros = builder.itemPriceInMicros;
        itemQuantity = builder.itemQuantity;
        productName = builder.productName;
        productCategory = builder.productCategory;
    }


    public long getItemPriceInMicros()
    {
        return itemPriceInMicros;
    }

    public long getItemQuantity()
    {
        return itemQuantity;
    }

    public String getProductCategory()
    {
        return productCategory;
    }

    public String getProductName()
    {
        return productName;
    }

    public String getProductSKU()
    {
        return productSKU;
    }
}
