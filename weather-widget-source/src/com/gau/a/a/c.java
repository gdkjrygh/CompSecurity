// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a;

import com.gau.a.a.d.a;
import java.util.Comparator;

// Referenced classes of package com.gau.a.a:
//            b

class c
    implements Comparator
{

    final b a;

    c(b b)
    {
        a = b;
        super();
    }

    public int a(a a1, a a2)
    {
        if (a1.q() < a2.q())
        {
            return 1;
        }
        return a1.q() <= a2.q() ? 0 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }
}
