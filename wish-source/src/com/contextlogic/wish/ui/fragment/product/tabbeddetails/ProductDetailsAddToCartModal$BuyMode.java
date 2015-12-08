// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            ProductDetailsAddToCartModal

public static final class  extends Enum
{

    private static final BUY $VALUES[];
    public static final BUY BUY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/ProductDetailsAddToCartModal$BuyMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BUY = new <init>("BUY", 0);
        $VALUES = (new .VALUES[] {
            BUY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
