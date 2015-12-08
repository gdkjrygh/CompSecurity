// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            c, d

class g
{

    private final c a;
    private final d b[];

    g(c c1)
    {
        a = new c(c1);
        b = new d[(c1.d() - c1.c()) + 1];
    }

    final c a()
    {
        return a;
    }

    final d a(int i)
    {
        d d1 = c(i);
        if (d1 == null) goto _L2; else goto _L1
_L1:
        return d1;
_L2:
        int j = 1;
_L7:
        if (j >= 5) goto _L4; else goto _L3
_L3:
        d d2;
        int k = b(i) - j;
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        d2 = b[k];
        d1 = d2;
        if (d2 != null) goto _L1; else goto _L5
_L5:
        int l = b(i) + j;
        if (l >= b.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        d2 = b[l];
        d1 = d2;
        if (d2 != null) goto _L1; else goto _L6
_L6:
        j++;
          goto _L7
_L4:
        return null;
    }

    final void a(int i, d d1)
    {
        b[b(i)] = d1;
    }

    final int b(int i)
    {
        return i - a.c();
    }

    final d[] b()
    {
        return b;
    }

    final d c(int i)
    {
        return b[b(i)];
    }

    public String toString()
    {
        Formatter formatter = new Formatter();
        d ad[] = b;
        int i1 = ad.length;
        int j = 0;
        int i = 0;
        while (j < i1) 
        {
            d d1 = ad[j];
            if (d1 == null)
            {
                int k = i + 1;
                formatter.format("%3d:    |   \n", new Object[] {
                    Integer.valueOf(i)
                });
                i = k;
            } else
            {
                int l = i + 1;
                formatter.format("%3d: %3d|%3d\n", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(d1.h()), Integer.valueOf(d1.g())
                });
                i = l;
            }
            j++;
        }
        String s = formatter.toString();
        formatter.close();
        return s;
    }
}
