// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.Iterator;

// Referenced classes of package com.google.c.b:
//            n, h, o, s, 
//            p, m, y, af

final class aa extends n
{
    private class a extends p
    {

        final aa a;

        public af a()
        {
            return b().a();
        }

        m d()
        {
            return new y(this, aa.a(a));
        }

        n e()
        {
            return a;
        }

        public Iterator iterator()
        {
            return a();
        }

        private a()
        {
            a = aa.this;
            super();
        }

    }

    private static final class b extends o
    {

        private final o c;

        o a()
        {
            return c;
        }

        b(o o1, o o2)
        {
            super(o1);
            c = o2;
        }
    }


    private final transient o a[];
    private final transient o b[];
    private final transient int c;

    aa(int i, o.a aa1[])
    {
        a = a(i);
        int j = h.a(i, 1.2D);
        b = a(j);
        c = j - 1;
        j = 0;
        while (j < i) 
        {
            Object obj = aa1[j];
            Object obj1 = ((o.a) (obj)).getKey();
            int k = h.a(obj1.hashCode());
            k = c & k;
            o o1 = b[k];
            if (o1 != null)
            {
                obj = new b(((o) (obj)), o1);
            }
            b[k] = ((o) (obj));
            a[j] = ((o) (obj));
            a(obj1, ((o) (obj)), o1);
            j++;
        }
    }

    private void a(Object obj, o o1, o o2)
    {
        while (o2 != null) 
        {
            boolean flag;
            if (!obj.equals(o2.getKey()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag, "key", ((java.util.Map.Entry) (o1)), ((java.util.Map.Entry) (o2)));
            o2 = o2.a();
        }
    }

    private o[] a(int i)
    {
        return new o[i];
    }

    static o[] a(aa aa1)
    {
        return aa1.a;
    }

    s c()
    {
        return new a();
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = h.a(obj.hashCode());
            int j = c;
            o o1 = b[i & j];
            while (o1 != null) 
            {
                if (obj.equals(o1.getKey()))
                {
                    return o1.getValue();
                }
                o1 = o1.a();
            }
        }
        return null;
    }

    public int size()
    {
        return a.length;
    }
}
