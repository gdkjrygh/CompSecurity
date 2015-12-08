// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;


public final class  extends Enum
{

    public static final DOUBLECLICK_CONVERSION DOUBLECLICK_CONVERSION;
    public static final DOUBLECLICK_CONVERSION GOOGLE_CONVERSION;
    private static final DOUBLECLICK_CONVERSION a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/ads/conversiontracking/GoogleConversionPing$ConversionType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        GOOGLE_CONVERSION = new <init>("GOOGLE_CONVERSION", 0);
        DOUBLECLICK_CONVERSION = new <init>("DOUBLECLICK_CONVERSION", 1);
        a = (new a[] {
            GOOGLE_CONVERSION, DOUBLECLICK_CONVERSION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
