// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.app.offline.a.a;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.offline.store.b;
import com.google.android.apps.youtube.core.utils.p;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax

final class cw extends f
{

    final ax a;

    cw(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        if (!p.a(ax.N(a)))
        {
            return new b();
        } else
        {
            return new a(a, a.bf(), a.aT(), (ce)ax.B(a).b(), a.Z());
        }
    }
}
