// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishWalletItem

public static final class  extends Enum
{

    private static final ExpiredGiftCard $VALUES[];
    public static final ExpiredGiftCard ExpiredGiftCard;
    public static final ExpiredGiftCard GiftCard;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishWalletItem$WalletItemType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GiftCard = new <init>("GiftCard", 0);
        ExpiredGiftCard = new <init>("ExpiredGiftCard", 1);
        $VALUES = (new .VALUES[] {
            GiftCard, ExpiredGiftCard
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
