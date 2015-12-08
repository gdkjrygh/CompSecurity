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
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class bv extends f
{

    final ax a;

    bv(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(a.aE());
        arraylist.add(a.aS());
        return new b(arraylist, a.aA(), (l)com.google.android.apps.youtube.app.ax.j(a).b(), (j)ax.m(a).b(), a.aG(), a.b(), (c)ax.n(a).b(), a.aI());
    }
}
