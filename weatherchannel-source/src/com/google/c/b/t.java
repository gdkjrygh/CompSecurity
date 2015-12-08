// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.c;
import com.google.c.a.d;
import com.google.c.a.e;
import com.google.c.a.f;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.c.b:
//            ag, af, a, d

public final class t
{

    static final ag a = new ag() {

        public boolean hasNext()
        {
            return false;
        }

        public boolean hasPrevious()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

        public int nextIndex()
        {
            return 0;
        }

        public Object previous()
        {
            throw new NoSuchElementException();
        }

        public int previousIndex()
        {
            return -1;
        }

    };
    private static final Iterator b = new Iterator() {

        public boolean hasNext()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

        public void remove()
        {
            d.a(false);
        }

    };

    public static af a()
    {
        return b();
    }

    public static af a(Object obj)
    {
        return new af(obj) {

            boolean a;
            final Object b;

            public boolean hasNext()
            {
                return !a;
            }

            public Object next()
            {
                if (a)
                {
                    throw new NoSuchElementException();
                } else
                {
                    a = true;
                    return b;
                }
            }

            
            {
                b = obj;
                super();
            }
        };
    }

    static ag a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d.a(flag);
        d.a(i, i + j, aobj.length);
        d.b(k, j);
        if (j == 0)
        {
            return b();
        } else
        {
            return new a(j, k, aobj, i) {

                final Object a[];
                final int b;

                protected Object a(int l)
                {
                    return a[b + l];
                }

            
            {
                a = aobj;
                b = k;
                super(i, j);
            }
            };
        }
    }

    public static boolean a(Iterator iterator, e e1)
    {
        return b(iterator, e1) != -1;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        return a(iterator, f.a(obj));
    }

    public static boolean a(Iterator iterator, Iterator iterator1)
    {
        do
        {
            if (iterator.hasNext())
            {
                if (iterator1.hasNext())
                {
                    continue;
                }
            } else
            if (!iterator1.hasNext())
            {
                return true;
            }
            return false;
        } while (c.a(iterator.next(), iterator1.next()));
        return false;
    }

    public static int b(Iterator iterator, e e1)
    {
        d.a(e1, "predicate");
        for (int i = 0; iterator.hasNext(); i++)
        {
            if (e1.a(iterator.next()))
            {
                return i;
            }
        }

        return -1;
    }

    static ag b()
    {
        return a;
    }

}
