// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerAdapter

public static final class  extends Enum
{

    private static final RELATED_PRODUCTS $VALUES[];
    public static final RELATED_PRODUCTS DESCRIPTION;
    public static final RELATED_PRODUCTS OVERVIEW;
    public static final RELATED_PRODUCTS PRODUCT_RATINGS;
    public static final RELATED_PRODUCTS RELATED_PRODUCTS;
    public static final RELATED_PRODUCTS SHIPPING_INFO;
    public static final RELATED_PRODUCTS STORE_RATINGS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsPagerAdapter$ProductDetailSection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OVERVIEW = new <init>("OVERVIEW", 0);
        DESCRIPTION = new <init>("DESCRIPTION", 1);
        PRODUCT_RATINGS = new <init>("PRODUCT_RATINGS", 2);
        STORE_RATINGS = new <init>("STORE_RATINGS", 3);
        SHIPPING_INFO = new <init>("SHIPPING_INFO", 4);
        RELATED_PRODUCTS = new <init>("RELATED_PRODUCTS", 5);
        $VALUES = (new .VALUES[] {
            OVERVIEW, DESCRIPTION, PRODUCT_RATINGS, STORE_RATINGS, SHIPPING_INFO, RELATED_PRODUCTS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
