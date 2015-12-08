// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.android.volley.l;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.bb;
import com.google.android.apps.youtube.datalib.config.c;
import com.google.android.apps.youtube.datalib.e.g;
import com.google.android.apps.youtube.datalib.offline.a;
import com.google.android.apps.youtube.datalib.offline.m;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class de extends f
{

    final ax a;

    de(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        HashSet hashset = new HashSet();
        hashset.add(new g((l)ax.j(a).b(), a.aG(), (c)ax.n(a).b(), (m)ax.R(a).b()));
        hashset.add(new bb((l)ax.j(a).b(), a.aG(), (c)ax.n(a).b(), (m)ax.R(a).b()));
        return new a(a.ab(), hashset, a.aJ(), (c)ax.n(a).b(), (m)ax.R(a).b(), a.aG(), a.aX());
    }
}
