// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.sync;

import com.google.a.a.a.a.ly;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app.offline.sync:
//            b

final class c
{

    final b a;
    private final String b;
    private final long c;

    public c(b b1, ly ly1, long l)
    {
        a = b1;
        super();
        com.google.android.apps.youtube.common.fromguava.c.a(ly1);
        b = ly1.b;
        c = TimeUnit.SECONDS.toMillis(ly1.d) + l;
    }

    public final String a()
    {
        return b;
    }

    public final long b()
    {
        return c;
    }
}
