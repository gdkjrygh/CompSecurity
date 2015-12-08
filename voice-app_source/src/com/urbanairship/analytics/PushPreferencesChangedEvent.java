// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, DefaultEnvironment, Environment

public class PushPreferencesChangedEvent extends Event
{

    static final String TYPE = "push_preferences_changed";

    public PushPreferencesChangedEvent()
    {
        this(((Environment) (new DefaultEnvironment())));
    }

    public PushPreferencesChangedEvent(Environment environment)
    {
        super(environment);
    }

    JSONObject getData()
    {
        JSONObject jsonobject;
        Environment environment;
        jsonobject = new JSONObject();
        environment = getEnvironment();
        java.util.Date adate[];
        jsonobject.put("session_id", environment.getSessionId());
        jsonobject.put("notification_types", new JSONArray(environment.getNotificationTypes()));
        jsonobject.put("push_enabled", environment.isPushEnabled());
        adate = environment.getQuietTimeInterval();
        if (environment.isQuietTimeEnabled() && adate != null)
        {
            try
            {
                SimpleDateFormat simpledateformat = new SimpleDateFormat("HH:mm");
                ArrayList arraylist = new ArrayList(2);
                arraylist.add(simpledateformat.format(adate[0]));
                arraylist.add(simpledateformat.format(adate[1]));
                jsonobject.put("quiet_time", new JSONArray(arraylist));
            }
            catch (JSONException jsonexception)
            {
                Logger.error((new StringBuilder()).append("Error constructing JSON data for ").append(getType()).toString());
                return jsonobject;
            }
        }
        return jsonobject;
    }

    String getType()
    {
        return "push_preferences_changed";
    }
}
