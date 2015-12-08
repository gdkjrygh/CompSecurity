// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;
import java.io.File;

// Referenced classes of package com.gau.go.launcherex.gowidget.download:
//            f, e

public class a
    implements f
{

    private static long r = 0L;
    private NotificationManager a;
    private Notification b;
    private PendingIntent c;
    private PendingIntent d;
    private PendingIntent e;
    private int f;
    private int g;
    private Context h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private RemoteViews q;
    private e s;
    private u t;

    public a(Context context)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0;
        g = 0;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        if (context != null)
        {
            h = context;
            a = (NotificationManager)context.getSystemService("notification");
            q = new RemoteViews(context.getPackageName(), 0x7f030069);
            s = com.gau.go.launcherex.gowidget.weather.c.c.a(h.getApplicationContext()).f();
            t = s.a();
        }
    }

    private static long a()
    {
        com/gau/go/launcherex/gowidget/download/a;
        JVM INSTR monitorenter ;
        long l1;
        r++;
        l1 = r;
        com/gau/go/launcherex/gowidget/download/a;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    private void b()
    {
        TypedArray typedarray = h.obtainStyledAttributes(0x1030068, new int[] {
            0x1010098
        });
        int i1 = typedarray.getColor(0, 0);
        typedarray.recycle();
        if ((0xffffff & i1) < 0x7fffff)
        {
            t.C = "notification_style_default_white";
        } else
        {
            t.C = "notification_style_default_black";
        }
        s.a("notification_style", t.C);
    }

    public void a(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (h == null || e1 == null || q == null || a == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        obj = e1.d();
        j = String.format("%1$s--%2$s(%3$s)", new Object[] {
            e1.d(), h.getString(0x7f08026b), h.getString(0x7f08026c)
        });
        k = String.format("%1$s--%2$s(%3$s)", new Object[] {
            e1.d(), h.getString(0x7f08026d), h.getString(0x7f08026e)
        });
        l = String.format("%1$s--%2$s(%3$s)", new Object[] {
            e1.d(), h.getString(0x7f08026f), h.getString(0x7f080270)
        });
        i = String.format("%1$s--%2$s", new Object[] {
            obj, h.getString(0x7f080271)
        });
        m = String.format("%1$s--%2$s", new Object[] {
            obj, h.getString(0x7f080272)
        });
        n = String.format("%1$s--%2$s", new Object[] {
            obj, h.getString(0x7f08026d)
        });
        o = String.format("%1$s--%2$s", new Object[] {
            obj, h.getString(0x7f08026f)
        });
        p = String.format("%1$s--%2$s", new Object[] {
            obj, h.getString(0x7f080273)
        });
        obj = new Intent();
        ((Intent) (obj)).setAction("com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_STOP");
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append("download://").append(a()).toString()));
        ((Intent) (obj)).putExtra("download_task_id_key", e1.b());
        c = PendingIntent.getBroadcast(h, 0, ((Intent) (obj)), 0x10000000);
        obj = new Intent();
        ((Intent) (obj)).setAction("com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_DELETE");
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append("download://").append(a()).toString()));
        ((Intent) (obj)).putExtra("download_task_id_key", e1.b());
        d = PendingIntent.getBroadcast(h, 0, ((Intent) (obj)), 0x10000000);
        obj = new Intent();
        ((Intent) (obj)).setAction("com.gau.go.launcherex.gowidget.download.DownloadBrocastReceiver.GOWEATHER_DOWNLOAD_RESTART");
        ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append("download://").append(a()).toString()));
        ((Intent) (obj)).putExtra("download_task_id_key", e1.b());
        e = PendingIntent.getBroadcast(h, 0, ((Intent) (obj)), 0x10000000);
        obj = new Intent();
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        ((Intent) (obj)).setComponent(new ComponentName(h.getPackageName(), "com.gau.go.launcherex.gowidget.framework.GoWidgetActivity"));
        ((Intent) (obj)).setFlags(0x10200000);
        obj = PendingIntent.getActivity(h, 0, ((Intent) (obj)), 0x10000000);
        b = new Notification();
        b.icon = 0x7f02038e;
        b.tickerText = m;
        b.when = System.currentTimeMillis();
        b.contentIntent = ((PendingIntent) (obj));
        b.flags = 2;
        b.deleteIntent = d;
        if (t.C.equals("notification_style_default"))
        {
            b();
        }
        i1 = 0x106000b;
        obj = h.getResources();
        if (!t.C.equals("notification_style_default_black")) goto _L4; else goto _L3
