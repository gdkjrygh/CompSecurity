// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;

// Referenced classes of package com.weather.commons.analytics.feed:
//            SummarySupportingLocalyticsModuleHandler, LocalyticsModuleViewedAttribute

public class MainFeedLocalyticsModuleHandler extends SummarySupportingLocalyticsModuleHandler
{

    public MainFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, LocalyticsModuleViewedAttribute localyticsmoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, localyticsmoduleviewedattribute, localyticshandler, handler);
    }

    protected LocalyticsRecorder getFeedSummaryRecorder()
    {
        return localyticsHandler.getMainFeedSummaryRecorder();
    }
}
