// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;
import com.urbanairship.push.PushMessage;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            Event

public class InteractiveNotificationEvent extends Event
{

    private static final String BUTTON_DESCRIPTION_KEY = "button_description";
    private static final String BUTTON_GROUP_KEY = "button_group";
    private static final String BUTTON_ID_KEY = "button_id";
    private static final String FOREGROUND_KEY = "foreground";
    private static final String SEND_ID_KEY = "send_id";
    private static final String TYPE = "interactive_notification_action";
    private String buttonDescription;
    private String buttonGroupId;
    private String buttonId;
    private boolean isForeground;
    private String sendId;

    public InteractiveNotificationEvent(PushMessage pushmessage, String s, String s1, boolean flag)
    {
        sendId = pushmessage.getSendId();
        buttonGroupId = pushmessage.getInteractiveNotificationType();
        buttonId = s;
        buttonDescription = s1;
        isForeground = flag;
    }

    protected final JSONObject getEventData()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("send_id", sendId);
            jsonobject.put("button_group", buttonGroupId);
            jsonobject.put("button_id", buttonId);
            jsonobject.put("button_description", buttonDescription);
            jsonobject.put("foreground", isForeground);
        }
        catch (JSONException jsonexception)
        {
            Logger.error((new StringBuilder()).append("Error constructing JSON data for ").append(getType()).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    public final String getType()
    {
        return "interactive_notification_action";
    }
}
