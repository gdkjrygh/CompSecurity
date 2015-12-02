// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            ov, as9, aoz, q7, 
//            t0

class _g
    implements Runnable
{

    final HashMap a;
    final as9 b;

    _g(as9 as9_1, HashMap hashmap)
    {
        b = as9_1;
        a = hashmap;
        super();
    }

    public void run()
    {
        boolean flag = ov.e;
        aoz.c(b.b).a(b.c, a);
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            aoz.c(b.b).a(s);
            aoz.b(b.b).d(s);
        } while (!flag);
    }
}
