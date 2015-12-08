// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.offline.n;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            ab

public final class aa
    implements ce
{

    private final ce a;
    private final Executor b;
    private final l c;
    private final n d;
    private final q e;

    public aa(ce ce1, Executor executor, a a1, l l1, n n1, q q1)
    {
        a = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1);
        e = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
    }

    static l a(aa aa1)
    {
        return aa1.c;
    }

    static q b(aa aa1)
    {
        return aa1.e;
    }

    public final void a(SubtitleTrack subtitletrack, b b1)
    {
        a.a(subtitletrack, b1);
    }

    public final void a(String s, b b1)
    {
        if (d.a())
        {
            b.execute(new ab(this, s, b1));
            return;
        } else
        {
            a.a(s, b1);
            return;
        }
    }

    public final void b(SubtitleTrack subtitletrack, b b1)
    {
        a.b(subtitletrack, b1);
    }
}
