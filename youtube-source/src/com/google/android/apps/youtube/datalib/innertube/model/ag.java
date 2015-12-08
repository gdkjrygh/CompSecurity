// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.dp;
import com.google.a.a.a.a.os;
import com.google.a.a.a.a.ot;
import com.google.a.a.a.a.ou;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            af

public final class ag
{

    private final os a;
    private List b;
    private dp c;

    public ag(os os1)
    {
        a = (os)com.google.android.apps.youtube.common.fromguava.c.a(os1);
    }

    public final List a()
    {
        if (b == null)
        {
            b = new ArrayList(a.b.length);
            ou aou[] = a.b;
            int j = aou.length;
            for (int i = 0; i < j; i++)
            {
                ou ou1 = aou[i];
                if (ou1.c != null)
                {
                    b.add(new af(ou1.c, a.c, a.d));
                }
            }

        }
        return b;
    }

    public final dp b()
    {
        if (c == null)
        {
            c = new dp();
            ot aot[] = a.e;
            int j = aot.length;
            for (int i = 0; i < j; i++)
            {
                ot ot1 = aot[i];
                if (ot1.b != null)
                {
                    c.c = ot1.b;
                }
            }

        }
        return c;
    }
}
