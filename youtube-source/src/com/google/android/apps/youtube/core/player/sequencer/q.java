// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            o

final class q
    implements Runnable
{

    final WatchNextResponse a;
    final o b;

    q(o o1, WatchNextResponse watchnextresponse)
    {
        b = o1;
        a = watchnextresponse;
        super();
    }

    public final void run()
    {
        o.a(b, a);
    }
}
