// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bh

public final class bj
    implements j
{

    private final Context a;
    private final com.google.android.apps.youtube.core.client.bj b;
    private final a c;
    private final v d;

    public bj(Context context, com.google.android.apps.youtube.core.client.bj bj1, a a1, v v1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (com.google.android.apps.youtube.core.client.bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (v)com.google.android.apps.youtube.common.fromguava.c.a(v1);
    }

    public final g a()
    {
        return new bh(a, b, c, d);
    }
}
