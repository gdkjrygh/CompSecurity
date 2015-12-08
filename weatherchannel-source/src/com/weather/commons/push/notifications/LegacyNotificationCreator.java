// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import android.content.Context;
import com.weather.commons.push.alertmessages.AlertMessage;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.push.notifications:
//            AbstractNotificationCreator

public class LegacyNotificationCreator extends AbstractNotificationCreator
{

    public LegacyNotificationCreator(Class class1, String s)
    {
        super(class1, s);
    }

    protected void addContent(android.support.v4.app.NotificationCompat.Builder builder, Collection collection, Context context, AlertMessage alertmessage)
    {
        builder.setContentTitle(alertmessage.getDescription());
        builder.setContentText(alertmessage.getPresentationName());
    }

    public int getNotificationId(Collection collection)
    {
        collection = (AlertMessage)collection.iterator().next();
        String s = collection.getLocationCode();
        if (s != null)
        {
            return s.hashCode();
        } else
        {
            return (new StringBuilder()).append(collection.getLocation()).append(":").append(collection.getCountryCode()).toString().hashCode();
        }
    }

    public boolean hasBackgroundImage()
    {
        return true;
    }
}
