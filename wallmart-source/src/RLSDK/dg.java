// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            v, ak, dm, do, 
//            di

final class dg
{

    private final ak a;
    private do b;
    private dm c;

    dg(ak ak1)
        throws v
    {
        int i = ak1.b;
        if (i < 21 || (i & 3) != 1)
        {
            throw v.a();
        } else
        {
            a = ak1;
            return;
        }
    }

    private int a(int i, int j, int k)
    {
        if (a.a(i, j))
        {
            return k << 1 | 1;
        } else
        {
            return k << 1;
        }
    }

    final dm a()
        throws v
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

        int j1 = a.b;
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

        c = dm.b(k, l);
        if (c != null)
        {
            return c;
        } else
        {
            throw v.a();
        }
    }

    final do b()
        throws v
    {
        boolean flag = false;
        if (b != null)
        {
            return b;
        }
        int i1 = a.b;
        int i = i1 - 17 >> 2;
        if (i <= 6)
        {
            return RLSDK.do.b(i);
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

        b = RLSDK.do.c(j);
        if (b != null && b.d() == i1)
        {
            return b;
        }
        i = 5;
        j = ((flag) ? 1 : 0);
        for (; i >= 0; i--)
        {
            for (int l = i1 - 9; l >= j1; l--)
            {
                j = a(i, l, j);
            }

        }

        b = RLSDK.do.c(j);
        if (b != null && b.d() == i1)
        {
            return b;
        } else
        {
            throw v.a();
        }
    }

    final byte[] c()
        throws v
    {
        Object obj = a();
        do do1 = b();
        obj = di.a(((dm) (obj)).b());
        int k2 = a.b;
        ((di) (obj)).a(a, k2);
        obj = do1.e();
        byte abyte0[] = new byte[do1.c()];
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
                    if (!((ak) (obj)).a(i1 - k1, j1))
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

        if (l1 != do1.c())
        {
            throw v.a();
        } else
        {
            return abyte0;
        }
    }
}
