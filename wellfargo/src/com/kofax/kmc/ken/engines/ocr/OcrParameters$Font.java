// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;


public final class  extends Enum
{

    public static final E13B_MICR DEFAULT;
    public static final E13B_MICR E13B_MICR;
    public static final E13B_MICR FARRINGTON_CREDIT_CARD;
    public static final E13B_MICR GENERIC_MACHINE_PRINT;
    private static final E13B_MICR a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/ocr/OcrParameters$Font, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        GENERIC_MACHINE_PRINT = new <init>("GENERIC_MACHINE_PRINT", 1);
        FARRINGTON_CREDIT_CARD = new <init>("FARRINGTON_CREDIT_CARD", 2);
        E13B_MICR = new <init>("E13B_MICR", 3);
        a = (new a[] {
            DEFAULT, GENERIC_MACHINE_PRINT, FARRINGTON_CREDIT_CARD, E13B_MICR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
