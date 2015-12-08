// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client.a;

import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client.a:
//            g, h, a

final class k
    implements d
{

    final h a;
    private final String b;

    private k(h h1, String s)
    {
        a = h1;
        super();
        b = c.a(s);
    }

    k(h h1, String s, byte byte0)
    {
        this(h1, s);
    }

    public final void a(Object obj)
    {
        obj = (g)obj;
        ((g) (obj)).a(b);
        Iterator iterator = h.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.a(((g) (obj))))
            {
                iterator.remove();
                h.b(a).a(a1.a());
            }
        } while (true);
    }
}
