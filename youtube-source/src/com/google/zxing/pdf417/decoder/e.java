// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


final class e
{

    static final int a[];

    static 
    {
        a = new int[DecodedBitStreamParser.Mode.values().length];
        try
        {
            a[DecodedBitStreamParser.Mode.ALPHA.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[DecodedBitStreamParser.Mode.LOWER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[DecodedBitStreamParser.Mode.MIXED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[DecodedBitStreamParser.Mode.PUNCT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[DecodedBitStreamParser.Mode.ALPHA_SHIFT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[DecodedBitStreamParser.Mode.PUNCT_SHIFT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
