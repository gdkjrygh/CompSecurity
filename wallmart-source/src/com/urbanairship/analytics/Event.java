// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Event
{

    static final String CARRIER_KEY = "carrier";
    static final String CONNECTION_SUBTYPE_KEY = "connection_subtype";
    static final String CONNECTION_TYPE_KEY = "connection_type";
    static final String DATA_KEY = "data";
    static final String DAYLIGHT_SAVINGS_KEY = "daylight_savings";
    static final String EVENT_ID_KEY = "event_id";
    static final String LAST_SEND_ID_KEY = "last_send_id";
    static final String LIB_VERSION_KEY = "lib_version";
    static final String NOTIFICATION_TYPES_KEY = "notification_types";
    static final String OS_VERSION_KEY = "os_version";
    static final String PACKAGE_VERSION_KEY = "package_version";
    static final String PUSH_ENABLED_KEY = "push_enabled";
    static final String PUSH_ID_KEY = "push_id";
    static final String SESSION_ID_KEY = "session_id";
    static final String TIME_KEY = "time";
    static final String TIME_ZONE_KEY = "time_zone";
    static final String TYPE_KEY = "type";
    private String eventId;
    private String time;

    public Event()
    {
        this(System.currentTimeMillis());
    }

    public Event(long l)
    {
        eventId = UUID.randomUUID().toString();
        time = String.format(Locale.US, "%.3f", new Object[] {
            Double.valueOf((double)l / 1000D)
        });
    }

    String createEventPayload(String s)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = new JSONObject();
        jsonobject1 = getEventData();
        jsonobject1 = new JSONObject(jsonobject1.toString());
        jsonobject1.put("session_id", s);
        jsonobject.put("type", getType());
        jsonobject.put("event_id", eventId);
        jsonobject.put("time", time);
        jsonobject.put("data", jsonobject1);
        return jsonobject.toString();
        s;
_L2:
        Logger.error((new StringBuilder()).append("Error constructing JSON ").append(getType()).append(" representation").toString());
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected String getCarrier()
    {
        return ((TelephonyManager)UAirship.getApplicationContext().getSystemService("phone")).getNetworkOperatorName();
    }

    public String getConnectionSubType()
    {
        Object obj = (ConnectivityManager)UAirship.getApplicationContext().getSystemService("connectivity");
        if (obj != null)
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            if (obj != null)
            {
                return ((NetworkInfo) (obj)).getSubtypeName();
            }
        }
        return "";
    }

    public String getConnectionType()
    {
        byte byte0 = -1;
        Object obj = (ConnectivityManager)UAirship.getApplicationContext().getSystemService("connectivity");
        int i = byte0;
        if (obj != null)
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            i = byte0;
            if (obj != null)
            {
                i = ((NetworkInfo) (obj)).getType();
            }
        }
        switch (i)
        {
        default:
            return "none";

        case 0: // '\0'
            return "cell";

        case 1: // '\001'
            return "wifi";

        case 6: // '\006'
            return "wimax";
        }
    }

    protected abstract JSONObject getEventData();

    public String getEventId()
    {
        return eventId;
    }

    public ArrayList getNotificationTypes()
    {
        ArrayList arraylist = new ArrayList();
        PushManager pushmanager = UAirship.shared().getPushManager();
        if (pushmanager.isPushEnabled())
        {
            if (pushmanager.isSoundEnabled())
            {
                arraylist.add("sound");
            }
            if (pushmanager.isVibrateEnabled())
            {
                arraylist.add("vibrate");
            }
        }
        return arraylist;
    }

    public String getTime()
    {
        return time;
    }

    protected long getTimezone()
    {
        return (long)(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
    }

    public abstract String getType();

    protected boolean isDaylightSavingsTime()
    {
        return Calendar.getInstance().getTimeZone().inDaylightTime(new Date());
    }
}
