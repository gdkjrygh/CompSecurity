// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            y, u

final class ac
    implements Runnable
{

    final WatchNextResponse a;
    final y b;

    ac(y y1, WatchNextResponse watchnextresponse)
    {
        b = y1;
        a = watchnextresponse;
        super();
    }

    public final void run()
    {
        if (y.a(b))
        {
            return;
        } else
        {
            b.a.i = a;
            b.a.q();
            u.a(b.a, new PlaybackStartDescriptor(b.a.i.getCurrentWatchEndpoint(), y.b(b).getWatchFeature()));
            return;
        }
    }
}
