// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.widget.Toast;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.notification.model.FareSplitInviteNotificationData;
import com.ubercab.client.feature.notification.model.NotificationData;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.FareSplitClient;

public final class ela extends eld
{

    private final hku a;
    private final gmg b;
    private final eku c;
    private final dpg d;
    private icl e;

    public ela(cev cev, Context context, hku hku1, gmg gmg1, NotificationManager notificationmanager, eku eku1, dpg dpg1)
    {
        super(context, cev, notificationmanager);
        a = hku1;
        b = gmg1;
        c = eku1;
        d = dpg1;
    }

    private void a(FareSplitInviteNotificationData faresplitinvitenotificationdata)
    {
        Object obj = e();
        Object obj1 = faresplitinvitenotificationdata.getMasterName();
        String s = ((Context) (obj)).getString(0x7f0702df);
        String s1 = ((Context) (obj)).getString(0x7f0702de, new Object[] {
            faresplitinvitenotificationdata.getMasterName()
        });
        int i = faresplitinvitenotificationdata.getMessageIdentifier().intValue();
        android.app.PendingIntent pendingintent2 = c(i, "com.ubercab.client.ACTION_TRIP_SHOW_MAP");
        obj1 = (new android.support.v4.app.NotificationCompat.Builder(e())).setSmallIcon(0x7f020191).setLargeIcon(c.a(faresplitinvitenotificationdata.getMasterPhotoUrl(), c.a())).setContentTitle(((CharSequence) (obj1))).setContentText(s).setContentIntent(pendingintent2).setDeleteIntent(b(4, null)).setAutoCancel(true).setTicker(s1);
        if (b.a(dbf.bI))
        {
            android.app.PendingIntent pendingintent = a(i, "com.ubercab.client.ACTION_FARE_SPLIT_INVITE_ACCEPT", false);
            android.app.PendingIntent pendingintent1 = a(i, "com.ubercab.client.ACTION_FARE_SPLIT_INVITE_DECLINE", false);
            ((android.support.v4.app.NotificationCompat.Builder) (obj1)).addAction(0x7f020184, ((Context) (obj)).getString(0x7f0701c8), pendingintent1);
            ((android.support.v4.app.NotificationCompat.Builder) (obj1)).addAction(0x7f020183, ((Context) (obj)).getString(0x7f070033), pendingintent);
        }
        obj = ((android.support.v4.app.NotificationCompat.Builder) (obj1)).build();
        if (faresplitinvitenotificationdata.getSource() != com.ubercab.client.feature.notification.model.NotificationData.Source.PUSH)
        {
            obj.defaults = 0;
            obj.sound = null;
            obj.vibrate = null;
        }
        a(((Notification) (obj)));
    }

    public final void a()
    {
    }

    public final volatile void a(NotificationData notificationdata)
    {
        a((FareSplitInviteNotificationData)notificationdata);
    }

    final void a(FareSplit faresplit)
    {
        if (faresplit == null || faresplit.getClientSelf() == null || !"Pending".equals(faresplit.getClientSelf().getStatus()))
        {
            d();
        }
    }

    public final void b()
    {
        super.b();
        if (e == null || e.c())
        {
            e = a.g().c(new elb(this, (byte)0));
        }
    }

    public final void c()
    {
        super.c();
        if (e != null)
        {
            e.b();
        }
    }

    public final void onFareSplitAcceptFromNotificationResponseEvent(dla dla1)
    {
        if (!dla1.e())
        {
            Toast.makeText(e(), e().getString(0x7f070631), 1).show();
        }
    }

    public final void onFareSplitDeclineFromNotificationResponseEvent(dlb dlb1)
    {
        if (!dlb1.e())
        {
            Toast.makeText(e(), e().getString(0x7f070631), 1).show();
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (d.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (dar1 != null)
        {
            dar1 = dar1.getFareSplit();
        } else
        {
            dar1 = null;
        }
        a(dar1);
    }
}
