// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.al;
import android.text.Html;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            i, e, j

public final class d
    implements i
{

    private final Context a;
    private final String b;
    private final Class c;
    private final String d;
    private final int e;
    private Service f;
    private NotificationManager g;
    private String h;
    private final BroadcastReceiver i;
    private final IntentFilter j;
    private boolean k;

    public d(Context context, String s, Class class1, com.google.android.apps.youtube.core.player.notification.j j1, String s1, int i1)
    {
        this(context, s, class1, j1, s1, i1, null);
    }

    private d(Context context, String s, Class class1, com.google.android.apps.youtube.core.player.notification.j j1, String s1, int i1, Service service)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c = (Class)com.google.android.apps.youtube.common.fromguava.c.a(class1);
        b = s;
        d = s1;
        e = i1;
        g = (NotificationManager)context.getSystemService("notification");
        com.google.android.apps.youtube.common.fromguava.c.a(j1);
        j = new IntentFilter();
        j.addAction("com.google.android.youtube.action.controller_notification_prev");
        j.addAction("com.google.android.youtube.action.controller_notification_play_pause");
        j.addAction("com.google.android.youtube.action.controller_notification_next");
        j.addAction("com.google.android.youtube.action.controller_notification_close");
        j.addAction("com.google.android.youtube.action.controller_notification_replay");
        i = new e(this, j1);
    }

    private RemoteViews a(PlaybackControllerGroup.PlaybackInfo playbackinfo, boolean flag)
    {
        RemoteViews remoteviews;
        int i1;
        boolean flag1;
        int j2 = 1;
        flag1 = false;
        int k1;
        int i2;
        int k2;
        if (flag)
        {
            i1 = l.aC;
        } else
        {
            i1 = l.aD;
        }
        remoteviews = new RemoteViews(a.getPackageName(), i1);
        remoteviews.setTextViewText(j.fF, playbackinfo.b);
        remoteviews.setTextViewText(j.ff, b);
        if (playbackinfo.c == PlaybackControllerGroup.PlaybackInfo.PlaybackState.PLAYING)
        {
            i1 = h.Q;
        } else
        {
            i1 = h.R;
        }
        remoteviews.setImageViewResource(j.dn, i1);
        if (playbackinfo.c == PlaybackControllerGroup.PlaybackInfo.PlaybackState.BUFFERING)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        i2 = j.I;
        if (i1 != 0)
        {
            k1 = 0;
        } else
        {
            k1 = 8;
        }
        remoteviews.setViewVisibility(i2, k1);
        if (playbackinfo.c == PlaybackControllerGroup.PlaybackInfo.PlaybackState.ENDED)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        k2 = j.eg;
        if (k1 != 0)
        {
            i2 = 0;
        } else
        {
            i2 = 8;
        }
        remoteviews.setViewVisibility(k2, i2);
        if (playbackinfo.c == PlaybackControllerGroup.PlaybackInfo.PlaybackState.ERROR)
        {
            i2 = j2;
        } else
        {
            i2 = 0;
        }
        k2 = j.aV;
        if (i2 != 0)
        {
            j2 = 0;
        } else
        {
            j2 = 8;
        }
        remoteviews.setViewVisibility(k2, j2);
        j2 = j.dn;
        if (i1 == 0 && k1 == 0 && i2 == 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        remoteviews.setViewVisibility(j2, i1);
        if (playbackinfo.f != null)
        {
            remoteviews.setImageViewBitmap(j.fy, playbackinfo.f);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        remoteviews.setBoolean(j.dN, "setEnabled", playbackinfo.d);
        remoteviews.setBoolean(j.cK, "setEnabled", playbackinfo.e);
        if (playbackinfo.d)
        {
            i1 = h.S;
        } else
        {
            i1 = h.T;
        }
        remoteviews.setImageViewResource(j.dN, i1);
        if (playbackinfo.e)
        {
            i1 = h.O;
        } else
        {
            i1 = h.P;
        }
        remoteviews.setImageViewResource(j.cK, i1);
_L4:
        if (flag)
        {
            a(remoteviews, j.dN, "com.google.android.youtube.action.controller_notification_prev");
        }
        a(remoteviews, j.dn, "com.google.android.youtube.action.controller_notification_play_pause");
        a(remoteviews, j.cK, "com.google.android.youtube.action.controller_notification_next");
        a(remoteviews, j.eg, "com.google.android.youtube.action.controller_notification_replay");
        a(remoteviews, j.aw, "com.google.android.youtube.action.controller_notification_close");
        return remoteviews;
_L2:
        int l1 = j.cK;
        int j1;
        if (playbackinfo.e)
        {
            j1 = ((flag1) ? 1 : 0);
        } else
        {
            j1 = 8;
        }
        remoteviews.setViewVisibility(l1, j1);
        if (h != null)
        {
            remoteviews.setTextViewText(j.ff, Html.fromHtml(h));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(RemoteViews remoteviews, int i1, String s)
    {
        remoteviews.setOnClickPendingIntent(i1, PendingIntent.getBroadcast(a, 0, new Intent(s), 0x8000000));
    }

    public final void a()
    {
        if (f != null)
        {
            f.stopForeground(true);
        } else
        {
            g.cancel(2);
        }
        if (k)
        {
            a.unregisterReceiver(i);
            k = false;
        }
    }

    public final void a(PlaybackControllerGroup.PlaybackInfo playbackinfo)
    {
        RemoteViews remoteviews = a(playbackinfo, false);
        playbackinfo = a(playbackinfo, true);
        Object obj = (new al(a)).a(e).a(true).a(remoteviews).d(d);
        Intent intent = new Intent(a, c);
        intent.setFlags(0x4000000);
        obj = ((al) (obj)).a(PendingIntent.getActivity(a, 0, intent, 0x8000000)).a();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj.bigContentView = playbackinfo;
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            obj.contentView = remoteviews;
        }
        if (f != null)
        {
            f.startForeground(2, ((Notification) (obj)));
        } else
        {
            g.notify(2, ((Notification) (obj)));
        }
        if (!k)
        {
            a.registerReceiver(i, j);
            k = true;
        }
    }

    public final void a(String s)
    {
        h = s;
    }
}
