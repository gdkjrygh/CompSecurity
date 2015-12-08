// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            an, ay, RemoteControl, az

public final class ax
{

    private final Handler a;
    private final aw b;
    private final bc c;
    private final an d;
    private final am e;
    private WatchFeature f;
    private final l g;
    private final boolean h;

    public ax(Context context, bc bc1, an an1, aw aw1, am am1, l l1, boolean flag)
    {
        a = new Handler(context.getMainLooper());
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        d = (an)com.google.android.apps.youtube.common.fromguava.c.a(an1);
        b = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        e = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        g = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        h = flag;
    }

    static WatchFeature a(ax ax1)
    {
        return ax1.f;
    }

    private void a(Uri uri, int i, boolean flag)
    {
        af af1;
        ay ay1;
        if (g.b())
        {
            af1 = c.j();
        } else
        {
            af1 = c.c();
        }
        ay1 = new ay(this, d.e(), i, flag, (byte)0);
        (new com.google.android.apps.youtube.app.a.c(c, af1, a, ay1)).a(uri);
    }

    static void a(ax ax1, List list, List list1, int i, RemoteControl remotecontrol, boolean flag)
    {
        int j;
        if (i >= 0 && i < list.size())
        {
            j = i;
        } else
        {
            L.c((new StringBuilder("Trying to play an invalid index ")).append(i).append(". Will try to play a different video.").toString());
            if (!list.isEmpty())
            {
                if (i < 0)
                {
                    j = 0;
                } else
                {
                    j = list.size() - 1;
                }
            } else
            {
                j = -1;
            }
        }
        if (j == -1)
        {
            L.b("No video to play.");
        }
        if (flag || list.size() > 1)
        {
            remotecontrol.a(list, j);
            ax1.e.a(remotecontrol.r(), (String)list.get(j), i, false, (WatchFeature)list1.get(j), false);
        } else
        if (!list.isEmpty())
        {
            remotecontrol.a((String)list.get(0), null, 0);
            ax1.e.a(remotecontrol.r(), (String)list.get(0), remotecontrol.q(), false, (WatchFeature)list1.get(0), false);
            return;
        }
    }

    static aw b(ax ax1)
    {
        return ax1.b;
    }

    public final void a(WatchFeature watchfeature)
    {
        f = watchfeature;
    }

    public final void a(String s)
    {
        if (d.e() == null)
        {
            return;
        } else
        {
            a(c.a().g(s).a, 0, false);
            return;
        }
    }

    public final void a(String s, int i, String s1)
    {
        if (d.e() == null)
        {
            return;
        }
        if (h)
        {
            d.e().a(s, s1, i);
            return;
        } else
        {
            a(c.a().g(s).a, i, true);
            return;
        }
    }

    public final void a(List list, int i)
    {
        Object obj = d.e();
        if (obj == null)
        {
            return;
        } else
        {
            obj = com.google.android.apps.youtube.common.a.e.a(a, new az(this, ((RemoteControl) (obj)), 0, true, (byte)0));
            c.y().a(list, ((com.google.android.apps.youtube.common.a.b) (obj)));
            return;
        }
    }
}
