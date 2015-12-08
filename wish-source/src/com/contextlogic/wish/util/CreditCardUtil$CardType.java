// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;


// Referenced classes of package com.contextlogic.wish.util:
//            CreditCardUtil

public static final class  extends Enum
{

    private static final Invalid $VALUES[];
    public static final Invalid Amex;
    public static final Invalid DinersClub;
    public static final Invalid Discover;
    public static final Invalid HiperCard;
    public static final Invalid Invalid;
    public static final Invalid MasterCard;
    public static final Invalid Visa;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/util/CreditCardUtil$CardType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Visa = new <init>("Visa", 0);
        MasterCard = new <init>("MasterCard", 1);
        Amex = new <init>("Amex", 2);
        Discover = new <init>("Discover", 3);
        HiperCard = new <init>("HiperCard", 4);
        DinersClub = new <init>("DinersClub", 5);
        Invalid = new <init>("Invalid", 6);
        $VALUES = (new .VALUES[] {
            Visa, MasterCard, Amex, Discover, HiperCard, DinersClub, Invalid
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
