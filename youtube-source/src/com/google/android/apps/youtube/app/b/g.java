// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import com.google.android.apps.youtube.core.client.a.f;
import com.google.android.apps.youtube.core.player.event.ac;

// Referenced classes of package com.google.android.apps.youtube.app.b:
//            k, e

final class g
    implements f
{

    final e a;

    g(e e)
    {
        a = e;
        super();
    }

    public final com.google.android.apps.youtube.core.client.a.g a(com.google.android.apps.youtube.core.client.a.g g1)
    {
        g1 = (ac)g1;
        switch (k.a[g1.c().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            g1.a("gv");
            return g1;

        case 2: // '\002'
            g1.a("ad_i");
            break;
        }
        return g1;
    }
}
