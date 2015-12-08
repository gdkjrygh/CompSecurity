// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.core.player.ap;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bf, q

final class bg
    implements ap
{

    final bf a;

    private bg(bf bf1)
    {
        a = bf1;
        super();
    }

    bg(bf bf1, byte byte0)
    {
        this(bf1);
    }

    public final void a()
    {
        bf.a(a).a(true);
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        a.a(subtitletrack);
    }

    public final void a(List list)
    {
        bf.a(a).a(list);
    }

    public final void b()
    {
        bf.a(a).a(false);
    }

    public final void c()
    {
        ah.a(bf.b(a), p.cT, 0);
    }
}
