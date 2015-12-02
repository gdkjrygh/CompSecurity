// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.ubercab.client.feature.notification.model.MessageNotificationData;
import com.ubercab.client.feature.notification.model.NotificationData;
import com.ubercab.client.feature.trip.TripActivity;

public final class elc extends eld
    implements gmk
{

    private final gmg a;
    private final eku b;
    private final int c;
    private boolean d;

    public elc(Context context, cev cev, eku eku1, NotificationManager notificationmanager, gmg gmg1)
    {
        super(context, cev, notificationmanager);
        b = eku1;
        c = context.getResources().getDimensionPixelSize(0x7f080116);
        a = gmg1;
        gmg1.a(this);
    }

    private void a(MessageNotificationData messagenotificationdata)
    {
        Object obj;
        if (!TextUtils.isEmpty(messagenotificationdata.getUrl()))
        {
            obj = new Intent("android.intent.action.VIEW", Uri.parse(messagenotificationdata.getUrl()));
        } else
        {
            obj = new Intent(e(), com/ubercab/client/feature/trip/TripActivity);
        }
        obj = PendingIntent.getActivity(e(), 0, ((Intent) (obj)), 0x10000000);
        obj = (new android.support.v4.app.NotificationCompat.Builder(e())).setSmallIcon(0x7f020191).setContentTitle(messagenotificationdata.getTitle()).setContentText(messagenotificationdata.getText()).setContentIntent(((PendingIntent) (obj))).setDeleteIntent(b(6, messagenotificationdata.getTag())).setAutoCancel(true).setTicker(messagenotificationdata.getTicker()).setWhen(0L);
        if (!TextUtils.isEmpty(messagenotificationdata.getLargeImageUrl()))
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setLargeIcon(b.a(messagenotificationdata.getLargeImageUrl(), c));
        }
        if (d)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setDefaults(-1);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setPriority(1);
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle(((android.support.v4.app.NotificationCompat.Builder) (obj)))).setBigContentTitle(messagenotificationdata.getTitle()).bigText(messagenotificationdata.getText()));
        a(6, messagenotificationdata.getTag(), ((android.support.v4.app.NotificationCompat.Builder) (obj)).build());
    }

    public final void a()
    {
    }

    public final volatile void a(NotificationData notificationdata)
    {
        a((MessageNotificationData)notificationdata);
    }

    public final void a(gmj gmj)
    {
        d = a.a(dbf.aj, dbh.c);
    }
}
