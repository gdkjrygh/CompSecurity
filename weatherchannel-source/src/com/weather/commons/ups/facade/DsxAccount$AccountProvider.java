// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;

import android.content.Context;
import com.weather.util.enums.EnumConverter;
import com.weather.util.enums.ReverseEnumMap;

// Referenced classes of package com.weather.commons.ups.facade:
//            DsxAccount

public static final class nameResourceId extends Enum
    implements EnumConverter
{

    private static final PROVIDER_WEATHER_CHANNEL $VALUES[];
    public static final PROVIDER_WEATHER_CHANNEL PROVIDER_AMAZON;
    public static final PROVIDER_WEATHER_CHANNEL PROVIDER_ANONYMOUS;
    public static final PROVIDER_WEATHER_CHANNEL PROVIDER_FACEBOOK;
    public static final PROVIDER_WEATHER_CHANNEL PROVIDER_GOOGLE_PLUS;
    public static final PROVIDER_WEATHER_CHANNEL PROVIDER_WEATHER_CHANNEL;
    public static final PROVIDER_WEATHER_CHANNEL STATIC;
    private static final ReverseEnumMap map = new ReverseEnumMap(com/weather/commons/ups/facade/DsxAccount$AccountProvider);
    private final Integer nameResourceId;
    private final String provider;

    public static nameResourceId valueOf(String s)
    {
        return (nameResourceId)Enum.valueOf(com/weather/commons/ups/facade/DsxAccount$AccountProvider, s);
    }

    public static nameResourceId[] values()
    {
        return (nameResourceId[])$VALUES.clone();
    }

    public r_3B_.clone convert(String s)
    {
        return (r_3B_.clone)map.get(s);
    }

    public volatile Enum convert(String s)
    {
        return convert(s);
    }

    public String convert()
    {
        return provider;
    }

    public String getProviderName(Context context)
    {
        if (nameResourceId == null)
        {
            return "";
        } else
        {
            return context.getString(nameResourceId.intValue());
        }
    }

    public String toString()
    {
        return String.format("AccountProvider{provider='%s'}", new Object[] {
            provider
        });
    }

    static 
    {
        PROVIDER_FACEBOOK = new <init>("PROVIDER_FACEBOOK", 0, "fb", Integer.valueOf(com.weather.commons.k));
        PROVIDER_ANONYMOUS = new <init>("PROVIDER_ANONYMOUS", 1, "anon", null);
        PROVIDER_AMAZON = new <init>("PROVIDER_AMAZON", 2, "aws", Integer.valueOf(com.weather.commons.ntProvider));
        PROVIDER_GOOGLE_PLUS = new <init>("PROVIDER_GOOGLE_PLUS", 3, "gp", Integer.valueOf(com.weather.commons.plus));
        PROVIDER_WEATHER_CHANNEL = new <init>("PROVIDER_WEATHER_CHANNEL", 4, "wx", Integer.valueOf(com.weather.commons.ntProvider));
        $VALUES = (new .VALUES[] {
            PROVIDER_FACEBOOK, PROVIDER_ANONYMOUS, PROVIDER_AMAZON, PROVIDER_GOOGLE_PLUS, PROVIDER_WEATHER_CHANNEL
        });
        STATIC = PROVIDER_WEATHER_CHANNEL;
    }

    private (String s, int i, String s1, Integer integer)
    {
        super(s, i);
        provider = s1;
        nameResourceId = integer;
    }
}
