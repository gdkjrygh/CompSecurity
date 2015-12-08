// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;


// Referenced classes of package com.weather.Weather.chat:
//            ChatPrefs

public static final class  extends Enum
{

    private static final HAS_LAUNCHED $VALUES[];
    public static final HAS_LAUNCHED HAS_LAUNCHED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/Weather/chat/ChatPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HAS_LAUNCHED = new <init>("HAS_LAUNCHED", 0);
        $VALUES = (new .VALUES[] {
            HAS_LAUNCHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
