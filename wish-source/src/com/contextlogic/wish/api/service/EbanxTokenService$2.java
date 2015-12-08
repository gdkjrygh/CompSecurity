// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;


// Referenced classes of package com.contextlogic.wish.api.service:
//            EbanxTokenService

static class 
{

    static final int $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[];

    static 
    {
        $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType = new int[com.contextlogic.wish.util.ype.values().length];
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.Visa.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.MasterCard.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.Amex.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.Discover.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.DinersClub.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.HiperCard.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.ype.Invalid.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
