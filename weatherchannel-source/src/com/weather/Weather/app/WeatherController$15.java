// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;


// Referenced classes of package com.weather.Weather.app:
//            WeatherController

static class .LoginStatus
{

    static final int $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[];

    static 
    {
        $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus = new int[com.weather.commons.ups.backend.atus.values().length];
        try
        {
            $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.atus.LOGGED_OUT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.atus.LOGGED_IN_TO_ANON_ACCOUNT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.atus.LOGGED_IN_TO_NAMED_ACCOUNT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.atus.TOKEN_EXPIRED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
