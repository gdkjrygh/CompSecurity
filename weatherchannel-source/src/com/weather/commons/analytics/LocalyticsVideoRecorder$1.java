// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.commons.video.FeedType;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsVideoRecorder

static class 
{

    static final int $SwitchMap$com$weather$commons$video$FeedType[];

    static 
    {
        $SwitchMap$com$weather$commons$video$FeedType = new int[FeedType.values().length];
        try
        {
            $SwitchMap$com$weather$commons$video$FeedType[FeedType.MUST_SEE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$video$FeedType[FeedType.LOCAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$video$FeedType[FeedType.ON_TV.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
