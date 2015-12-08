// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.android.volley.l;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.datalib.config.c;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.offline.j;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class bt extends f
{

    final ax a;

    bt(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        return new b(Collections.unmodifiableList(new ArrayList()), a.aA(), (l)com.google.android.apps.youtube.app.ax.j(a).b(), (j)ax.m(a).b(), a.aG(), a.b(), (c)ax.n(a).b(), a.aI());
    }
}
