// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;


// Referenced classes of package com.walmartlabs.payment.view:
//            DrawerIndicatorView

public static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE GIFT_CARD;
    public static final NONE GIFT_CARD_ZERO;
    public static final NONE NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/payment/view/DrawerIndicatorView$GiftCardType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GIFT_CARD = new <init>("GIFT_CARD", 0);
        GIFT_CARD_ZERO = new <init>("GIFT_CARD_ZERO", 1);
        NONE = new <init>("NONE", 2);
        $VALUES = (new .VALUES[] {
            GIFT_CARD, GIFT_CARD_ZERO, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
