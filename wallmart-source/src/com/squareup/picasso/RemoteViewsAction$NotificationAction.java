// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.widget.RemoteViews;

// Referenced classes of package com.squareup.picasso:
//            RemoteViewsAction, Picasso, Utils, Request

static class notification extends RemoteViewsAction
{

    private final Notification notification;
    private final int notificationId;

    volatile Object getTarget()
    {
        return super.getTarget();
    }

    void update()
    {
        ((NotificationManager)Utils.getService(picasso.context, "notification")).notify(notificationId, notification);
    }

    (Picasso picasso, Request request, RemoteViews remoteviews, int i, int j, Notification notification1, int k, 
            int l, String s, Object obj, int i1)
    {
        super(picasso, request, remoteviews, i, i1, k, l, obj, s);
        notificationId = j;
        notification = notification1;
    }
}
