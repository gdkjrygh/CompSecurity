// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client.a;

import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client.a:
//            f, g, h, a

final class l
    implements d
{

    final h a;
    private final f b;

    private l(h h1, f f1)
    {
        a = h1;
        super();
        b = (f)c.a(f1);
    }

    l(h h1, f f1, byte byte0)
    {
        this(h1, f1);
    }

    public final void a(Object obj)
    {
        obj = (g)obj;
        obj = b.a(((g) (obj)));
        if (obj != null)
        {
            for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((a)iterator.next()).a(((g) (obj)))) { }
        }
    }
}
