// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            cg, YouTubeTvScreen

final class ch
    implements Runnable
{

    final YouTubeTvScreen a;
    final cg b;

    ch(cg cg1, YouTubeTvScreen youtubetvscreen)
    {
        b = cg1;
        a = youtubetvscreen;
        super();
    }

    public final void run()
    {
        b.b.a(b.a, a);
    }
}
