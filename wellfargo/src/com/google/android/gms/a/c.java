// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.a:
//            n, b, i, a

class c
    implements n
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void a(a a1)
    {
        b.a(a, a1);
        for (a1 = b.a(a).iterator(); a1.hasNext(); ((i)a1.next()).a(b.b(a))) { }
        b.a(a).clear();
        b.a(a, null);
    }
}
