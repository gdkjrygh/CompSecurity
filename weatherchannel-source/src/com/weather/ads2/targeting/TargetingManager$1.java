// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;


// Referenced classes of package com.weather.ads2.targeting:
//            TargetingManager

static class 
{

    static final int $SwitchMap$com$weather$dal2$system$AppEvent$Cause[];

    static 
    {
        $SwitchMap$com$weather$dal2$system$AppEvent$Cause = new int[com.weather.dal2.system.es().length];
        try
        {
            $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.START.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.STOP.nal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$dal2$system$AppEvent$Cause[com.weather.dal2.system.CREATE.nal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
