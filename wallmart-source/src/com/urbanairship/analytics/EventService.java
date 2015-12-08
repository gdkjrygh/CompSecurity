// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.util.Map;

// Referenced classes of package com.urbanairship.analytics:
//            EventAPIClient, Analytics, EventDataManager, AnalyticsPreferences, 
//            EventResponse

public class EventService extends IntentService
{

    static final String ACTION_ADD = "com.urbanairship.analytics.ADD";
    static final String ACTION_SEND = "com.urbanairship.analytics.SEND";
    static final String EXTRA_EVENT_DATA = "EXTRA_EVENT_DATA";
    static final String EXTRA_EVENT_ID = "EXTRA_EVENT_ID";
    static final String EXTRA_EVENT_SESSION_ID = "EXTRA_EVENT_SESSION_ID";
    static final String EXTRA_EVENT_TIME_STAMP = "EXTRA_EVENT_TIME_STAMP";
    static final String EXTRA_EVENT_TYPE = "EXTRA_EVENT_TYPE";
    private static long backoffMs = 0L;
    private EventAPIClient eventClient;

    public EventService()
    {
        this("EventService");
    }

    public EventService(String s)
    {
        this(s, new EventAPIClient());
    }

    EventService(String s, EventAPIClient eventapiclient)
    {
        super(s);
        eventClient = eventapiclient;
    }

    private void addEventFromIntent(Intent intent)
    {
        AnalyticsPreferences analyticspreferences = UAirship.shared().getAnalytics().getPreferences();
        EventDataManager eventdatamanager = UAirship.shared().getAnalytics().getDataManager();
        String s = intent.getStringExtra("EXTRA_EVENT_TYPE");
        String s1 = intent.getStringExtra("EXTRA_EVENT_ID");
        String s2 = intent.getStringExtra("EXTRA_EVENT_DATA");
        String s3 = intent.getStringExtra("EXTRA_EVENT_TIME_STAMP");
        intent = intent.getStringExtra("EXTRA_EVENT_SESSION_ID");
        if (s == null || s2 == null || s3 == null || s1 == null)
        {
            Logger.warn("Event service unable to add event with missing data.");
        } else
        {
            if (eventdatamanager.getDatabaseSize() > analyticspreferences.getMaxTotalDbSize())
            {
                Logger.info("Event database size exceeded. Deleting oldest session.");
                String s4 = eventdatamanager.getOldestSessionId();
                if (s4 != null && s4.length() > 0)
                {
                    eventdatamanager.deleteSession(s4);
                }
            }
            if (eventdatamanager.insertEvent(s, s2, s1, intent, s3) <= 0L)
            {
                Logger.error("Unable to insert event into database.");
            }
            if ("location".equals(s))
            {
                long l = System.currentTimeMillis() - analyticspreferences.getLastSendTime();
                long l1 = UAirship.shared().getAirshipConfigOptions().backgroundReportingIntervalMS;
                if (!UAirship.shared().getAnalytics().isAppInForeground() && l < l1)
                {
                    Logger.info((new StringBuilder()).append("LocationEvent was inserted, but may not be updated until ").append(l1 - l).append(" ms have passed").toString());
                    return;
                }
            }
        }
    }

    private long getNextSendTime()
    {
        AnalyticsPreferences analyticspreferences = UAirship.shared().getAnalytics().getPreferences();
        return analyticspreferences.getLastSendTime() + (long)analyticspreferences.getMinBatchInterval() + backoffMs;
    }

    private void scheduleEventUpload(long l)
    {
        Context context = UAirship.getApplicationContext();
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, com/urbanairship/analytics/EventService);
        intent.setAction("com.urbanairship.analytics.SEND");
        alarmmanager.set(1, l, PendingIntent.getService(context, 0, intent, 0x8000000));
    }

    private void uploadEvents()
    {
        AnalyticsPreferences analyticspreferences = UAirship.shared().getAnalytics().getPreferences();
        EventDataManager eventdatamanager = UAirship.shared().getAnalytics().getDataManager();
        analyticspreferences.setLastSendTime(System.currentTimeMillis());
        int j = eventdatamanager.getEventCount();
        if (j <= 0)
        {
            Logger.debug("No events to send. Ending analytics upload.");
        } else
        {
            int i = eventdatamanager.getDatabaseSize() / j;
            Map map = eventdatamanager.getEvents(analyticspreferences.getMaxBatchSize() / i);
            EventResponse eventresponse = eventClient.sendEvents(map.values());
            boolean flag;
            if (eventresponse != null && eventresponse.getStatus() == 200)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                eventdatamanager.deleteEvents(map.keySet());
                backoffMs = 0L;
            } else
            if (backoffMs == 0L)
            {
                backoffMs = analyticspreferences.getMinBatchInterval();
            } else
            {
                backoffMs = Math.min(backoffMs * 2L, analyticspreferences.getMaxWait());
            }
            if (!flag || j - map.size() > 0)
            {
                Logger.verbose("Scheduling next event batch upload.");
                scheduleEventUpload(getNextSendTime());
            }
            if (eventresponse != null)
            {
                Logger.info((new StringBuilder()).append("Warp 9 response: ").append(eventresponse.getStatus()).toString());
                analyticspreferences.setMaxTotalDbSize(eventresponse.getMaxTotalSize().intValue());
                analyticspreferences.setMaxBatchSize(eventresponse.getMaxBatchSize().intValue());
                analyticspreferences.setMaxWait(eventresponse.getMaxWait().intValue());
                analyticspreferences.setMinBatchInterval(eventresponse.getMinBatchInterval().intValue());
                return;
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff(getApplicationContext());
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        if ("com.urbanairship.analytics.ADD".equals(intent.getAction()))
        {
            addEventFromIntent(intent);
        }
        if (getNextSendTime() > System.currentTimeMillis())
        {
            scheduleEventUpload(getNextSendTime());
            return;
        } else
        {
            uploadEvents();
            return;
        }
    }

}
