// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client.a;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.client.a:
//            e, b, g, a, 
//            h

final class j
    implements e
{

    protected final Set a;
    final h b;
    private final b c;

    private j(h h1, b b1)
    {
        b = h1;
        super();
        a = new HashSet();
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
    }

    j(h h1, b b1, byte byte0)
    {
        this(h1, b1);
    }

    public final e a(Class class1)
    {
        a.add(com.google.android.apps.youtube.common.fromguava.c.a(class1));
        return this;
    }

    public final void a(Object obj)
    {
        obj = (g)obj;
        a a1 = c.a(b);
        if (a1 != null)
        {
            a1.a(((g) (obj)), a);
            h.a(b).add(a1);
        }
    }
}
