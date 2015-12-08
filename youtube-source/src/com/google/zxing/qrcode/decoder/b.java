// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;


// Referenced classes of package com.google.zxing.qrcode.decoder:
//            p, r, q, ErrorCorrectionLevel

final class b
{

    private final int a;
    private final byte b[];

    private b(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    static b[] a(byte abyte0[], p p1, ErrorCorrectionLevel errorcorrectionlevel)
    {
        if (abyte0.length != p1.c())
        {
            throw new IllegalArgumentException();
        }
        p1 = p1.a(errorcorrectionlevel);
        errorcorrectionlevel = p1.b();
        int l = errorcorrectionlevel.length;
        int i = 0;
        int k = 0;
        for (; i < l; i++)
        {
            k += errorcorrectionlevel[i].a();
        }

        b ab[] = new b[k];
        int i1 = errorcorrectionlevel.length;
        k = 0;
        for (l = 0; l < i1;)
        {
            q q1 = errorcorrectionlevel[l];
            i = k;
            for (k = 0; k < q1.a();)
            {
                int k1 = q1.b();
                ab[i] = new b(k1, new byte[p1.a() + k1]);
                k++;
                i++;
            }

            l++;
            k = i;
        }

        l = ab[0].b.length;
        for (i = ab.length - 1; i >= 0 && ab[i].b.length != l; i--) { }
        int j2 = i + 1;
        int l1 = l - p1.a();
        l = 0;
        i = 0;
        for (; l < l1; l++)
        {
            for (i1 = 0; i1 < k;)
            {
                ab[i1].b[l] = abyte0[i];
                i1++;
                i++;
            }

        }

        i1 = j2;
        for (l = i; i1 < k; l++)
        {
            ab[i1].b[l1] = abyte0[l];
            i1++;
        }

        int k2 = ab[0].b.length;
        for (int j = l1; j < k2; j++)
        {
            int j1 = 0;
            while (j1 < k) 
            {
                int i2;
                if (j1 < j2)
                {
                    i2 = j;
                } else
                {
                    i2 = j + 1;
                }
                ab[j1].b[i2] = abyte0[l];
                j1++;
                l++;
            }
        }

        return ab;
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
