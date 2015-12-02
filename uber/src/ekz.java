// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.content.Context;
import com.ubercab.client.feature.notification.model.FareSplitAcceptedNotificationData;
import com.ubercab.client.feature.notification.model.NotificationData;

public final class ekz extends eld
{

    private final eku a;

    public ekz(Context context, cev cev, eku eku1, NotificationManager notificationmanager)
    {
        super(context, cev, notificationmanager);
        a = eku1;
    }

    private void a(FareSplitAcceptedNotificationData faresplitacceptednotificationdata)
    {
        Object obj = faresplitacceptednotificationdata.getMinionName();
        String s = e().getString(0x7f0702dc);
        String s1 = e().getString(0x7f0702dd, new Object[] {
            faresplitacceptednotificationdata.getMinionName()
        });
        android.app.PendingIntent pendingintent = c(faresplitacceptednotificationdata.getMessageIdentifier().intValue(), "com.ubercab.client.ACTION_TRIP_SHOW_MAP");
        obj = (new android.support.v4.app.NotificationCompat.Builder(e())).setSmallIcon(0x7f020191).setLargeIcon(a.a(faresplitacceptednotificationdata.getMinionPhotoUrl(), a.a())).setContentTitle(((CharSequence) (obj))).setContentText(s).setContentIntent(pendingintent).setDeleteIntent(b(5, null)).setAutoCancel(true).setTicker(s1);
        a(5, faresplitacceptednotificationdata.getTag(), ((android.support.v4.app.NotificationCompat.Builder) (obj)).build());
    }

    public final void a()
    {
    }

    public final volatile void a(NotificationData notificationdata)
    {
        a((FareSplitAcceptedNotificationData)notificationdata);
    }
}
