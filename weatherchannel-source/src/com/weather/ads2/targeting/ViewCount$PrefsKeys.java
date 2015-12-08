// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;


// Referenced classes of package com.weather.ads2.targeting:
//            ViewCount

static final class  extends Enum
{

    private static final LAST_SAVED_MS $VALUES[];
    public static final LAST_SAVED_MS LAST_SAVED_MS;
    public static final LAST_SAVED_MS VIEW_COUNT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/targeting/ViewCount$PrefsKeys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VIEW_COUNT = new <init>("VIEW_COUNT", 0);
        LAST_SAVED_MS = new <init>("LAST_SAVED_MS", 1);
        $VALUES = (new .VALUES[] {
            VIEW_COUNT, LAST_SAVED_MS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
