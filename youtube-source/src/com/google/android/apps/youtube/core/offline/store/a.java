// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            OfflineStoreInterface, i

public final class a
    implements OfflineStoreInterface
{

    public a()
    {
    }

    public final OfflineStoreInterface.OfflineAddResult a(String s, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type)
    {
        return OfflineStoreInterface.OfflineAddResult.CANNOT_ADD;
    }

    public final OfflineStoreInterface.OfflineAddResult a(String s, String s1)
    {
        return OfflineStoreInterface.OfflineAddResult.CANNOT_ADD;
    }

    public final x a(String s)
    {
        return null;
    }

    public final void a(long l1)
    {
    }

    public final void a(b b1)
    {
        b1.a(null, Collections.emptyList());
    }

    public final void a(String s, long l1)
    {
    }

    public final void a(String s, b b1)
    {
        b1.a(null, new Pair(null, Collections.emptyList()));
    }

    public final void a(Collection collection)
    {
    }

    public final boolean a(Playlist playlist)
    {
        return false;
    }

    public final boolean a(v v)
    {
        return false;
    }

    public final OfflineStoreInterface.OfflineAddResult b(String s, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type)
    {
        return OfflineStoreInterface.OfflineAddResult.CANNOT_ADD;
    }

    public final VastAd b(String s, String s1)
    {
        return null;
    }

    public final s b(String s)
    {
        return null;
    }

    public final u b(String s, long l1)
    {
        return new u(null, null);
    }

    public final void b(b b1)
    {
        b1.a(null, Collections.emptyList());
    }

    public final void b(String s, b b1)
    {
        b1.a(null, null);
    }

    public final v c(String s)
    {
        return null;
    }

    public final void c(String s, b b1)
    {
        b1.a(null, Collections.emptyList());
    }

    public final void c(String s, String s1)
    {
    }

    public final int d(String s, String s1)
    {
        return 0;
    }

    public final i d()
    {
        return null;
    }

    public final List d(String s)
    {
        return null;
    }

    public final Collection e()
    {
        return Collections.emptyList();
    }

    public final void e(String s)
    {
    }

    public final void f()
    {
    }

    public final void f(String s)
    {
    }

    public final Map g()
    {
        return Collections.emptyMap();
    }

    public final void g(String s)
    {
    }

    public final void h(String s)
    {
    }

    public final long i()
    {
        return 0L;
    }

    public final Pair i(String s)
    {
        return null;
    }

    public final Video j(String s)
    {
        return null;
    }

    public final PlaybackPair k(String s)
    {
        return null;
    }

    public final List l(String s)
    {
        return null;
    }

    public final void m(String s)
    {
    }

    public final void n(String s)
    {
    }

    public final int o(String s)
    {
        return 0;
    }

    public final OfflineMediaStatus p(String s)
    {
        return OfflineMediaStatus.DELETED;
    }
}
