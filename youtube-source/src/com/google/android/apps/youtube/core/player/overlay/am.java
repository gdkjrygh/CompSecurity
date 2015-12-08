// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            al, ak, an

public final class am
    implements al
{

    private final ak a;
    private final ae b;

    public am(ak ak1, ae ae1)
    {
        a = (ak)c.a(ak1);
        b = (ae)c.a(ae1);
        ak1.setListener(this);
    }

    public final void b()
    {
        b.n();
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        switch (an.a[ac1.c().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.d();
            return;

        case 2: // '\002'
            ac1.d().getPlayerResponse().isLive();
            break;
        }
    }
}
