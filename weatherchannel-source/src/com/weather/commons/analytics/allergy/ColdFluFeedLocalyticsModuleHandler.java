// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.allergy;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.feed.SummarySupportingLocalyticsModuleHandler;

// Referenced classes of package com.weather.commons.analytics.allergy:
//            ColdFluModuleViewedAttribute

public class ColdFluFeedLocalyticsModuleHandler extends SummarySupportingLocalyticsModuleHandler
{

    public ColdFluFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, ColdFluModuleViewedAttribute coldflumoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, coldflumoduleviewedattribute, localyticshandler, handler);
    }

    protected LocalyticsRecorder getFeedSummaryRecorder()
    {
        return localyticsHandler.getColdFluFeedSummaryRecorder();
    }
}
