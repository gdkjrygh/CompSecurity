// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            o, b, j, a

final class c
    implements o
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void a(a a1)
    {
        b.a(a, a1);
        j j1;
        for (a1 = b.a(a).iterator(); a1.hasNext(); j1.b())
        {
            j1 = (j)a1.next();
            b.b(a);
        }

        b.a(a).clear();
        b.a(a, null);
    }
}
