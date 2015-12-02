// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.ubercab.client.feature.notification.model.NotificationData;

public abstract class eld
{

    private final cev a;
    private final Context b;
    private final NotificationManager c;

    protected eld(Context context, cev cev1, NotificationManager notificationmanager)
    {
        b = context;
        a = cev1;
        c = notificationmanager;
    }

    private NotificationManager g()
    {
        return c;
    }

    protected final PendingIntent a(int i, String s, boolean flag)
    {
        return ekx.a(e(), i, s, flag);
    }

    protected final String a(Long long1)
    {
        if (long1 == null)
        {
            return "";
        } else
        {
            String s = dvb.a(long1.longValue());
            long1 = dvb.b(long1.longValue());
            return b.getString(0x7f0702ee, new Object[] {
                s, long1
            });
        }
    }

    public abstract void a();

    protected final void a(int i, String s)
    {
        g().cancel(s, i);
    }

    protected final void a(int i, String s, Notification notification)
    {
        g().notify(s, i, notification);
    }

    protected final void a(Notification notification)
    {
        a(4, null, notification);
    }

    public abstract void a(NotificationData notificationdata);

    protected final PendingIntent b(int i, String s)
    {
        return ekx.a(e(), i, s);
    }

    public void b()
    {
        a.a(this);
    }

    protected final PendingIntent c(int i, String s)
    {
        return a(i, s, true);
    }

    public void c()
    {
        a.b(this);
    }

    protected final void d()
    {
        g().cancel(4);
    }

    protected final Context e()
    {
        return b;
    }

    protected final SharedPreferences f()
    {
        return e().getSharedPreferences("notifications", 0);
    }
}
