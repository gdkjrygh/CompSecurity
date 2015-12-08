// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;


// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBaseBillingHeader

public static final class  extends Enum
{

    private static final PAYPAL $VALUES[];
    public static final PAYPAL BOLETO;
    public static final PAYPAL CREDIT_CARD;
    public static final PAYPAL GOOGLE_WALLET;
    public static final PAYPAL OXXO;
    public static final PAYPAL PAYPAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/cartmodal/ui/billing/CartBaseBillingHeader$CartBillingSection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CREDIT_CARD = new <init>("CREDIT_CARD", 0);
        GOOGLE_WALLET = new <init>("GOOGLE_WALLET", 1);
        BOLETO = new <init>("BOLETO", 2);
        OXXO = new <init>("OXXO", 3);
        PAYPAL = new <init>("PAYPAL", 4);
        $VALUES = (new .VALUES[] {
            CREDIT_CARD, GOOGLE_WALLET, BOLETO, OXXO, PAYPAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
