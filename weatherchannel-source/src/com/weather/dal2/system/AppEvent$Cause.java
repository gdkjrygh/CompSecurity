// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;


// Referenced classes of package com.weather.dal2.system:
//            AppEvent

public static final class  extends Enum
{

    private static final APP_STOP $VALUES[];
    public static final APP_STOP APP_CREATE;
    public static final APP_STOP APP_START;
    public static final APP_STOP APP_STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/dal2/system/AppEvent$Cause, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        APP_CREATE = new <init>("APP_CREATE", 0);
        APP_START = new <init>("APP_START", 1);
        APP_STOP = new <init>("APP_STOP", 2);
        $VALUES = (new .VALUES[] {
            APP_CREATE, APP_START, APP_STOP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
