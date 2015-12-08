// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.push;

import android.content.Context;
import android.text.TextUtils;
import com.urbanairship.push.PushMessage;
import com.urbanairship.push.notifications.DefaultNotificationFactory;

public class UAPushNotificationFactory extends DefaultNotificationFactory
{

    public UAPushNotificationFactory(Context context)
    {
        super(context);
    }

    protected android.support.v4.app.NotificationCompat.Builder createNotificationBuilder(PushMessage pushmessage, int i, android.support.v4.app.NotificationCompat.Style style)
    {
        style = super.createNotificationBuilder(pushmessage, i, style);
        if (!TextUtils.isEmpty(pushmessage.getTitle()))
        {
            pushmessage = pushmessage.getTitle();
        } else
        if (!TextUtils.isEmpty(pushmessage.getAlert()))
        {
            pushmessage = pushmessage.getAlert();
        } else
        {
            pushmessage = getDefaultTitle();
        }
        style.setTicker(pushmessage);
        return style;
    }
}
