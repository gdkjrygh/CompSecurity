// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google:
//            fv, ao, gu, aR, 
//            gA, d6, gY, bE, 
//            d, cp, gV, g4, 
//            gd, eY, fG, fw, 
//            bm

public final class g1
{

    public static int a;
    private static final fv b = new fv();

    private static int a(ao ao1, int i, int j, boolean flag)
    {
        int i1 = a;
        aR ar;
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        ar = null;
        if (a(ao1, i - k))
        {
            ar = ao1.a(i - k).c(j);
        }
        if (ar != null)
        {
            if (flag)
            {
                return ar.a();
            } else
            {
                return ar.d();
            }
        }
        ar = ao1.a(i).b(j);
        if (ar != null)
        {
            if (flag)
            {
                return ar.d();
            } else
            {
                return ar.a();
            }
        }
        if (a(ao1, i - k))
        {
            ar = ao1.a(i - k).b(j);
        }
        if (ar != null)
        {
            if (flag)
            {
                return ar.a();
            } else
            {
                return ar.d();
            }
        }
        boolean flag1 = false;
        j = i;
        i = ((flag1) ? 1 : 0);
        do
        {
            if (!a(ao1, j - k))
            {
                break;
            }
            int l = j - k;
            aR aar[] = ao1.a(l).a();
            int j1 = aar.length;
            j = 0;
            do
            {
                if (j >= j1)
                {
                    break;
                }
                aR ar1 = aar[j];
                if (ar1 != null)
                {
                    if (flag)
                    {
                        j = ar1.a();
                    } else
                    {
                        j = ar1.d();
                    }
                    return k * i * (ar1.a() - ar1.d()) + j;
                }
                j++;
            } while (i1 == 0);
            i++;
            j = l;
        } while (i1 == 0);
        if (flag)
        {
            return ao1.e().d();
        } else
        {
            return ao1.e().b();
        }
    }

