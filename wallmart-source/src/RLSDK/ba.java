// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            az

final class ba
{

    private final az a;
    private final int b[];

    ba(az az1, int ai[])
    {
        int i = 1;
        super();
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        a = az1;
        int j = ai.length;
        if (j > 1 && ai[0] == 0)
        {
            for (; i < j && ai[i] == 0; i++) { }
            if (i == j)
            {
                b = az1.a().b;
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

    final ba a(int i, int j)
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

        return new ba(a, ai);
    }

    final ba a(ba ba1)
    {
        if (!a.equals(ba1.a))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (b())
        {
            return ba1;
        }
        if (ba1.b())
        {
            return this;
        }
        Object obj = b;
        ba1 = ba1.b;
        int ai[];
        int j;
        if (obj.length <= ba1.length)
        {
            ba ba2 = ba1;
            ba1 = ((ba) (obj));
            obj = ba2;
        }
        ai = new int[obj.length];
        j = obj.length - ba1.length;
        System.arraycopy(obj, 0, ai, 0, j);
        for (int i = j; i < obj.length; i++)
        {
            ai[i] = az.b(ba1[i - j], obj[i]);
        }

        return new ba(a, ai);
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
        int i1 = b.length;
        if (i == 1)
        {
            i = 0;
            do
            {
                j = i;
                if (k >= i1)
                {
                    continue;
                }
                i = az.b(i, b[k]);
                k++;
            } while (true);
        }
        k = b[0];
        int l = 1;
        do
        {
            j = k;
            if (l >= i1)
            {
                continue;
            }
            k = az.b(a.c(i, k), b[l]);
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final ba b(ba ba1)
    {
        if (!a.equals(ba1.a))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (b() || ba1.b())
        {
            return a.a();
        }
        int ai[] = b;
        int k = ai.length;
        ba1 = ba1.b;
        int l = ba1.length;
        int ai1[] = new int[(k + l) - 1];
        for (int i = 0; i < k; i++)
        {
            int i1 = ai[i];
            for (int j = 0; j < l; j++)
            {
                ai1[i + j] = az.b(ai1[i + j], a.c(i1, ba1[j]));
            }

        }

        return new ba(a, ai1);
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

    final ba c(int i)
    {
        ba ba1;
        if (i == 0)
        {
            ba1 = a.a();
        } else
        {
            ba1 = this;
            if (i != 1)
            {
                int k = b.length;
                int ai[] = new int[k];
                for (int j = 0; j < k; j++)
                {
                    ai[j] = a.c(b[j], i);
                }

                return new ba(a, ai);
            }
        }
        return ba1;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer((b.length - 1) * 8);
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
                        stringbuffer.append(" - ");
                        j = -k;
                    } else
                    {
                        j = k;
                        if (stringbuffer.length() > 0)
                        {
                            stringbuffer.append(" + ");
                            j = k;
                        }
                    }
                    if (i == 0 || j != 1)
                    {
                        j = a.b(j);
                        if (j == 0)
                        {
                            stringbuffer.append('1');
                        } else
                        if (j == 1)
                        {
                            stringbuffer.append('a');
                        } else
                        {
                            stringbuffer.append("a^");
                            stringbuffer.append(j);
                        }
                    }
                    if (i != 0)
                    {
                        if (i == 1)
                        {
                            stringbuffer.append('x');
                        } else
                        {
                            stringbuffer.append("x^");
                            stringbuffer.append(i);
                        }
                    }
                }
                i--;
                continue;
            }
            return stringbuffer.toString();
        } while (true);
    }
}
