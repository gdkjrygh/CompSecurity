// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.ubercab.client.feature.notification.model.NotificationData;
import com.ubercab.client.feature.notification.model.SurgeNotificationData;
import com.ubercab.client.feature.trip.TripActivity;

public final class elf extends eld
{

    private final chp a;

    public elf(Context context, cev cev, chp chp1, NotificationManager notificationmanager)
    {
        super(context, cev, notificationmanager);
        a = chp1;
    }

    private void a(SurgeNotificationData surgenotificationdata)
    {
        String s = surgenotificationdata.getFallbackText();
        if (TextUtils.isEmpty(s))
        {
            a(3, surgenotificationdata.getTag());
            return;
        } else
        {
            a.a(l.hZ);
            Object obj = e();
            PendingIntent pendingintent = PendingIntent.getActivity(((Context) (obj)), 0, new Intent(((Context) (obj)), com/ubercab/client/feature/trip/TripActivity), 0x10000000);
            android.graphics.Bitmap bitmap = ((BitmapDrawable)((Context) (obj)).getResources().getDrawable(0x7f020192)).getBitmap();
            String s1 = ((Context) (obj)).getString(0x7f070454);
            obj = (new android.support.v4.app.NotificationCompat.Builder(((Context) (obj)))).setLargeIcon(bitmap).setSmallIcon(0x7f020191).setContentTitle(s1).setContentText(s).setContentIntent(pendingintent).setDeleteIntent(b(6, surgenotificationdata.getTag())).setAutoCancel(true).setTicker(s).setWhen(0L);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle(((android.support.v4.app.NotificationCompat.Builder) (obj)))).setBigContentTitle(s1).bigText(s));
            a(3, surgenotificationdata.getTag(), ((android.support.v4.app.NotificationCompat.Builder) (obj)).build());
            return;
        }
    }

    public final void a()
    {
    }

    public final volatile void a(NotificationData notificationdata)
    {
        a((SurgeNotificationData)notificationdata);
    }
}
