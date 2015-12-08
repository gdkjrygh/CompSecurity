// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;


// Referenced classes of package com.google.zxing.common.reedsolomon:
//            b, a, ReedSolomonException

public final class c
{

    private final a a;

    public c(a a1)
    {
        a = a1;
    }

    private int[] a(b b1)
    {
        int j = 0;
        int i = 1;
        int l = b1.a();
        if (l == 1)
        {
            return (new int[] {
                b1.a(1)
            });
        }
        int ai[] = new int[l];
        int k;
        for (; i < a.c() && j < l; j = k)
        {
            k = j;
            if (b1.b(i) == 0)
            {
                ai[j] = a.c(i);
                k = j + 1;
            }
            i++;
        }

        if (j != l)
        {
            throw new ReedSolomonException("Error locator degree does not match number of roots");
        } else
        {
            return ai;
        }
    }

    private int[] a(b b1, int ai[])
    {
        int i1 = ai.length;
        int ai1[] = new int[i1];
        for (int j = 0; j < i1; j++)
        {
            int j1 = a.c(ai[j]);
            int i = 1;
            int k = 0;
            while (k < i1) 
            {
                if (j != k)
                {
                    int l = a.c(ai[k], j1);
                    if ((l & 1) == 0)
                    {
                        l |= 1;
                    } else
                    {
                        l &= -2;
                    }
                    i = a.c(i, l);
                }
                k++;
            }
            ai1[j] = a.c(b1.b(j1), a.c(i));
            if (a.d() != 0)
            {
                ai1[j] = a.c(ai1[j], j1);
            }
        }

        return ai1;
    }

    public final void a(int ai[], int i)
    {
        boolean flag1 = false;
        b b1 = new b(a, ai);
        int ai1[] = new int[i];
        int j = 0;
        boolean flag = true;
        for (; j < i; j++)
        {
            int j1 = b1.b(a.a(a.d() + j));
            ai1[ai1.length - 1 - j] = j1;
            if (j1 != 0)
            {
                flag = false;
            }
        }

        if (!flag)
        {
            b b2 = new b(a, ai1);
            b b3 = a.a(i, 1);
            Object aobj[];
            Object obj;
            b b4;
            b b5;
            if (b3.a() < b2.a())
            {
                obj = b2;
                b2 = b3;
            } else
            {
                obj = b3;
            }
            b4 = a.a();
            b5 = a.b();
            b3 = ((b) (obj));
            obj = b5;
            b b6;
            for (; b2.a() >= i / 2; b2 = b6)
            {
                if (b2.b())
                {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
                b6 = a.a();
                int k = b2.a(b2.a());
                k = a.c(k);
                int i1;
                int k1;
                for (; b3.a() >= b2.a() && !b3.b(); b3 = b3.a(b2.a(i1, k1)))
                {
                    i1 = b3.a() - b2.a();
                    k1 = a.c(b3.a(b3.a()), k);
                    b6 = b6.a(a.a(i1, k1));
                }

                b6 = b6.b(((b) (obj))).a(b4);
                if (b3.a() >= b2.a())
                {
                    throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                }
                b4 = ((b) (obj));
                obj = b6;
                b6 = b3;
                b3 = b2;
            }

            i = ((b) (obj)).a(0);
            if (i == 0)
            {
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
            i = a.c(i);
            obj = ((b) (obj)).c(i);
            b3 = b2.c(i);
            aobj = new b[2];
            aobj[0] = ((b) (obj));
            aobj[1] = b3;
            obj = aobj[0];
            aobj = aobj[1];
            obj = a(((b) (obj)));
            aobj = a(((b) (aobj)), ((int []) (obj)));
            i = ((flag1) ? 1 : 0);
            while (i < obj.length) 
            {
                int l = ai.length - 1 - a.b(obj[i]);
                if (l < 0)
                {
                    throw new ReedSolomonException("Bad error location");
                }
                ai[l] = com.google.zxing.common.reedsolomon.a.b(ai[l], aobj[i]);
                i++;
            }
        }
    }
}
