// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            fU, by, d6, gh, 
//            fw

public final class dO
{

    private static final int a[] = {
        0, 4, 1, 5
    };
    private static final int b[] = {
        8, 1, 1, 1, 1, 1, 1, 3
    };
    private static final int c[] = {
        7, 1, 1, 3, 1, 1, 1, 2, 1
    };
    private static final int d[] = {
        6, 2, 7, 3
    };

    private static float a(int ai[], int ai1[], float f)
    {
        boolean flag = fU.b;
        int k1 = ai.length;
        int i1 = 0;
        int j = 0;
        int i = 0;
        int l;
        int j1;
        do
        {
            j1 = j;
            l = i;
            if (i1 >= k1)
            {
                break;
            }
            l = i + ai[i1];
            j1 = j + ai1[i1];
            i1++;
            j = j1;
            i = l;
        } while (!flag);
        if (l < j1)
        {
            return (1.0F / 0.0F);
        }
        float f3 = (float)l / (float)j1;
        i = 0;
        float f1 = 0.0F;
        do
        {
label0:
            {
                float f2 = f1;
                if (i < k1)
                {
                    int k = ai[i];
                    f2 = (float)ai1[i] * f3;
                    if ((float)k > f2)
                    {
                        f2 = (float)k - f2;
                    } else
                    {
                        f2 -= k;
                    }
                    if (f2 > f * f3)
                    {
                        return (1.0F / 0.0F);
                    }
                    f1 += f2;
                    if (!flag)
                    {
                        break label0;
                    }
                    f2 = f1;
                }
                return f2 / (float)l;
            }
            i++;
        } while (true);
    }

    public static fU a(by by1, Map map, boolean flag)
    {
        boolean flag1 = fU.b;
        d6 d6_1 = by1.d();
        List list = a(flag, d6_1);
        map = list;
        by1 = d6_1;
        if (list.isEmpty())
        {
            by1 = d6_1.f();
            by1.a();
            map = a(flag, ((d6) (by1)));
        }
        by1 = new fU(by1, map);
        if (flag1)
        {
            gh.a++;
        }
        return by1;
    }

