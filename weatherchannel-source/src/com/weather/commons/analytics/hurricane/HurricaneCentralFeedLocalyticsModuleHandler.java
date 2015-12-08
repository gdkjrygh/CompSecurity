// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.hurricane;

import android.os.Handler;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.analytics.Event;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.feed.SummarySupportingLocalyticsModuleHandler;

// Referenced classes of package com.weather.commons.analytics.hurricane:
//            HurricaneCentralTag, HurricaneModuleViewedAttribute

public class HurricaneCentralFeedLocalyticsModuleHandler extends SummarySupportingLocalyticsModuleHandler
{

    public HurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, HurricaneModuleViewedAttribute hurricanemoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, hurricanemoduleviewedattribute, localyticshandler, handler);
    }

    protected LocalyticsRecorder getFeedSummaryRecorder()
    {
        return localyticsHandler.getHurricaneCentralFeedSummaryRecorder();
    }

    protected void tagEventWithStorm(Event event, String s)
    {
        if (s != null)
        {
            localyticsHandler.tagEvent(event, ImmutableMap.of(HurricaneCentralTag.CURRENT_STORM, s));
            return;
        } else
        {
            localyticsHandler.tagEvent(event);
            return;
        }
    }
}
