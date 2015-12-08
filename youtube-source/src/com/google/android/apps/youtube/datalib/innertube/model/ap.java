// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.sx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ao

public final class ap
{

    private final List a;

    public ap(sx sx1)
    {
        if (sx1 != null)
        {
            a = new ArrayList(sx1.b.length);
            sx1 = sx1.b;
            int j = sx1.length;
            for (int i = 0; i < j; i++)
            {
                com.google.a.a.a.a.sy sy = sx1[i];
                a.add(new ao(sy));
            }

        } else
        {
            a = Collections.emptyList();
        }
    }

    public final boolean a()
    {
        return a.size() > 0;
    }

    public final List b()
    {
        return a;
    }
}
