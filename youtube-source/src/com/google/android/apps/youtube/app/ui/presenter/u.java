// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import com.google.android.apps.youtube.app.d.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            s

public final class u
    implements j
{

    private final Activity a;
    private final bj b;
    private final o c;

    public u(Activity activity, bj bj1, o o1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        c = (o)com.google.android.apps.youtube.common.fromguava.c.a(o1);
    }

    public final g a()
    {
        return new s(a, b, c);
    }
}
