// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishFeedPromotionItem

public static final class  extends Enum
{

    private static final Unknown $VALUES[];
    public static final Unknown Banner;
    public static final Unknown Tile;
    public static final Unknown Unknown;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishFeedPromotionItem$FeedPromotionItemDisplayMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Banner = new <init>("Banner", 0);
        Tile = new <init>("Tile", 1);
        Unknown = new <init>("Unknown", 2);
        $VALUES = (new .VALUES[] {
            Banner, Tile, Unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
