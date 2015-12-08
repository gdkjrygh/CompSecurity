// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;


// Referenced classes of package com.walmartlabs.kangaroo.service:
//            Log

public static final class  extends Enum
{

    private static final EVERYTHING $VALUES[];
    public static final EVERYTHING BASIC;
    public static final EVERYTHING EVERYTHING;
    public static final EVERYTHING NONE;
    public static final EVERYTHING PARAMS_AND_BODIES;
    public static final EVERYTHING SECURE_PARAMS_AND_BODIES;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmartlabs/kangaroo/service/Log$Level, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public boolean shouldLog(l_3B_.clone clone)
    {
        return !equals(NONE) && !clone.equals(NONE) && ordinal() >= clone.ordinal();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        BASIC = new <init>("BASIC", 1);
        PARAMS_AND_BODIES = new <init>("PARAMS_AND_BODIES", 2);
        SECURE_PARAMS_AND_BODIES = new <init>("SECURE_PARAMS_AND_BODIES", 3);
        EVERYTHING = new <init>("EVERYTHING", 4);
        $VALUES = (new .VALUES[] {
            NONE, BASIC, PARAMS_AND_BODIES, SECURE_PARAMS_AND_BODIES, EVERYTHING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
