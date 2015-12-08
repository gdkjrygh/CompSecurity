// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

public static final class zzRy
{

    private zzRy zzRy;

    public zzRy build()
    {
        if (zzRy(zzRy) != null)
        {
            if (!TextUtils.isEmpty(zzRy(zzRy)))
            {
                throw new IllegalArgumentException("notificationTitle requires using the default notification");
            }
            if (!TextUtils.isEmpty(zzRy(zzRy)))
            {
                throw new IllegalArgumentException("notificationText requires using the default notification");
            }
            if (zzRy(zzRy) != null)
            {
                throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
            }
        } else
        if (TextUtils.isEmpty(zzRy(zzRy)) && TextUtils.isEmpty(zzRy(zzRy)) && zzRy(zzRy) == null)
        {
            throw new IllegalArgumentException("At least an argument must be provided");
        }
        return zzRy;
    }

    public zzRy setNotification(Notification notification)
    {
        zzRy(zzRy, notification);
        return this;
    }

    public zzRy setNotificationPendingIntent(PendingIntent pendingintent)
    {
        zzRy(zzRy, pendingintent);
        return this;
    }

    public zzRy setNotificationText(String s)
    {
        zzRy(zzRy, s);
        return this;
    }

    public zzRy setNotificationTitle(String s)
    {
        zzRy(zzRy, s);
        return this;
    }

    public ()
    {
        zzRy = new zzRy(null);
    }
}
