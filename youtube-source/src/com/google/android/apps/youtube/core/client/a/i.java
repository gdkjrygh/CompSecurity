// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client.a;

import android.util.Pair;
import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client.a:
//            d, h, a

final class i
    implements d
{

    final h a;
    private final com.google.android.apps.youtube.core.client.a.d b;

    public i(h h1, com.google.android.apps.youtube.core.client.a.d d1)
    {
        a = h1;
        super();
        b = (com.google.android.apps.youtube.core.client.a.d)c.a(d1);
    }

    public final void a(Object obj)
    {
        obj = b.a(obj);
        if (obj != null)
        {
            for (Iterator iterator = h.a(a).iterator(); iterator.hasNext();)
            {
                a a1 = (a)iterator.next();
                Iterator iterator1 = ((List) (obj)).iterator();
                while (iterator1.hasNext()) 
                {
                    Pair pair = (Pair)iterator1.next();
                    a1.a((String)pair.first, (String)pair.second);
                }
            }

        }
    }
}
