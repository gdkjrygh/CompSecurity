// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.factual;


// Referenced classes of package com.weather.ads2.factual:
//            FactualPrefs

public static final class  extends Enum
{

    private static final PROXIMITY $VALUES[];
    public static final PROXIMITY AUDIENCE;
    public static final PROXIMITY DOCUMENT;
    public static final PROXIMITY PROXIMITY;
    public static final PROXIMITY UPDATE_TIME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/factual/FactualPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DOCUMENT = new <init>("DOCUMENT", 0);
        UPDATE_TIME = new <init>("UPDATE_TIME", 1);
        AUDIENCE = new <init>("AUDIENCE", 2);
        PROXIMITY = new <init>("PROXIMITY", 3);
        $VALUES = (new .VALUES[] {
            DOCUMENT, UPDATE_TIME, AUDIENCE, PROXIMITY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
