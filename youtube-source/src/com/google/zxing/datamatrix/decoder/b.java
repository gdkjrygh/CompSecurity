// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            e, g, f

final class b
{

    private final int a;
    private final byte b[];

    private b(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    static b[] a(byte abyte0[], e e1)
    {
        g g1 = e1.g();
        f af[] = g1.b();
        int l = af.length;
        int i = 0;
        int j = 0;
        for (; i < l; i++)
        {
            j += af[i].a();
        }

        b ab[] = new b[j];
        int i1 = af.length;
        i = 0;
        for (j = 0; j < i1; j++)
        {
            f f1 = af[j];
            for (l = 0; l < f1.a();)
            {
                int k1 = f1.b();
                ab[i] = new b(k1, new byte[g1.a() + k1]);
                l++;
                i++;
            }

        }

        int j2 = ab[0].b.length - g1.a();
        l = 0;
        j = 0;
        for (; l < j2 - 1; l++)
        {
            for (int j1 = 0; j1 < i;)
            {
                ab[j1].b[l] = abyte0[j];
                j1++;
                j++;
            }

        }

        boolean flag;
        int l1;
        if (e1.a() == 24)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l = 8;
        } else
        {
            l = i;
        }
        for (l1 = 0; l1 < l;)
        {
            ab[l1].b[j2 - 1] = abyte0[j];
            l1++;
            j++;
        }

        int l2 = ab[0].b.length;
        l = j;
        for (int k = j2; k < l2; k++)
        {
            int i2 = 0;
            while (i2 < i) 
            {
                int k2;
                if (flag && i2 > 7)
                {
                    k2 = k - 1;
                } else
                {
                    k2 = k;
                }
                ab[i2].b[k2] = abyte0[l];
                l++;
                i2++;
            }
        }

        if (l != abyte0.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return ab;
        }
    }

    final int a()
    {
        return a;
    }

    final byte[] b()
    {
        return b;
    }
}
