// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.ubercab.client.feature.notification.NotificationBackgroundConnectionService;

public final class eks extends Binder
{

    final NotificationBackgroundConnectionService a;
    private NotificationBackgroundConnectionService b;

    public eks(NotificationBackgroundConnectionService notificationbackgroundconnectionservice, NotificationBackgroundConnectionService notificationbackgroundconnectionservice1)
    {
        a = notificationbackgroundconnectionservice;
        super();
        b = notificationbackgroundconnectionservice1;
    }
}
