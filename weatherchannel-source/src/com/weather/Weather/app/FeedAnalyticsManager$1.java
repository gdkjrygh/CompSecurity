// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;


// Referenced classes of package com.weather.Weather.app:
//            FeedAnalyticsManager

static class eEvent.Cause
{

    static final int $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[];

    static 
    {
        $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause = new int[com.weather.dal2.locations.ent.Cause.values().length];
        try
        {
            $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.ent.Cause.USER_SELECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.ent.Cause.FOLLOW_ME.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.ent.Cause.LOCATION_ADDED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.ent.Cause.LOCATION_DELETED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.ent.Cause.CLICK_THRU.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$CurrentLocationChangeEvent$Cause[com.weather.dal2.locations.ent.Cause.APP_RESTORE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
