// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.Iterator;

// Referenced classes of package com.google.c.b:
//            s, m, n, af, 
//            i, k

final class q extends s
{

    private final n a;

    q(n n1)
    {
        a = n1;
    }

    public af a()
    {
        return b().a();
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    m d()
    {
        return new i(a.b().b()) {

            final m a;
            final q b;

            k c()
            {
                return b;
            }

            public Object get(int j)
            {
                return ((java.util.Map.Entry)a.get(j)).getKey();
            }

            
            {
                b = q.this;
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
