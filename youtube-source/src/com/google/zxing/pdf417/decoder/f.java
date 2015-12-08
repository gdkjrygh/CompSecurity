// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

// Referenced classes of package com.google.zxing.pdf417.decoder:
//            a, g, d, h, 
//            c

final class f
{

    private final a a;
    private final g b[];
    private c c;
    private final int d;

    f(a a1, c c1)
    {
        a = a1;
        d = a1.a();
        c = c1;
        b = new g[d + 2];
    }

    private static int a(int i, int j, d d1)
    {
        while (d1 == null || d1.a()) 
        {
            return j;
        }
        if (d1.a(i))
        {
            d1.b(i);
            return 0;
        } else
        {
            return j + 1;
        }
    }

    private void a(g g1)
    {
        if (g1 != null)
        {
            ((h)g1).a(a);
        }
    }

    final g a(int i)
    {
        return b[i];
    }

    final void a(int i, g g1)
    {
        b[i] = g1;
    }

    public final void a(c c1)
    {
        c = c1;
    }

    final g[] a()
    {
        int j;
        a(b[0]);
        a(b[d + 1]);
        j = 928;
_L12:
        int k;
        int k1;
        if (b[0] != null && b[d + 1] != null)
        {
            d ad[] = b[0].b();
            d ad2[] = b[d + 1].b();
            i = 0;
            while (i < ad.length) 
            {
                if (ad[i] != null && ad2[i] != null && ad[i].h() == ad2[i].h())
                {
                    for (k = 1; k <= d; k++)
                    {
                        d d2 = b[k].b()[i];
                        if (d2 == null)
                        {
                            continue;
                        }
                        d2.b(ad[i].h());
                        if (!d2.a())
                        {
                            b[k].b()[i] = null;
                        }
                    }

                }
                i++;
            }
        }
        if (b[0] != null) goto _L2; else goto _L1
_L1:
        k = 0;
_L6:
        if (b[d + 1] != null) goto _L4; else goto _L3
_L3:
        k1 = 0;
_L9:
        int l1 = k + k1;
        d ad1[];
        d d1;
        int i;
        int i1;
        int i2;
        int k2;
        int l2;
        if (l1 == 0)
        {
            i = 0;
        } else
        {
            i = 1;
            while (i < d + 1) 
            {
                d ad4[] = b[i].b();
label0:
                for (int l = 0; l < ad4.length; l++)
                {
                    if (ad4[l] == null || ad4[l].a())
                    {
                        continue;
                    }
                    d d3 = ad4[l];
                    d ad3[] = b[i - 1].b();
                    Object obj;
                    d ad5[];
                    int j1;
                    int j2;
                    if (b[i + 1] != null)
                    {
                        obj = b[i + 1].b();
                    } else
                    {
                        obj = ad3;
                    }
                    ad5 = new d[14];
                    ad5[2] = ad3[l];
                    ad5[3] = obj[l];
                    if (l > 0)
                    {
                        ad5[0] = ad4[l - 1];
                        ad5[4] = ad3[l - 1];
                        ad5[5] = obj[l - 1];
                    }
                    if (l > 1)
                    {
                        ad5[8] = ad4[l - 2];
                        ad5[10] = ad3[l - 2];
                        ad5[11] = obj[l - 2];
                    }
                    if (l < ad4.length - 1)
                    {
                        ad5[1] = ad4[l + 1];
                        ad5[6] = ad3[l + 1];
                        ad5[7] = obj[l + 1];
                    }
                    if (l < ad4.length - 2)
                    {
                        ad5[9] = ad4[l + 2];
                        ad5[12] = ad3[l + 2];
                        ad5[13] = obj[l + 2];
                    }
                    j2 = ad5.length;
                    j1 = 0;
                    do
                    {
                        if (j1 >= j2)
                        {
                            continue label0;
                        }
                        obj = ad5[j1];
                        boolean flag;
                        if (obj != null && ((d) (obj)).a() && ((d) (obj)).f() == d3.f())
                        {
                            d3.b(((d) (obj)).h());
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            continue label0;
                        }
                        j1++;
                    } while (true);
                }

                i++;
            }
            i = l1;
        }
        if (i <= 0 || i >= j)
        {
            return b;
        }
        break MISSING_BLOCK_LABEL_975;
_L2:
        ad1 = b[0].b();
        i1 = 0;
        i = 0;
_L7:
        k = i;
        if (i1 >= ad1.length) goto _L6; else goto _L5
_L5:
        k = i;
        if (ad1[i1] != null)
        {
            k2 = ad1[i1].h();
            l1 = 0;
            for (k1 = 1; k1 < d + 1 && l1 < 2; l1 = k)
            {
                d1 = b[k1].b()[i1];
                i2 = i;
                k = l1;
                if (d1 != null)
                {
                    l1 = a(k2, l1, d1);
                    i2 = i;
                    k = l1;
                    if (!d1.a())
                    {
                        i2 = i + 1;
                        k = l1;
                    }
                }
                k1++;
                i = i2;
            }

            k = i;
        }
        i1++;
        i = k;
          goto _L7
          goto _L6
_L4:
        ad1 = b[d + 1].b();
        i1 = 0;
        i = 0;
_L10:
        k1 = i;
        if (i1 >= ad1.length) goto _L9; else goto _L8
_L8:
        i2 = i;
        if (ad1[i1] != null)
        {
            l2 = ad1[i1].h();
            k1 = d + 1;
            l1 = 0;
            do
            {
                i2 = i;
                if (k1 <= 0)
                {
                    break;
                }
                i2 = i;
                if (l1 >= 2)
                {
                    break;
                }
                d1 = b[k1].b()[i1];
                k2 = i;
                i2 = l1;
                if (d1 != null)
                {
                    l1 = a(l2, l1, d1);
                    k2 = i;
                    i2 = l1;
                    if (!d1.a())
                    {
                        k2 = i + 1;
                        i2 = l1;
                    }
                }
                k1--;
                i = k2;
                l1 = i2;
            } while (true);
        }
        i1++;
        i = i2;
          goto _L10
          goto _L9
        j = i;
        if (true) goto _L12; else goto _L11
_L11:
    }

    final int b()
    {
        return d;
    }

    final int c()
    {
        return a.c();
    }

    final int d()
    {
        return a.b();
    }

    final c e()
    {
        return c;
    }

    public final String toString()
    {
        Object obj1 = b[0];
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = b[d + 1];
        }
        obj1 = new Formatter();
        for (int i = 0; i < ((g) (obj)).b().length; i++)
        {
            ((Formatter) (obj1)).format("CW %3d:", new Object[] {
                Integer.valueOf(i)
            });
            int j = 0;
            while (j < d + 2) 
            {
                if (b[j] == null)
                {
                    ((Formatter) (obj1)).format("    |   ", new Object[0]);
                } else
                {
                    d d1 = b[j].b()[i];
                    if (d1 == null)
                    {
                        ((Formatter) (obj1)).format("    |   ", new Object[0]);
                    } else
                    {
                        ((Formatter) (obj1)).format(" %3d|%3d", new Object[] {
                            Integer.valueOf(d1.h()), Integer.valueOf(d1.g())
                        });
                    }
                }
                j++;
            }
            ((Formatter) (obj1)).format("\n", new Object[0]);
        }

        obj = ((Formatter) (obj1)).toString();
        ((Formatter) (obj1)).close();
        return ((String) (obj));
    }
}
