// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;


// Referenced classes of package com.walmart.android.config:
//            FragmentConfig

public static final class  extends Enum
{

    private static final MOBILE_PAY $VALUES[];
    public static final MOBILE_PAY FAST_PICKUP;
    public static final MOBILE_PAY HOME;
    public static final MOBILE_PAY HYBRID_CART;
    public static final MOBILE_PAY LOCAL_AD;
    public static final MOBILE_PAY MOBILE_PAY;
    public static final MOBILE_PAY PAYMENT;
    public static final MOBILE_PAY PHARMACY;
    public static final MOBILE_PAY PHARMACY_HYBRID;
    public static final MOBILE_PAY PRODUCT_DETAILS;
    public static final MOBILE_PAY REGISTRY;
    public static final MOBILE_PAY SAVER_DASHBOARD;
    public static final MOBILE_PAY SHOP;
    public static final MOBILE_PAY STORE_FINDER;
    public static final MOBILE_PAY TRACK_ORDER;
    public static final MOBILE_PAY WEB_FRAGMENT;
    public static final MOBILE_PAY WISHLIST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/config/FragmentConfig$FragmentName, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HOME = new <init>("HOME", 0);
        SHOP = new <init>("SHOP", 1);
        STORE_FINDER = new <init>("STORE_FINDER", 2);
        TRACK_ORDER = new <init>("TRACK_ORDER", 3);
        LOCAL_AD = new <init>("LOCAL_AD", 4);
        PHARMACY = new <init>("PHARMACY", 5);
        SAVER_DASHBOARD = new <init>("SAVER_DASHBOARD", 6);
        PRODUCT_DETAILS = new <init>("PRODUCT_DETAILS", 7);
        WEB_FRAGMENT = new <init>("WEB_FRAGMENT", 8);
        FAST_PICKUP = new <init>("FAST_PICKUP", 9);
        REGISTRY = new <init>("REGISTRY", 10);
        PHARMACY_HYBRID = new <init>("PHARMACY_HYBRID", 11);
        HYBRID_CART = new <init>("HYBRID_CART", 12);
        PAYMENT = new <init>("PAYMENT", 13);
        WISHLIST = new <init>("WISHLIST", 14);
        MOBILE_PAY = new <init>("MOBILE_PAY", 15);
        $VALUES = (new .VALUES[] {
            HOME, SHOP, STORE_FINDER, TRACK_ORDER, LOCAL_AD, PHARMACY, SAVER_DASHBOARD, PRODUCT_DETAILS, WEB_FRAGMENT, FAST_PICKUP, 
            REGISTRY, PHARMACY_HYBRID, HYBRID_CART, PAYMENT, WISHLIST, MOBILE_PAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
