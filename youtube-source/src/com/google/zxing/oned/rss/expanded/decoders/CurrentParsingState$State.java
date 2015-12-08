// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


final class  extends Enum
{

    private static final ISO_IEC_646 $VALUES[];
    public static final ISO_IEC_646 ALPHA;
    public static final ISO_IEC_646 ISO_IEC_646;
    public static final ISO_IEC_646 NUMERIC;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/zxing/oned/rss/expanded/decoders/CurrentParsingState$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NUMERIC = new <init>("NUMERIC", 0);
        ALPHA = new <init>("ALPHA", 1);
        ISO_IEC_646 = new <init>("ISO_IEC_646", 2);
        $VALUES = (new .VALUES[] {
            NUMERIC, ALPHA, ISO_IEC_646
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
