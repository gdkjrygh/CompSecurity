// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//            l

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN AUTO;
    public static final UNKNOWN CLICK;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/ads/interactivemedia/v3/impl/l$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUTO = new <init>("AUTO", 0);
        CLICK = new <init>("CLICK", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            AUTO, CLICK, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
