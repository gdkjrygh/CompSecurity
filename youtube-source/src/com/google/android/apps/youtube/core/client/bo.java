// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ak;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            bp

public final class bo
    implements ag
{

    private final bp a;

    public bo(bp bp1)
    {
        a = (bp)c.a(bp1);
    }

    public final void a(ak ak1)
    {
        String s = a.y();
        if (s != null)
        {
            if (s.equals("tvlite"))
            {
                ak1.j(8);
                return;
            }
            if (s.equals("xbox"))
            {
                ak1.j(11);
                return;
            }
        }
        ak1.j(7);
    }
}
