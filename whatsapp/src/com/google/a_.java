// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google:
//            b4, d8, cW, d9, 
//            cA, eu, Q, bX, 
//            P, ee

public class a_
    implements b4
{

    private Q a;
    private b4 b;
    private List c;
    private eu d;
    private boolean e;
    private List f;
    private cA g;
    private boolean h;

    public a_(List list, boolean flag, b4 b4_1, boolean flag1)
    {
        c = list;
        h = flag;
        b = b4_1;
        e = flag1;
    }

    private d8 a(int j, boolean flag)
    {
label0:
        {
            d8 d8_1;
            try
            {
                if (f != null)
                {
                    break label0;
                }
                d8_1 = (d8)c.get(j);
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return d8_1;
        }
        Object obj = (cW)f.get(j);
        if (obj == null)
        {
            try
            {
                obj = (d8)c.get(j);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((d8) (obj));
        }
        if (flag)
        {
            try
            {
                obj = ((cW) (obj)).g();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((d8) (obj));
        } else
        {
            return ((cW) (obj)).e();
        }
    }

    private void c()
    {
        try
        {
            if (!h)
            {
                c = new ArrayList(c);
                h = true;
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    private void d()
    {
        boolean flag = e;
        NullPointerException nullpointerexception;
        if (flag)
        {
            try
            {
                if (b != null)
                {
                    b.a();
                    e = false;
                    return;
                }
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        break MISSING_BLOCK_LABEL_37;
        nullpointerexception;
        throw nullpointerexception;
    }

    private void e()
    {
        int k = d9.c;
        if (f == null)
        {
            f = new ArrayList(c.size());
            int j = 0;
            do
            {
                if (j >= c.size())
                {
                    break;
                }
                f.add(null);
                j++;
            } while (k == 0);
        }
    }

    private void g()
    {
        try
        {
            if (g != null)
            {
                g.a();
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        try
        {
            if (d != null)
            {
                d.a();
            }
        }
        catch (NullPointerException nullpointerexception1)
        {
            throw nullpointerexception1;
        }
        try
        {
            if (a != null)
            {
                a.a();
            }
            return;
        }
        catch (NullPointerException nullpointerexception2)
        {
            throw nullpointerexception2;
        }
    }

    public int a()
    {
        return c.size();
    }

    public a_ a(int j, d8 d8_1)
    {
        if (d8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (d8 d8_1)
            {
                throw d8_1;
            }
        }
        c();
        c.set(j, d8_1);
        if (f != null)
        {
            d8_1 = (cW)f.set(j, null);
            if (d8_1 != null)
            {
                try
                {
                    d8_1.f();
                }
                // Misplaced declaration of an exception variable
                catch (d8 d8_1)
                {
                    throw d8_1;
                }
            }
        }
        d();
        g();
        return this;
    }

    public a_ a(d8 d8_1)
    {
        if (d8_1 == null)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (d8 d8_1)
            {
                throw d8_1;
            }
        }
        try
        {
            c();
            c.add(d8_1);
            if (f != null)
            {
                f.add(null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (d8 d8_1)
        {
            throw d8_1;
        }
        d();
        g();
        return this;
    }

    public a_ a(Iterable iterable)
    {
        int j = d9.c;
        Iterator iterator = iterable.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if ((d8)iterator.next() == null)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Iterable iterable)
                {
                    throw iterable;
                }
            }
        } while (j == 0);
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            int k;
            try
            {
                k = collection.size();
            }
            // Misplaced declaration of an exception variable
            catch (Iterable iterable)
            {
                throw iterable;
            }
            if (k == 0)
            {
                return this;
            }
            c();
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                a((d8)iterable.next());
            } while (j == 0);
        } else
        {
            c();
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                a((d8)iterable.next());
            } while (j == 0);
        }
        d();
        g();
        return this;
    }

    public ee a(int j)
    {
        e();
        cW cw1 = (cW)f.get(j);
        cW cw = cw1;
        if (cw1 == null)
        {
            cw = new cW((d8)c.get(j), this, e);
            f.set(j, cw);
        }
        return cw.c();
    }

    public void a()
    {
        d();
    }

    public d8 b(int j)
    {
        return a(j, false);
    }

    public boolean b()
    {
        return c.isEmpty();
    }

    public void c(int j)
    {
        c();
        c.remove(j);
        if (f != null)
        {
            cW cw = (cW)f.remove(j);
            if (cw != null)
            {
                try
                {
                    cw.f();
                }
                catch (NullPointerException nullpointerexception)
                {
                    throw nullpointerexception;
                }
            }
        }
        d();
        g();
    }

    public bX d(int j)
    {
label0:
        {
            bX bx;
            try
            {
                if (f != null)
                {
                    break label0;
                }
                bx = (bX)c.get(j);
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return bx;
        }
        Object obj = (cW)f.get(j);
        if (obj == null)
        {
            try
            {
                obj = (bX)c.get(j);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((bX) (obj));
        } else
        {
            return ((cW) (obj)).d();
        }
    }

    public void f()
    {
        b = null;
    }

    public void h()
    {
        int j = d9.c;
        c = Collections.emptyList();
        h = false;
        if (f != null)
        {
            Iterator iterator = f.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                cW cw = (cW)iterator.next();
                if (cw != null)
                {
                    try
                    {
                        cw.f();
                    }
                    catch (NullPointerException nullpointerexception)
                    {
                        throw nullpointerexception;
                    }
                }
            } while (j == 0);
            f = null;
        }
        d();
        g();
    }

    public List i()
    {
        int l = d9.c;
        boolean flag;
        e = true;
        flag = h;
        NullPointerException nullpointerexception;
        if (!flag)
        {
            try
            {
                if (f == null)
                {
                    return c;
                }
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
        }
        break MISSING_BLOCK_LABEL_39;
        nullpointerexception;
        throw nullpointerexception;
        if (h) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = 0;
        j = 1;
_L6:
        if (k >= c.size()) goto _L4; else goto _L3
_L3:
        Object obj = (P)c.get(k);
        Object obj1 = (cW)f.get(k);
        if (obj1 != null)
        {
            try
            {
                obj1 = ((cW) (obj1)).g();
            }
            catch (NullPointerException nullpointerexception2)
            {
                throw nullpointerexception2;
            }
            if (obj1 != obj)
            {
                if (l == 0)
                {
                    break MISSING_BLOCK_LABEL_213;
                }
                j = 0;
            }
        }
        if (l == 0) goto _L5; else goto _L4
_L4:
        if (j != 0)
        {
            try
            {
                obj = c;
            }
            catch (NullPointerException nullpointerexception3)
            {
                throw nullpointerexception3;
            }
            return ((List) (obj));
        }
_L2:
        c();
        j = 0;
        do
        {
            if (j >= c.size())
            {
                break;
            }
            c.set(j, a(j, true));
            j++;
        } while (l == 0);
        c = Collections.unmodifiableList(c);
        h = false;
        return c;
_L5:
        k++;
          goto _L6
        j = 0;
          goto _L4
    }
}
