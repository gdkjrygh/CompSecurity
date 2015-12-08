// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.adapter.af;
import com.google.android.apps.youtube.app.ui.cq;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MyPlaylistsFragment

final class am
    implements b
{

    final Playlist a;
    final MyPlaylistsFragment b;

    am(MyPlaylistsFragment myplaylistsfragment, Playlist playlist)
    {
        b = myplaylistsfragment;
        a = playlist;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        MyPlaylistsFragment.c(b).c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Playlist)MyPlaylistsFragment.d(b).get();
        if (obj != null && ((Playlist) (obj)).id.equals(a.id))
        {
            MyPlaylistsFragment.d(b).compareAndSet(obj, null);
        }
        MyPlaylistsFragment.e(b).b(a);
        MyPlaylistsFragment.f(b).c(new cq());
        ah.a(b.c, p.aM, 1);
    }
}
