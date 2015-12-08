// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.NotFoundException;

// Referenced classes of package com.google.zxing.common:
//            h, j, b

public final class e extends h
{

    public e()
    {
    }

    public final b a(b b1, int i, int k, float f, float f1, float f2, float f3, 
            float f4, float f5, float f6, float f7, float f8, float f9, float f10, 
            float f11, float f12, float f13, float f14, float f15)
    {
        return a(b1, i, k, j.a(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15));
    }

    public final b a(b b1, int i, int k, j j1)
    {
        if (i <= 0 || k <= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        b b2 = new b(i, k);
        float af[] = new float[i << 1];
        int l = 0;
        do
        {
            if (l >= k)
            {
                break;
            }
            int k1 = af.length;
            float f = l;
            for (i = 0; i < k1; i += 2)
            {
                af[i] = (float)(i >> 1) + 0.5F;
                af[i + 1] = 0.5F + f;
            }

            j1.a(af);
            int l1 = b1.d();
            int i2 = b1.e();
            i = 1;
            int i1 = 0;
            while (i1 < af.length && i != 0) 
            {
                int l2 = (int)af[i1];
                int j2 = (int)af[i1 + 1];
                if (l2 < -1 || l2 > l1 || j2 < -1 || j2 > i2)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                i = 0;
                if (l2 == -1)
                {
                    af[i1] = 0.0F;
                    i = 1;
                } else
                if (l2 == l1)
                {
                    af[i1] = l1 - 1;
                    i = 1;
                }
                if (j2 == -1)
                {
                    af[i1 + 1] = 0.0F;
                    i = 1;
                } else
                if (j2 == i2)
                {
                    af[i1 + 1] = i2 - 1;
                    i = 1;
                }
                i1 += 2;
            }
            i1 = af.length;
            i = 1;
            i1 -= 2;
            while (i1 >= 0 && i != 0) 
            {
                int i3 = (int)af[i1];
                int k2 = (int)af[i1 + 1];
                if (i3 < -1 || i3 > l1 || k2 < -1 || k2 > i2)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                i = 0;
                if (i3 == -1)
                {
                    af[i1] = 0.0F;
                    i = 1;
                } else
                if (i3 == l1)
                {
                    af[i1] = l1 - 1;
                    i = 1;
                }
                if (k2 == -1)
                {
                    af[i1 + 1] = 0.0F;
                    i = 1;
                } else
                if (k2 == i2)
                {
                    af[i1 + 1] = i2 - 1;
                    i = 1;
                }
                i1 -= 2;
            }
            i = 0;
            while (i < k1) 
            {
                try
                {
                    if (b1.a((int)af[i], (int)af[i + 1]))
                    {
                        b2.b(i >> 1, l);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (b b1)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                i += 2;
            }
            l++;
        } while (true);
        return b2;
    }
}
