// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.support.v4.app.al;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.d;
import com.google.android.apps.youtube.app.offline.a.ac;
import com.google.android.apps.youtube.app.offline.a.ad;
import com.google.android.apps.youtube.app.offline.a.ae;
import com.google.android.apps.youtube.app.offline.a.s;
import com.google.android.apps.youtube.app.offline.a.t;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.youtube.h;
import com.google.android.youtube.o;
import com.google.android.youtube.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            e, d

public final class c
{

    private final Context a;
    private final a b;
    private final bj c;
    private final NotificationManager d;
    private final com.google.android.apps.youtube.common.network.h e;
    private HashMap f;
    private Set g;

    public c(Context context, a a1, bj bj1)
    {
        a = context;
        b = a1;
        c = bj1;
        d = (NotificationManager)context.getSystemService("notification");
        e = ((BaseApplication)context.getApplicationContext()).C();
        g = new HashSet();
        f = new HashMap();
        a1.a(this);
    }

    static Bitmap a(c c1, Bitmap bitmap)
    {
        int i = bitmap.getHeight();
        int j = bitmap.getWidth();
        int k = (int)((double)j / 1.8D);
        float f1 = (float)l.a(c1.a.getResources().getDisplayMetrics(), 64) / (float)k;
        c1 = new Matrix();
        c1.setScale(f1, f1, 0.0F, 0.0F);
        return Bitmap.createBitmap(bitmap, (j - k) / 2, (i - k) / 2, k, k, c1, false);
    }

    static al a(c c1, String s1)
    {
        return c1.b(s1);
    }

    private static String a(long l1)
    {
        if (l1 < 0x100000L)
        {
            return String.format("%.1f", new Object[] {
                Double.valueOf((double)l1 / 1048576D)
            });
        } else
        {
            return Long.toString(Util.a(l1));
        }
    }

    static Set a(c c1)
    {
        return c1.g;
    }

    private void a(Playlist playlist, boolean flag)
    {
        String s1 = playlist.id;
        if (g.contains(s1))
        {
            if (flag)
            {
                g.remove(s1);
            }
        } else
        {
            playlist = playlist.hqThumbnailUri;
            if (playlist != null)
            {
                c.a(playlist, new e(this, s1));
                return;
            }
        }
    }

    private void a(x x1, boolean flag)
    {
        String s1 = x1.a();
        if (g.contains(s1))
        {
            if (flag)
            {
                g.remove(s1);
            }
        } else
        {
            x1 = x1.c();
            if (x1 != null)
            {
                c.a(x1, new com.google.android.apps.youtube.app.offline.d(this, s1));
                return;
            }
        }
    }

    static NotificationManager b(c c1)
    {
        return c1.d;
    }

    private al b(String s1)
    {
        if (f.containsKey(s1))
        {
            return (al)f.get(s1);
        } else
        {
            al al1 = new al(a);
            al1.a(System.currentTimeMillis());
            f.put(s1, al1);
            return al1;
        }
    }

    private void handleOfflinePlaylistDeleteEvent(s s1)
    {
        s1 = s1.a;
        f.remove(s1);
        g.remove(s1);
        d.cancel(s1, 1004);
    }

