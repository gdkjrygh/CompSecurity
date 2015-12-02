// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            eM, m, bQ, cm, 
//            gV, fm, fw, f, 
//            n, T, S, c6, 
//            gh

public final class eD extends eM
{

    private static final int h[] = {
        0, 161, 961, 2015, 2715
    };
    private static final int i[] = {
        2, 4, 6, 8
    };
    private static final int k[][];
    private static final int l[] = {
        4, 20, 48, 81
    };
    private static final int m[] = {
        0, 336, 1036, 1516
    };
    private static final int n[] = {
        1, 10, 34, 70, 126
    };
    private static final int o[] = {
        8, 6, 4, 3, 1
    };
    private final List j = new ArrayList();
    private final List p = new ArrayList();

    public eD()
    {
    }

    private cm a(bQ bq, int i1, boolean flag, int ai[])
    {
        boolean flag1 = m.c;
        boolean flag2 = bq.e(ai[0]);
        int j1 = ai[0] - 1;
        int k1;
        do
        {
            k1 = j1;
            if (j1 < 0)
            {
                break;
            }
            k1 = j1;
            if (!(bq.e(j1) ^ flag2))
            {
                break;
            }
            k1 = j1 - 1;
            j1 = k1;
        } while (!flag1);
        int l1 = k1 + 1;
        j1 = ai[0];
        int ai1[] = f();
        System.arraycopy(ai1, 0, ai1, 1, ai1.length - 1);
        ai1[0] = j1 - l1;
        int i2 = a(ai1, k);
        k1 = ai[1];
        if (flag)
        {
            j1 = bq.b() - 1 - l1;
            k1 = bq.b() - 1 - k1;
        } else
        {
            j1 = l1;
        }
        return new cm(i2, new int[] {
            l1, ai[1]
        }, j1, k1, i1);
    }

    private m a(bQ bq, cm cm1, boolean flag)
    {
        int ai[];
        boolean flag1;
label0:
        {
            flag1 = m.c;
            ai = a();
            ai[0] = 0;
            ai[1] = 0;
            ai[2] = 0;
            ai[3] = 0;
            ai[4] = 0;
            ai[5] = 0;
            ai[6] = 0;
            ai[7] = 0;
            if (flag)
            {
                a(bq, cm1.c()[0], ai);
                if (!flag1)
                {
                    break label0;
                }
            }
            b(bq, cm1.c()[1] + 1, ai);
            int l1 = 0;
            int i1 = ai.length - 1;
            do
            {
                if (l1 >= i1)
                {
                    break;
                }
                int j3 = ai[l1];
                ai[l1] = ai[i1];
                ai[i1] = j3;
                l1++;
                i1--;
            } while (!flag1);
        }
        float f1;
        float af[];
        float af1[];
        int k1;
        int k2;
        int k3;
        int i4;
        int k4;
        int l4;
        int i5;
        if (flag)
        {
            k3 = 16;
        } else
        {
            k3 = 15;
        }
        f1 = (float)a(ai) / (float)k3;
        bq = e();
        cm1 = b();
        af = d();
        af1 = c();
        i4 = 0;
label1:
        do
        {
            float f2;
            int j1;
label2:
            {
                if (i4 >= ai.length)
                {
                    break label1;
                }
                f2 = (float)ai[i4] / f1;
                j1 = (int)(0.5F + f2);
                int i2 = j1;
                if (j1 < 1)
                {
                    j1 = 1;
                    i2 = 1;
                    if (!flag1)
                    {
                        break label2;
                    }
                }
                j1 = i2;
                if (i2 > 8)
                {
                    j1 = 8;
                }
            }
label3:
            {
                int j2 = i4 / 2;
                if ((i4 & 1) == 0)
                {
                    bq[j2] = j1;
                    af[j2] = f2 - (float)j1;
                    if (!flag1)
                    {
                        break label3;
                    }
                }
                cm1[j2] = j1;
                af1[j2] = f2 - (float)j1;
            }
            i4++;
        } while (!flag1);
        a(flag, k3);
        k3 = bq.length;
        k2 = 0;
        k1 = 0;
        k4 = k3 - 1;
        do
        {
            i4 = k2;
            k3 = k1;
            if (k4 < 0)
            {
                break;
            }
            i4 = k2 * 9 + bq[k4];
            k3 = k1 + bq[k4];
            k4--;
            k2 = i4;
            k1 = k3;
        } while (!flag1);
        k4 = cm1.length;
        k2 = 0;
        k1 = 0;
        k4--;
        do
        {
            l4 = k2;
            i5 = k1;
            if (k4 < 0)
            {
                break;
            }
            i5 = k1 * 9 + cm1[k4];
            l4 = k2 + cm1[k4];
            k4--;
            k2 = l4;
            k1 = i5;
        } while (!flag1);
        k1 = i5 * 3 + i4;
        if (flag)
        {
            if ((k3 & 1) != 0 || k3 > 12 || k3 < 4)
            {
                throw gV.a();
            } else
            {
                int l2 = (12 - k3) / 2;
                int j4 = o[l2];
                k3 = fm.a(bq, j4, false);
                j4 = fm.a(cm1, 9 - j4, true);
                return new m(k3 * n[l2] + j4 + h[l2], k1);
            }
        }
        if ((l4 & 1) != 0 || l4 > 10 || l4 < 4)
        {
            throw gV.a();
        } else
        {
            int i3 = (10 - l4) / 2;
            int l3 = i[i3];
            return new m(fm.a(bq, l3, true) + fm.a(cm1, 9 - l3, false) * l[i3] + m[i3], k1);
        }
    }

