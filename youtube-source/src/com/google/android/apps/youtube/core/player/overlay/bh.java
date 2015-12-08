// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.player.ao;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            t, bf

final class bh
    implements t
{

    final bf a;

    private bh(bf bf1)
    {
        a = bf1;
        super();
    }

    bh(bf bf1, byte byte0)
    {
        this(bf1);
    }

    public final void a()
    {
        bf.c(a).b("CC");
        bf.d(a).a();
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        bf.d(a).a(subtitletrack);
        a.a(subtitletrack);
    }
}
