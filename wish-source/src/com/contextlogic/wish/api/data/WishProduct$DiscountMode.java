// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct

public static final class  extends Enum
{

    private static final CommerceOutOfStock $VALUES[];
    public static final CommerceOutOfStock Commerce;
    public static final CommerceOutOfStock CommerceOutOfStock;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishProduct$DiscountMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Commerce = new <init>("Commerce", 0);
        CommerceOutOfStock = new <init>("CommerceOutOfStock", 1);
        $VALUES = (new .VALUES[] {
            Commerce, CommerceOutOfStock
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
