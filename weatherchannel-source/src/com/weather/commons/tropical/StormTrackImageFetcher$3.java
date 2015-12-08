// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;


// Referenced classes of package com.weather.commons.tropical:
//            StormTrackImageFetcher

static class 
{

    static final int $SwitchMap$com$weather$commons$tropical$StormData$StormType[];

    static 
    {
        $SwitchMap$com$weather$commons$tropical$StormData$StormType = new int[s().length];
        try
        {
            $SwitchMap$com$weather$commons$tropical$StormData$StormType[CAL_DEPRESSION.al()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$tropical$StormData$StormType[CAL_STORM.al()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$tropical$StormData$StormType[CANE.al()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
