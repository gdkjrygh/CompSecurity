// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.content.Context;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            h, p

public final class n
    implements j
{

    private final Context a;
    private final bj b;
    private final a c;

    public n(Context context, bj bj1, a a1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    public final g a()
    {
        return new h(a, b, new p(a), c);
    }
}
