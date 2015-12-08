// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;


// Referenced classes of package com.walmartlabs.kangaroo:
//            Result

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CONNECT;
    public static final UNKNOWN PARSE;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/kangaroo/Result$Error$Category, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONNECT = new <init>("CONNECT", 0);
        PARSE = new <init>("PARSE", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            CONNECT, PARSE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
