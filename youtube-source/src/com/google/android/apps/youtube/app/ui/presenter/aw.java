// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            at, p

public final class aw
    implements j
{

    private final Context a;
    private final bj b;
    private final a c;
    private final OfflineStoreInterface d;
    private final h e;
    private final am f;
    private final p g;
    private final v h;

    public aw(Context context, bj bj1, a a1, OfflineStoreInterface offlinestoreinterface, h h1, am am1, p p1, 
            v v1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        e = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        f = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        g = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        h = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
    }

    public final g a()
    {
        at at1 = new at(a, new com.google.android.apps.youtube.app.ui.presenter.p(a), b, d, e, f, g, h);
        c.a(at1);
        return at1;
    }
}
