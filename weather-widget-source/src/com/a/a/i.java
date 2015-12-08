// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            b, d, j, h, 
//            a

class i
    implements b
{

    private d a;
    private j b;
    private int c;

    public i(d d1, j j1, int k)
    {
        a = d1;
        b = j1;
        c = k;
    }

    private void e(a a1)
    {
        if (!a.b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        int l;
        l = b.c.size();
        k = 0;
_L5:
        h h1;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        h1 = (h)b.c.get(k);
        if (h1.b != c || h1.a.a != a1) goto _L4; else goto _L3
_L3:
        a1.b(this);
        a1 = h1;
_L6:
        b.c.remove(a1);
        if (b.c.size() == 0)
        {
            b.a.a();
            com.a.a.d.a(a).add(b.a);
            return;
        }
          goto _L1
_L4:
        k++;
          goto _L5
        a1 = null;
          goto _L6
    }

    public void a(a a1)
    {
        if (c == 0)
        {
            e(a1);
        }
    }

    public void b(a a1)
    {
    }

    public void c(a a1)
    {
        if (c == 1)
        {
            e(a1);
        }
    }

    public void d(a a1)
    {
    }
}
