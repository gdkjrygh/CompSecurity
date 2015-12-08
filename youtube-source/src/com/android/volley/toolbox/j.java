// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            g, k, m, n

final class j
    implements Runnable
{

    final g a;

    j(g g1)
    {
        a = g1;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = g.b(a).values().iterator(); iterator.hasNext();)
        {
            k k1 = (k)iterator.next();
            Iterator iterator1 = k.a(k1).iterator();
            while (iterator1.hasNext()) 
            {
                m m1 = (m)iterator1.next();
                if (m.a(m1) != null)
                {
                    if (k1.a() == null)
                    {
                        m.a(m1, k.b(k1));
                        m.a(m1).a(m1, false);
                    } else
                    {
                        m.a(m1).a(k1.a());
                    }
                }
            }
        }

        g.b(a).clear();
        g.a(a, null);
    }
}
