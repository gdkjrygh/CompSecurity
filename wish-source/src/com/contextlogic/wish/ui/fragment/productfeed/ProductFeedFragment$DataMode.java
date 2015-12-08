// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

public static final class  extends Enum
{

    private static final WishlistV2 $VALUES[];
    public static final WishlistV2 Brand;
    public static final WishlistV2 Collections;
    public static final WishlistV2 Merchant;
    public static final WishlistV2 Search;
    public static final WishlistV2 Set;
    public static final WishlistV2 Tag;
    public static final WishlistV2 WishlistV2;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$DataMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Search = new <init>("Search", 0);
        Tag = new <init>("Tag", 1);
        Set = new <init>("Set", 2);
        Brand = new <init>("Brand", 3);
        Merchant = new <init>("Merchant", 4);
        Collections = new <init>("Collections", 5);
        WishlistV2 = new <init>("WishlistV2", 6);
        $VALUES = (new .VALUES[] {
            Search, Tag, Set, Brand, Merchant, Collections, WishlistV2
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
