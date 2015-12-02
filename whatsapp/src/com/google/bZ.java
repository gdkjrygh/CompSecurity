// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            bW, cH, bQ, gV, 
//            d6

public final class bZ extends bW
{

    public bZ()
    {
    }

    public d6 a(d6 d6_1, int i, int j, float f, float f1, float f2, float f3, 
            float f4, float f5, float f6, float f7, float f8, float f9, float f10, 
            float f11, float f12, float f13, float f14, float f15)
    {
        return a(d6_1, i, j, cH.a(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15));
    }

    public d6 a(d6 d6_1, int i, int j, cH ch)
    {
        boolean flag = bQ.a;
        if (i <= 0 || j <= 0)
        {
            try
            {
                throw gV.a();
            }
            // Misplaced declaration of an exception variable
            catch (d6 d6_1)
            {
                throw d6_1;
            }
        }
        d6 d6_2 = new d6(i, j);
        float af[] = new float[i * 2];
        i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    int l = af.length;
                    float f = i;
                    int k = 0;
                    do
                    {
                        if (k >= l)
                        {
                            break;
                        }
                        af[k] = (float)(k / 2) + 0.5F;
                        af[k + 1] = f + 0.5F;
                        k += 2;
                    } while (!flag);
                    ch.a(af);
                    a(d6_1, af);
                    k = 0;
                    do
                    {
                        if (k >= l)
                        {
                            break;
                        }
                        try
                        {
                            if (d6_1.b((int)af[k], (int)af[k + 1]))
                            {
                                d6_2.c(k / 2, i);
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (d6 d6_1)
                        {
                            try
                            {
                                throw d6_1;
                            }
                            // Misplaced declaration of an exception variable
                            catch (d6 d6_1)
                            {
                                throw gV.a();
                            }
                        }
                        k += 2;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return d6_2;
            }
            i++;
        } while (true);
    }
}