    private static List a(boolean flag, d6 d6_1)
    {
        boolean flag1 = fU.b;
        ArrayList arraylist = new ArrayList();
        int j = 0;
        int k = 0;
        int i = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
                            if (i >= d6_1.c())
                            {
                                break label2;
                            }
                            fw afw[] = a(d6_1, i, k);
                            if (afw[0] == null && afw[3] == null)
                            {
                                if (j == 0 && !flag1)
                                {
                                    break label2;
                                }
                                Iterator iterator = arraylist.iterator();
                                do
                                {
                                    j = i;
                                    if (!iterator.hasNext())
                                    {
                                        break;
                                    }
                                    fw afw1[] = (fw[])iterator.next();
                                    k = i;
                                    if (afw1[1] != null)
                                    {
                                        k = (int)Math.max(i, afw1[1].b());
                                    }
                                    j = k;
                                    if (afw1[3] != null)
                                    {
                                        j = Math.max(k, (int)afw1[3].b());
                                    }
                                    i = j;
                                } while (!flag1);
                                if (!flag1)
                                {
                                    break label0;
                                }
                            }
                            arraylist.add(afw);
                            if (!flag && !flag1)
                            {
                                break label2;
                            }
                            if (afw[2] != null)
                            {
                                i = (int)afw[2].a();
                                j = (int)afw[2].b();
                                if (!flag1)
                                {
                                    break label3;
                                }
                            }
                            i = (int)afw[4].a();
                            j = (int)afw[4].b();
                        }
                        if (!flag1)
                        {
                            break label1;
                        }
                    }
                    return arraylist;
                }
                int l = j;
                j = 1;
                k = i;
                i = l;
                continue;
            }
            k = 0;
            i = j + 5;
            j = 0;
        } while (true);
    }

    private static void a(fw afw[], fw afw1[], int ai[])
    {
        boolean flag = fU.b;
        int i = 0;
        do
        {
            if (i >= ai.length)
            {
                break;
            }
            afw[ai[i]] = afw1[i];
            i++;
        } while (!flag);
    }

    private static int[] a(d6 d6_1, int i, int j, int k, boolean flag, int ai[], int ai1[])
    {
        boolean flag1 = fU.b;
        Arrays.fill(ai1, 0, ai1.length, 0);
        int l1 = ai.length;
        int i1 = 0;
        int l = i;
        do
        {
label0:
            {
                i = l;
                if (d6_1.b(l, j))
                {
                    i = l;
                    if (l > 0)
                    {
                        i = l;
                        if (i1 < 3)
                        {
                            i = l - 1;
                            if (!flag1)
                            {
                                break label0;
                            }
                        }
                    }
                }
                l = 0;
                i1 = i;
label1:
                do
                {
label2:
                    {
                        int j1;
label3:
                        {
                            if (i1 >= k)
                            {
                                break label1;
                            }
                            if (d6_1.b(i1, j) ^ flag)
                            {
                                ai1[l] = ai1[l] + 1;
                                if (!flag1)
                                {
                                    break label2;
                                }
                            }
                            int k1 = l;
                            j1 = i;
                            if (l == l1 - 1)
                            {
                                if (a(ai1, ai, 0.8F) < 0.42F)
                                {
                                    return (new int[] {
                                        i, i1
                                    });
                                }
                                i += ai1[0] + ai1[1];
                                System.arraycopy(ai1, 2, ai1, 0, l1 - 2);
                                ai1[l1 - 2] = 0;
                                ai1[l1 - 1] = 0;
                                k1 = l - 1;
                                l = k1;
                                j1 = i;
                                if (!flag1)
                                {
                                    break label3;
                                }
                                j1 = i;
                            }
                            l = k1 + 1;
                        }
                        ai1[l] = 1;
                        if (!flag)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        i = j1;
                    }
                    i1++;
                } while (!flag1);
                if (l == l1 - 1 && a(ai1, ai, 0.8F) < 0.42F)
                {
                    return (new int[] {
                        i, i1 - 1
                    });
                } else
                {
                    return null;
                }
            }
            i1++;
            l = i;
        } while (true);
    }

    private static fw[] a(d6 d6_1, int i, int j)
    {
        int k = d6_1.c();
        int l = d6_1.b();
        fw afw[] = new fw[8];
        a(afw, a(d6_1, k, l, i, j, b), a);
        if (afw[4] != null)
        {
            j = (int)afw[4].a();
            i = (int)afw[4].b();
        }
        a(afw, a(d6_1, k, l, i, j, c), d);
        return afw;
    }

    private static fw[] a(d6 d6_1, int i, int j, int k, int l, int ai[])
    {
        fw afw[];
        int ai3[];
        int i1;
        boolean flag;
        flag = fU.b;
        afw = new fw[4];
        i1 = 0;
        ai3 = new int[ai.length];
_L22:
        int ai1[];
        if (k >= i)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        ai1 = a(d6_1, l, k, j, false, ai, ai3);
        if (ai1 == null) goto _L2; else goto _L1
_L1:
        if (k <= 0) goto _L4; else goto _L3
_L3:
        int ai2[];
        k--;
        ai2 = a(d6_1, l, k, j, false, ai, ai3);
        if (ai2 == null) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        ai1 = ai2;
_L6:
        i1 = k + 1;
        ai2 = ai1;
        k = i1;
        if (!flag) goto _L10; else goto _L9
_L9:
        k = i1;
_L23:
        if (!flag) goto _L1; else goto _L11
_L11:
        ai2 = ai1;
_L10:
        int j1;
        int k1;
        afw[0] = new fw(ai2[0], k);
        afw[1] = new fw(ai2[1], k);
        i1 = 1;
        k1 = 1;
        j1 = k;
        if (!flag) goto _L13; else goto _L12
_L12:
        i1 = k1;
_L2:
        j1 = k + 5;
        if (!flag) goto _L14; else goto _L13
_L13:
        k = i1;
_L24:
        l = j1 + 1;
        i1 = l;
        if (k == 0) goto _L16; else goto _L15
_L15:
        k = 0;
        ai1 = new int[2];
        ai1[0] = (int)afw[0].a();
        ai1[1] = (int)afw[1].a();
_L20:
        if (l >= i) goto _L18; else goto _L17
_L17:
label0:
        {
            ai2 = a(d6_1, ai1[0], l, j, false, ai, ai3);
            if (ai2 != null && Math.abs(ai1[0] - ai2[0]) < 5 && Math.abs(ai1[1] - ai2[1]) < 5)
            {
                k = 0;
                i1 = 0;
                ai1 = ai2;
                if (!flag)
                {
                    break label0;
                }
                k = i1;
                ai1 = ai2;
            }
            if (k > 25)
            {
                ai2 = ai1;
                i1 = k;
                k1 = l;
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_354;
                }
            }
            k++;
        }
        l++;
        if (!flag) goto _L20; else goto _L19
_L19:
        k1 = l;
        i1 = k;
        ai2 = ai1;
_L21:
        i1 = k1 - (i1 + 1);
        afw[2] = new fw(ai2[0], i1);
        afw[3] = new fw(ai2[1], i1);
_L16:
        if (i1 - j1 < 10)
        {
            i = 0;
            do
            {
                if (i >= afw.length)
                {
                    break;
                }
                afw[i] = null;
                i++;
            } while (!flag);
        }
        return afw;
_L18:
        ai2 = ai1;
        i1 = k;
        k1 = l;
        if (true) goto _L21; else goto _L14
_L14:
        k = j1;
          goto _L22
_L8:
        ai1 = ai2;
          goto _L23
_L4:
        ai2 = ai1;
          goto _L10
        j1 = k;
        k = i1;
          goto _L24
    }

}