    private n a(bQ bq, boolean flag, int i1, Map map)
    {
        cm cm1;
        int ai[];
        try
        {
            ai = a(bq, 0, flag);
            cm1 = a(bq, i1, flag, ai);
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            return null;
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        float f1;
        float f2;
        for (map = null; map == null; map = (f)map.get(T.NEED_RESULT_POINT_CALLBACK))
        {
            break MISSING_BLOCK_LABEL_85;
        }

        f2 = (float)(ai[0] + ai[1]) / 2.0F;
        f1 = f2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        f1 = (float)(bq.b() - 1) - f2;
        map.a(new fw(f1, i1));
        map = a(bq, cm1, true);
        bq = a(bq, cm1, false);
        return new n(map.b() * 1597 + bq.b(), map.a() + bq.a() * 4, cm1);
    }

    private static void a(Collection collection, n n1)
    {
        boolean flag2 = m.c;
        if (n1 != null)
        {
            Iterator iterator = collection.iterator();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                n n2 = (n)iterator.next();
                if (n2.b() != n1.b())
                {
                    continue;
                }
                n2.b();
                flag = true;
                boolean flag1 = true;
                if (!flag2)
                {
                    break;
                }
                flag = flag1;
            } while (!flag2);
            if (!flag)
            {
                collection.add(n1);
                return;
            }
        }
    }

