// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.hurricane;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;

// Referenced classes of package com.weather.commons.analytics.hurricane:
//            HurricaneCentralFeedLocalyticsModuleHandler, HurricaneModuleViewedAttribute

public class ClickableHurricaneCentralFeedLocalyticsModuleHandler extends HurricaneCentralFeedLocalyticsModuleHandler
{

    private final LocalyticsEvent triggeredEvent;

    public ClickableHurricaneCentralFeedLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, HurricaneModuleViewedAttribute hurricanemoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler, LocalyticsEvent localyticsevent)
    {
        super(screenname, hurricanemoduleviewedattribute, localyticshandler, handler);
        triggeredEvent = localyticsevent;
    }

    public void recordButtonClick(String s)
    {
        if (triggeredEvent != null)
        {
            tagEventWithStorm(triggeredEvent, s);
        }
    }
}
