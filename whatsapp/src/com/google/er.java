// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            eH, gV, bQ, T, 
//            gd, fw, S, c6

public final class er extends eH
{

    static final int b[][] = {
        {
            1, 1, 3, 3, 1
        }, {
            3, 1, 1, 1, 3
        }, {
            1, 3, 1, 1, 3
        }, {
            3, 3, 1, 1, 1
        }, {
            1, 1, 3, 1, 3
        }, {
            3, 1, 3, 1, 1
        }, {
            1, 3, 3, 1, 1
        }, {
            1, 1, 1, 3, 3
        }, {
            3, 1, 1, 3, 1
        }, {
            1, 3, 1, 3, 1
        }
    };
    private static final int c[] = {
        1, 1, 1, 1
    };
    private static final int d[] = {
        1, 1, 3
    };
    private static final int e[] = {
        6, 8, 10, 12, 14
    };
    private int f;

    public er()
    {
        f = -1;
    }

    private static int a(int ai[])
    {
        boolean flag = eH.a;
        float f1 = 0.38F;
        int j = -1;
        int l = b.length;
        int i = 0;
        int k;
        do
        {
            k = j;
            if (i >= l)
            {
                break;
            }
            float f2 = a(ai, b[i], 0.78F);
            if (f2 < f1)
            {
                j = i;
                f1 = f2;
            }
            i++;
            if (!flag)
            {
                continue;
            }
            k = j;
            break;
        } while (true);
        if (k >= 0)
        {
            return k;
        } else
        {
            throw gV.a();
        }
    }

    private void a(bQ bq, int i)
    {
        boolean flag = eH.a;
        int j = f * 10;
        int k;
        if (j >= i)
        {
            j = i;
        }
        k = i - 1;
        i = j;
        do
        {
            j = i;
            if (i <= 0)
            {
                break;
            }
            j = i;
            if (k < 0)
            {
                break;
            }
            if (bq.e(k))
            {
                j = i;
                if (!flag)
                {
                    break;
                }
            }
            j = i - 1;
            k--;
            i = j;
        } while (!flag);
        if (j != 0)
        {
            throw gV.a();
        } else
        {
            return;
        }
    }

    private static void a(bQ bq, int i, int j, StringBuilder stringbuilder)
    {
        boolean flag = eH.a;
        int ai[] = new int[10];
        int ai1[] = new int[5];
        int ai2[] = new int[5];
        do
        {
            if (i >= j)
            {
                break;
            }
            b(bq, i, ai);
            int k = 0;
            do
            {
                if (k >= 5)
                {
                    break;
                }
                int l = k * 2;
                ai1[k] = ai[l];
                ai2[k] = ai[l + 1];
                k++;
            } while (!flag);
            stringbuilder.append((char)(a(ai1) + 48));
            stringbuilder.append((char)(a(ai2) + 48));
            int j1 = ai.length;
            int i1 = 0;
            do
            {
                k = i;
                if (i1 >= j1)
                {
                    break;
                }
                k = i + ai[i1];
                i1++;
                i = k;
            } while (!flag);
            i = k;
        } while (!flag);
    }

    private static int[] a(bQ bq, int i, int ai[])
    {
        boolean flag1 = eH.a;
        int l1 = ai.length;
        int ai1[] = new int[l1];
        int i2 = bq.b();
        int j = i;
        boolean flag = false;
        int i1 = 0;
        int l = i;
        i = ((flag) ? 1 : 0);
label0:
        do
        {
label1:
            {
                int k;
                int j1;
                int k1;
label2:
                {
                    if (l >= i2)
                    {
                        break label0;
                    }
                    if (bq.e(l) ^ i1)
                    {
                        ai1[i] = ai1[i] + 1;
                        j1 = j;
                        k1 = i;
                        k = i1;
                        if (!flag1)
                        {
                            break label1;
                        }
                    }
                    k = j;
                    j1 = i;
                    if (i == l1 - 1)
                    {
                        if (a(ai1, ai, 0.78F) < 0.38F)
                        {
                            return (new int[] {
                                j, l
                            });
                        }
                        k = j + (ai1[0] + ai1[1]);
                        System.arraycopy(ai1, 2, ai1, 0, l1 - 2);
                        ai1[l1 - 2] = 0;
                        ai1[l1 - 1] = 0;
                        j1 = i - 1;
                        j = k;
                        i = j1;
                        if (!flag1)
                        {
                            break label2;
                        }
                    }
                    i = j1 + 1;
                    j = k;
                }
                ai1[i] = 1;
                if (i1 == 0)
                {
                    k = 1;
                    k1 = i;
                    j1 = j;
                } else
                {
                    k = 0;
                    j1 = j;
                    k1 = i;
                }
            }
            l++;
            j = j1;
            i = k1;
            i1 = k;
        } while (!flag1);
        throw gV.a();
    }

    private static int b(bQ bq)
    {
        int i = bq.b();
        int j = bq.c(0);
        if (j == i)
        {
            throw gV.a();
        } else
        {
            return j;
        }
    }

    public c6 a(int i, bQ bq, Map map)
    {
        boolean flag1 = eH.a;
        int ai1[] = a(bq);
        int ai[] = c(bq);
        Object obj = new StringBuilder(20);
        a(bq, ai1[1], ai[0], ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        bq = null;
        if (map != null)
        {
            bq = (int[])(int[])map.get(T.ALLOWED_LENGTHS);
        }
        map = bq;
        if (bq == null)
        {
            map = e;
        }
        int k1 = ((String) (obj)).length();
        int l1 = map.length;
        int l = 0;
        int j = 0;
        int k = 0;
        do
        {
            boolean flag;
label0:
            {
                int i1;
label1:
                {
                    i1 = j;
                    flag = k;
                    if (l >= l1)
                    {
                        break label1;
                    }
                    int j1 = map[l];
                    flag = k;
                    if (k1 == j1)
                    {
                        flag = true;
                        k = 1;
                        i1 = j;
                        if (!flag1)
                        {
                            break label1;
                        }
                        flag = k;
                    }
                    k = j;
                    if (j1 > j)
                    {
                        k = j1;
                    }
                    if (!flag1)
                    {
                        break label0;
                    }
                    i1 = k;
                }
                j = ((flag) ? 1 : 0);
                if (!flag)
                {
                    j = ((flag) ? 1 : 0);
                    if (k1 > i1)
                    {
                        j = 1;
                    }
                }
                if (j == 0)
                {
                    throw gd.a();
                } else
                {
                    bq = new fw(ai1[1], i);
                    map = new fw(ai[0], i);
                    S s = S.ITF;
                    return new c6(((String) (obj)), null, new fw[] {
                        bq, map
                    }, s);
                }
            }
            l++;
            j = k;
            k = ((flag) ? 1 : 0);
        } while (true);
    }

    int[] a(bQ bq)
    {
        int ai[] = a(bq, b(bq), c);
        f = (ai[1] - ai[0]) / 4;
        a(bq, ai[0]);
        return ai;
    }

    int[] c(bQ bq)
    {
        bq.c();
        int ai[];
        ai = a(bq, b(bq), d);
        a(bq, ai[0]);
        int i = ai[0];
        ai[0] = bq.b() - ai[1];
        ai[1] = bq.b() - i;
        bq.c();
        return ai;
        Exception exception;
        exception;
        bq.c();
        throw exception;
    }

}
