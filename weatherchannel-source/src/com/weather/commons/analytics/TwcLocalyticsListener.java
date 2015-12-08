// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.localytics.android.AnalyticsListener;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Map;

public class TwcLocalyticsListener
    implements AnalyticsListener
{

    private static final String TAG = "TwcLocalyticsListener";

    public TwcLocalyticsListener()
    {
    }

    public void localyticsDidTagEvent(String s, Map map, long l)
    {
        LogUtil.d("TwcLocalyticsListener", LoggingMetaTags.TWC_BEACON, (new StringBuilder()).append("localyticsDidTagEvent: eventName=").append(s).toString(), new Object[0]);
    }

    public void localyticsSessionDidOpen(boolean flag, boolean flag1, boolean flag2)
    {
        LogUtil.d("TwcLocalyticsListener", LoggingMetaTags.TWC_BEACON, (new StringBuilder()).append("localyticsSessionDidOpen: isFirst=").append(flag).append(", isUpgrade=").append(flag1).append(", isResume=").append(flag2).toString(), new Object[0]);
    }

    public void localyticsSessionWillClose()
    {
        LogUtil.d("TwcLocalyticsListener", LoggingMetaTags.TWC_BEACON, "localyticsSessionWillClose", new Object[0]);
    }

    public void localyticsSessionWillOpen(boolean flag, boolean flag1, boolean flag2)
    {
        LogUtil.d("TwcLocalyticsListener", LoggingMetaTags.TWC_BEACON, (new StringBuilder()).append("localyticsSessionWillOpen: isFirst=").append(flag).append(", isUpgrade=").append(flag1).append(", isResume=").append(flag2).toString(), new Object[0]);
    }
}
