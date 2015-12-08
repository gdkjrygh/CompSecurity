// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.l;
import android.support.v4.app.v;
import android.text.TextUtils;
import com.google.a.a.a.a.il;
import com.google.a.a.a.a.rk;
import com.google.a.a.a.a.rl;
import com.google.a.a.a.a.rm;
import com.google.a.a.a.a.sx;
import com.google.a.a.a.a.sy;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.ui.InfoCardGalleryDialogFragment;
import com.google.android.apps.youtube.core.player.ui.c;
import com.google.android.apps.youtube.datalib.a.m;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.apps.youtube.datalib.innertube.t;
import com.google.android.apps.youtube.datalib.innertube.u;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            PlaybackClientManager, u, t

public final class s
    implements c
{

    private final Handler a;
    private final a b;
    private final bj c;
    private final PlaybackClientManager d;
    private final t e;
    private final com.google.android.apps.youtube.core.player.u f;
    private final l g;
    private d h;
    private InfoCardGalleryDialogFragment i;
    private InfoCardCollection j;

    public s(Handler handler, a a1, bj bj1, PlaybackClientManager playbackclientmanager, t t1, com.google.android.apps.youtube.core.player.u u1, l l1)
    {
        a = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = (PlaybackClientManager)com.google.android.apps.youtube.common.fromguava.c.a(playbackclientmanager);
        e = (t)com.google.android.apps.youtube.common.fromguava.c.a(t1);
        f = (com.google.android.apps.youtube.core.player.u)com.google.android.apps.youtube.common.fromguava.c.a(u1);
        g = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
    }

    private void a(int k, Bitmap bitmap)
    {
        if (i != null && j != null)
        {
            i.a(k, bitmap);
            b(j, k + 1);
        }
    }

    static void a(s s1, int k, Bitmap bitmap)
    {
        s1.a(k, bitmap);
    }

    private void a(byte abyte0[])
    {
        if (abyte0 != null && abyte0.length != 0)
        {
            u u1 = e.a();
            u1.b(abyte0);
            e.a(u1, m.a(com/google/a/a/a/a/il));
        }
    }

    private void b(InfoCardCollection infocardcollection, int k)
    {
        Object obj = null;
        if (k >= infocardcollection.getInfoCards().size())
        {
            return;
        }
        infocardcollection = (com.google.android.apps.youtube.datalib.innertube.model.m)infocardcollection.getInfoCards().get(k);
        if (infocardcollection.b() == null || infocardcollection.b().b == null)
        {
            L.c("Image is missing in info card's content");
            a(k, ((Bitmap) (null)));
            return;
        }
        infocardcollection = infocardcollection.b().b;
        com.google.android.apps.youtube.core.player.t t1 = new com.google.android.apps.youtube.core.player.t(this, k);
        if (infocardcollection == null || ((sx) (infocardcollection)).b.length == 0)
        {
            infocardcollection = null;
        } else
        {
            infocardcollection = ((sx) (infocardcollection)).b[0].b;
        }
        if (TextUtils.isEmpty(infocardcollection))
        {
            infocardcollection = obj;
        } else
        {
            Uri uri = Uri.parse(infocardcollection);
            infocardcollection = com.google.android.apps.youtube.common.a.d.a(t1);
            c.a(uri, com.google.android.apps.youtube.common.a.e.a(a, infocardcollection));
        }
        h = infocardcollection;
    }

    public final void a()
    {
        if (h != null)
        {
            h.a();
            h = null;
        }
        if (i != null)
        {
            i.a(null);
            i = null;
        }
        j = null;
        f.a();
    }

    public final void a(int k)
    {
        if (k >= j.getInfoCards().size())
        {
            L.c(String.format("info card index (%d) out of range (size of list: %d).", new Object[] {
                Integer.valueOf(k), Integer.valueOf(j.getInfoCards().size())
            }));
        } else
        {
            com.google.android.apps.youtube.datalib.innertube.model.m m1 = (com.google.android.apps.youtube.datalib.innertube.model.m)j.getInfoCards().get(k);
            if (m1.d() != null)
            {
                d.d(k);
                a(m1.d().c);
                return;
            }
        }
    }

    public final void a(InfoCardCollection infocardcollection, int k)
    {
        j = infocardcollection;
        i = InfoCardGalleryDialogFragment.a(infocardcollection, k);
        i.a(this);
        v v1 = g.a();
        android.support.v4.app.Fragment fragment = g.a(com/google/android/apps/youtube/core/player/ui/InfoCardGalleryDialogFragment.getName());
        if (fragment != null)
        {
            v1.a(fragment);
        }
        i.a(v1, com/google/android/apps/youtube/core/player/ui/InfoCardGalleryDialogFragment.getName());
        b(infocardcollection, 0);
    }

    public final void b(int k)
    {
        com.google.android.apps.youtube.datalib.innertube.model.m m1;
        boolean flag;
        if (k < j.getInfoCards().size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        m1 = (com.google.android.apps.youtube.datalib.innertube.model.m)j.getInfoCards().get(k);
        if (m1.c() != null && m1.c().c != null)
        {
            d.e(k);
            a(m1.c().e);
            b.a(m1.c().c);
        }
    }
}
