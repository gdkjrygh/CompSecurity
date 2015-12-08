// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.f;
import com.google.zxing.g;
import com.google.zxing.oned.rss.a;
import com.google.zxing.oned.rss.b;
import com.google.zxing.oned.rss.expanded.decoders.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned.rss.expanded:
//            a, b

public final class c extends a
{

    private static final int a[] = {
        7, 5, 4, 3, 1
    };
    private static final int b[] = {
        4, 20, 52, 104, 204
    };
    private static final int c[] = {
        0, 348, 1388, 2948, 3988
    };
    private static final int d[][];
    private static final int e[][];
    private static final int f[][];
    private final List g = new ArrayList(11);
    private final List h = new ArrayList();
    private final int i[] = new int[2];
    private boolean j;

    public c()
    {
        j = false;
    }

    private static f a(List list)
    {
        int k = (list.size() << 1) - 1;
        if (((com.google.zxing.oned.rss.expanded.a)list.get(list.size() - 1)).b() == null)
        {
            k--;
        }
        Object obj = new com.google.zxing.common.a(k * 12);
        int k1 = ((com.google.zxing.oned.rss.expanded.a)list.get(0)).b().a();
        int l = 11;
        for (k = 0; l >= 0; k++)
        {
            if ((1 << l & k1) != 0)
            {
                ((com.google.zxing.common.a) (obj)).b(k);
            }
            l--;
        }

        for (int l1 = 1; l1 < list.size();)
        {
            com.google.zxing.oned.rss.expanded.a a1 = (com.google.zxing.oned.rss.expanded.a)list.get(l1);
            int i2 = a1.a().a();
            for (int i1 = 11; i1 >= 0;)
            {
                if ((1 << i1 & i2) != 0)
                {
                    ((com.google.zxing.common.a) (obj)).b(k);
                }
                i1--;
                k++;
            }

            int j1;
            if (a1.b() != null)
            {
                int k2 = a1.b().a();
                int j2 = 11;
                do
                {
                    j1 = k;
                    if (j2 < 0)
                    {
                        break;
                    }
                    if ((1 << j2 & k2) != 0)
                    {
                        ((com.google.zxing.common.a) (obj)).b(k);
                    }
                    j2--;
                    k++;
                } while (true);
            } else
            {
                j1 = k;
            }
            l1++;
            k = j1;
        }

        obj = com.google.zxing.oned.rss.expanded.decoders.j.a(((com.google.zxing.common.a) (obj))).a();
        g ag[] = ((com.google.zxing.oned.rss.expanded.a)list.get(0)).c().c();
        g ag1[] = ((com.google.zxing.oned.rss.expanded.a)list.get(list.size() - 1)).c().c();
        list = ag[0];
        g g1 = ag[1];
        g g2 = ag1[0];
        g g3 = ag1[1];
        BarcodeFormat barcodeformat = BarcodeFormat.RSS_EXPANDED;
        return new f(((String) (obj)), null, new g[] {
            list, g1, g2, g3
        }, barcodeformat);
    }

