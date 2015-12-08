// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

public static final class  extends Enum
{

    private static final BrandPrice150Plus $VALUES[];
    public static final BrandPrice150Plus BrandPrice100To150;
    public static final BrandPrice150Plus BrandPrice150Plus;
    public static final BrandPrice150Plus BrandPrice1To20;
    public static final BrandPrice150Plus BrandPrice20To50;
    public static final BrandPrice150Plus BrandPrice50To100;
    public static final BrandPrice150Plus Everything;
    public static final BrandPrice150Plus MostWishes;
    public static final BrandPrice150Plus Price100To150;
    public static final BrandPrice150Plus Price150Plus;
    public static final BrandPrice150Plus Price1To20;
    public static final BrandPrice150Plus Price20To50;
    public static final BrandPrice150Plus Price50To100;
    public static final BrandPrice150Plus Recommended;
    public static final BrandPrice150Plus Trending;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$SortMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Recommended = new <init>("Recommended", 0);
        Trending = new <init>("Trending", 1);
        MostWishes = new <init>("MostWishes", 2);
        Price1To20 = new <init>("Price1To20", 3);
        Price20To50 = new <init>("Price20To50", 4);
        Price50To100 = new <init>("Price50To100", 5);
        Price100To150 = new <init>("Price100To150", 6);
        Price150Plus = new <init>("Price150Plus", 7);
        Everything = new <init>("Everything", 8);
        BrandPrice1To20 = new <init>("BrandPrice1To20", 9);
        BrandPrice20To50 = new <init>("BrandPrice20To50", 10);
        BrandPrice50To100 = new <init>("BrandPrice50To100", 11);
        BrandPrice100To150 = new <init>("BrandPrice100To150", 12);
        BrandPrice150Plus = new <init>("BrandPrice150Plus", 13);
        $VALUES = (new .VALUES[] {
            Recommended, Trending, MostWishes, Price1To20, Price20To50, Price50To100, Price100To150, Price150Plus, Everything, BrandPrice1To20, 
            BrandPrice20To50, BrandPrice50To100, BrandPrice100To150, BrandPrice150Plus
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
