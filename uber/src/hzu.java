// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class hzu extends hzi
{

    final transient byte f[][];
    final transient int g[];

    hzu(hzf hzf1, int i)
    {
        boolean flag = false;
        super(null);
        hzy.a(hzf1.b, 0L, i);
        hzs hzs1 = hzf1.a;
        int j = 0;
        for (int k = 0; k < i;)
        {
            if (hzs1.c == hzs1.b)
            {
                throw new AssertionError("s.limit == s.pos");
            }
            k += hzs1.c - hzs1.b;
            j++;
            hzs1 = hzs1.f;
        }

        f = new byte[j][];
        g = new int[j * 2];
        hzf1 = hzf1.a;
        j = 0;
        for (int l = ((flag) ? 1 : 0); l < i;)
        {
            f[j] = ((hzs) (hzf1)).a;
            l += ((hzs) (hzf1)).c - ((hzs) (hzf1)).b;
            g[j] = l;
            g[f.length + j] = ((hzs) (hzf1)).b;
            hzf1.d = true;
            j++;
            hzf1 = ((hzs) (hzf1)).f;
        }

    }

    private int b(int i)
    {
        i = Arrays.binarySearch(g, 0, f.length, i + 1);
        if (i >= 0)
        {
            return i;
        } else
        {
            return ~i;
        }
    }

    private hzi h()
    {
        return new hzi(g());
    }

    private Object writeReplace()
    {
        return h();
    }

    public final byte a(int i)
    {
        hzy.a(g[f.length - 1], i, 1L);
        int k = b(i);
        int j;
        int l;
        if (k == 0)
        {
            j = 0;
        } else
        {
            j = g[k - 1];
        }
        l = g[f.length + k];
        return f[k][(i - j) + l];
    }

    public final String a()
    {
        return h().a();
    }

    final void a(hzf hzf1)
    {
        int i = 0;
        int l = f.length;
        int j = 0;
        while (i < l) 
        {
            int i1 = g[l + i];
            int k = g[i];
            hzs hzs1 = new hzs(f[i], i1, (i1 + k) - j);
            if (hzf1.a == null)
            {
                hzs1.g = hzs1;
                hzs1.f = hzs1;
                hzf1.a = hzs1;
            } else
            {
                hzf1.a.g.a(hzs1);
            }
            i++;
            j = k;
        }
        long l1 = hzf1.b;
        hzf1.b = (long)j + l1;
    }

    public final boolean a(int i, hzi hzi1, int j, int k)
    {
        if (f() - k >= 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = b(0);
        int l = i;
        i = i1;
        do
        {
label0:
            {
                if (k <= 0)
                {
                    break label0;
                }
                int j1;
                int k1;
                int l1;
                if (i == 0)
                {
                    j1 = 0;
                } else
                {
                    j1 = g[i - 1];
                }
                k1 = Math.min(k, ((g[i] - j1) + j1) - l);
                l1 = g[f.length + i];
                if (!hzi1.a(j, f[i], (l - j1) + l1, k1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                l += k1;
                j += k1;
                k -= k1;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final boolean a(int i, byte abyte0[], int j, int k)
    {
        if (i <= f() - k && j <= abyte0.length - k) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = b(i);
        int l = i;
        i = i1;
        do
        {
label0:
            {
                if (k <= 0)
                {
                    break label0;
                }
                int j1;
                int k1;
                int l1;
                if (i == 0)
                {
                    j1 = 0;
                } else
                {
                    j1 = g[i - 1];
                }
                k1 = Math.min(k, ((g[i] - j1) + j1) - l);
                l1 = g[f.length + i];
                if (!hzy.a(f[i], (l - j1) + l1, abyte0, j, k1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                l += k1;
                j += k1;
                k -= k1;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final String b()
    {
        return h().b();
    }

    public final hzi c()
    {
        return h().c();
    }

    public final String d()
    {
        return h().d();
    }

    public final hzi e()
    {
        return h().e();
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        return (obj instanceof hzi) && ((hzi)obj).f() == f() && a(0, (hzi)obj, 0, f());
    }

    public final int f()
    {
        return g[f.length - 1];
    }

    public final byte[] g()
    {
        int i = 0;
        byte abyte0[] = new byte[g[f.length - 1]];
        int l = f.length;
        int k;
        for (int j = 0; i < l; j = k)
        {
            int i1 = g[l + i];
            k = g[i];
            System.arraycopy(f[i], i1, abyte0, j, k - j);
            i++;
        }

        return abyte0;
    }

    public final int hashCode()
    {
        int i = d;
        if (i != 0)
        {
            return i;
        }
        i = 1;
        int k1 = f.length;
        int j = 0;
        int i1;
        for (int k = 0; j < k1; k = i1)
        {
            byte abyte0[] = f[j];
            int j1 = g[k1 + j];
            i1 = g[j];
            for (int l = j1; l < (i1 - k) + j1; l++)
            {
                i = i * 31 + abyte0[l];
            }

            j++;
        }

        d = i;
        return i;
    }

    public final String toString()
    {
        return h().toString();
    }
}
