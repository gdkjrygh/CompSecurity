// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import com.google.android.apps.youtube.app.d.r;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            f, cu, g, cq

public final class ct
    implements j
{

    private final Activity a;
    private final bj b;
    private final f c;
    private final cu d;
    private final com.google.android.apps.youtube.app.ui.presenter.g e;
    private final r f;

    public ct(Activity activity, bj bj1, f f1, cu cu1, com.google.android.apps.youtube.app.ui.presenter.g g1, r r1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        d = (cu)com.google.android.apps.youtube.common.fromguava.c.a(cu1);
        e = (com.google.android.apps.youtube.app.ui.presenter.g)com.google.android.apps.youtube.common.fromguava.c.a(g1);
        f = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
    }

    public final g a()
    {
        return new cq(a, b, c, d, e, f);
    }
}
