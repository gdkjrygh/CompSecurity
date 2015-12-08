// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;


// Referenced classes of package com.google.zxing.common.reedsolomon:
//            a

final class b
{

    private final a a;
    private final int b[];

    b(a a1, int ai[])
    {
        int i = 1;
        super();
        if (ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        a = a1;
        int j = ai.length;
        if (j > 1 && ai[0] == 0)
        {
            for (; i < j && ai[i] == 0; i++) { }
            if (i == j)
            {
                b = a1.a().b;
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

    final b a(int i, int j)
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
            ai[i] = a.c(b[i], j);
        }

        return new b(a, ai);
    }

    final b a(b b1)
    {
        if (!a.equals(b1.a))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (b())
        {
            return b1;
        }
        if (b1.b())
        {
            return this;
        }
        Object obj = b;
        b1 = b1.b;
        int ai[];
        int j;
        if (obj.length <= b1.length)
        {
            b b2 = b1;
            b1 = ((b) (obj));
            obj = b2;
        }
        ai = new int[obj.length];
        j = obj.length - b1.length;
        System.arraycopy(obj, 0, ai, 0, j);
        for (int i = j; i < obj.length; i++)
        {
            ai[i] = com.google.zxing.common.reedsolomon.a.b(b1[i - j], obj[i]);
        }

        return new b(a, ai);
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
                i = com.google.zxing.common.reedsolomon.a.b(i, ai[k]);
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
            k = com.google.zxing.common.reedsolomon.a.b(a.c(i, k), b[i1]);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final b b(b b1)
    {
        if (!a.equals(b1.a))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (b() || b1.b())
        {
            return a.a();
        }
        int ai[] = b;
        int k = ai.length;
        b1 = b1.b;
        int l = b1.length;
        int ai1[] = new int[(k + l) - 1];
        for (int i = 0; i < k; i++)
        {
            int i1 = ai[i];
            for (int j = 0; j < l; j++)
            {
                ai1[i + j] = com.google.zxing.common.reedsolomon.a.b(ai1[i + j], a.c(i1, b1[j]));
            }

        }

        return new b(a, ai1);
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

    final b c(int i)
    {
        b b1;
        if (i == 0)
        {
            b1 = a.a();
        } else
        {
            b1 = this;
            if (i != 1)
            {
                int k = b.length;
                int ai[] = new int[k];
                for (int j = 0; j < k; j++)
                {
                    ai[j] = a.c(b[j], i);
                }

                return new b(a, ai);
            }
        }
        return b1;
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
                        j = a.b(j);
                        if (j == 0)
                        {
                            stringbuilder.append('1');
                        } else
                        if (j == 1)
                        {
                            stringbuilder.append('a');
                        } else
                        {
                            stringbuilder.append("a^");
                            stringbuilder.append(j);
                        }
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
