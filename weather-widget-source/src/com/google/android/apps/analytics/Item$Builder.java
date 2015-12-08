// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Item

public class itemCount
{

    private String itemCategory;
    private final long itemCount;
    private String itemName;
    private final double itemPrice;
    private final String itemSKU;
    private final String orderId;

    public Item build()
    {
        return new Item(this, null);
    }

    public itemCount setItemCategory(String s)
    {
        itemCategory = s;
        return this;
    }

    public itemCategory setItemName(String s)
    {
        itemName = s;
        return this;
    }







    public (String s, String s1, double d, long l)
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
