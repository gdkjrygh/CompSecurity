// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo;


// Referenced classes of package com.walmartlabs.kangaroo:
//            Result

public static final class  extends Enum
{

    private static final CONDITIONAL_CACHED $VALUES[];
    public static final CONDITIONAL_CACHED CACHED;
    public static final CONDITIONAL_CACHED CONDITIONAL_CACHED;
    public static final CONDITIONAL_CACHED CONDITIONAL_NETWORK;
    public static final CONDITIONAL_CACHED NETWORK;
    public static final CONDITIONAL_CACHED NO_RESPONSE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/kangaroo/Result$ResponseType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NO_RESPONSE = new <init>("NO_RESPONSE", 0);
        NETWORK = new <init>("NETWORK", 1);
        CACHED = new <init>("CACHED", 2);
        CONDITIONAL_NETWORK = new <init>("CONDITIONAL_NETWORK", 3);
        CONDITIONAL_CACHED = new <init>("CONDITIONAL_CACHED", 4);
        $VALUES = (new .VALUES[] {
            NO_RESPONSE, NETWORK, CACHED, CONDITIONAL_NETWORK, CONDITIONAL_CACHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