    private void handleOfflinePlaylistProgressEvent(t t1)
    {
        Object obj;
label0:
        {
            if (t1.b)
            {
                obj = t1.a;
                if (!((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).e())
                {
                    break label0;
                }
                String s1 = ((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).a();
                Playlist playlist = ((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).b();
                int i = h.af;
                al al1;
                if (((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).g())
                {
                    t1 = a.getString(p.db);
                    i = h.N;
                } else
                {
                    t1 = a.getString(p.da);
                }
                obj = (new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity)).addFlags(0x4000000).putExtra("pane", com.google.android.apps.youtube.app.fragments.navigation.d.c(s1));
                al1 = b(s1);
                al1.a(playlist.title).b(t1).c(null).a(i).a(0, 0, false).a(false).b(true).a(PendingIntent.getActivity(a, s1.hashCode(), ((Intent) (obj)), 0x40000000));
                a(playlist, true);
                d.notify(s1, 1004, al1.a());
            }
            return;
        }
        String s2 = ((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).a();
        Intent intent = (new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity)).addFlags(0x4000000).putExtra("pane", com.google.android.apps.youtube.app.fragments.navigation.d.c(s2));
        int j = ((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).d();
        int k = ((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).c();
        int i1 = ((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).f();
        boolean flag1 = true;
        boolean flag = false;
        al al2;
        if (!e.a())
        {
            t1 = a.getString(p.dy);
            flag1 = false;
            flag = true;
        } else
        {
            t1 = a.getResources().getQuantityString(o.i, j, new Object[] {
                Integer.valueOf(k), Integer.valueOf(j)
            });
        }
        al2 = b(s2);
        al2.a(((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).b().title).c(a.getString(p.dK, new Object[] {
            Integer.valueOf(i1)
        })).b(t1).a(h.ad).a(100, i1, false).a(flag1).b(flag).a(PendingIntent.getActivity(a, 0, intent, 0x8000000));
        a(((com.google.android.apps.youtube.datalib.legacy.model.s) (obj)).b(), false);
        d.notify(s2, 1004, al2.a());
    }

    private void handleOfflineVideoCompleteEvent(ac ac1)
    {
        if (ac1.a.d())
        {
            ac1 = ac1.a;
            String s1 = ac1.a();
            Object obj = new PlaybackStartDescriptor(s1, "", -1, 0, WatchFeature.OFFLINE);
            obj = (new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity)).addFlags(0x4000000).putExtra("watch", new WatchDescriptor(((PlaybackStartDescriptor) (obj))));
            al al1 = b(s1);
            al1.b(a.getString(p.dd)).c(null).a(h.af).a(0, 0, false).a(false).b(true).a(PendingIntent.getActivity(a, s1.hashCode(), ((Intent) (obj)), 0x40000000));
            a(ac1, true);
            d.notify(s1, 1003, al1.a());
        }
    }

    private void handleOfflineVideoDeleteEvent(ad ad1)
    {
        ad1 = ad1.a;
        f.remove(ad1);
        g.remove(ad1);
        d.cancel(ad1, 1003);
    }

    private void handleOfflineVideoStatusUpdateEvent(ae ae1)
    {
        x x1 = ae1.a;
        if (x1.m())
        {
            d.cancel(x1.a(), 1003);
        } else
        if (ae1.b)
        {
            x x2 = ae1.a;
            String s2 = x2.a();
            Intent intent = (new Intent(a, com/google/android/apps/youtube/app/WatchWhileActivity)).addFlags(0x4000000).putExtra("pane", com.google.android.apps.youtube.app.fragments.navigation.d.i());
            byte byte0 = 100;
            int j = x2.o();
            String s1 = a.getString(p.dK, new Object[] {
                Integer.valueOf(j)
            });
            boolean flag1 = true;
            boolean flag = false;
            int i = h.ad;
            al al1;
            if (x2.t())
            {
                flag1 = false;
                flag = true;
                ae1 = x2.a(a);
                i = h.N;
                byte0 = 0;
                s1 = null;
            } else
            if (!e.a())
            {
                ae1 = a.getString(p.dy);
                flag1 = false;
                flag = true;
            } else
            {
                ae1 = a.getString(p.dc, new Object[] {
                    a(x2.i()), a(x2.j())
                });
            }
            al1 = b(s2);
            al1.a(x2.b()).c(s1).b(ae1).a(i).a(byte0, j, false).a(flag1).b(flag).a(PendingIntent.getActivity(a, s2.hashCode(), intent, 0x8000000));
            a(x2, false);
            d.notify(s2, 1003, al1.a());
            return;
        }
    }

    public final void a(String s1)
    {
        if (f.containsKey(s1))
        {
            ((al)f.get(s1)).a(System.currentTimeMillis());
        }
    }
}
