// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;


public final class ProductType extends Enum
{

    private static final ProductType $VALUES[];
    public static final ProductType BUNDLE;
    public static final ProductType EGIFTCARD;
    public static final ProductType EXTENDED_ITEM_NO_RESPONSE;
    public static final ProductType GIFTCARD;
    public static final ProductType MARKETPLACE;
    public static final ProductType PREORDER;
    public static final ProductType REGULAR;
    private String value;

    private ProductType(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static ProductType valueOf(String s)
    {
        return (ProductType)Enum.valueOf(com/walmart/android/analytics/events/ProductType, s);
    }

    public static ProductType[] values()
    {
        return (ProductType[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        REGULAR = new ProductType("REGULAR", 0, "single item");
        BUNDLE = new ProductType("BUNDLE", 1, "bundle");
        EGIFTCARD = new ProductType("EGIFTCARD", 2, "egiftcard");
        GIFTCARD = new ProductType("GIFTCARD", 3, "giftcard");
        PREORDER = new ProductType("PREORDER", 4, "preorder");
        MARKETPLACE = new ProductType("MARKETPLACE", 5, "marketplace");
        EXTENDED_ITEM_NO_RESPONSE = new ProductType("EXTENDED_ITEM_NO_RESPONSE", 6, "extendedItemNoResponse");
        $VALUES = (new ProductType[] {
            REGULAR, BUNDLE, EGIFTCARD, GIFTCARD, PREORDER, MARKETPLACE, EXTENDED_ITEM_NO_RESPONSE
        });
    }
}
