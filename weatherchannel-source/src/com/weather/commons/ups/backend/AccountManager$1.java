// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


// Referenced classes of package com.weather.commons.ups.backend:
//            AccountManager

static class Provider
{

    static final int $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[];

    static 
    {
        $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider = new int[com.weather.commons.ups.facade.tProvider.values().length];
        try
        {
            $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.tProvider.PROVIDER_FACEBOOK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.tProvider.PROVIDER_AMAZON.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.tProvider.PROVIDER_GOOGLE_PLUS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.tProvider.PROVIDER_WEATHER_CHANNEL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$facade$DsxAccount$AccountProvider[com.weather.commons.ups.facade.tProvider.PROVIDER_ANONYMOUS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
