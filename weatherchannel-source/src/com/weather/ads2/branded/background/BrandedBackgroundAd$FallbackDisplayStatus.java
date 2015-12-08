// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;


// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackgroundAd

private static final class  extends Enum
{

    private static final PENDING $VALUES[];
    public static final PENDING LOADED;
    public static final PENDING NOT_LOADED;
    public static final PENDING PENDING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/branded/background/BrandedBackgroundAd$FallbackDisplayStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_LOADED = new <init>("NOT_LOADED", 0);
        LOADED = new <init>("LOADED", 1);
        PENDING = new <init>("PENDING", 2);
        $VALUES = (new .VALUES[] {
            NOT_LOADED, LOADED, PENDING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
