// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder.a;


// Referenced classes of package com.google.zxing.pdf417.decoder.a:
//            b

final class c
{

    private final b a;
    private final int b[];

    c(b b1, int ai[])
    {
        int i = 1;
        super();
        if (ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        a = b1;
        int j = ai.length;
        if (j > 1 && ai[0] == 0)
        {
            for (; i < j && ai[i] == 0; i++) { }
            if (i == j)
            {
                b = b1.a().b;
                return;
            } else
            {
                b = new int[j - i];
                System.arraycopy(ai, i, b, 0, b.length);
                return;
            }
        } else
        {
            b = ai;
            return;
        }
    }

    final int a()
    {
        return b.length - 1;
    }

    final int a(int i)
    {
        return b[b.length - 1 - i];
    }

    final c a(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j == 0)
        {
            return a.a();
        }
        int k = b.length;
        int ai[] = new int[k + i];
        for (i = 0; i < k; i++)
        {
            ai[i] = a.d(b[i], j);
        }

        return new c(a, ai);
    }

    final c a(c c1)
    {
        if (!a.equals(c1.a))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b())
        {
            return c1;
        }
        if (c1.b())
        {
            return this;
        }
        Object obj = b;
        c1 = c1.b;
        int ai[];
        int j;
        if (obj.length <= c1.length)
        {
            c c2 = c1;
            c1 = ((c) (obj));
            obj = c2;
        }
        ai = new int[obj.length];
        j = obj.length - c1.length;
        System.arraycopy(obj, 0, ai, 0, j);
        for (int i = j; i < obj.length; i++)
        {
            ai[i] = a.b(c1[i - j], obj[i]);
        }

        return new c(a, ai);
    }

    final int b(int i)
    {
        int k = 0;
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = a(0);
_L4:
        return j;
_L2:
        int j1 = b.length;
        if (i == 1)
        {
            int ai[] = b;
            int l = ai.length;
            i = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    continue;
                }
                j = ai[k];
                i = a.b(i, j);
                k++;
            } while (true);
        }
        k = b[0];
        int i1 = 1;
        do
        {
            j = k;
            if (i1 >= j1)
            {
                continue;
            }
            k = a.b(a.d(i, k), b[i1]);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final c b(c c1)
    {
        if (!a.equals(c1.a))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (c1.b())
        {
            return this;
        } else
        {
            return a(c1.c());
        }
    }

    final boolean b()
    {
        boolean flag = false;
        if (b[0] == 0)
        {
            flag = true;
        }
        return flag;
    }

    final c c()
    {
        int j = b.length;
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = a.c(0, b[i]);
        }

        return new c(a, ai);
    }

    final c c(int i)
    {
        c c1;
        if (i == 0)
        {
            c1 = a.a();
        } else
        {
            c1 = this;
            if (i != 1)
            {
                int k = b.length;
                int ai[] = new int[k];
                for (int j = 0; j < k; j++)
                {
                    ai[j] = a.d(b[j], i);
                }

                return new c(a, ai);
            }
        }
        return c1;
    }

    final c c(c c1)
    {
        if (!a.equals(c1.a))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b() || c1.b())
        {
            return a.a();
        }
        int ai[] = b;
        int k = ai.length;
        c1 = c1.b;
        int l = c1.length;
        int ai1[] = new int[(k + l) - 1];
        for (int i = 0; i < k; i++)
        {
            int i1 = ai[i];
            for (int j = 0; j < l; j++)
            {
                ai1[i + j] = a.b(ai1[i + j], a.d(i1, c1[j]));
            }

        }

        return new c(a, ai1);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((b.length - 1) * 8);
        int i = b.length - 1;
        do
        {
            if (i >= 0)
            {
                int k = a(i);
                if (k != 0)
                {
                    int j;
                    if (k < 0)
                    {
                        stringbuilder.append(" - ");
                        j = -k;
                    } else
                    {
                        j = k;
                        if (stringbuilder.length() > 0)
                        {
                            stringbuilder.append(" + ");
                            j = k;
                        }
                    }
                    if (i == 0 || j != 1)
                    {
                        stringbuilder.append(j);
                    }
                    if (i != 0)
                    {
                        if (i == 1)
                        {
                            stringbuilder.append('x');
                        } else
                        {
                            stringbuilder.append("x^");
                            stringbuilder.append(i);
                        }
                    }
                }
                i--;
                continue;
            }
            return stringbuilder.toString();
        } while (true);
    }
}
