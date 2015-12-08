// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.b;

import java.util.Comparator;

// Referenced classes of package com.wf.wellsfargomobile.b:
//            e, c, d

class f
    implements Comparator
{

    final c a;

    private f(c c)
    {
        a = c;
        super();
    }

    f(c c, d d)
    {
        this(c);
    }

    public int a(e e1, e e2)
    {
        return e1.b() - e2.b();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((e)obj, (e)obj1);
    }
}
