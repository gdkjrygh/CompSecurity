// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final COLOR $VALUES[];
    public static final COLOR BITONAL;
    public static final COLOR COLOR;
    public static final COLOR GRAYSCALE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/BasicSettingsProfile$OutputBitDepth, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BITONAL = new <init>("BITONAL", 0);
        GRAYSCALE = new <init>("GRAYSCALE", 1);
        COLOR = new <init>("COLOR", 2);
        $VALUES = (new .VALUES[] {
            BITONAL, GRAYSCALE, COLOR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
