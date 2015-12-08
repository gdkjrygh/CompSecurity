// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            an, al

final class aq
    implements an
{

    aq()
    {
    }

    public final Notification a(al al1)
    {
        android.content.Context context = al1.a;
        Notification notification = al1.r;
        CharSequence charsequence = al1.b;
        CharSequence charsequence1 = al1.c;
        CharSequence charsequence2 = al1.h;
        android.widget.RemoteViews remoteviews = al1.f;
        int i = al1.i;
        android.app.PendingIntent pendingintent1 = al1.d;
        android.app.PendingIntent pendingintent = al1.e;
        android.graphics.Bitmap bitmap = al1.g;
        int j = al1.n;
        int k = al1.o;
        boolean flag1 = al1.p;
        al1 = (new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag;
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al1 = al1.setOngoing(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al1 = al1.setOnlyAlertOnce(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al1 = al1.setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent1).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return al1.setFullScreenIntent(pendingintent, flag).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag1).getNotification();
    }
}
