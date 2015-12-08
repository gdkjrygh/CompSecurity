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
//            ax, aw

final class bw extends f
{

    final ax a;

    bw(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        boolean flag = a.b().r();
        boolean flag1 = a.b().s();
        if (flag && flag1)
        {
            return (b)ax.o(a).b();
        }
        if (!flag && !flag1)
        {
            return (b)ax.p(a).b();
        }
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            arraylist.add(a.aS());
        }
        if (flag1)
        {
            arraylist.add(a.aE());
        }
        return new b(arraylist, a.aA(), (l)ax.q(a).b(), (j)ax.m(a).b(), a.aG(), a.b(), (c)ax.n(a).b(), a.aI());
    }
}
