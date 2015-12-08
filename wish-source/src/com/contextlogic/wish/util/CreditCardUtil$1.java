// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;


// Referenced classes of package com.contextlogic.wish.util:
//            CreditCardUtil

static class rdType
{

    static final int $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[];

    static 
    {
        $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType = new int[rdType.values().length];
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.Visa.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.MasterCard.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.Amex.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.Discover.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.DinersClub.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.HiperCard.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[rdType.Invalid.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
