// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.ContentValues;
import com.urbanairship.Logger;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            DefaultEnvironment, Environment

public abstract class Event
{

    static final String APID_KEY = "apid";
    static final String CARRIER_KEY = "carrier";
    static final String CLASS_NAME_KEY = "class_name";
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
    static final String QUIET_TIME_KEY = "quiet_time";
    static final String SESSION_ID_KEY = "session_id";
    static final String TIME_KEY = "time";
    static final String TIME_ZONE_KEY = "time_zone";
    static final String TRANSPORT_KEY = "transport";
    static final String TYPE_KEY = "type";
    private Environment environment;
    private String eventId;
    private String sessionId;
    private String time;

    public Event()
    {
        this(((Environment) (new DefaultEnvironment())));
    }

    public Event(Environment environment1)
    {
        eventId = UUID.randomUUID().toString();
        time = Long.toString(environment1.getTimeMillis() / 1000L);
        environment = environment1;
        sessionId = environment1.getSessionId();
    }

    ContentValues getContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        String s = jsonRepresentation().toString();
        int i = s.length();
        contentvalues.put("type", getType());
        contentvalues.put("event_id", getEventId());
        contentvalues.put("data", s);
        contentvalues.put("time", getTime());
        contentvalues.put("session_id", getSessionId());
        contentvalues.put("event_size", Integer.valueOf(i));
        return contentvalues;
    }

    abstract JSONObject getData();

    Environment getEnvironment()
    {
        return environment;
    }

    String getEventId()
    {
        return eventId;
    }

    String getSessionId()
    {
        return sessionId;
    }

    String getTime()
    {
        return time;
    }

    abstract String getType();

    JSONObject jsonRepresentation()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = getData();
        try
        {
            jsonobject.put("type", getType());
            jsonobject.put("event_id", eventId);
            jsonobject.put("time", time);
            jsonobject.put("data", jsonobject1);
        }
        catch (JSONException jsonexception)
        {
            Logger.error((new StringBuilder()).append("Error constructing JSON ").append(getType()).append(" representation").toString());
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        String s;
        try
        {
            s = jsonRepresentation().toString();
        }
        catch (Exception exception)
        {
            return getType();
        }
        return s;
    }
}