    private b a(com.google.zxing.common.a a1, com.google.zxing.oned.rss.c c1, boolean flag, boolean flag1)
    {
        int ai1[];
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        int j4;
        int k4;
        int l4;
        int ai[] = c();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        ai[5] = 0;
        ai[6] = 0;
        ai[7] = 0;
        float f1;
        float f2;
        if (flag1)
        {
            b(a1, c1.b()[0], ai);
        } else
        {
            a(a1, c1.b()[1], ai);
            int j1 = 0;
            int k = ai.length - 1;
            while (j1 < k) 
            {
                int i2 = ai[j1];
                ai[j1] = ai[k];
                ai[k] = i2;
                j1++;
                k--;
            }
        }
        f1 = (float)a(ai) / 17F;
        f2 = (float)(c1.b()[1] - c1.b()[0]) / 15F;
        if (Math.abs(f1 - f2) / f2 > 0.3F)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        a1 = f();
        ai1 = g();
        float af[] = d();
        float af1[] = e();
        int k1 = 0;
        while (k1 < ai.length) 
        {
            float f3 = (1.0F * (float)ai[k1]) / f1;
            int j2 = (int)(0.5F + f3);
            int l;
            if (j2 <= 0)
            {
                if (f3 < 0.3F)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                l = 1;
            } else
            {
                l = j2;
                if (j2 > 8)
                {
                    if (f3 > 8.7F)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    l = 8;
                }
            }
            j2 = k1 >> 1;
            if ((k1 & 1) == 0)
            {
                a1[j2] = l;
                af[j2] = f3 - (float)l;
            } else
            {
                ai1[j2] = l;
                af1[j2] = f3 - (float)l;
            }
            k1++;
        }
        j4 = a(f());
        k4 = a(g());
        l4 = (j4 + k4) - 17;
        if ((j4 & 1) == 1)
        {
            flag7 = true;
        } else
        {
            flag7 = false;
        }
        if ((k4 & 1) == 0)
        {
            flag6 = true;
        } else
        {
            flag6 = false;
        }
        flag3 = false;
        flag4 = false;
        if (j4 <= 13) goto _L2; else goto _L1
_L1:
        flag2 = true;
_L6:
        flag5 = false;
        boolean flag8 = false;
        if (k4 > 13)
        {
            flag4 = true;
        } else
        {
            flag4 = flag8;
            if (k4 < 4)
            {
                flag5 = true;
                flag4 = flag8;
            }
        }
        if (l4 == 1)
        {
            if (flag7)
            {
                if (flag6)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag2 = true;
            } else
            {
                if (!flag6)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag4 = true;
            }
        } else
        if (l4 == -1)
        {
            if (flag7)
            {
                if (flag6)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag3 = true;
            } else
            {
                if (!flag6)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag5 = true;
            }
        } else
        if (l4 == 0)
        {
            if (!flag7)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag6)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            if (j4 < k4)
            {
                flag3 = true;
                flag4 = true;
            } else
            {
                flag2 = true;
                flag5 = true;
            }
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
          goto _L3
_L2:
        flag2 = flag4;
        if (j4 < 4)
        {
            flag3 = true;
            flag2 = flag4;
        }
        continue; /* Loop/switch isn't completed */
        if (!flag6) goto _L3; else goto _L4
_L4:
        throw NotFoundException.getNotFoundInstance();
_L3:
        if (flag3)
        {
            if (flag2)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            a(f(), d());
        }
        if (flag2)
        {
            b(f(), d());
        }
        if (flag5)
        {
            if (flag4)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            a(g(), d());
        }
        if (flag4)
        {
            b(g(), e());
        }
        int k2 = c1.a();
        int i1;
        int l1;
        int i4;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 2;
        }
        if (flag1)
        {
            l1 = 0;
        } else
        {
            l1 = 1;
        }
        i4 = (l1 + (k2 * 4 + i1)) - 1;
        i1 = a1.length;
        l1 = 0;
        k2 = i1 - 1;
        int l2;
        for (i1 = 0; k2 >= 0; i1 = l2)
        {
            l2 = i1;
            if (a(c1, flag, flag1))
            {
                l2 = i1 + e[i4][k2 * 2] * a1[k2];
            }
            i1 = a1[k2];
            k2--;
            l1 = i1 + l1;
        }

        k2 = 0;
        for (int i3 = ai1.length - 1; i3 >= 0;)
        {
            int k3 = k2;
            if (a(c1, flag, flag1))
            {
                k3 = k2 + e[i4][i3 * 2 + 1] * ai1[i3];
            }
            i3--;
            k2 = k3;
        }