    private void a(boolean flag, int i1)
    {
        boolean flag1;
        boolean flag2;
        boolean flag5;
        int k2;
        boolean flag7;
        boolean flag8;
        int l2;
        int i3;
        int j3;
        boolean flag9;
label0:
        {
label1:
            {
label2:
                {
                    flag9 = m.c;
                    l2 = a(e());
                    i3 = a(b());
                    j3 = (l2 + i3) - i1;
                    int j1;
                    int l1;
                    boolean flag4;
                    boolean flag6;
                    if (flag)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if ((l2 & 1) == i1)
                    {
                        flag8 = true;
                    } else
                    {
                        flag8 = false;
                    }
                    if ((i3 & 1) == 1)
                    {
                        flag7 = true;
                    } else
                    {
                        flag7 = false;
                    }
                    flag4 = false;
                    j1 = 0;
                    i1 = 0;
                    flag2 = false;
                    k2 = 0;
                    l1 = 0;
                    flag5 = false;
                    flag1 = false;
                    if (!flag)
                    {
                        break label1;
                    }
                    i1 = ((flag2) ? 1 : 0);
                    if (l2 > 12)
                    {
                        l1 = 1;
                        i1 = 1;
                        flag4 = j1;
                        if (!flag9)
                        {
                            break label2;
                        }
                    }
                    l1 = i1;
                    flag4 = j1;
                    if (l2 < 4)
                    {
                        flag4 = true;
                        l1 = i1;
                    }
                }
                flag5 = flag1;
                if (i3 > 12)
                {
                    flag1 = true;
                    flag5 = true;
                    i1 = k2;
                    j1 = l1;
                    flag2 = flag4;
                    if (!flag9)
                    {
                        break label0;
                    }
                }
                flag1 = flag5;
                i1 = k2;
                j1 = l1;
                flag2 = flag4;
                if (i3 >= 4)
                {
                    break label0;
                }
                i1 = 1;
                k2 = 1;
                flag1 = flag5;
                j1 = l1;
                flag2 = flag4;
                if (!flag9)
                {
                    break label0;
                }
                i1 = l1;
                l1 = k2;
            }
label3:
            {
                if (l2 > 11)
                {
                    k2 = 1;
                    i1 = 1;
                    flag6 = flag4;
                    if (!flag9)
                    {
                        break label3;
                    }
                }
                k2 = i1;
                flag6 = flag4;
                if (l2 < 5)
                {
                    flag6 = true;
                    k2 = i1;
                }
            }
            if (i3 > 10)
            {
                flag1 = true;
                flag5 = true;
                i1 = l1;
                j1 = k2;
                flag2 = flag6;
                if (!flag9)
                {
                    break label0;
                }
            }
            flag1 = flag5;
            i1 = l1;
            j1 = k2;
            flag2 = flag6;
            if (i3 < 4)
            {
                i1 = 1;
                flag2 = flag6;
                j1 = k2;
                flag1 = flag5;
            }
        }
        int k1;
        int i2;
        int j2;
label4:
        {
            flag5 = flag1;
            k2 = j1;
            if (j3 == 1)
            {
                k2 = j1;
                if (flag8)
                {
                    if (flag7)
                    {
                        throw gV.a();
                    }
                    j2 = 1;
                    k2 = 1;
                    i2 = i1;
                    k1 = ((flag2) ? 1 : 0);
                    if (!flag9)
                    {
                        break label4;
                    }
                }
                if (!flag7)
                {
                    throw gV.a();
                }
                flag1 = true;
                flag5 = true;
                i2 = i1;
                j2 = k2;
                k1 = ((flag2) ? 1 : 0);
                if (!flag9)
                {
                    break label4;
                }
            }
            i2 = i1;
            flag1 = flag2;
            if (j3 == -1)
            {
                if (flag8)
                {
                    if (flag7)
                    {
                        throw gV.a();
                    }
                    k1 = 1;
                    flag2 = true;
                    flag1 = flag5;
                    i2 = i1;
                    j2 = k2;
                    if (!flag9)
                    {
                        break label4;
                    }
                }
                if (!flag7)
                {
                    throw gV.a();
                }
                i2 = 1;
                i1 = 1;
                flag1 = flag5;
                j2 = k2;
                k1 = ((flag2) ? 1 : 0);
                if (!flag9)
                {
                    break label4;
                }
                flag1 = flag2;
                i2 = i1;
            }
            if (j3 == 0)
            {
                boolean flag3 = flag5;
                k1 = i2;
                j2 = k2;
                i1 = ((flag1) ? 1 : 0);
                if (flag8)
                {
                    if (!flag7)
                    {
                        throw gV.a();
                    }
                    i1 = ((flag1) ? 1 : 0);
                    if (l2 < i3)
                    {
                        k1 = 1;
                        i1 = 1;
                        flag1 = true;
                        flag5 = true;
                        j2 = k2;
                        if (!flag9)
                        {
                            break label4;
                        }
                    }
                    j2 = 1;
                    k2 = 1;
                    i2 = 1;
                    flag3 = true;
                    flag1 = flag5;
                    k1 = i1;
                    if (!flag9)
                    {
                        break label4;
                    }
                    j2 = k2;
                    k1 = ((flag3) ? 1 : 0);
                    flag3 = flag5;
                }
                flag1 = flag3;
                i2 = k1;
                k1 = i1;
                if (flag7)
                {
                    throw gV.a();
                }
            } else
            {
                throw gV.a();
            }
        }
        if (k1 != 0)
        {
            if (j2 != 0)
            {
                throw gV.a();
            }
            b(e(), d());
        }
        if (j2 != 0)
        {
            a(e(), d());
        }
        if (i2 != 0)
        {
            if (flag1)
            {
                throw gV.a();
            }
            b(b(), d());
        }
        if (flag1)
        {
            a(b(), c());
        }
    }

    private static boolean a(n n1, n n2)
    {
        int k1 = n1.a();
        int l1 = n2.a();
        int j1 = n1.a().a() * 9 + n2.a().a();
        int i1 = j1;
        if (j1 > 72)
        {
            i1 = j1 - 1;
        }
        j1 = i1;
        if (i1 > 8)
        {
            j1 = i1 - 1;
        }
        return (k1 + l1 * 16) % 79 == j1;
    }

