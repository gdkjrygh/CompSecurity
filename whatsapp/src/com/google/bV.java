// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fw, br, fA, gg, 
//            a6, gV, ec, d6, 
//            bW, bP, ep, gh

public final class bV
{

    public static int a;
    private static final int c[] = {
        3808, 476, 2107, 1799
    };
    private boolean b;
    private int d;
    private int e;
    private final d6 f;
    private int g;
    private int h;

    public bV(d6 d6_1)
    {
        f = d6_1;
    }

    private static float a(fw fw1, fw fw2)
    {
        return br.a(fw1.a(), fw1.b(), fw2.a(), fw2.b());
    }

    private int a()
    {
        if (b)
        {
            return g * 4 + 11;
        }
        if (g <= 4)
        {
            return g * 4 + 15;
        } else
        {
            return g * 4 + ((g - 4) / 8 + 1) * 2 + 15;
        }
    }

    private static int a(long l, boolean flag)
    {
        int i;
        byte byte0;
        int i1;
label0:
        {
            i1 = a;
            if (flag)
            {
                i = 7;
                byte0 = 2;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            i = 10;
            byte0 = 4;
        }
        int ai[] = new int[i];
        int j = i - 1;
        do
        {
            if (j < 0)
            {
                break;
            }
            ai[j] = (int)l & 0xf;
            l >>= 4;
            j--;
        } while (i1 == 0);
        int k;
        try
        {
            (new gg(a6.b)).a(ai, i - byte0);
        }
        catch (fA fa)
        {
            throw gV.a();
        }
        j = 0;
        i = 0;
        do
        {
            k = i;
            if (j >= byte0)
            {
                break;
            }
            k = (i << 4) + ai[j];
            j++;
            i = k;
        } while (i1 == 0);
        return k;
    }

    private int a(ec ec1, ec ec2)
    {
        int l = a;
        float f3 = b(ec1, ec2);
        float f4 = (float)(ec2.a() - ec1.a()) / f3;
        float f5 = (float)(ec2.b() - ec1.b()) / f3;
        float f1 = ec1.a();
        float f2 = ec1.b();
        boolean flag1 = f.b(ec1.a(), ec1.b());
        int i = 0;
        int k = 0;
        int j;
        do
        {
            j = i;
            if ((float)k >= f3)
            {
                break;
            }
            f1 += f4;
            f2 += f5;
            j = i;
            if (f.b(br.a(f1), br.a(f2)) != flag1)
            {
                j = i + 1;
            }
            k++;
            i = j;
        } while (l == 0);
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

    private int a(fw fw1, fw fw2, int i)
    {
        int j = 0;
        int i1 = a;
        float f4 = a(fw1, fw2);
        float f5 = f4 / (float)i;
        float f1 = fw1.a();
        float f2 = fw1.b();
        float f3 = ((fw2.a() - fw1.a()) * f5) / f4;
        f4 = (f5 * (fw2.b() - fw1.b())) / f4;
        int l = 0;
        int k;
        do
        {
            k = j;
            if (l >= i)
            {
                break;
            }
            k = j;
            if (f.b(br.a((float)l * f3 + f1), br.a((float)l * f4 + f2)))
            {
                k = j | 1 << i - l - 1;
            }
            l++;
            j = k;
        } while (i1 == 0);
        return k;
    }

    private static int a(int ai[], int i)
    {
        int i1 = a;
        int j1 = ai.length;
        int k = 0;
        int j = 0;
        int l;
        do
        {
            l = j;
            if (k >= j1)
            {
                break;
            }
            l = ai[k];
            l = (j << 3) + ((l & 1) + ((l >> i - 2) << 1));
            k++;
            j = l;
        } while (i1 == 0);
        i = 0;
        do
        {
            if (i >= 4)
            {
                break;
            }
            if (Integer.bitCount(c[i] ^ ((l & 1) << 11) + (l >> 1)) <= 2)
            {
                return i;
            }
            i++;
        } while (i1 == 0);
        throw gV.a();
    }

    private d6 a(d6 d6_1, fw fw1, fw fw2, fw fw3, fw fw4)
    {
        bW bw = bW.a();
        int i = a();
        float f1 = (float)i / 2.0F - (float)h;
        float f2 = (float)i / 2.0F + (float)h;
        return bw.a(d6_1, i, i, f1, f1, f2, f1, f2, f2, f1, f2, fw1.a(), fw1.b(), fw2.a(), fw2.b(), fw3.a(), fw3.b(), fw4.a(), fw4.b());
    }

    private ec a(ec ec1, boolean flag, int i, int j)
    {
        int k1 = a;
        int k = ec1.a() + i;
        int l = ec1.b() + j;
        int i1;
        int j1;
        do
        {
            j1 = l;
            i1 = k;
            if (!a(k, l))
            {
                break;
            }
            j1 = l;
            i1 = k;
            if (f.b(k, l) != flag)
            {
                break;
            }
            i1 = k + i;
            j1 = l + j;
            l = j1;
            k = i1;
        } while (k1 == 0);
        j1 -= j;
        k = i1 - i;
        do
        {
            l = k;
            if (!a(k, j1))
            {
                break;
            }
            l = k;
            if (f.b(k, j1) != flag)
            {
                break;
            }
            l = k + i;
            k = l;
        } while (k1 == 0);
        l -= i;
        i = j1;
        do
        {
            k = i;
            if (!a(l, i))
            {
                break;
            }
            k = i;
            if (f.b(l, i) != flag)
            {
                break;
            }
            k = i + j;
            i = k;
        } while (k1 == 0);
        return new ec(l, k - j);
    }

    private void a(fw afw[])
    {
        int k = a;
        if (!a(afw[0]) || !a(afw[1]) || !a(afw[2]) || !a(afw[3]))
        {
            throw gV.a();
        }
        int i = h * 2;
        int ai[] = new int[4];
        ai[0] = a(afw[0], afw[1], i);
        ai[1] = a(afw[1], afw[2], i);
        ai[2] = a(afw[2], afw[3], i);
        ai[3] = a(afw[3], afw[0], i);
        e = a(ai, i);
        long l1 = 0L;
        i = 0;
        long l2;
label0:
        do
        {
label1:
            {
                l2 = l1;
                if (i >= 4)
                {
                    break label0;
                }
                int l = ai[(e + i) % 4];
                l2 = l1;
                if (b)
                {
                    l1 = (l1 << 7) + (long)(l >> 1 & 0x7f);
                    l2 = l1;
                    if (k == 0)
                    {
                        break label1;
                    }
                    l2 = l1;
                }
                l2 = (l2 << 10) + (long)((l >> 1 & 0x1f) + (l >> 2 & 0x3e0));
            }
            i++;
            l1 = l2;
        } while (k == 0);
label2:
        {
            int j = a(l2, b);
            if (b)
            {
                g = (j >> 6) + 1;
                d = (j & 0x3f) + 1;
                if (k == 0)
                {
                    break label2;
                }
            }
            g = (j >> 11) + 1;
            d = (j & 0x7ff) + 1;
        }
    }

    private boolean a(int i, int j)
    {
        return i >= 0 && i < f.b() && j > 0 && j < f.c();
    }

    private boolean a(ec ec1, ec ec2, ec ec3, ec ec4)
    {
        ec1 = new ec(ec1.a() - 3, ec1.b() + 3);
        ec2 = new ec(ec2.a() - 3, ec2.b() - 3);
        ec3 = new ec(ec3.a() + 3, ec3.b() - 3);
        ec4 = new ec(ec4.a() + 3, 3 + ec4.b());
        for (int i = a(ec4, ec1); i == 0 || a(ec1, ec2) != i || a(ec2, ec3) != i || a(ec3, ec4) != i;)
        {
            return false;
        }

        return true;
    }

    private boolean a(fw fw1)
    {
        return a(br.a(fw1.a()), br.a(fw1.b()));
    }

    private fw[] a(ec ec1)
    {
        int i = a;
        boolean flag = true;
        h = 1;
        ec ec2 = ec1;
        Object obj = ec1;
        Object obj1 = ec1;
        Object obj2 = ec1;
        ec1 = ec2;
        do
        {
            ec ec3;
            ec ec5;
            ec ec6;
            ec ec10;
label0:
            {
                ec ec4;
                ec ec7;
                ec ec8;
                ec ec9;
label1:
                {
                    ec7 = ec1;
                    ec8 = ((ec) (obj));
                    ec9 = ((ec) (obj1));
                    ec4 = ((ec) (obj2));
                    if (h >= 9)
                    {
                        break label1;
                    }
                    ec3 = a(((ec) (obj1)), flag, 1, -1);
                    ec5 = a(((ec) (obj)), flag, 1, 1);
                    ec6 = a(ec1, flag, -1, 1);
                    ec10 = a(((ec) (obj2)), flag, -1, -1);
                    if (h > 2)
                    {
                        float f1 = (b(ec10, ec3) * (float)h) / (b(((ec) (obj2)), ((ec) (obj1))) * (float)(h + 2));
                        ec7 = ec1;
                        ec8 = ((ec) (obj));
                        ec9 = ((ec) (obj1));
                        ec4 = ((ec) (obj2));
                        if ((double)f1 < 0.75D)
                        {
                            break label1;
                        }
                        ec7 = ec1;
                        ec8 = ((ec) (obj));
                        ec9 = ((ec) (obj1));
                        ec4 = ((ec) (obj2));
                        if ((double)f1 > 1.25D)
                        {
                            break label1;
                        }
                        if (!a(ec3, ec5, ec6, ec10))
                        {
                            ec7 = ec1;
                            ec8 = ((ec) (obj));
                            ec9 = ((ec) (obj1));
                            ec4 = ((ec) (obj2));
                            if (i == 0)
                            {
                                break label1;
                            }
                        }
                    }
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    h = h + 1;
                    if (i == 0)
                    {
                        break label0;
                    }
                    ec4 = ec10;
                    ec9 = ec3;
                    ec8 = ec5;
                    ec7 = ec6;
                }
                if (h != 5 && h != 7)
                {
                    throw gV.a();
                }
                float f2;
                float f3;
                if (h == 5)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b = flag;
                ec1 = new fw((float)ec9.a() + 0.5F, (float)ec9.b() - 0.5F);
                obj = new fw((float)ec8.a() + 0.5F, (float)ec8.b() + 0.5F);
                obj1 = new fw((float)ec7.a() - 0.5F, (float)ec7.b() + 0.5F);
                obj2 = new fw((float)ec4.a() - 0.5F, (float)ec4.b() - 0.5F);
                f2 = h * 2 - 3;
                f3 = h * 2;
                return a(new fw[] {
                    ec1, obj, obj1, obj2
                }, f2, f3);
            }
            obj2 = ec10;
            ec1 = ec6;
            obj = ec5;
            obj1 = ec3;
        } while (true);
    }

    private static fw[] a(fw afw[], float f1, float f2)
    {
        f1 = f2 / (2.0F * f1);
        f2 = afw[0].a() - afw[2].a();
        float f3 = afw[0].b() - afw[2].b();
        float f4 = (afw[0].a() + afw[2].a()) / 2.0F;
        float f5 = (afw[0].b() + afw[2].b()) / 2.0F;
        fw fw1 = new fw(f1 * f2 + f4, f1 * f3 + f5);
        fw fw2 = new fw(f4 - f2 * f1, f5 - f3 * f1);
        f2 = afw[1].a() - afw[3].a();
        f3 = afw[1].b() - afw[3].b();
        f4 = (afw[1].a() + afw[3].a()) / 2.0F;
        f5 = (afw[1].b() + afw[3].b()) / 2.0F;
        return (new fw[] {
            fw1, new fw(f1 * f2 + f4, f1 * f3 + f5), fw2, new fw(f4 - f2 * f1, f5 - f1 * f3)
        });
    }

    private static float b(ec ec1, ec ec2)
    {
        return br.a(ec1.a(), ec1.b(), ec2.a(), ec2.b());
    }

    private ec b()
    {
        fw afw[] = (new bP(f)).a();
        Object obj;
        fw fw1;
        fw fw2;
        fw fw3;
        fw3 = afw[0];
        fw2 = afw[1];
        fw1 = afw[2];
        obj = afw[3];
_L1:
        int i;
        int j;
        i = br.a((fw3.a() + ((fw) (obj)).a() + fw2.a() + fw1.a()) / 4F);
        float f1 = fw3.b();
        j = br.a((((fw) (obj)).b() + f1 + fw2.b() + fw1.b()) / 4F);
        obj = (new bP(f, 15, i, j)).a();
        fw3 = obj[0];
        fw2 = obj[1];
        fw1 = obj[2];
        obj = obj[3];
_L2:
        i = br.a((fw3.a() + ((fw) (obj)).a() + fw2.a() + fw1.a()) / 4F);
        float f2 = fw3.b();
        return new ec(i, br.a((((fw) (obj)).b() + f2 + fw2.b() + fw1.b()) / 4F));
        gV gv;
        gv;
        i = f.b() / 2;
        j = f.c() / 2;
        fw3 = a(new ec(i + 7, j - 7), false, 1, -1).c();
        fw2 = a(new ec(i + 7, j + 7), false, 1, 1).c();
        fw1 = a(new ec(i - 7, j + 7), false, -1, 1).c();
        gv = a(new ec(i - 7, j - 7), false, -1, -1).c();
          goto _L1
        gv;
        fw3 = a(new ec(i + 7, j - 7), false, 1, -1).c();
        fw2 = a(new ec(i + 7, j + 7), false, 1, 1).c();
        fw1 = a(new ec(i - 7, j + 7), false, -1, 1).c();
        gv = a(new ec(i - 7, j - 7), false, -1, -1).c();
          goto _L2
    }

    private fw[] b(fw afw[])
    {
        return a(afw, h * 2, a());
    }

    public ep a(boolean flag)
    {
        int i = a;
        fw afw[] = a(b());
        if (flag)
        {
            fw fw1 = afw[0];
            afw[0] = afw[2];
            afw[2] = fw1;
        }
        a(afw);
        ep ep1 = new ep(a(f, afw[e % 4], afw[(e + 1) % 4], afw[(e + 2) % 4], afw[(e + 3) % 4]), b(afw), b, d, g);
        if (i != 0)
        {
            gh.a++;
        }
        return ep1;
    }

}
