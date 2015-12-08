// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import java.util.Comparator;

// Referenced classes of package com.go.weatherex.messagecenter:
//            a, b, c

class e
    implements Comparator
{

    final b a;

    private e(b b)
    {
        a = b;
        super();
    }

    e(b b, c c)
    {
        this(b);
    }

    public int a(a a1, a a2)
    {
        if (a1.a() && a2.a())
        {
            return 0;
        }
        return a1.a() || !a2.a() ? 1 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }
}