    private int[] a(bQ bq, int i1, boolean flag)
    {
        boolean flag4 = m.c;
        int ai[] = f();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int j2 = bq.b();
        boolean flag3 = false;
        int j1 = i1;
        int l1;
        boolean flag2;
        do
        {
            i1 = j1;
            if (j1 >= j2)
            {
                break;
            }
            boolean flag1;
            if (!bq.e(j1))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag == flag2)
            {
                flag3 = flag2;
                i1 = j1;
                if (!flag4)
                {
                    break;
                }
            }
            i1 = j1 + 1;
            flag3 = flag2;
            j1 = i1;
            if (!flag4)
            {
                continue;
            }
            flag3 = flag2;
            break;
        } while (true);
        l1 = i1;
        flag1 = false;
        flag2 = flag3;
        j1 = i1;
        i1 = ((flag1) ? 1 : 0);
label0:
        do
        {
label1:
            {
                int k1;
                int i2;
label2:
                {
                    if (l1 >= j2)
                    {
                        break label0;
                    }
                    if (bq.e(l1) ^ flag2)
                    {
                        ai[i1] = ai[i1] + 1;
                        k1 = j1;
                        i2 = i1;
                        flag = flag2;
                        if (!flag4)
                        {
                            break label1;
                        }
                    }
                    k1 = j1;
                    i2 = i1;
                    if (i1 == 3)
                    {
                        if (b(ai))
                        {
                            return (new int[] {
                                j1, l1
                            });
                        }
                        j1 += ai[0] + ai[1];
                        ai[0] = ai[2];
                        ai[1] = ai[3];
                        ai[2] = 0;
                        ai[3] = 0;
                        i2 = i1 - 1;
                        k1 = j1;
                        i1 = i2;
                        if (!flag4)
                        {
                            break label2;
                        }
                        k1 = j1;
                    }
                    i1 = i2 + 1;
                }
                ai[i1] = 1;
                if (!flag2)
                {
                    flag = true;
                    i2 = i1;
                } else
                {
                    flag = false;
                    i2 = i1;
                }
            }
            l1++;
            j1 = k1;
            i1 = i2;
            flag2 = flag;
        } while (!flag4);
        throw gV.a();
    }

    private static c6 b(n n1, n n2)
    {
        boolean flag = m.c;
        String s = String.valueOf(0x453af5L * (long)n1.b() + (long)n2.b());
        Object obj = new StringBuilder(14);
        int i1 = 13 - s.length();
        do
        {
            if (i1 <= 0)
            {
                break;
            }
            ((StringBuilder) (obj)).append('0');
            i1--;
        } while (!flag);
        ((StringBuilder) (obj)).append(s);
        int j1 = 0;
        i1 = 0;
        do
        {
label0:
            {
                int k1 = i1;
                if (j1 < 13)
                {
                    int l1 = ((StringBuilder) (obj)).charAt(j1) - 48;
                    k1 = l1;
                    if ((j1 & 1) == 0)
                    {
                        k1 = l1 * 3;
                    }
                    i1 += k1;
                    if (!flag)
                    {
                        break label0;
                    }
                    k1 = i1;
                }
                j1 = 10 - k1 % 10;
                i1 = j1;
                if (j1 == 10)
                {
                    i1 = 0;
                }
                ((StringBuilder) (obj)).append(i1);
                fw afw1[] = n1.a().b();
                fw afw[] = n2.a().b();
                n1 = String.valueOf(((StringBuilder) (obj)).toString());
                n2 = afw1[0];
                obj = afw1[1];
                fw fw2 = afw[0];
                fw fw1 = afw[1];
                S s1 = S.RSS_14;
                return new c6(n1, null, new fw[] {
                    n2, obj, fw2, fw1
                }, s1);
            }
            j1++;
        } while (true);
    }

    public c6 a(int i1, bQ bq, Map map)
    {
        int k1;
        boolean flag;
        flag = m.c;
        n n1 = a(bq, false, i1, map);
        a(((Collection) (p)), n1);
        bq.c();
        map = a(bq, true, i1, map);
        a(((Collection) (j)), ((n) (map)));
        bq.c();
        k1 = p.size();
        i1 = 0;
_L6:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        bq = (n)p.get(i1);
        if (bq.c() <= 1) goto _L4; else goto _L3
_L3:
        int j1;
        int l1;
        l1 = j.size();
        j1 = 0;
_L7:
        if (j1 < l1)
        {
            map = (n)j.get(j1);
            if (map.c() > 1 && a(((n) (bq)), ((n) (map))))
            {
                return b(bq, map);
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_177;
            }
            gh.a++;
        }
_L4:
        if (!flag) goto _L5; else goto _L2
_L2:
        throw gV.a();
_L5:
        i1++;
          goto _L6
        j1++;
          goto _L7
    }

    public void a()
    {
        p.clear();
        j.clear();
    }

    static 
    {
        int ai[] = {
            3, 8, 2, 1
        };
        int ai1[] = {
            3, 3, 7, 1
        };
        int ai2[] = {
            3, 1, 9, 1
        };
        int ai3[] = {
            2, 7, 4, 1
        };
        int ai4[] = {
            2, 3, 8, 1
        };
        k = (new int[][] {
            ai, new int[] {
                3, 5, 5, 1
            }, ai1, ai2, ai3, new int[] {
                2, 5, 6, 1
            }, ai4, new int[] {
                1, 5, 7, 1
            }, new int[] {
                1, 3, 9, 1
            }
        });
    }
}
