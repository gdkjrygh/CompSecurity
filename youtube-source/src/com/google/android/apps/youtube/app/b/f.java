// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import com.google.android.apps.youtube.core.player.event.g;

// Referenced classes of package com.google.android.apps.youtube.app.b:
//            e

final class f
    implements com.google.android.apps.youtube.core.client.a.f
{

    final e a;

    f(e e)
    {
        a = e;
        super();
    }

    public final com.google.android.apps.youtube.core.client.a.g a(com.google.android.apps.youtube.core.client.a.g g1)
    {
        g1 = (g)g1;
        if (((g) (g1)).c <= 1)
        {
            g1.a((new StringBuilder("ad_")).append(((g) (g1)).b).toString());
            return g1;
        } else
        {
            g1.a((new StringBuilder("ad_")).append(((g) (g1)).b).append('_').append(((g) (g1)).c).toString());
            return g1;
        }
    }
}
