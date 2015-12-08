// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            d, h, j, k

class g
    implements Runnable
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = d.b(a).values().iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            Iterator iterator1 = h.a(h1).iterator();
            while (iterator1.hasNext()) 
            {
                j j1 = (j)iterator1.next();
                if (j.a(j1) != null)
                {
                    if (h1.a() == null)
                    {
                        j.a(j1, h.b(h1));
                        j.a(j1).a(j1, false);
                    } else
                    {
                        j.a(j1).a(h1.a());
                    }
                }
            }
        }

        d.b(a).clear();
        d.a(a, null);
    }
}
