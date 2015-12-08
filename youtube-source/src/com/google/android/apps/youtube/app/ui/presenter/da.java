// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.ui.ja;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.av;
import com.google.android.apps.youtube.datalib.innertube.bc;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cz, p

public final class da
    implements j
{

    private final YouTubeActivity a;
    private final av b;
    private final a c;
    private final l d;
    private final as e;
    private final aa f;
    private final bc g;
    private final bj h;
    private final com.google.android.apps.youtube.common.c.a i;
    private final aw j;

    public da(YouTubeActivity youtubeactivity, av av1, l l1, as as1, aa aa1, bc bc1, bj bj1, 
            com.google.android.apps.youtube.common.c.a a1, aw aw1, a a2)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a2);
        b = (av)com.google.android.apps.youtube.common.fromguava.c.a(av1);
        d = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        e = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1);
        f = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        g = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        h = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        i = (com.google.android.apps.youtube.common.c.a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        j = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
    }

    public final g a()
    {
        ja ja1 = new ja(a, new com.google.android.apps.youtube.app.c.a(a, g, d, e), c, i, j);
        return new cz(a, new p(a), b, d, f, ja1, h, i, j, c);
    }
}
