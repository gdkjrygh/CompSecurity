// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.b:
//            f, b, n, e, 
//            d, k, l

public final class c extends f
{

    private List c;
    private n d;

    public c()
    {
    }

    private int a(int i, int j, int k)
    {
        for (; i < j; i++)
        {
            b b1 = (b)b.get(i);
            b1.l();
            b1.b(2, k);
            k = b1.a(1);
        }

        return k;
    }

    public final n a()
    {
        return d;
    }

    public final void a(b b1)
    {
        int i = b(b1);
        b1.l();
        int j = b1.a(1);
        int k = b1.a(2);
        if (a(0, i, a(i + 1, b.size(), j)) != k)
        {
            throw new w((new StringBuilder("depth mismatch at ")).append(b1.m()).toString());
        } else
        {
            return;
        }
    }

    public final void a(e e1)
    {
        e1 = (b)e1;
        a(e1, e1);
    }

    public final void a(k k)
    {
        b b1;
        b b3;
        int i;
        int j;
        boolean flag1;
        b1 = null;
        flag1 = true;
        j = c.size() - 1;
        i = 1;
        b3 = null;
_L2:
        b b2;
        b b4;
        b b5;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        b4 = (b)c.get(j);
        b5 = b4.f();
        b2 = b3;
        if (b3 == null)
        {
            b2 = b3;
            if (b4.d() == k)
            {
                b2 = b4;
            }
        }
        switch (i)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_130;
_L3:
        j--;
        b3 = b2;
        if (true) goto _L2; else goto _L1
_L1:
        if (b5.d() == k)
        {
            i = 2;
            b1 = b5;
        }
          goto _L3
        if (b4.d() == k)
        {
            b1.c(b4);
            i = 1;
        }
          goto _L3
        if (i == 2)
        {
            boolean flag;
            if (b3 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, "found null for first outgoing dirEdge");
            if (b3.d() == k)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            com.vividsolutions.jts.a.a.a(flag, "unable to link last incoming dirEdge");
            b1.c(b3);
        }
        return;
    }

    public final void a(n n1)
    {
        n n2;
        for (Iterator iterator = f(); iterator.hasNext(); n2.d(1, n1.a(1)))
        {
            n2 = ((b)iterator.next()).l();
            n2.d(0, n1.a(0));
        }

    }

    public final void a(l al[])
    {
        super.a(al);
        d = new n(-1);
        for (al = f(); al.hasNext();)
        {
            n n1 = ((e)al.next()).a().m();
            int i = 0;
            while (i < 2) 
            {
                int j = n1.a(i);
                if (j == 0 || j == 1)
                {
                    d.b(i, 0);
                }
                i++;
            }
        }

    }

    public final void b()
    {
        b b1;
        for (Iterator iterator = f(); iterator.hasNext(); b1.l().b(b1.f().l()))
        {
            b1 = (b)iterator.next();
        }

    }

    public final void c()
    {
        b b2;
        b b4;
        int i;
        int j;
        b2 = null;
        if (c == null)
        {
            c = new ArrayList();
            Iterator iterator = f();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                b b3 = (b)iterator.next();
                if (b3.b() || b3.f().b())
                {
                    c.add(b3);
                }
            } while (true);
        }
        List list = c;
        j = 0;
        i = 1;
        b4 = null;
_L10:
        b b5;
        b b6;
        b b7;
        if (j >= c.size())
        {
            break MISSING_BLOCK_LABEL_260;
        }
        b6 = (b)c.get(j);
        b7 = b6.f();
        b5 = b4;
        if (!b6.l().c()) goto _L2; else goto _L1
_L1:
        b b1;
        b1 = b4;
        if (b4 == null)
        {
            b1 = b4;
            if (b6.b())
            {
                b1 = b6;
            }
        }
        i;
        JVM INSTR tableswitch 1 2: default 184
    //                   1 205
    //                   2 231;
           goto _L3 _L4 _L5
_L3:
        b5 = b1;
_L2:
        b1 = b2;
        b2 = b5;
_L7:
        j++;
        b4 = b2;
        b2 = b1;
        continue; /* Loop/switch isn't completed */
_L4:
        b5 = b1;
        if (!b7.b()) goto _L2; else goto _L6
_L6:
        i = 2;
        b2 = b7;
        b4 = b1;
        b1 = b2;
        b2 = b4;
          goto _L7
_L5:
        b5 = b1;
        if (!b6.b()) goto _L2; else goto _L8
_L8:
        b2.b(b6);
        i = 1;
        b4 = b1;
        b1 = b2;
        b2 = b4;
          goto _L7
        if (i == 2)
        {
            if (b4 == null)
            {
                throw new w("no outgoing dirEdge found", d());
            }
            com.vividsolutions.jts.a.a.a(b4.b(), "unable to link last incoming dirEdge");
            b2.b(b4);
        }
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
