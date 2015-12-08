// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;
import com.urbanairship.util.UAStringUtil;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, DefaultEnvironment, Environment

class AppBackgroundEvent extends Event
{

    static final String TYPE = "app_background";

    public AppBackgroundEvent()
    {
        this(((Environment) (new DefaultEnvironment())));
    }

    public AppBackgroundEvent(Environment environment)
    {
        super(environment);
    }

    JSONObject getData()
    {
        JSONObject jsonobject = new JSONObject();
        Environment environment = getEnvironment();
        try
        {
            jsonobject.put("session_id", environment.getSessionId());
            jsonobject.put("connection_type", environment.getConnectionType());
            String s = environment.getConnectionSubType();
            if (!UAStringUtil.isEmpty(s))
            {
                jsonobject.put("connection_subtype", s);
            }
            jsonobject.put("push_id", environment.getConversionPushId());
        }
        catch (JSONException jsonexception)
        {
            Logger.error((new StringBuilder()).append("Error constructing JSON data for ").append(getType()).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    String getType()
    {
        return "app_background";
    }
}
