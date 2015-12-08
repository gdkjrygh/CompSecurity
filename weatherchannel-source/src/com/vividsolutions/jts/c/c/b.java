// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.c;

import com.vividsolutions.jts.c.a;

// Referenced classes of package com.vividsolutions.jts.c.c:
//            c

public final class b extends c
{

    private Object c;

    public b(double d, double d1, Object obj)
    {
        a = d;
        b = d1;
        c = obj;
    }

    public final void a(double d, double d1, a a1)
    {
        if (!a(d, d1))
        {
            return;
        } else
        {
            a1.a(c);
            return;
        }
    }
}
