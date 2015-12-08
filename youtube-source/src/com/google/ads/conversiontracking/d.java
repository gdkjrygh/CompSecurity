// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;


final class d
{

    static final int a[];

    static 
    {
        a = new int[GoogleConversionPing.ConversionType.values().length];
        try
        {
            a[GoogleConversionPing.ConversionType.DOUBLECLICK_CONVERSION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[GoogleConversionPing.ConversionType.GOOGLE_CONVERSION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
