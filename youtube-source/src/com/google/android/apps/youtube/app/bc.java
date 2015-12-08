// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.player.DefaultPlaybackMonitor;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class bc extends f
{

    final ax a;

    bc(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new DefaultPlaybackMonitor(a.bf(), a.ba());
    }
}
