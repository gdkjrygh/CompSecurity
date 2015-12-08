// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            n, p, c

final class a
{

    private final b a;
    private p b;
    private n c;
    private boolean d;

    a(b b1)
    {
        int i = b1.e();
        if (i < 21 || (i & 3) != 1)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            a = b1;
            return;
        }
    }

    private int a(int i, int j, int k)
    {
        boolean flag;
        if (d)
        {
            flag = a.a(j, i);
        } else
        {
            flag = a.a(i, j);
        }
        if (flag)
        {
            return k << 1 | 1;
        } else
        {
            return k << 1;
        }
    }

    final n a()
    {
        int l = 0;
        if (c != null)
        {
            return c;
        }
        int i = 0;
        int k = 0;
        for (; i < 6; i++)
        {
            k = a(i, 8, k);
        }

        k = a(8, 7, a(8, 8, a(7, 8, k)));
        for (i = 5; i >= 0; i--)
        {
            k = a(8, i, k);
        }

        int j1 = a.e();
        int i1 = j1 - 1;
        i = l;
        for (l = i1; l >= j1 - 7; l--)
        {
            i = a(8, l, i);
        }

        i1 = j1 - 8;
        l = i;
        for (int j = i1; j < j1; j++)
        {
            l = a(j, 8, l);
        }

        c = com.google.zxing.qrcode.decoder.n.b(k, l);
        if (c != null)
        {
            return c;
        } else
        {
            throw FormatException.getFormatInstance();
        }
    }

    final void a(boolean flag)
    {
        b = null;
        c = null;
        d = true;
    }

    final p b()
    {
        if (b != null)
        {
            return b;
        }
        int i1 = a.e();
        int i = i1 - 17 >> 2;
        if (i <= 6)
        {
            return com.google.zxing.qrcode.decoder.p.b(i);
        }
        int j1 = i1 - 11;
        i = 5;
        int j = 0;
        for (; i >= 0; i--)
        {
            for (int k = i1 - 9; k >= j1; k--)
            {
                j = a(k, i, j);
            }

        }

        p p1 = p.c(j);
        if (p1 != null && p1.d() == i1)
        {
            b = p1;
            return p1;
        }
        i = 5;
        j = 0;
        for (; i >= 0; i--)
        {
            for (int l = i1 - 9; l >= j1; l--)
            {
                j = a(i, l, j);
            }

        }

        p1 = p.c(j);
        if (p1 != null && p1.d() == i1)
        {
            b = p1;
            return p1;
        } else
        {
            throw FormatException.getFormatInstance();
        }
    }

    final byte[] c()
    {
        Object obj = a();
        p p1 = b();
        obj = com.google.zxing.qrcode.decoder.c.a(((n) (obj)).b());
        int k2 = a.e();
        ((c) (obj)).a(a, k2);
        obj = p1.e();
        byte abyte0[] = new byte[p1.c()];
        int i = k2 - 1;
        int j = 0;
        int k = 0;
        int l1 = 0;
        for (boolean flag = true; i > 0; flag ^= true)
        {
            int i1 = i;
            if (i == 6)
            {
                i1 = i - 1;
            }
            for (i = 0; i < k2;)
            {
                int l;
                int j1;
                int k1;
                int j2;
                if (flag)
                {
                    j1 = k2 - 1 - i;
                } else
                {
                    j1 = i;
                }
                k1 = 0;
                l = k;
                j2 = j;
                while (k1 < 2) 
                {
                    k = j2;
                    j = l;
                    int i2 = l1;
                    if (!((b) (obj)).a(i1 - k1, j1))
                    {
                        j2++;
                        j = l << 1;
                        l = j;
                        if (a.a(i1 - k1, j1))
                        {
                            l = j | 1;
                        }
                        k = j2;
                        j = l;
                        i2 = l1;
                        if (j2 == 8)
                        {
                            abyte0[l1] = (byte)l;
                            j = 0;
                            i2 = l1 + 1;
                            k = 0;
                        }
                    }
                    k1++;
                    j2 = k;
                    l = j;
                    l1 = i2;
                }
                i++;
                j = j2;
                k = l;
            }

            i = i1 - 2;
        }

        if (l1 != p1.c())
        {
            throw FormatException.getFormatInstance();
        } else
        {
            return abyte0;
        }
    }

    final void d()
    {
        if (c == null)
        {
            return;
        } else
        {
            c c1 = com.google.zxing.qrcode.decoder.c.a(c.b());
            int i = a.e();
            c1.a(a, i);
            return;
        }
    }

    final void e()
    {
        for (int i = 0; i < a.d(); i++)
        {
            for (int j = i + 1; j < a.e(); j++)
            {
                if (a.a(i, j) != a.a(j, i))
                {
                    a.c(j, i);
                    a.c(i, j);
                }
            }

        }

    }
}
