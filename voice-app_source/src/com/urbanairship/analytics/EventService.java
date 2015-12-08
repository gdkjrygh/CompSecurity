// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.AlarmManager;
import android.app.Application;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.LocationOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.restclient.Response;
import java.util.Map;
import org.apache.http.Header;

// Referenced classes of package com.urbanairship.analytics:
//            EventAPIClient, EventDataManager, AnalyticsPreferences, Analytics, 
//            Event

public class EventService extends IntentService
{

    public static final String ACTION_ADD = "com.urbanairship.analytics.ADD";
    public static final String ACTION_SEND = "com.urbanairship.analytics.SEND";
    public static final String EVENT_CONTENT_VALUES_EXTRA = "com.urbanairship.analytics.CONTENT_VALUES_EXTRA";
    public static final String EVENT_TYPE_EXTRA = "com.urbanairship.analytics.TYPE_EXTRA";
    private static long backoffMs = 0L;
    private EventDataManager dataManager;
    private EventAPIClient eventClient;
    private AnalyticsPreferences preferences;

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
        eventClient = new EventAPIClient();
        eventClient = eventapiclient;
    }

    private void addEventFromIntent(Intent intent)
    {
        String s;
        s = intent.getStringExtra("com.urbanairship.analytics.TYPE_EXTRA");
        intent = (ContentValues)intent.getParcelableExtra("com.urbanairship.analytics.CONTENT_VALUES_EXTRA");
        if (dataManager.getDatabaseSize() <= preferences.getMaxTotalDbSize()) goto _L2; else goto _L1
_L1:
        if (!"activity_started".equals(s) && !"activity_stopped".equals(s)) goto _L4; else goto _L3
_L3:
        Logger.info("Database full. Not logging activity start/stop events");
_L6:
        return;
_L4:
        Logger.info("DB size exceeded. Deleting non-critical events.");
        deleteActivityStartAndStopEvents();
        if (dataManager.getDatabaseSize() > preferences.getMaxTotalDbSize())
        {
            deleteOldestSession();
        }
_L2:
        if (dataManager.insertEvent(intent) <= 0L)
        {
            Logger.error("Unable to insert event into database.");
        }
        if ("location_updated".equals(s))
        {
            long l = System.currentTimeMillis() - preferences.getLastSendTime();
            long l1 = UAirship.shared().getAirshipConfigOptions().locationOptions.backgroundReportingIntervalSeconds * 1000L;
            if (!UAirship.shared().getAnalytics().isAppInForeground() && l < l1)
            {
                Logger.info((new StringBuilder()).append("LocationEvent was inserted, but may not be updated until ").append(l1 - l).append(" ms have passed").toString());
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void deleteActivityStartAndStopEvents()
    {
        Logger.info("Deleting activity start and stop events");
        dataManager.deleteEventType("activity_started");
        dataManager.deleteEventType("activity_stopped");
    }

    private void deleteOldestSession()
    {
        Logger.info("Deleting oldest session.");
        String s = dataManager.getOldestSessionId();
        if (s != null && s.length() > 0)
        {
            dataManager.deleteSession(s);
        }
    }

    private long getNextSendTime()
    {
        return preferences.getLastSendTime() + (long)preferences.getMinBatchInterval() + backoffMs;
    }

    private Integer parseIntegerFromResponseHeader(Response response, String s)
    {
        response = response.getFirstHeader(s);
        if (response == null || response.getValue() == null)
        {
            return null;
        }
        int i;
        try
        {
            i = Integer.parseInt(response.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.debug((new StringBuilder()).append("Unable to parse String: ").append(response.getValue()).append("as an int.").toString());
            return null;
        }
        return Integer.valueOf(i);
    }

    private void scheduleEventUpload(long l)
    {
        Context context = UAirship.shared().getApplicationContext();
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, com/urbanairship/analytics/EventService);
        intent.setAction("com.urbanairship.analytics.SEND");
        alarmmanager.set(1, l, PendingIntent.getService(context, 0, intent, 0x8000000));
    }

    public static void sendAddEventIntent(Event event)
    {
        Context context = UAirship.shared().getApplicationContext();
        Intent intent = new Intent("com.urbanairship.analytics.ADD");
        intent.setClass(context, com/urbanairship/analytics/EventService);
        intent.putExtra("com.urbanairship.analytics.TYPE_EXTRA", event.getType());
        intent.putExtra("com.urbanairship.analytics.CONTENT_VALUES_EXTRA", event.getContentValues());
        try
        {
            context.startService(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Event event)
        {
            Logger.error("Unable to start analytics service. Check that the event service is added to the manifest.", event);
        }
    }

    private void updateAnalyticPreferences(Response response)
    {
        Integer integer = parseIntegerFromResponseHeader(response, "X-UA-Max-Total");
        Integer integer1 = parseIntegerFromResponseHeader(response, "X-UA-Max-Batch");
        Integer integer2 = parseIntegerFromResponseHeader(response, "X-UA-Max-Wait");
        response = parseIntegerFromResponseHeader(response, "X-UA-Min-Batch-Interval");
        if (integer != null)
        {
            preferences.setMaxTotalDbSize(integer.intValue());
        }
        if (integer1 != null)
        {
            preferences.setMaxBatchSize(integer1.intValue());
        }
        if (integer2 != null)
        {
            preferences.setMaxWait(integer2.intValue());
        }
        if (response != null)
        {
            preferences.setMinBatchInterval(response.intValue());
        }
    }

    private void uploadEvents()
    {
        preferences.setLastSendTime(System.currentTimeMillis());
        int j = dataManager.getEventCount();
        if (j <= 0)
        {
            Logger.debug("No events to send. Ending analytics upload.");
        } else
        {
            int i = dataManager.getDatabaseSize() / j;
            Map map = dataManager.getEvents(preferences.getMaxBatchSize() / i);
            Response response = eventClient.sendEvents(map.values());
            Logger.info((new StringBuilder()).append("Uploading events: ").append(map.values()).toString());
            boolean flag;
            if (response != null && response.status() == 200)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                dataManager.deleteEvents(map.keySet());
                backoffMs = 0L;
            } else
            if (backoffMs == 0L)
            {
                backoffMs = preferences.getMinBatchInterval();
            } else
            {
                backoffMs = Math.min(backoffMs * 2L, preferences.getMaxWait());
            }
            if (!flag || j - map.size() > 0)
            {
                Logger.verbose("Scheduling next event batch upload.");
                scheduleEventUpload(getNextSendTime());
            }
            if (response != null)
            {
                Logger.info((new StringBuilder()).append("Warp 9 response: ").append(response.status()).toString());
                updateAnalyticPreferences(response);
                return;
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        dataManager = UAirship.shared().getAnalytics().getDataManager();
        preferences = UAirship.shared().getAnalytics().getPreferences();
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
