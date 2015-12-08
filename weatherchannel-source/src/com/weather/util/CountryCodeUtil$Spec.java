// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;


// Referenced classes of package com.weather.util:
//            CountryCodeUtil

public static final class  extends Enum
{

    private static final ISO $VALUES[];
    public static final ISO FIPS;
    public static final ISO ISO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/util/CountryCodeUtil$Spec, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FIPS = new <init>("FIPS", 0);
        ISO = new <init>("ISO", 1);
        $VALUES = (new .VALUES[] {
            FIPS, ISO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
