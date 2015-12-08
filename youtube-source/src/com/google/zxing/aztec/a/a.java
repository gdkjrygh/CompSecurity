// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.a;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.common.h;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.g;

// Referenced classes of package com.google.zxing.aztec.a:
//            b

public final class a
{

    private static final int g[] = {
        3808, 476, 2107, 1799
    };
    private final b a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;

    public a(b b1)
    {
        a = b1;
    }

    private static int a(long l, boolean flag)
    {
        boolean flag1 = false;
        int ai[];
        byte byte0;
        byte byte1;
        if (flag)
        {
            byte1 = 7;
            byte0 = 2;
        } else
        {
            byte1 = 10;
            byte0 = 4;
        }
        ai = new int[byte1];
        for (int j = byte1 - 1; j >= 0; j--)
        {
            ai[j] = (int)l & 0xf;
            l >>= 4;
        }

        int k;
        try
        {
            (new c(com.google.zxing.common.reedsolomon.a.d)).a(ai, byte1 - byte0);
        }
        catch (ReedSolomonException reedsolomonexception)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        k = 0;
        for (int i = ((flag1) ? 1 : 0); i < byte0; i++)
        {
            k = (k << 4) + ai[i];
        }

        return k;
    }

    private int a(com.google.zxing.aztec.a.b b1, com.google.zxing.aztec.a.b b2)
    {
        float f3 = b(b1, b2);
        float f4 = (float)(b2.b() - b1.b()) / f3;
        float f5 = (float)(b2.c() - b1.c()) / f3;
        float f1 = b1.b();
        float f2 = b1.c();
        boolean flag1 = a.a(b1.b(), b1.c());
        int j = 0;
        for (int i = 0; (float)i < f3;)
        {
            f1 += f4;
            f2 += f5;
            int k = j;
            if (a.a((int)(0.5F + f1), (int)(0.5F + f2)) != flag1)
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        f1 = (float)j / f3;
        if (f1 > 0.1F && f1 < 0.9F)
        {
            return 0;
        }
        boolean flag;
        if (f1 <= 0.1F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag != flag1 ? -1 : 1;
    }

    private int a(g g1, g g2, int i)
    {
        int k = 0;
        float f4 = com.google.zxing.common.a.a.a(g1.a(), g1.b(), g2.a(), g2.b());
        float f5 = f4 / (float)i;
        float f1 = g1.a();
        float f2 = g1.b();
        float f3 = ((g2.a() - g1.a()) * f5) / f4;
        f4 = (f5 * (g2.b() - g1.b())) / f4;
        for (int j = 0; j < i;)
        {
            int l = k;
            if (a.a((int)((float)j * f3 + f1 + 0.5F), (int)((float)j * f4 + f2 + 0.5F)))
            {
                l = k | 1 << i - j - 1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private com.google.zxing.aztec.a.b a()
    {
        g ag[] = (new com.google.zxing.common.a.b(a)).a();
        Object obj;
        g g1;
        g g2;
        g g3;
        g3 = ag[0];
        g2 = ag[1];
        g1 = ag[2];
        obj = ag[3];
_L1:
        int i;
        int j;
        i = (int)((g3.a() + ((g) (obj)).a() + g2.a() + g1.a()) / 4F + 0.5F);
        float f1 = g3.b();
        j = (int)((((g) (obj)).b() + f1 + g2.b() + g1.b()) / 4F + 0.5F);
        obj = (new com.google.zxing.common.a.b(a, 15, i, j)).a();
        g3 = obj[0];
        g2 = obj[1];
        g1 = obj[2];
        obj = obj[3];
_L2:
        i = (int)((g3.a() + ((g) (obj)).a() + g2.a() + g1.a()) / 4F + 0.5F);
        float f2 = g3.b();
        return new com.google.zxing.aztec.a.b(i, (int)((((g) (obj)).b() + f2 + g2.b() + g1.b()) / 4F + 0.5F));
        NotFoundException notfoundexception;
        notfoundexception;
        i = a.d() / 2;
        j = a.e() / 2;
        g3 = a(new com.google.zxing.aztec.a.b(i + 7, j - 7), false, 1, -1).a();
        g2 = a(new com.google.zxing.aztec.a.b(i + 7, j + 7), false, 1, 1).a();
        g1 = a(new com.google.zxing.aztec.a.b(i - 7, j + 7), false, -1, 1).a();
        notfoundexception = a(new com.google.zxing.aztec.a.b(i - 7, j - 7), false, -1, -1).a();
          goto _L1
        notfoundexception;
        g3 = a(new com.google.zxing.aztec.a.b(i + 7, j - 7), false, 1, -1).a();
        g2 = a(new com.google.zxing.aztec.a.b(i + 7, j + 7), false, 1, 1).a();
        g1 = a(new com.google.zxing.aztec.a.b(i - 7, j + 7), false, -1, 1).a();
        notfoundexception = a(new com.google.zxing.aztec.a.b(i - 7, j - 7), false, -1, -1).a();
          goto _L2
    }

    private com.google.zxing.aztec.a.b a(com.google.zxing.aztec.a.b b1, boolean flag, int i, int j)
    {
        int l = b1.b() + i;
        int k;
        for (k = b1.c() + j; a(l, k) && a.a(l, k) == flag; k += j)
        {
            l += i;
        }

        int i1 = l - i;
        l = k - j;
        for (k = i1; a(k, l) && a.a(k, l) == flag; k += i) { }
        k -= i;
        for (i = l; a(k, i) && a.a(k, i) == flag; i += j) { }
        return new com.google.zxing.aztec.a.b(k, i - j);
    }

    private boolean a(int i, int j)
    {
        return i >= 0 && i < a.d() && j > 0 && j < a.e();
    }

    private boolean a(g g1)
    {
        return a((int)(g1.a() + 0.5F), (int)(g1.b() + 0.5F));
    }

    private static g[] a(g ag[], float f1, float f2)
    {
        f1 = f2 / (2.0F * f1);
        f2 = ag[0].a() - ag[2].a();
        float f3 = ag[0].b() - ag[2].b();
        float f4 = (ag[0].a() + ag[2].a()) / 2.0F;
        float f5 = (ag[0].b() + ag[2].b()) / 2.0F;
        g g1 = new g(f1 * f2 + f4, f1 * f3 + f5);
        g g2 = new g(f4 - f2 * f1, f5 - f3 * f1);
        f2 = ag[1].a() - ag[3].a();
        f3 = ag[1].b() - ag[3].b();
        f4 = (ag[1].a() + ag[3].a()) / 2.0F;
        f5 = (ag[1].b() + ag[3].b()) / 2.0F;
        return (new g[] {
            g1, new g(f1 * f2 + f4, f1 * f3 + f5), g2, new g(f4 - f2 * f1, f5 - f1 * f3)
        });
    }

    private static float b(com.google.zxing.aztec.a.b b1, com.google.zxing.aztec.a.b b2)
    {
        return com.google.zxing.common.a.a.a(b1.b(), b1.c(), b2.b(), b2.c());
    }

    private int b()
    {
        if (b)
        {
            return c * 4 + 11;
        }
        if (c <= 4)
        {
            return c * 4 + 15;
        } else
        {
            return c * 4 + ((c - 4) / 8 + 1) * 2 + 15;
        }
    }

    public final com.google.zxing.aztec.a a(boolean flag)
    {
        g ag[];
        long l2;
label0:
        {
            Object obj = a();
            e = 1;
            Object obj1 = obj;
            boolean flag1 = true;
            Object obj2 = obj;
            Object obj3 = obj;
            while (e < 9) 
            {
                com.google.zxing.aztec.a.b b3 = a(((com.google.zxing.aztec.a.b) (obj3)), flag1, 1, -1);
                com.google.zxing.aztec.a.b b4 = a(((com.google.zxing.aztec.a.b) (obj2)), flag1, 1, 1);
                com.google.zxing.aztec.a.b b5 = a(((com.google.zxing.aztec.a.b) (obj1)), flag1, -1, 1);
                com.google.zxing.aztec.a.b b2 = a(((com.google.zxing.aztec.a.b) (obj)), flag1, -1, -1);
                if (e > 2)
                {
                    float f1 = (b(b2, b3) * (float)e) / (b(((com.google.zxing.aztec.a.b) (obj)), ((com.google.zxing.aztec.a.b) (obj3))) * (float)(e + 2));
                    if ((double)f1 < 0.75D || (double)f1 > 1.25D)
                    {
                        break;
                    }
                    com.google.zxing.aztec.a.b b6 = new com.google.zxing.aztec.a.b(b3.b() - 3, b3.c() + 3);
                    com.google.zxing.aztec.a.b b7 = new com.google.zxing.aztec.a.b(b4.b() - 3, b4.c() - 3);
                    com.google.zxing.aztec.a.b b8 = new com.google.zxing.aztec.a.b(b5.b() + 3, b5.c() - 3);
                    com.google.zxing.aztec.a.b b9 = new com.google.zxing.aztec.a.b(b2.b() + 3, b2.c() + 3);
                    int i = a(b9, b6);
                    if (i != 0 && a(b6, b7) == i && a(b7, b8) == i && a(b8, b9) == i)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (!i)
                    {
                        break;
                    }
                }
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                e = e + 1;
                obj1 = b5;
                obj2 = b4;
                obj3 = b3;
                obj = b2;
            }
            if (e != 5 && e != 7)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            float f2;
            float f4;
            if (e == 5)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            b = flag1;
            obj3 = new g((float)((com.google.zxing.aztec.a.b) (obj3)).b() + 0.5F, (float)((com.google.zxing.aztec.a.b) (obj3)).c() - 0.5F);
            obj2 = new g((float)((com.google.zxing.aztec.a.b) (obj2)).b() + 0.5F, (float)((com.google.zxing.aztec.a.b) (obj2)).c() + 0.5F);
            obj1 = new g((float)((com.google.zxing.aztec.a.b) (obj1)).b() - 0.5F, (float)((com.google.zxing.aztec.a.b) (obj1)).c() + 0.5F);
            obj = new g((float)((com.google.zxing.aztec.a.b) (obj)).b() - 0.5F, (float)((com.google.zxing.aztec.a.b) (obj)).c() - 0.5F);
            f2 = e * 2 - 3;
            f4 = e * 2;
            ag = a(new g[] {
                obj3, obj2, obj1, obj
            }, f2, f4);
            if (flag)
            {
                g g1 = ag[0];
                ag[0] = ag[2];
                ag[2] = g1;
            }
            if (!a(ag[0]) || !a(ag[1]) || !a(ag[2]) || !a(ag[3]))
            {
                throw NotFoundException.getNotFoundInstance();
            }
            int k1 = e * 2;
            int ai[] = new int[4];
            ai[0] = a(ag[0], ag[1], k1);
            ai[1] = a(ag[1], ag[2], k1);
            ai[2] = a(ag[2], ag[3], k1);
            ai[3] = a(ag[3], ag[0], k1);
            int j = 0;
            int l1 = ai.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                int i2 = ai[i1];
                j = (j << 3) + ((i2 & 1) + ((i2 >> k1 - 2) << 1));
            }

            int j1 = 0;
            do
            {
                if (j1 >= 4)
                {
                    break;
                }
                if (Integer.bitCount(g[j1] ^ (j >> 1) + ((j & 1) << 11)) <= 2)
                {
                    f = j1;
                    l2 = 0L;
                    int k = 0;
                    while (k < 4) 
                    {
                        j1 = ai[(f + k) % 4];
                        if (b)
                        {
                            l2 = (l2 << 7) + (long)(j1 >> 1 & 0x7f);
                        } else
                        {
                            l2 = (l2 << 10) + (long)((j1 >> 1 & 0x1f) + (j1 >> 2 & 0x3e0));
                        }
                        k++;
                    }
                    break label0;
                }
                j1++;
            } while (true);
            throw NotFoundException.getNotFoundInstance();
        }
        int l = a(l2, b);
        float f3;
        float f5;
        b b1;
        g g2;
        g g3;
        g g4;
        g g5;
        h h1;
        if (b)
        {
            c = (l >> 6) + 1;
            d = (l & 0x3f) + 1;
        } else
        {
            c = (l >> 11) + 1;
            d = (l & 0x7ff) + 1;
        }
        b1 = a;
        g2 = ag[f % 4];
        g3 = ag[(f + 1) % 4];
        g4 = ag[(f + 2) % 4];
        g5 = ag[(f + 3) % 4];
        h1 = h.a();
        l = b();
        f3 = (float)l / 2.0F - (float)e;
        f5 = (float)l / 2.0F + (float)e;
        return new com.google.zxing.aztec.a(h1.a(b1, l, l, f3, f3, f5, f3, f5, f5, f3, f5, g2.a(), g2.b(), g3.a(), g3.b(), g4.a(), g4.b(), g5.a(), g5.b()), a(ag, e * 2, b()), b, d, c);
    }

}
