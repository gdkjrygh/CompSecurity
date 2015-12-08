// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.decoder;


final class  extends Enum
{

    private static final BINARY $VALUES[];
    public static final BINARY BINARY;
    public static final BINARY DIGIT;
    public static final BINARY LOWER;
    public static final BINARY MIXED;
    public static final BINARY PUNCT;
    public static final BINARY UPPER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/zxing/aztec/decoder/Decoder$Table, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UPPER = new <init>("UPPER", 0);
        LOWER = new <init>("LOWER", 1);
        MIXED = new <init>("MIXED", 2);
        DIGIT = new <init>("DIGIT", 3);
        PUNCT = new <init>("PUNCT", 4);
        BINARY = new <init>("BINARY", 5);
        $VALUES = (new .VALUES[] {
            UPPER, LOWER, MIXED, DIGIT, PUNCT, BINARY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
