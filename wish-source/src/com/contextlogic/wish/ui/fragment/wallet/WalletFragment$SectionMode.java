// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;


// Referenced classes of package com.contextlogic.wish.ui.fragment.wallet:
//            WalletFragment

public static final class I extends Enum
{

    private static final Rebates $VALUES[];
    public static final Rebates GiftCards;
    public static final Rebates Rebates;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/contextlogic/wish/ui/fragment/wallet/WalletFragment$SectionMode, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        GiftCards = new <init>("GiftCards", 0);
        Rebates = new <init>("Rebates", 1);
        $VALUES = (new .VALUES[] {
            GiftCards, Rebates
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