        if ((l1 & 1) != 0 || l1 > 13 || l1 < 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        l1 = (13 - l1) / 2;
        int l3 = a[l1];
        int j3 = com.google.zxing.oned.rss.f.a(a1, l3, true);
        l3 = com.google.zxing.oned.rss.f.a(ai1, 9 - l3, false);
        i4 = b[l1];
        return new b(c[l1] + (j3 * i4 + l3), i1 + k2);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private com.google.zxing.oned.rss.c a(com.google.zxing.common.a a1, int k, boolean flag)
    {
        int l;
        int i1;
        int j1;
        if (flag)
        {
            for (l = i[0] - 1; l >= 0 && !a1.a(l); l--) { }
            l++;
            j1 = i[0] - l;
            i1 = i[1];
        } else
        {
            l = i[0];
            i1 = a1.d(i[1] + 1);
            j1 = i1 - i[1];
        }
        a1 = b();
        System.arraycopy(a1, 0, a1, 1, a1.length - 1);
        a1[0] = j1;
        try
        {
            j1 = a(((int []) (a1)), d);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.zxing.common.a a1)
        {
            return null;
        }
        return new com.google.zxing.oned.rss.c(j1, new int[] {
            l, i1
        }, l, i1, k);
    }

    private com.google.zxing.oned.rss.expanded.a a(com.google.zxing.common.a a1, List list, int k)
    {
        int l;
        int l1;
        boolean flag3;
        if (list.size() % 2 == 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (j)
        {
            if (!flag3)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
        }
        l1 = 1;
        l = -1;
        do
        {
            int i1;
label0:
            {
                com.google.zxing.oned.rss.c c1;
                b b1;
label1:
                {
                    c1 = b();
                    c1[0] = 0;
                    c1[1] = 0;
                    c1[2] = 0;
                    c1[3] = 0;
                    int l2 = a1.a();
                    boolean flag;
                    boolean flag1;
                    int i2;
                    if (l >= 0)
                    {
                        i1 = l;
                    } else
                    if (list.isEmpty())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = ((com.google.zxing.oned.rss.expanded.a)list.get(list.size() - 1)).c().b()[1];
                    }
                    if (list.size() % 2 != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag1 = flag;
                    if (j)
                    {
                        if (!flag)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    }
                    flag = false;
                    do
                    {
                        i2 = ((flag) ? 1 : 0);
                        if (i1 >= l2)
                        {
                            break;
                        }
                        if (!a1.a(i1))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        i2 = ((flag) ? 1 : 0);
                        if (!flag)
                        {
                            break;
                        }
                        i1++;
                    } while (true);
                    int j1 = i1;
                    int j2 = i2;
                    int k2 = 0;
                    i2 = j1;
                    while (i2 < l2) 
                    {
                        int k1;
                        if ((a1.a(i2) ^ j2) != 0)
                        {
                            c1[k2] = c1[k2] + 1;
                            k1 = j2;
                            j2 = i1;
                        } else
                        {
                            if (k2 == 3)
                            {
                                if (flag1)
                                {
                                    c(c1);
                                }
                                if (b(c1))
                                {
                                    i[0] = i1;
                                    i[1] = i2;
                                    c1 = a(a1, k, flag3);
                                    if (c1 == null)
                                    {
                                        l = i[0];
                                        boolean flag2;
                                        if (a1.a(l))
                                        {
                                            l = a1.c(a1.d(l));
                                        } else
                                        {
                                            l = a1.d(a1.c(l));
                                        }
                                        i1 = l1;
                                    } else
                                    {
                                        i1 = 0;
                                    }
                                    if (i1 != 0)
                                    {
                                        break label0;
                                    }
                                    b1 = a(a1, c1, flag3, true);
                                    if (!list.isEmpty() && ((com.google.zxing.oned.rss.expanded.a)list.get(list.size() - 1)).d())
                                    {
                                        throw NotFoundException.getNotFoundInstance();
                                    }
                                    break label1;
                                }
                                if (flag1)
                                {
                                    c(c1);
                                }
                                k1 = i1 + (c1[0] + c1[1]);
                                c1[0] = c1[2];
                                c1[1] = c1[3];
                                c1[2] = 0;
                                c1[3] = 0;
                                i1 = k2 - 1;
                            } else
                            {
                                k2++;
                                k1 = i1;
                                i1 = k2;
                            }
                            c1[i1] = 1;
                            if (j2 == 0)
                            {
                                flag2 = true;
                                j2 = k1;
                                k2 = i1;
                                k1 = ((flag2) ? 1 : 0);
                            } else
                            {
                                flag2 = false;
                                j2 = k1;
                                k2 = i1;
                                k1 = ((flag2) ? 1 : 0);
                            }
                        }
                        i2++;
                        i1 = j2;
                        j2 = k1;
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                try
                {
                    a1 = a(a1, c1, flag3, false);
                }
                // Misplaced declaration of an exception variable
                catch (com.google.zxing.common.a a1)
                {
                    a1 = null;
                }
                return new com.google.zxing.oned.rss.expanded.a(b1, a1, c1, true);
            }
            l1 = i1;
        } while (true);
    }

    private List a(int k, com.google.zxing.common.a a1)
    {
        try
        {
            do
            {
                com.google.zxing.oned.rss.expanded.a a2 = a(a1, g, k);
                g.add(a2);
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.zxing.common.a a1) { }
        if (g.isEmpty())
        {
            throw a1;
        }
        if (!h()) goto _L2; else goto _L1
_L1:
        a1 = g;
_L8:
        return a1;
_L2:
        int l;
        boolean flag2;
        boolean flag3;
        List list;
        boolean flag;
        if (!h.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = false;
        l = 0;
_L10:
        if (l >= h.size())
        {
            break MISSING_BLOCK_LABEL_516;
        }
        a1 = (com.google.zxing.oned.rss.expanded.b)h.get(l);
        if (a1.b() <= k) goto _L4; else goto _L3
_L3:
        flag3 = a1.a(g);
_L38:
        if (!flag3 && !flag2) goto _L6; else goto _L5
_L5:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        list = a(false);
        a1 = list;
        if (list != null) goto _L8; else goto _L7
_L7:
        list = a(true);
        a1 = list;
        if (list != null) goto _L8; else goto _L9
_L9:
        throw NotFoundException.getNotFoundInstance();
_L4:
        flag2 = a1.a(g);
        l++;
          goto _L10
_L6:
        Iterator iterator;
        a1 = g;
        iterator = h.iterator();
_L20:
        if (!iterator.hasNext()) goto _L12; else goto _L11
_L11:
        Object obj;
        Object obj1;
        obj = (com.google.zxing.oned.rss.expanded.b)iterator.next();
        obj1 = a1.iterator();
_L18:
        Object obj2;
        Iterator iterator1;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_510;
        }
        obj2 = (com.google.zxing.oned.rss.expanded.a)((Iterator) (obj1)).next();
        iterator1 = ((com.google.zxing.oned.rss.expanded.b) (obj)).a().iterator();
_L16:
        if (!iterator1.hasNext()) goto _L14; else goto _L13
_L13:
        if (!((com.google.zxing.oned.rss.expanded.a) (obj2)).equals((com.google.zxing.oned.rss.expanded.a)iterator1.next())) goto _L16; else goto _L15
_L15:
        boolean flag1 = true;
_L36:
        if (flag1) goto _L18; else goto _L17
_L17:
        flag1 = false;
_L37:
        if (!flag1) goto _L20; else goto _L19
_L19:
        flag1 = true;
_L33:
        if (flag1) goto _L5; else goto _L21
_L21:
        h.add(l, new com.google.zxing.oned.rss.expanded.b(g, k, false));
        a1 = g;
        iterator = h.iterator();
_L24:
        if (!iterator.hasNext()) goto _L5; else goto _L22
_L22:
        obj = (com.google.zxing.oned.rss.expanded.b)iterator.next();
        if (((com.google.zxing.oned.rss.expanded.b) (obj)).a().size() == a1.size()) goto _L24; else goto _L23
_L23:
        obj = ((com.google.zxing.oned.rss.expanded.b) (obj)).a().iterator();
_L32:
        if (!((Iterator) (obj)).hasNext()) goto _L26; else goto _L25
_L25:
        obj1 = (com.google.zxing.oned.rss.expanded.a)((Iterator) (obj)).next();
        obj2 = a1.iterator();
_L30:
        if (!((Iterator) (obj2)).hasNext()) goto _L28; else goto _L27
_L27:
        if (!((com.google.zxing.oned.rss.expanded.a) (obj1)).equals((com.google.zxing.oned.rss.expanded.a)((Iterator) (obj2)).next())) goto _L30; else goto _L29
_L29:
        k = 1;
_L34:
        if (k != 0) goto _L32; else goto _L31
_L31:
        k = 0;
_L35:
        if (k != 0)
        {
            iterator.remove();
        }
          goto _L24
_L12:
        flag1 = false;
          goto _L33
_L28:
        k = 0;
          goto _L34
_L26:
        k = 1;
          goto _L35
_L14:
        flag1 = false;
          goto _L36
        flag1 = true;
          goto _L37
        flag3 = false;
          goto _L38
    }

    private List a(List list, int k)
    {
_L10:
        if (k >= h.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        int ai[][];
        int i1;
        int l1;
        obj = (com.google.zxing.oned.rss.expanded.b)h.get(k);
        g.clear();
        int j1 = list.size();
        for (int l = 0; l < j1; l++)
        {
            g.addAll(((com.google.zxing.oned.rss.expanded.b)list.get(l)).a());
        }

        g.addAll(((com.google.zxing.oned.rss.expanded.b) (obj)).a());
        obj1 = g;
        ai = f;
        l1 = ai.length;
        i1 = 0;
_L9:
        if (i1 >= l1) goto _L4; else goto _L3
_L3:
        int ai1[];
        int k1;
        ai1 = ai[i1];
        if (((List) (obj1)).size() > ai1.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = 0;
_L8:
        if (k1 >= ((List) (obj1)).size())
        {
            break MISSING_BLOCK_LABEL_291;
        }
        if (((com.google.zxing.oned.rss.expanded.a)((List) (obj1)).get(k1)).c().a() == ai1[k1]) goto _L6; else goto _L5
_L5:
        k1 = 0;
_L11:
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 1;
          goto _L7
_L6:
        k1++;
          goto _L8
        i1++;
          goto _L9
_L4:
        i1 = 0;
_L7:
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (h())
        {
            return g;
        }
        obj1 = new ArrayList();
        ((List) (obj1)).addAll(list);
        ((List) (obj1)).add(obj);
        obj = a(((List) (obj1)), k + 1);
        return ((List) (obj));
        NotFoundException notfoundexception;
        notfoundexception;
        k++;
          goto _L10
_L2:
        throw NotFoundException.getNotFoundInstance();
        k1 = 1;
          goto _L11
    }

    private List a(boolean flag)
    {
        List list;
        List list1;
        list = null;
        list1 = null;
        if (h.size() <= 25) goto _L2; else goto _L1
_L1:
        h.clear();
_L4:
        return list1;
_L2:
        g.clear();
        if (flag)
        {
            Collections.reverse(h);
        }
        list1 = a(((List) (new ArrayList())), 0);
        list = list1;
_L5:
        list1 = list;
        if (flag)
        {
            Collections.reverse(h);
            return list;
        }
        if (true) goto _L4; else goto _L3
_L3:
        NotFoundException notfoundexception;
        notfoundexception;
          goto _L5
    }

    private static boolean a(com.google.zxing.oned.rss.c c1, boolean flag, boolean flag1)
    {
        return c1.a() != 0 || !flag || !flag1;
    }

    private static void c(int ai[])
    {
        int l = ai.length;
        for (int k = 0; k < l / 2; k++)
        {
            int i1 = ai[k];
            ai[k] = ai[l - k - 1];
            ai[l - k - 1] = i1;
        }

    }

    private boolean h()
    {
        boolean flag = true;
        Object obj = (com.google.zxing.oned.rss.expanded.a)g.get(0);
        b b1 = ((com.google.zxing.oned.rss.expanded.a) (obj)).a();
        obj = ((com.google.zxing.oned.rss.expanded.a) (obj)).b();
        if (obj == null)
        {
            flag = false;
        } else
        {
            int k = ((b) (obj)).b();
            int l = 2;
            for (int i1 = 1; i1 < g.size(); i1++)
            {
                Object obj1 = (com.google.zxing.oned.rss.expanded.a)g.get(i1);
                int j1 = k + ((com.google.zxing.oned.rss.expanded.a) (obj1)).a().b();
                int k1 = l + 1;
                obj1 = ((com.google.zxing.oned.rss.expanded.a) (obj1)).b();
                l = k1;
                k = j1;
                if (obj1 != null)
                {
                    k = j1 + ((b) (obj1)).b();
                    l = k1 + 1;
                }
            }

            if (k % 211 + (l - 4) * 211 != b1.a())
            {
                return false;
            }
        }
        return flag;
    }

    public final f a(int k, com.google.zxing.common.a a1, Map map)
    {
        g.clear();
        j = false;
        try
        {
            map = a(a(k, a1));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            g.clear();
            j = true;
            return a(a(k, a1));
        }
        return map;
    }

    public final void a()
    {
        g.clear();
        h.clear();
    }

    static 
    {
        int ai[] = {
            3, 6, 4, 1
        };
        int ai1[] = {
            3, 2, 8, 1
        };
        int ai2[] = {
            2, 6, 5, 1
        };
        int ai3[] = {
            2, 2, 9, 1
        };
        d = (new int[][] {
            new int[] {
                1, 8, 4, 1
            }, ai, new int[] {
                3, 4, 6, 1
            }, ai1, ai2, ai3
        });
        ai = (new int[] {
            62, 186, 136, 197, 169, 85, 44, 132
        });
        ai1 = (new int[] {
            185, 133, 188, 142, 4, 12, 36, 108
        });
        ai2 = (new int[] {
            150, 28, 84, 41, 123, 158, 52, 156
        });
        ai3 = (new int[] {
            79, 26, 78, 23, 69, 207, 199, 175
        });
        int ai4[] = {
            103, 98, 83, 38, 114, 131, 182, 124
        };
        e = (new int[][] {
            new int[] {
                1, 3, 9, 27, 81, 32, 96, 77
            }, new int[] {
                20, 60, 180, 118, 143, 7, 21, 63
            }, new int[] {
                189, 145, 13, 39, 117, 140, 209, 205
            }, new int[] {
                193, 157, 49, 147, 19, 57, 171, 91
            }, ai, ai1, new int[] {
                113, 128, 173, 97, 80, 29, 87, 50
            }, ai2, new int[] {
                46, 138, 203, 187, 139, 206, 196, 166
            }, new int[] {
                76, 17, 51, 153, 37, 111, 122, 155
            }, new int[] {
                43, 129, 176, 106, 107, 110, 119, 146
            }, new int[] {
                16, 48, 144, 10, 30, 90, 59, 177
            }, new int[] {
                109, 116, 137, 200, 178, 112, 125, 164
            }, new int[] {
                70, 210, 208, 202, 184, 130, 179, 115
            }, new int[] {
                134, 191, 151, 31, 93, 68, 204, 190
            }, new int[] {
                148, 22, 66, 198, 172, 94, 71, 2
            }, new int[] {
                6, 18, 54, 162, 64, 192, 154, 40
            }, new int[] {
                120, 149, 25, 75, 14, 42, 126, 167
            }, ai3, ai4, new int[] {
                161, 61, 183, 127, 170, 88, 53, 159
            }, new int[] {
                55, 165, 73, 8, 24, 72, 5, 15
            }, new int[] {
                45, 135, 194, 160, 58, 174, 100, 89
            }
        });
        ai = (new int[] {
            0, 0
        });
        ai1 = (new int[] {
            0, 1, 1
        });
        ai2 = (new int[] {
            0, 4, 1, 3, 3, 5
        });
        ai3 = (new int[] {
            0, 4, 1, 3, 4, 5, 5
        });
        ai4 = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 3
        });
        f = (new int[][] {
            ai, ai1, new int[] {
                0, 2, 1, 3
            }, new int[] {
                0, 4, 1, 3, 2
            }, ai2, ai3, ai4, new int[] {
                0, 0, 1, 1, 2, 2, 3, 4, 4
            }, new int[] {
                0, 0, 1, 1, 2, 2, 3, 4, 5, 5
            }, new int[] {
                0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 
                5
            }
        });
    }
}
