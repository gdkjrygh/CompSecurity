// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.a.c.b.b.a.j;
import org.a.c.b.b.b.f;

// Referenced classes of package org.a.c.b.b.c:
//            o, k, j, a, 
//            h

class n
    implements j
{

    public final int a;
    public final h b;
    public final Map c;
    private List d;
    private List e;

    public n(int i, h h, Map map)
    {
        d = new ArrayList();
        e = new ArrayList();
        a = i;
        b = h;
        c = map;
    }

    public final void a(int i)
    {
        int l;
        l = 0;
        do
        {
            if (l >= d.size())
            {
                l = 0;
                break MISSING_BLOCK_LABEL_20;
            }
            o o1 = (o)d.get(l);
            byte abyte0[] = G_.a(new int[] {
                o1.a.d()
            }, i);
            o1.b.a(abyte0);
            l++;
        } while (true);
_L2:
        a a1;
        int i1;
        if (l >= e.size())
        {
            return;
        }
        a1 = (a)e.get(l);
        i1 = 0;
_L3:
label0:
        {
            if (i1 < a1.c.length)
            {
                break label0;
            }
            a1.b.a(G_.a(a1.a, i));
            l++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        k k1 = a1.c[i1];
        a1.a[i1] = k1.d();
        i1++;
          goto _L3
    }

    public final void a(k k1, org.a.c.b.b.c.j j1)
    {
        d.add(new o(k1, j1));
    }
}
