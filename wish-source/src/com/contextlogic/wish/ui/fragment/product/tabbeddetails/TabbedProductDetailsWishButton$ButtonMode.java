// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsWishButton

public static final class  extends Enum
{

    private static final WishedV2 $VALUES[];
    public static final WishedV2 Wish;
    public static final WishedV2 WishLoading;
    public static final WishedV2 Wished;
    public static final WishedV2 WishedV2;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsWishButton$ButtonMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Wish = new <init>("Wish", 0);
        WishLoading = new <init>("WishLoading", 1);
        Wished = new <init>("Wished", 2);
        WishedV2 = new <init>("WishedV2", 3);
        $VALUES = (new .VALUES[] {
            Wish, WishLoading, Wished, WishedV2
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
