// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.Iterator;

// Referenced classes of package com.google.c.b:
//            k, n, s, v, 
//            t, af, m, i

final class r extends k
{

    private final n a;

    r(n n1)
    {
        a = n1;
    }

    public af a()
    {
        return v.a(a.b().a());
    }

    public boolean contains(Object obj)
    {
        return obj != null && t.a(a(), obj);
    }

    m d()
    {
        return new i(a.b().b()) {

            final m a;
            final r b;

            k c()
            {
                return b;
            }

            public Object get(int j)
            {
                return ((java.util.Map.Entry)a.get(j)).getValue();
            }

            
            {
                b = r.this;
                a = m1;
                super();
            }
        };
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return a.size();
    }
}