    private static int a(d6 d6_1, int i, int j, boolean flag, int k, int l)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        i2 = a;
        if (flag)
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        k1 = 0;
        l1 = i1;
        i1 = k;
_L7:
        j1 = i1;
        if (k1 >= 2) goto _L2; else goto _L1
_L1:
        j1 = i1;
_L6:
        if (!flag || j1 < i)
        {
            i1 = j1;
            if (flag)
            {
                break; /* Loop/switch isn't completed */
            }
            i1 = j1;
            if (j1 >= j)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        i1 = j1;
        if (flag != d6_1.b(j1, l))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Math.abs(k - j1) <= 2) goto _L4; else goto _L3
_L3:
        j1 = k;
_L2:
        return j1;
_L4:
        i1 = j1 + l1;
        j1 = i1;
        if (i2 == 0) goto _L6; else goto _L5
_L5:
        l1 = -l1;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1++;
        j1 = i1;
        if (i2 != 0) goto _L2; else goto _L7
    }

    private static int a(int ai[])
    {
        int l = a;
        int i1 = ai.length;
        int i = -1;
        int j = 0;
        int k;
        do
        {
            k = i;
            if (j >= i1)
            {
                break;
            }
            k = Math.max(i, ai[j]);
            j++;
            i = k;
        } while (l == 0);
        return k;
    }

    private static int a(int ai[], int ai1[], int i)
    {
        if (ai1 != null && ai1.length > i / 2 + 3 || i < 0 || i > 512)
        {
            throw gY.a();
        } else
        {
            return b.a(ai, i, ai1);
        }
    }

    private static aR a(d6 d6_1, int i, int j, boolean flag, int k, int l, int i1, int j1)
    {
        int k1 = a;
        k = a(d6_1, i, j, flag, k, l);
        d6_1 = b(d6_1, i, j, flag, k, l);
        if (d6_1 == null)
        {
            return null;
        }
        j = bE.a(d6_1);
        if (!flag || k1 != 0)
        {
            i = 0;
            do
            {
                if (i >= d6_1.length / 2)
                {
                    break;
                }
                l = d6_1[i];
                d6_1[i] = d6_1[d6_1.length - 1 - i];
                d6_1[d6_1.length - 1 - i] = l;
                i++;
            } while (k1 == 0);
            i = k - j;
        } else
        {
            i = k;
            k += j;
        }
        if (!a(j, i1, j1))
        {
            return null;
        }
        j = d.d(d6_1);
        l = bE.a(j);
        if (l == -1)
        {
            return null;
        } else
        {
            return new aR(i, k, c(j), l);
        }
    }

    private static ao a(g4 g4_1, g4 g4_2)
    {
        bm bm1;
        if (g4_1 != null || g4_2 != null)
        {
            if ((bm1 = b(g4_1, g4_2)) != null)
            {
                return new ao(bm1, gA.a(a(g4_1), a(g4_2)));
            }
        }
        return null;
    }

    private static fG a(int i, int ai[], int ai1[], int ai2[], int ai3[][])
    {
        int ai4[];
        int j;
        int i1;
        i1 = a;
        ai4 = new int[ai2.length];
        j = 100;
_L4:
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        int k = 0;
        do
        {
            if (k >= ai4.length)
            {
                break;
            }
            ai[ai2[k]] = ai3[k][ai4[k]];
            k++;
        } while (i1 == 0);
        fG fg = a(ai, i, ai1);
        return fg;
        gY gy;
        gy;
        int l;
        try
        {
            if (ai4.length == 0)
            {
                throw gY.a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ai;
        }
        l = 0;
_L2:
        int j1;
        if (l >= ai4.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = ai4[l];
        int k1 = ai3[l].length;
        if (j1 < k1 - 1)
        {
            ai4[l] = ai4[l] + 1;
            if (i1 == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        ai4[l] = 0;
        try
        {
            if (l == ai4.length - 1)
            {
                throw gY.a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            throw ai;
        }
        break MISSING_BLOCK_LABEL_166;
        ai;
        try
        {
            throw ai;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[]) { }
        throw ai;
        l++;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        throw gY.a();
        j--;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static fG a(ao ao1)
    {
        boolean flag = false;
        int k = a;
        Object aobj[][] = b(ao1);
        a(ao1, ((cp [][]) (aobj)));
        ArrayList arraylist = new ArrayList();
        int ai[] = new int[ao1.b() * ao1.g()];
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        int i = 0;
        do
        {
            if (i >= ao1.b())
            {
                break;
            }
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= ao1.g())
                    {
                        break label0;
                    }
                    int ai1[] = aobj[i][j + 1].a();
                    int l = ao1.g() * i + j;
                    if (ai1.length == 0)
                    {
                        arraylist.add(Integer.valueOf(l));
                        if (k == 0)
                        {
                            break label1;
                        }
                    }
                    if (ai1.length == 1)
                    {
                        ai[l] = ai1[0];
                        if (k == 0)
                        {
                            break label1;
                        }
                    }
                    arraylist2.add(Integer.valueOf(l));
                    arraylist1.add(ai1);
                }
                j++;
            } while (k == 0);
            i++;
        } while (k == 0);
        aobj = new int[arraylist1.size()][];
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= aobj.length)
            {
                break;
            }
            aobj[i] = (int[])arraylist1.get(i);
            i++;
        } while (k == 0);
        return a(ao1.j(), ai, bE.a(arraylist), bE.a(arraylist2), ((int [][]) (aobj)));
    }

    public static fG a(d6 d6_1, fw fw1, fw fw2, fw fw3, fw fw4, int i, int j)
    {
        g4 g4_1;
        Object obj;
        int k;
        int i2;
        i2 = a;
        fw2 = new gA(d6_1, fw1, fw2, fw3, fw4);
        g4_1 = null;
        k = 0;
        obj = null;
        fw4 = null;
_L14:
        if (k >= 2) goto _L2; else goto _L1
_L1:
        ao ao1;
        if (fw1 != null)
        {
            fw4 = a(d6_1, ((gA) (fw2)), fw1, true, i, j);
        }
        if (fw3 != null)
        {
            g4_1 = a(d6_1, ((gA) (fw2)), fw3, false, i, j);
        }
        ao1 = a(((g4) (fw4)), g4_1);
        if (ao1 == null)
        {
            throw gV.a();
        }
        obj = fw2;
        if (k != 0) goto _L4; else goto _L3
_L3:
        obj = fw2;
        if (ao1.e() == null) goto _L4; else goto _L5
_L5:
        if (ao1.e().h() < fw2.h()) goto _L7; else goto _L6
_L6:
        obj = fw2;
        if (ao1.e().c() <= fw2.c()) goto _L4; else goto _L7
_L7:
        obj = ao1.e();
        fw2 = ((fw) (obj));
        if (i2 == 0) goto _L8; else goto _L4
_L4:
        ao1.a(((gA) (obj)));
        fw2 = ((fw) (obj));
        if (i2 == 0) goto _L10; else goto _L9
_L9:
        fw2 = ((fw) (obj));
_L8:
        if (i2 == 0) goto _L11; else goto _L10
_L10:
        fw1 = ao1;
        fw3 = fw4;
_L12:
        int j2 = fw1.g() + 1;
        fw1.a(0, fw3);
        fw1.a(j2, g4_1);
        int l;
        boolean flag;
        if (fw3 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = 1;
        k = j;
        j = l;
        l = i;
label0:
        do
        {
label1:
            {
label2:
                {
                    if (j > j2)
                    {
                        break label0;
                    }
                    int i1;
                    int j1;
                    int k1;
                    if (flag)
                    {
                        k1 = j;
                    } else
                    {
                        k1 = j2 - j;
                    }
                    if (fw1.a(k1) != null)
                    {
                        j1 = l;
                        i1 = k;
                        if (i2 == 0)
                        {
                            break label1;
                        }
                    }
                    if (k1 == 0 || k1 == j2)
                    {
                        int l1;
                        boolean flag1;
                        if (k1 == 0)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        fw3 = new g4(fw2, flag1);
                        if (i2 == 0)
                        {
                            break label2;
                        }
                    }
                    fw3 = new gu(fw2);
                }
                fw1.a(k1, fw3);
                l1 = fw2.h();
                i = -1;
                do
                {
label3:
                    {
label4:
                        {
                            j1 = l;
                            i1 = k;
                            if (l1 > fw2.c())
                            {
                                break label1;
                            }
                            j1 = a(((ao) (fw1)), k1, l1, flag);
                            if (j1 >= 0)
                            {
                                i1 = j1;
                                if (j1 <= fw2.b())
                                {
                                    break label4;
                                }
                            }
                            if (i == -1 && i2 == 0)
                            {
                                break label3;
                            }
                            i1 = i;
                        }
                        fw4 = a(d6_1, fw2.d(), fw2.b(), flag, i1, l1, l, k);
                        if (fw4 != null)
                        {
                            fw3.a(l1, fw4);
                            l = Math.min(l, fw4.g());
                            k = Math.max(k, fw4.g());
                            i = i1;
                        }
                    }
                    l1++;
                } while (i2 == 0);
                i1 = k;
                j1 = l;
            }
            j++;
            l = j1;
            k = i1;
        } while (i2 == 0);
        return a(((ao) (fw1)));
_L2:
        fw1 = ((fw) (obj));
        fw3 = fw4;
        if (true) goto _L12; else goto _L11
_L11:
        k++;
        obj = ao1;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private static fG a(int ai[], int i, int ai1[])
    {
        if (ai.length == 0)
        {
            throw gd.a();
        } else
        {
            int j = 1 << i + 1;
            int k = a(ai, ai1, j);
            a(ai, j);
            ai = eY.a(ai, String.valueOf(i));
            ai.b(Integer.valueOf(k));
            ai.a(Integer.valueOf(ai1.length));
            return ai;
        }
    }

    private static g4 a(d6 d6_1, gA ga, fw fw1, boolean flag, int i, int j)
    {
        int k1 = a;
        g4 g4_1 = new g4(ga, flag);
        int l = 0;
        do
        {
label0:
            {
label1:
                {
                    if (l >= 2)
                    {
                        break label1;
                    }
                    int k;
                    int i1;
                    int j1;
                    if (l == 0)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = -1;
                    }
                    k = (int)fw1.a();
                    j1 = (int)fw1.b();
label2:
                    do
                    {
label3:
                        {
                            if (j1 > ga.c() || j1 < ga.h())
                            {
                                break label2;
                            }
                            aR ar = a(d6_1, 0, d6_1.b(), flag, k, j1, i, j);
                            if (ar == null)
                            {
                                break label3;
                            }
                            g4_1.a(j1, ar);
                            if (flag)
                            {
                                k = ar.d();
                                if (k1 == 0)
                                {
                                    break label3;
                                }
                            }
                            k = ar.a();
                        }
                        j1 += i1;
                    } while (k1 == 0);
                    if (k1 == 0)
                    {
                        break label0;
                    }
                }
                return g4_1;
            }
            l++;
        } while (true);
    }

    private static gA a(g4 g4_1)
    {
        int l1 = a;
        int ai[];
        if (g4_1 != null)
        {
            if ((ai = g4_1.b()) != null)
            {
                int i2 = a(ai);
                int j1 = ai.length;
                int k = 0;
                int i = 0;
                int j;
                do
                {
                    j = i;
                    if (k >= j1)
                    {
                        break;
                    }
                    j = ai[k];
                    int l = i + (i2 - j);
                    if (j > 0)
                    {
                        j = l;
                        if (l1 == 0)
                        {
                            break;
                        }
                    }
                    k++;
                    i = l;
                    if (l1 == 0)
                    {
                        continue;
                    }
                    j = l;
                    break;
                } while (true);
                aR aar[] = g4_1.a();
                i = 0;
                do
                {
                    k = j;
                    if (j <= 0)
                    {
                        break;
                    }
                    k = j;
                    if (aar[i] != null)
                    {
                        break;
                    }
                    k = j - 1;
                    i++;
                    j = k;
                } while (l1 == 0);
                i = ai.length;
                j = 0;
                int i1 = i - 1;
                do
                {
                    i = j;
                    if (i1 < 0)
                    {
                        break;
                    }
                    int k1 = j + (i2 - ai[i1]);
                    if (ai[i1] > 0)
                    {
                        i = k1;
                        if (l1 == 0)
                        {
                            break;
                        }
                    }
                    i1--;
                    j = k1;
                    if (l1 == 0)
                    {
                        continue;
                    }
                    i = k1;
                    break;
                } while (true);
                j = aar.length - 1;
                do
                {
                    i1 = i;
                    if (i <= 0)
                    {
                        break;
                    }
                    i1 = i;
                    if (aar[j] != null)
                    {
                        break;
                    }
                    i1 = i - 1;
                    j--;
                    i = i1;
                } while (l1 == 0);
                return g4_1.b().a(k, i1, g4_1.a());
            }
        }
        return null;
    }

    private static void a(ao ao1, cp acp[][])
    {
label0:
        {
            int ai[] = acp[0][1].a();
            int i = ao1.g() * ao1.b() - b(ao1.j());
            if (ai.length == 0)
            {
                if (i < 1 || i > 928)
                {
                    throw gV.a();
                }
                acp[0][1].a(i);
                if (a == 0)
                {
                    break label0;
                }
            }
            if (ai[0] != i)
            {
                acp[0][1].a(i);
            }
        }
    }

    private static void a(int ai[], int i)
    {
label0:
        {
            if (ai.length < 4)
            {
                throw gd.a();
            }
            int j = ai[0];
            if (j > ai.length)
            {
                throw gd.a();
            }
            if (j != 0)
            {
                break label0;
            }
            if (i < ai.length)
            {
                ai[0] = ai.length - i;
                if (a == 0)
                {
                    break label0;
                }
            }
            throw gd.a();
        }
    }

    private static boolean a(int i, int j, int k)
    {
        return j - 2 <= i && i <= k + 2;
    }

    private static boolean a(ao ao1, int i)
    {
        return i >= 0 && i <= ao1.g() + 1;
    }

    private static int[] a(int i)
    {
        int j1 = a;
        int ai[] = new int[8];
        int i1 = 0;
        int l = ai.length - 1;
        do
        {
            int j = l;
            int k = i1;
            if ((i & 1) != i1)
            {
                i1 = i & 1;
                l--;
                j = l;
                k = i1;
                if (l < 0)
                {
                    if (j1 == 0)
                    {
                        break;
                    }
                    k = i1;
                    j = l;
                }
            }
            ai[j] = ai[j] + 1;
            i >>= 1;
            l = j;
            i1 = k;
        } while (j1 == 0);
        return ai;
    }

    private static int b(int i)
    {
        return 2 << i;
    }

    private static int b(int ai[])
    {
        return ((((ai[0] - ai[2]) + ai[4]) - ai[6]) + 9) % 9;
    }

    private static bm b(g4 g4_1, g4 g4_2)
    {
        if (g4_1 == null) goto _L2; else goto _L1
_L1:
        g4_1 = g4_1.d();
        if (g4_1 != null) goto _L3; else goto _L2
_L2:
        if (g4_2 != null) goto _L5; else goto _L4
_L4:
        return null;
_L5:
        return g4_2.d();
_L3:
        if (g4_2 != null)
        {
            g4_2 = g4_2.d();
            if (g4_2 != null)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        return g4_1;
        if (g4_1.d() != g4_2.d() && g4_1.b() != g4_2.b() && g4_1.e() != g4_2.e()) goto _L4; else goto _L6
_L6:
        return g4_1;
    }

    private static int[] b(d6 d6_1, int i, int j, boolean flag, int k, int l)
    {
        int i2 = a;
        int ai[] = new int[8];
        int i1;
        int k1;
        boolean flag1;
        if (flag)
        {
            k1 = 1;
        } else
        {
            k1 = -1;
        }
        flag1 = flag;
        i1 = 0;
label0:
        do
        {
            int j1;
            int l1;
            do
            {
                if (!flag || k >= j)
                {
                    l1 = i1;
                    j1 = k;
                    if (flag)
                    {
                        break label0;
                    }
                    l1 = i1;
                    j1 = k;
                    if (k < i)
                    {
                        break label0;
                    }
                }
                l1 = i1;
                j1 = k;
                if (i1 >= ai.length)
                {
                    break label0;
                }
                j1 = k;
                if (d6_1.b(k, l) != flag1)
                {
                    break;
                }
                ai[i1] = ai[i1] + 1;
                j1 = k + k1;
                k = j1;
            } while (i2 == 0);
            l1 = i1 + 1;
            if (!flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            i1 = l1;
            k = j1;
        } while (i2 == 0);
        if (l1 == ai.length || (flag && j1 == j || !flag && j1 == i) && l1 == ai.length - 1)
        {
            return ai;
        } else
        {
            return null;
        }
    }

    private static cp[][] b(ao ao1)
    {
        int i1 = a;
        cp acp[][] = (cp[][])Array.newInstance(com/google/cp, new int[] {
            ao1.b(), ao1.g() + 2
        });
        int i = 0;
        do
        {
            if (i >= acp.length)
            {
                break;
            }
            int j = 0;
            do
            {
                if (j >= acp[i].length)
                {
                    break;
                }
                acp[i][j] = new cp();
                j++;
            } while (i1 == 0);
            i++;
        } while (i1 == 0);
        ao1 = ao1.i();
        int j1 = ao1.length;
        i = 0;
        int k = 0;
        do
        {
label0:
            {
                if (i < j1)
                {
                    gu gu1 = ao1[i];
                    if (gu1 != null)
                    {
                        aR aar[] = gu1.a();
                        int k1 = aar.length;
                        int l = 0;
                        do
                        {
                            if (l >= k1)
                            {
                                break;
                            }
                            aR ar = aar[l];
                            if (ar != null)
                            {
                                int l1 = ar.f();
                                if (l1 >= 0)
                                {
                                    if (l1 >= acp.length)
                                    {
                                        throw gd.a();
                                    }
                                    acp[l1][k].a(ar.e());
                                }
                            }
                            l++;
                        } while (i1 == 0);
                    }
                    k++;
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                return acp;
            }
            i++;
        } while (true);
    }

    private static int c(int i)
    {
        return b(a(i));
    }

}
