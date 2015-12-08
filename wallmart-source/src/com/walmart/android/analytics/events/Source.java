// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics.events;


public final class Source extends Enum
{

    private static final Source $VALUES[];
    public static final Source BROWSE;
    public static final Source CART;
    public static final Source LOCAL_AD;
    public static final Source MANUAL_SHELF;
    public static final Source RECOMMENDED_ITEM;
    public static final Source ROLLBACK;
    public static final Source SEARCH;
    private String value;

    private Source(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static Source valueOf(String s)
    {
        return (Source)Enum.valueOf(com/walmart/android/analytics/events/Source, s);
    }

    public static Source[] values()
    {
        return (Source[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        ROLLBACK = new Source("ROLLBACK", 0, "Rollback");
        RECOMMENDED_ITEM = new Source("RECOMMENDED_ITEM", 1, "productScreenRecommended");
        LOCAL_AD = new Source("LOCAL_AD", 2, "LocalAd");
        MANUAL_SHELF = new Source("MANUAL_SHELF", 3, "ManualShelf");
        SEARCH = new Source("SEARCH", 4, "Search");
        BROWSE = new Source("BROWSE", 5, "Browse");
        CART = new Source("CART", 6, "Cart");
        $VALUES = (new Source[] {
            ROLLBACK, RECOMMENDED_ITEM, LOCAL_AD, MANUAL_SHELF, SEARCH, BROWSE, CART
        });
    }
}
