// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj

final class hq
    implements l
{

    final hj a;
    private final Playlist b;

    public hq(hj hj1, Playlist playlist)
    {
        a = hj1;
        super();
        b = playlist;
    }

    public final void a(VolleyError volleyerror)
    {
        Playlist playlist = (Playlist)hj.k(a).get();
        if (playlist != null && playlist.id.equals(b.id))
        {
            hj.k(a).compareAndSet(playlist, null);
        }
        L.a("Error adding video to playlist", volleyerror);
        hj.a(a).c(volleyerror);
    }

    public final void a(Object obj)
    {
        hj.k(a).set(b);
        hj.b(a, a.a.getString(p.s, new Object[] {
            b.title
        }));
    }
}
