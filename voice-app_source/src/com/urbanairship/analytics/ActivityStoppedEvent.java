// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.content.ComponentName;
import com.urbanairship.Logger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event, Environment

class ActivityStoppedEvent extends Event
{

    static final String TYPE = "activity_stopped";
    private String className;

    ActivityStoppedEvent(Activity activity)
    {
        if (activity.getComponentName() != null)
        {
            className = activity.getComponentName().getClassName();
            return;
        } else
        {
            className = activity.getClass().getName();
            return;
        }
    }

    ActivityStoppedEvent(Environment environment, String s)
    {
        super(environment);
        className = s;
    }

    JSONObject getData()
    {
        JSONObject jsonobject = new JSONObject();
        Environment environment = getEnvironment();
        try
        {
            jsonobject.put("class_name", className);
            jsonobject.put("session_id", environment.getSessionId());
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
        return "activity_stopped";
    }
}
