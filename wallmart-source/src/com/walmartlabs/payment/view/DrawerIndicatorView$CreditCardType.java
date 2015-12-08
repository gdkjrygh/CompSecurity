// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;


// Referenced classes of package com.walmartlabs.payment.view:
//            DrawerIndicatorView

public static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE AMEX;
    public static final NONE DISCOVER;
    public static final NONE MC;
    public static final NONE NONE;
    public static final NONE VISA;
    public static final NONE WMMASTERCARD;
    public static final NONE WMUSGESTORECARD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/payment/view/DrawerIndicatorView$CreditCardType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AMEX = new <init>("AMEX", 0);
        DISCOVER = new <init>("DISCOVER", 1);
        MC = new <init>("MC", 2);
        VISA = new <init>("VISA", 3);
        WMUSGESTORECARD = new <init>("WMUSGESTORECARD", 4);
        WMMASTERCARD = new <init>("WMMASTERCARD", 5);
        NONE = new <init>("NONE", 6);
        $VALUES = (new .VALUES[] {
            AMEX, DISCOVER, MC, VISA, WMUSGESTORECARD, WMMASTERCARD, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
