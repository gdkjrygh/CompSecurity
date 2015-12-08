// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;


// Referenced classes of package com.weather.commons.tropical:
//            StormPosition

public static final class  extends Enum
{

    private static final FUTURE $VALUES[];
    public static final FUTURE CURRENT;
    public static final FUTURE FUTURE;
    public static final FUTURE PAST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/tropical/StormPosition$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CURRENT = new <init>("CURRENT", 0);
        PAST = new <init>("PAST", 1);
        FUTURE = new <init>("FUTURE", 2);
        $VALUES = (new .VALUES[] {
            CURRENT, PAST, FUTURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
