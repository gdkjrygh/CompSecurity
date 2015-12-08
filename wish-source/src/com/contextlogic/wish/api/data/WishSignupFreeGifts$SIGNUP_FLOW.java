// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishSignupFreeGifts

public static final class  extends Enum
{

    private static final FREE_GIFT $VALUES[];
    public static final FREE_GIFT FREE_GIFT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishSignupFreeGifts$SIGNUP_FLOW, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FREE_GIFT = new <init>("FREE_GIFT", 0);
        $VALUES = (new .VALUES[] {
            FREE_GIFT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
