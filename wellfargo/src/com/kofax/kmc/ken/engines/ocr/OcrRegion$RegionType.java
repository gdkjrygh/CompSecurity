// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.ocr;


public final class  extends Enum
{

    public static final REGION_PIXELS REGION_PERCENT;
    public static final REGION_PIXELS REGION_PIXELS;
    private static final REGION_PIXELS a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/ocr/OcrRegion$RegionType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        REGION_PERCENT = new <init>("REGION_PERCENT", 0);
        REGION_PIXELS = new <init>("REGION_PIXELS", 1);
        a = (new a[] {
            REGION_PERCENT, REGION_PIXELS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
