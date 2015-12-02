// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google:
//            eH, eS, cZ, gV, 
//            gd, bQ, gh, fw, 
//            f, T, gY, c6, 
//            bC, S

public abstract class e9 extends eH
{

    static final int c[][];
    static final int d[] = {
        1, 1, 1, 1, 1
    };
    static final int f[] = {
        1, 1, 1
    };
    static final int g[][];
    private final StringBuilder b = new StringBuilder(20);
    private final eS e = new eS();
    private final cZ h = new cZ();

    protected e9()
    {
    }

    static int a(bQ bq, int ai[], int i, int ai1[][])
    {
        boolean flag = eH.a;
        b(bq, i, ai);
        float f1 = 0.48F;
        int j = -1;
        int l = ai1.length;
        i = 0;
        int k;
        do
        {
            k = j;
            if (i >= l)
            {
                break;
            }
            float f2 = a(ai, ai1[i], 0.7F);
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

    static boolean a(CharSequence charsequence)
    {
        boolean flag = eH.a;
        int l = charsequence.length();
        if (l == 0)
        {
            return false;
        }
        int j = l - 2;
        int i = 0;
        int k;
        do
        {
            k = i;
            if (j < 0)
            {
                break;
            }
            k = charsequence.charAt(j) - 48;
            if (k < 0 || k > 9)
            {
                throw gd.a();
            }
            k = i + k;
            j -= 2;
            i = k;
        } while (!flag);
        i = k * 3;
        j = l - 1;
        do
        {
            k = i;
            if (j < 0)
            {
                break;
            }
            k = charsequence.charAt(j) - 48;
            if (k < 0 || k > 9)
            {
                throw gd.a();
            }
            k = i + k;
            j -= 2;
            i = k;
        } while (!flag);
        if (k % 10 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    static int[] a(bQ bq)
    {
        boolean flag1 = eH.a;
        int ai[] = null;
        int ai2[] = new int[f.length];
        int i = 0;
        boolean flag = false;
        do
        {
            if (flag)
            {
                break;
            }
            Arrays.fill(ai2, 0, f.length, 0);
            int ai1[] = a(bq, i, false, f, ai2);
            int j = ai1[0];
            i = ai1[1];
            int k = j - (i - j);
            if (k >= 0)
            {
                flag = bq.a(k, j, false);
            }
            ai = ai1;
            if (!flag1)
            {
                continue;
            }
            ai = ai1;
            break;
        } while (true);
        return ai;
    }

    static int[] a(bQ bq, int i, boolean flag, int ai[])
    {
        return a(bq, i, flag, ai, new int[ai.length]);
    }

    private static int[] a(bQ bq, int i, boolean flag, int ai[], int ai1[])
    {
        boolean flag2 = eH.a;
        int k1 = ai.length;
        int l1 = bq.b();
        int j;
        int l;
        boolean flag1;
        if (flag)
        {
            i = bq.a(i);
        } else
        {
            i = bq.c(i);
        }
        j = 0;
        l = i;
        flag1 = flag;
label0:
        do
        {
label1:
            {
                int k;
                int i1;
label2:
                {
                    if (l >= l1)
                    {
                        break label0;
                    }
                    if (bq.e(l) ^ flag1)
                    {
                        ai1[j] = ai1[j] + 1;
                        k = i;
                        i1 = j;
                        flag = flag1;
                        if (!flag2)
                        {
                            break label1;
                        }
                    }
                    k = i;
                    int j1 = j;
                    if (j == k1 - 1)
                    {
                        if (a(ai1, ai, 0.7F) < 0.48F)
                        {
                            return (new int[] {
                                i, l
                            });
                        }
                        i1 = i + (ai1[0] + ai1[1]);
                        System.arraycopy(ai1, 2, ai1, 0, k1 - 2);
                        ai1[k1 - 2] = 0;
                        ai1[k1 - 1] = 0;
                        j1 = j - 1;
                        k = i1;
                        i = j1;
                        if (!flag2)
                        {
                            break label2;
                        }
                        k = i1;
                    }
                    i = j1 + 1;
                }
                ai1[i] = 1;
                if (!flag1)
                {
                    flag = true;
                    i1 = i;
                } else
                {
                    flag = false;
                    i1 = i;
                }
            }
            l++;
            i = k;
            j = i1;
            flag1 = flag;
        } while (!flag2);
        throw gV.a();
    }

    protected abstract int a(bQ bq, int ai[], StringBuilder stringbuilder);

    abstract S a();

    public c6 a(int i, bQ bq, Map map)
    {
        return a(i, bq, a(bq), map);
    }

    public c6 a(int i, bQ bq, int ai[], Map map)
    {
        Object obj;
        int ai1[];
        boolean flag;
        flag = eH.a;
        f f3;
        int j;
        int l;
        boolean flag1;
        if (map == null)
        {
            f3 = null;
        } else
        {
            f3 = (f)map.get(T.NEED_RESULT_POINT_CALLBACK);
        }
        if (f3 != null)
        {
            try
            {
                f3.a(new fw((float)(ai[0] + ai[1]) / 2.0F, i));
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
        }
        obj = b;
        ((StringBuilder) (obj)).setLength(0);
        j = a(bq, ai, ((StringBuilder) (obj)));
        if (f3 != null)
        {
            try
            {
                f3.a(new fw(j, i));
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
        }
        ai1 = a(bq, j);
        if (f3 != null)
        {
            try
            {
                f3.a(new fw((float)(ai1[0] + ai1[1]) / 2.0F, i));
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
        }
        j = ai1[1];
        l = (j - ai1[0]) + j;
        if (l >= bq.b())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        flag1 = bq.a(j, l, false);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        try
        {
            throw gV.a();
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            throw bq;
        }
        bq;
        throw bq;
label0:
        {
label1:
            {
                String s = ((StringBuilder) (obj)).toString();
                try
                {
                    if (s.length() < 8)
                    {
                        throw gd.a();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    throw bq;
                }
                try
                {
                    if (!a(s))
                    {
                        throw gY.a();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    throw bq;
                }
                float f1 = (float)(ai[1] + ai[0]) / 2.0F;
                float f2 = (float)(ai1[1] + ai1[0]) / 2.0F;
                obj = a();
                ai = new c6(s, null, new fw[] {
                    new fw(f1, i), new fw(f2, i)
                }, ((S) (obj)));
                int i1;
                try
                {
                    bq = e.a(i, bq, ai1[1]);
                    ai.a(bC.UPC_EAN_EXTENSION, bq.e());
                    ai.a(bq.b());
                    ai.a(bq.a());
                    i1 = bq.e().length();
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    i1 = 0;
                }
                if (map == null)
                {
                    bq = null;
                } else
                {
                    bq = (int[])(int[])map.get(T.ALLOWED_EAN_EXTENSIONS);
                }
                if (bq != null)
                {
                    int k1 = bq.length;
                    i = 0;
                    int j1 = 0;
                    int k;
                    do
                    {
                        k = i;
                        if (j1 >= k1)
                        {
                            break;
                        }
                        k = i;
                        if (i1 == bq[j1])
                        {
                            k = 1;
                            i = 1;
                            if (!flag)
                            {
                                break;
                            }
                            k = i;
                        }
                        j1++;
                        i = k;
                    } while (!flag);
                    if (k == 0)
                    {
                        try
                        {
                            throw gV.a();
                        }
                        // Misplaced declaration of an exception variable
                        catch (bQ bq)
                        {
                            throw bq;
                        }
                    }
                }
                try
                {
                    if (obj == S.EAN_13)
                    {
                        break label1;
                    }
                    bq = S.UPC_A;
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    throw bq;
                }
                if (obj != bq)
                {
                    break label0;
                }
            }
            bq = h.a(s);
            if (bq != null)
            {
                try
                {
                    ai.a(bC.POSSIBLE_COUNTRY, bq);
                }
                // Misplaced declaration of an exception variable
                catch (bQ bq)
                {
                    throw bq;
                }
            }
        }
        return ai;
    }

    boolean a(String s)
    {
        return a(((CharSequence) (s)));
    }

    int[] a(bQ bq, int i)
    {
        return a(bq, i, false, f);
    }

    static 
    {
        int ai[] = {
            1, 4, 1, 1
        };
        int ai2[] = {
            1, 2, 3, 1
        };
        int ai4[] = {
            1, 1, 1, 4
        };
        g = (new int[][] {
            new int[] {
                3, 2, 1, 1
            }, new int[] {
                2, 2, 2, 1
            }, new int[] {
                2, 1, 2, 2
            }, ai, new int[] {
                1, 1, 3, 2
            }, ai2, ai4, new int[] {
                1, 3, 1, 2
            }, new int[] {
                1, 2, 1, 3
            }, new int[] {
                3, 1, 1, 2
            }
        });
        c = new int[20][];
        System.arraycopy(g, 0, c, 0, 10);
        for (int i = 10; i < 20; i++)
        {
            int ai1[] = g[i - 10];
            int ai3[] = new int[ai1.length];
            for (int j = 0; j < ai1.length; j++)
            {
                ai3[j] = ai1[ai1.length - j - 1];
            }

            c[i] = ai3;
        }

    }
}
