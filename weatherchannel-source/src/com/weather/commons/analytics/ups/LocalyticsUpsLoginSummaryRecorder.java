// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;

import com.google.common.base.Ticker;
import com.weather.commons.analytics.LocalyticsRecorder;

// Referenced classes of package com.weather.commons.analytics.ups:
//            LocalyticsUpsTag, LocalyticsUpsAccountProvider

public class LocalyticsUpsLoginSummaryRecorder extends LocalyticsRecorder
{

    public LocalyticsUpsLoginSummaryRecorder()
    {
        this(Ticker.systemTicker());
    }

    LocalyticsUpsLoginSummaryRecorder(Ticker ticker)
    {
        super(ticker);
        putValueIfAbsent(LocalyticsUpsTag.COMPLETED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
    }

    public void pauseTime()
    {
        pauseStopwatch(LocalyticsUpsTag.TIME_SPENT);
    }

    public void recordAttemptStarted()
    {
        incrementValue(LocalyticsUpsTag.ATTEMPTS);
    }

    public void recordLoginComplete(LocalyticsUpsAccountProvider localyticsupsaccountprovider)
    {
        putValueIfAbsent(LocalyticsUpsTag.METHOD, localyticsupsaccountprovider.getAttributeValue());
        putValue(LocalyticsUpsTag.COMPLETED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    public void recordLoginProcessStarted()
    {
        initIncrementalValue(LocalyticsUpsTag.ATTEMPTS);
        startSecondsStopwatch(LocalyticsUpsTag.TIME_SPENT);
    }

    public void resumeTime()
    {
        resumeStopwatch(LocalyticsUpsTag.TIME_SPENT);
    }
}
