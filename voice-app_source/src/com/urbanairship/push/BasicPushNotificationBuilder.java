// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Notification;
import com.urbanairship.UAirship;
import com.urbanairship.util.NotificationIDGenerator;
import java.util.Map;

// Referenced classes of package com.urbanairship.push:
//            PushNotificationBuilder, PushManager, PushPreferences

public class BasicPushNotificationBuilder
    implements PushNotificationBuilder
{

    public String appName;
    public int constantNotificationId;
    public int iconDrawableId;

    public BasicPushNotificationBuilder()
    {
        iconDrawableId = UAirship.getAppIcon();
        appName = UAirship.getAppName();
        constantNotificationId = -1;
    }

    public Notification buildNotification(String s, Map map)
    {
        if (s == null || s.length() == 0)
        {
            s = null;
        } else
        {
            map = new Notification(iconDrawableId, s, System.currentTimeMillis());
            map.flags = 16;
            map.setLatestEventInfo(UAirship.shared().getApplicationContext(), appName, s, null);
            map.defaults = 0;
            PushPreferences pushpreferences = PushManager.shared().getPreferences();
            s = map;
            if (!pushpreferences.isInQuietTime())
            {
                if (pushpreferences.isVibrateEnabled())
                {
                    map.defaults = ((Notification) (map)).defaults | 2;
                }
                s = map;
                if (pushpreferences.isSoundEnabled())
                {
                    map.defaults = ((Notification) (map)).defaults | 1;
                    return map;
                }
            }
        }
        return s;
    }

    public int getNextId(String s, Map map)
    {
        if (constantNotificationId > 0)
        {
            return constantNotificationId;
        } else
        {
            return NotificationIDGenerator.nextID();
        }
    }
}
