// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


final class A extends Enum
{

    private static final PUNCT_SHIFT $VALUES[];
    public static final PUNCT_SHIFT ALPHA;
    public static final PUNCT_SHIFT ALPHA_SHIFT;
    public static final PUNCT_SHIFT LOWER;
    public static final PUNCT_SHIFT MIXED;
    public static final PUNCT_SHIFT PUNCT;
    public static final PUNCT_SHIFT PUNCT_SHIFT;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/google/zxing/pdf417/decoder/DecodedBitStreamParser$Mode, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        ALPHA = new <init>("ALPHA", 0);
        LOWER = new <init>("LOWER", 1);
        MIXED = new <init>("MIXED", 2);
        PUNCT = new <init>("PUNCT", 3);
        ALPHA_SHIFT = new <init>("ALPHA_SHIFT", 4);
        PUNCT_SHIFT = new <init>("PUNCT_SHIFT", 5);
        $VALUES = (new .VALUES[] {
            ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
