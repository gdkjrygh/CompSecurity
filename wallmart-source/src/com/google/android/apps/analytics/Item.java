// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


public class Item
{
    public static class Builder
    {

        private String itemCategory;
        private final long itemCount;
        private String itemName;
        private final double itemPrice;
        private final String itemSKU;
        private final String orderId;

        public Item build()
        {
            return new Item(this);
        }

        public Builder setItemCategory(String s)
        {
            itemCategory = s;
            return this;
        }

        public Builder setItemName(String s)
        {
            itemName = s;
            return this;
        }







        public Builder(String s, String s1, double d, long l)
        {
            itemName = null;
            itemCategory = null;
            if (s == null || s.trim().length() == 0)
            {
                throw new IllegalArgumentException("orderId must not be empty or null");
            }
            if (s1 == null || s1.trim().length() == 0)
            {
                throw new IllegalArgumentException("itemSKU must not be empty or null");
            } else
            {
                orderId = s;
                itemSKU = s1;
                itemPrice = d;
                itemCount = l;
                return;
            }
        }
    }


    private final String itemCategory;
    private final long itemCount;
    private final String itemName;
    private final double itemPrice;
    private final String itemSKU;
    private final String orderId;

    private Item(Builder builder)
    {
        orderId = builder.orderId;
        itemSKU = builder.itemSKU;
        itemPrice = builder.itemPrice;
        itemCount = builder.itemCount;
        itemName = builder.itemName;
        itemCategory = builder.itemCategory;
    }


    String getItemCategory()
    {
        return itemCategory;
    }

    long getItemCount()
    {
        return itemCount;
    }

    String getItemName()
    {
        return itemName;
    }

    double getItemPrice()
    {
        return itemPrice;
    }

    String getItemSKU()
    {
        return itemSKU;
    }

    String getOrderId()
    {
        return orderId;
    }
}
