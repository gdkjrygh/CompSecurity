// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class  extends Enum
{

    public static final LINE_STYLE_DOTTED LINE_STYLE_DOTTED;
    public static final LINE_STYLE_DOTTED LINE_STYLE_SOLID;
    private static final LINE_STYLE_DOTTED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kui/uicontrols/ImgReviewEditCntrl$Line_Style_Solid, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        LINE_STYLE_SOLID = new <init>("LINE_STYLE_SOLID", 0);
        LINE_STYLE_DOTTED = new <init>("LINE_STYLE_DOTTED", 1);
        a = (new a[] {
            LINE_STYLE_SOLID, LINE_STYLE_DOTTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
