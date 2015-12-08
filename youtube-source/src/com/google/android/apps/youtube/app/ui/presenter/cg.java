// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cd

public final class cg
    implements j
{

    private final Context a;
    private final bj b;
    private final a c;
    private final v d;
    private final com.google.android.apps.youtube.app.ui.a e;

    public cg(Context context, bj bj1, a a1, v v1, com.google.android.apps.youtube.app.ui.a a2)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
        e = (com.google.android.apps.youtube.app.ui.a)com.google.android.apps.youtube.common.fromguava.c.a(a2);
    }

    public final g a()
    {
        return new cd(a, b, c, d, e);
    }
}
