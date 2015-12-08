// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.an;
import com.google.a.a.a.a.ar;
import com.google.a.a.a.a.as;
import com.google.a.a.a.a.av;
import com.google.a.a.a.a.dq;
import com.google.a.a.a.a.ro;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            an, c, j, ab

public final class b
{

    private final ar a;
    private List b;
    private Object c;

    public b(ar ar1)
    {
        a = ar1;
    }

    public final dq a()
    {
        return a.e;
    }

    public final List b()
    {
        if (b == null)
        {
            b = new ArrayList();
            Object obj = a.d;
            if (obj == null)
            {
                return b;
            }
            obj = ((as) (obj)).d;
            if (obj == null)
            {
                return b;
            }
            av aav[] = ((ro) (obj)).b;
            int k = aav.length;
            for (int i = 0; i < k; i++)
            {
                av av1 = aav[i];
                if (av1.b != null)
                {
                    b.add(new com.google.android.apps.youtube.datalib.innertube.model.an(av1.b));
                }
            }

        }
        return b;
    }

    public final Object c()
    {
        if (c != null || a.g == null) goto _L2; else goto _L1
_L1:
        an an1 = a.g;
        if (an1.b == null) goto _L4; else goto _L3
_L3:
        c = new c(an1.b);
_L2:
        return c;
_L4:
        if (an1.c != null)
        {
            c = new j(an1.c);
        } else
        if (an1.d != null)
        {
            c = new ab(an1.d);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean d()
    {
        return a.d == null;
    }
}
