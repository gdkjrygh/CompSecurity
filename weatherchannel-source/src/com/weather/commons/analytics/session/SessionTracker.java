// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.session;

import com.google.common.base.Preconditions;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.system.AppEvent;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.analytics.session:
//            LocalyticsSessionAttribute, LocalyticsSessionSummaryRecorder

public final class SessionTracker
{

    private static final String TAG = "SessionTracker";
    private final LocalyticsHandler localyticsHandler;
    private final LocationManager locationManager;
    private boolean waitingForOriginalLocation;

    public SessionTracker(LocalyticsHandler localyticshandler, LocationManager locationmanager)
    {
        localyticsHandler = (LocalyticsHandler)Preconditions.checkNotNull(localyticshandler);
        locationManager = (LocationManager)Preconditions.checkNotNull(locationmanager);
    }

    public void onAppEvent(AppEvent appevent)
    {
        appevent = appevent.getCause();
        waitingForOriginalLocation = false;
        if (appevent == com.weather.dal2.system.AppEvent.Cause.APP_START)
        {
            if (locationManager.hasLocation())
            {
                waitingForOriginalLocation = true;
                localyticsHandler.getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.LOCATIONS_VIEWED);
            }
        } else
        if (appevent == com.weather.dal2.system.AppEvent.Cause.APP_STOP)
        {
            LogUtil.d("SessionTracker", LoggingMetaTags.TWC_LOCALYTICS, "Sending session summary with %s", new Object[] {
                localyticsHandler.getSessionSummaryRecorder().getAttributesMap()
            });
            localyticsHandler.tagSummaryEvent(LocalyticsEvent.SESSION_SUMMARY);
            return;
        }
    }

    public void onLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        currentlocationchangeevent = currentlocationchangeevent.getCause();
        boolean flag;
        if (currentlocationchangeevent == com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU || currentlocationchangeevent == com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.APP_RESTORE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!waitingForOriginalLocation || !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        waitingForOriginalLocation = false;
        if (flag)
        {
            localyticsHandler.getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.LOCATIONS_VIEWED);
        }
    }
}
