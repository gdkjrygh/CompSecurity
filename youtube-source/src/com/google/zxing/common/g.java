// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.NotFoundException;
import com.google.zxing.a;
import com.google.zxing.c;

// Referenced classes of package com.google.zxing.common:
//            a, b

public class g extends a
{

    private static final byte a[] = new byte[0];
    private byte b[];
    private final int c[] = new int[32];

    public g(c c1)
    {
        super(c1);
        b = a;
    }

    private static int a(int ai[])
    {
        int j2 = ai.length;
        int j = 0;
        int i1 = 0;
        int i = 0;
        int j1;
        int k1;
        for (j1 = 0; j < j2; j1 = k1)
        {
            int k = i1;
            if (ai[j] > i1)
            {
                k = ai[j];
                i = j;
            }
            k1 = j1;
            if (ai[j] > j1)
            {
                k1 = ai[j];
            }
            j++;
            i1 = k;
        }

        int l = 0;
        j = 0;
        i1 = 0;
        while (l < j2) 
        {
            int l1 = l - i;
            l1 *= ai[l] * l1;
            if (l1 > i1)
            {
                i1 = l;
                j = l1;
            } else
            {
                int i2 = i1;
                i1 = j;
                j = i2;
            }
            l++;
            l1 = j;
            j = i1;
            i1 = l1;
        }
        if (i > j)
        {
            l1 = j;
            i1 = i;
        } else
        {
            i1 = j;
            l1 = i;
        }
        if (i1 - l1 <= j2 >> 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j = i1 - 1;
        l = -1;
        i = i1 - 1;
        while (i > l1) 
        {
            j2 = i - l1;
            j2 = j2 * j2 * (i1 - i) * (j1 - ai[i]);
            if (j2 > l)
            {
                l = i;
                j = j2;
            } else
            {
                j2 = j;
                j = l;
                l = j2;
            }
            i--;
            j2 = l;
            l = j;
            j = j2;
        }
        return j << 3;
    }

    private void a(int i)
    {
        if (b.length < i)
        {
            b = new byte[i];
        }
        for (i = 0; i < 32; i++)
        {
            c[i] = 0;
        }

    }

    public final com.google.zxing.common.a a(int i, com.google.zxing.common.a a1)
    {
        int j = 1;
        c c1 = a();
        int j1 = c1.b();
        byte abyte0[];
        int ai[];
        if (a1 == null || a1.a() < j1)
        {
            a1 = new com.google.zxing.common.a(j1);
        } else
        {
            a1.b();
        }
        a(j1);
        abyte0 = c1.a(i, b);
        ai = c;
        for (i = 0; i < j1; i++)
        {
            int k = (abyte0[i] & 0xff) >> 3;
            ai[k] = ai[k] + 1;
        }

        int k1 = a(ai);
        int l = abyte0[0] & 0xff;
        int i1;
        for (i = abyte0[1] & 0xff; j < j1 - 1; i = i1)
        {
            i1 = abyte0[j + 1] & 0xff;
            if ((i << 2) - l - i1 >> 1 < k1)
            {
                a1.b(j);
            }
            j++;
            l = i;
        }

        return a1;
    }

    public b b()
    {
        c c1 = a();
        int i1 = c1.b();
        int j1 = c1.c();
        b b1 = new b(i1, j1);
        a(i1);
        int ai[] = c;
        for (int i = 1; i < 5; i++)
        {
            byte abyte1[] = c1.a((j1 * i) / 5, b);
            int k1 = (i1 << 2) / 5;
            for (int k = i1 / 5; k < k1; k++)
            {
                int i2 = (abyte1[k] & 0xff) >> 3;
                ai[i2] = ai[i2] + 1;
            }

        }

        int l1 = a(ai);
        byte abyte0[] = c1.a();
        for (int j = 0; j < j1; j++)
        {
            for (int l = 0; l < i1; l++)
            {
                if ((abyte0[j * i1 + l] & 0xff) < l1)
                {
                    b1.b(l, j);
                }
            }

        }

        return b1;
    }

}
