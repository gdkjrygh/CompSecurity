// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;


// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView

private static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN DOWN;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN UP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsPagerView$ScrollDirection, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UP = new <init>("UP", 0);
        DOWN = new <init>("DOWN", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            UP, DOWN, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
