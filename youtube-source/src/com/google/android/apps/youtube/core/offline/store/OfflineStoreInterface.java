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
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            i

public interface OfflineStoreInterface
{

    public abstract OfflineAddResult a(String s, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type);

    public abstract OfflineAddResult a(String s, String s1);

    public abstract x a(String s);

    public abstract void a(long l1);

    public abstract void a(b b1);

    public abstract void a(String s, long l1);

    public abstract void a(String s, b b1);

    public abstract void a(Collection collection);

    public abstract boolean a(Playlist playlist);

    public abstract boolean a(v v);

    public abstract OfflineAddResult b(String s, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type);

    public abstract VastAd b(String s, String s1);

    public abstract s b(String s);

    public abstract u b(String s, long l1);

    public abstract void b(b b1);

    public abstract void b(String s, b b1);

    public abstract v c(String s);

    public abstract void c(String s, b b1);

    public abstract void c(String s, String s1);

    public abstract int d(String s, String s1);

    public abstract i d();

    public abstract List d(String s);

    public abstract Collection e();

    public abstract void e(String s);

    public abstract void f();

    public abstract void f(String s);

    public abstract Map g();

    public abstract void g(String s);

    public abstract void h(String s);

    public abstract long i();

    public abstract Pair i(String s);

    public abstract Video j(String s);

    public abstract PlaybackPair k(String s);

    public abstract List l(String s);

    public abstract void m(String s);

    public abstract void n(String s);

    public abstract int o(String s);

    public abstract OfflineMediaStatus p(String s);
}
