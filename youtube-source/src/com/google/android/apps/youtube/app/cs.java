// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import com.android.volley.l;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.utils.k;
import com.google.android.apps.youtube.datalib.c.a;
import com.google.android.apps.youtube.datalib.config.b;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ax, ak

final class cs extends f
{

    final ax a;

    cs(ax ax1)
    {
        a = ax1;
        super();
    }

    public final Object a()
    {
        l l1 = (l)ax.j(a).b();
        android.content.SharedPreferences sharedpreferences = a.aP();
        com.google.android.apps.youtube.datalib.config.a a1 = a.az();
        ax ax1 = a;
        return new a(l1, sharedpreferences, a1, com.google.android.apps.youtube.app.ak.a.c(), k.a(ax.L(a).getContentResolver()), "YouTubeApplication");
    }
}