_L3:
        i1 = ((Resources) (obj)).getColor(0x7f0a005e);
_L6:
        q.setTextColor(0x7f09028a, i1);
        q.setTextColor(0x7f09028b, i1);
        q.setCharSequence(0x7f09028a, "setText", i);
        q.setCharSequence(0x7f09028b, "setText", (new StringBuilder()).append(g).append("%").toString());
        b.contentView = q;
        a.notify("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b(), b);
_L2:
        return;
_L4:
        if (t.C.equals("notification_style_default_white"))
        {
            i1 = ((Resources) (obj)).getColor(0x7f0a0061);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void b(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (h != null && e1 != null && q != null && a != null && b != null && (e1.f() > f || f >= 100))
        {
            f = f + 5;
            g = e1.f();
            b.contentIntent = c;
            q.setCharSequence(0x7f09028a, "setText", j);
            q.setInt(0x7f09028c, "setProgress", g);
            q.setCharSequence(0x7f09028b, "setText", (new StringBuilder()).append(g).append("%").toString());
            b.contentView = q;
            a.notify("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b(), b);
        }
    }

    public void c(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (h != null && a != null && e1 != null)
        {
            a.cancel("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b());
            Object obj = new Intent();
            ((Intent) (obj)).addFlags(0x10000000);
            ((Intent) (obj)).setAction("android.intent.action.VIEW");
            ((Intent) (obj)).setDataAndType(Uri.fromFile(new File(e1.g())), "application/vnd.android.package-archive");
            obj = PendingIntent.getActivity(h, 0, ((Intent) (obj)), 0);
            Notification notification = new Notification();
            notification.icon = 0x7f02038e;
            notification.tickerText = p;
            notification.when = System.currentTimeMillis();
            RemoteViews remoteviews = new RemoteViews(h.getPackageName(), 0x7f030068);
            remoteviews.setImageViewResource(0x7f090289, 0x7f02038e);
            remoteviews.setTextViewText(0x7f09028a, p);
            notification.contentView = remoteviews;
            notification.setLatestEventInfo(h, e1.d(), p, ((PendingIntent) (obj)));
            notification.flags = 16;
            a.notify("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b(), notification);
        }
    }

    public void d(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (h != null && e1 != null && a != null && q != null && b != null)
        {
            a.cancel("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b());
            b.tickerText = o;
            b.contentIntent = e;
            q.setCharSequence(0x7f09028a, "setText", l);
            b.contentView = q;
            b.flags = 16;
            a.notify("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b(), b);
        }
    }

    public void e(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (h != null && a != null && e1 != null && q != null && b != null && e1.h() != 6)
        {
            a.cancel("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b());
            b.tickerText = n;
            b.contentIntent = e;
            q.setCharSequence(0x7f09028a, "setText", k);
            b.contentView = q;
            b.flags = 16;
            a.notify("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b(), b);
        }
    }

    public void f(com.gau.go.launcherex.gowidget.download.e e1)
    {
        f = 0;
        g = 0;
    }

    public void g(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (e1 != null && a != null && h != null)
        {
            Notification notification = new Notification();
            notification.icon = 0x7f02038e;
            notification.tickerText = String.format("%1$s--%2$s", new Object[] {
                e1.d(), h.getString(0x7f080274)
            });
            notification.when = System.currentTimeMillis();
            Object obj = new Intent();
            ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
            ((Intent) (obj)).setComponent(new ComponentName(h.getPackageName(), "com.gau.go.launcherex.gowidget.framework.GoWidgetActivity"));
            ((Intent) (obj)).setFlags(0x10200000);
            obj = PendingIntent.getActivity(h, 0, ((Intent) (obj)), 0x10000000);
            notification.setLatestEventInfo(h, e1.d(), h.getString(0x7f080275), ((PendingIntent) (obj)));
            notification.flags = 16;
            a.notify("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b(), notification);
        }
    }

    public void h(com.gau.go.launcherex.gowidget.download.e e1)
    {
        if (a != null && e1 != null && e1.f() < 100)
        {
            a.cancel("com.gau.go.launcherex.gowidget.powersave.download.NOTYFY_TAG", (int)e1.b());
            a = null;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
    }

}
