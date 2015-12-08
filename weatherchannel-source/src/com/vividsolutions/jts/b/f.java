// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.a.c;
import com.vividsolutions.jts.a.b;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.vividsolutions.jts.b:
//            e, n, l, s

public abstract class f
{

    protected Map a;
    protected List b;
    private int c[] = {
        -1, -1
    };

    public f()
    {
        a = new TreeMap();
    }

    private void a(int i)
    {
        Iterator iterator = f();
        int j = -1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            n n1 = ((e)iterator.next()).l();
            if (n1.c(i) && n1.a(i, 1) != -1)
            {
                j = n1.a(i, 1);
            }
        } while (true);
        if (j != -1)
        {
            Iterator iterator1 = f();
            while (iterator1.hasNext()) 
            {
                e e1 = (e)iterator1.next();
                n n2 = e1.l();
                if (n2.a(i, 0) == -1)
                {
                    n2.a(i, 0, j);
                }
                if (n2.c(i))
                {
                    int k = n2.a(i, 1);
                    int i1 = n2.a(i, 2);
                    if (i1 != -1)
                    {
                        if (i1 != j)
                        {
                            throw new w("side location conflict", e1.m());
                        }
                        if (k == -1)
                        {
                            com.vividsolutions.jts.a.a.a((new StringBuilder("found single null side (at ")).append(e1.m()).append(")").toString());
                        }
                        j = k;
                    } else
                    {
                        boolean flag;
                        if (n2.a(i, 1) == -1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        com.vividsolutions.jts.a.a.a(flag, "found single null side");
                        n2.a(i, 2, j);
                        n2.a(i, 1, j);
                    }
                }
            }
        }
    }

    private void a(b b1)
    {
        for (Iterator iterator = f(); iterator.hasNext(); ((e)iterator.next()).a(b1)) { }
    }

    public abstract void a(e e1);

    protected final void a(e e1, Object obj)
    {
        a.put(e1, obj);
        b = null;
    }

    public void a(l al[])
    {
        boolean aflag[];
        Iterator iterator1;
        a(al[0].d());
        a(0);
        a(1);
        aflag = new boolean[2];
        aflag;
        aflag[0] = false;
        aflag[1] = false;
        for (Iterator iterator = f(); iterator.hasNext();)
        {
            n n1 = ((e)iterator.next()).l();
            int i = 0;
            while (i < 2) 
            {
                if (n1.d(i) && n1.a(i) == 1)
                {
                    aflag[i] = true;
                }
                i++;
            }
        }

        iterator1 = f();
_L2:
        e e1;
        n n2;
        s s1;
        int j;
        int k;
        if (iterator1.hasNext())
        {
            e1 = (e)iterator1.next();
            n2 = e1.l();
            j = 0;
        } else
        {
            return;
        }
_L5:
        if (j >= 2) goto _L2; else goto _L1
_L1:
        s1 = n2.a[j];
        k = 0;
_L6:
        if (k >= s1.a.length)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        if (s1.a[k] != -1) goto _L4; else goto _L3
_L3:
        k = 1;
_L7:
        if (k != 0)
        {
            if (aflag[j])
            {
                k = 2;
            } else
            {
                Coordinate coordinate = e1.m();
                if (c[j] == -1)
                {
                    c[j] = com.vividsolutions.jts.a.a.c.a(coordinate, al[j].c());
                }
                k = c[j];
            }
            n2.d(j, k);
        }
        j++;
          goto _L5
_L4:
        k++;
          goto _L6
        k = 0;
          goto _L7
    }

    public final boolean a(l l1)
    {
        a(l1.d());
        l1 = g();
        if (l1.size() > 0)
        {
            int i = ((e)l1.get(l1.size() - 1)).l().a(0, 1);
            boolean flag;
            if (i != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, "Found unlabelled area edge");
            for (l1 = f(); l1.hasNext();)
            {
                n n1 = ((e)l1.next()).l();
                com.vividsolutions.jts.a.a.a(n1.c(0), "Found non-area edge");
                int j = n1.a(0, 1);
                for (int k = n1.a(0, 2); j == k || k != i;)
                {
                    return false;
                }

                i = j;
            }

        }
        return true;
    }

    public final int b(e e1)
    {
        f();
        for (int i = 0; i < b.size(); i++)
        {
            if ((e)b.get(i) == e1)
            {
                return i;
            }
        }

        return -1;
    }

    public final Coordinate d()
    {
        Iterator iterator = f();
        if (!iterator.hasNext())
        {
            return null;
        } else
        {
            return ((e)iterator.next()).m();
        }
    }

    public final int e()
    {
        return a.size();
    }

    public final Iterator f()
    {
        return g().iterator();
    }

    public final List g()
    {
        if (b == null)
        {
            b = new ArrayList(a.values());
        }
        return b;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder("EdgeEndStar:   ")).append(d()).toString());
        stringbuffer.append("\n");
        for (Iterator iterator = f(); iterator.hasNext(); stringbuffer.append("\n"))
        {
            stringbuffer.append((e)iterator.next());
        }

        return stringbuffer.toString();
    }
}
