// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cj, ck, ch, p

public final class ci
    implements j
{

    private final Context a;
    private final bj b;
    private final a c;
    private final v d;
    private final int e;

    public ci(Activity activity, bj bj1, a a1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = new v(activity);
        e = d.a(p.dL, new cj(this));
        d.a(new ck(this));
    }

    static a a(ci ci1)
    {
        return ci1.c;
    }

    static int b(ci ci1)
    {
        return ci1.e;
    }

    public final g a()
    {
        return new ch(a, new com.google.android.apps.youtube.app.ui.presenter.p(a), b, c, d);
    }
}
