// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;

public final class LocalyticsUpsAccountProvider extends Enum
{

    private static final LocalyticsUpsAccountProvider $VALUES[];
    public static final LocalyticsUpsAccountProvider AMAZON;
    public static final LocalyticsUpsAccountProvider EMAIL;
    public static final LocalyticsUpsAccountProvider FACEBOOK;
    public static final LocalyticsUpsAccountProvider GOOGLE;
    private static final Map providerMap;
    private final String attributeValue;

    private LocalyticsUpsAccountProvider(String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }

    public static LocalyticsUpsAccountProvider valueOf(com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider)
    {
        return (LocalyticsUpsAccountProvider)providerMap.get(accountprovider);
    }

    public static LocalyticsUpsAccountProvider valueOf(String s)
    {
        return (LocalyticsUpsAccountProvider)Enum.valueOf(com/weather/commons/analytics/ups/LocalyticsUpsAccountProvider, s);
    }

    public static LocalyticsUpsAccountProvider[] values()
    {
        return (LocalyticsUpsAccountProvider[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        FACEBOOK = new LocalyticsUpsAccountProvider("FACEBOOK", 0, "facebook");
        EMAIL = new LocalyticsUpsAccountProvider("EMAIL", 1, "email");
        GOOGLE = new LocalyticsUpsAccountProvider("GOOGLE", 2, "G+");
        AMAZON = new LocalyticsUpsAccountProvider("AMAZON", 3, "Amazon");
        $VALUES = (new LocalyticsUpsAccountProvider[] {
            FACEBOOK, EMAIL, GOOGLE, AMAZON
        });
        EnumMap enummap = new EnumMap(com/weather/commons/ups/facade/DsxAccount$AccountProvider);
        enummap.put(com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL, EMAIL);
        enummap.put(com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_FACEBOOK, FACEBOOK);
        enummap.put(com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS, GOOGLE);
        enummap.put(com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_AMAZON, AMAZON);
        providerMap = Maps.immutableEnumMap(enummap);
    }
}
