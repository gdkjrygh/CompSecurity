// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


final class c
{

    static final int a[];

    static 
    {
        a = new int[DecodedBitStreamParser.Mode.values().length];
        try
        {
            a[DecodedBitStreamParser.Mode.C40_ENCODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[DecodedBitStreamParser.Mode.TEXT_ENCODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[DecodedBitStreamParser.Mode.ANSIX12_ENCODE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[DecodedBitStreamParser.Mode.EDIFACT_ENCODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[DecodedBitStreamParser.Mode.BASE256_ENCODE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
