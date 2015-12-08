// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net.http;

import java.util.Comparator;

// Referenced classes of package com.sessionm.net.http:
//            a, c

class hS
    implements Comparator
{

    final a hS;

    public int a(c c1, c c2)
    {
        return c2.getPriority() - c1.getPriority();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c)obj, (c)obj1);
    }

    (a a1)
    {
        hS = a1;
        super();
    }
}
