// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


final class  extends Enum
{

    private static final BASE256_ENCODE $VALUES[];
    public static final BASE256_ENCODE ANSIX12_ENCODE;
    public static final BASE256_ENCODE ASCII_ENCODE;
    public static final BASE256_ENCODE BASE256_ENCODE;
    public static final BASE256_ENCODE C40_ENCODE;
    public static final BASE256_ENCODE EDIFACT_ENCODE;
    public static final BASE256_ENCODE PAD_ENCODE;
    public static final BASE256_ENCODE TEXT_ENCODE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/zxing/datamatrix/decoder/DecodedBitStreamParser$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PAD_ENCODE = new <init>("PAD_ENCODE", 0);
        ASCII_ENCODE = new <init>("ASCII_ENCODE", 1);
        C40_ENCODE = new <init>("C40_ENCODE", 2);
        TEXT_ENCODE = new <init>("TEXT_ENCODE", 3);
        ANSIX12_ENCODE = new <init>("ANSIX12_ENCODE", 4);
        EDIFACT_ENCODE = new <init>("EDIFACT_ENCODE", 5);
        BASE256_ENCODE = new <init>("BASE256_ENCODE", 6);
        $VALUES = (new .VALUES[] {
            PAD_ENCODE, ASCII_ENCODE, C40_ENCODE, TEXT_ENCODE, ANSIX12_ENCODE, EDIFACT_ENCODE, BASE256_ENCODE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
