// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib;

import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.exoplayer.upstream.HttpDataSource;

// Referenced classes of package com.google.android.apps.youtube.medialib:
//            a

final class b
    implements e
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final Object b()
    {
        return new HttpDataSource(com.google.android.apps.youtube.medialib.a.a(a), HttpDataSource.a, com.google.android.apps.youtube.medialib.a.b(a), ((PlayerConfig)com.google.android.apps.youtube.medialib.a.c(a).b()).httpConnectTimeoutMs(), ((PlayerConfig)com.google.android.apps.youtube.medialib.a.c(a).b()).httpReadTimeoutMs());
    }
}
