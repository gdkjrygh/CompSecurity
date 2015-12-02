// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google:
//            eM, bQ, t, a0, 
//            gM, cm, S, c6, 
//            fw, gh, gV, gk, 
//            m, fm

public final class eq extends eM
{

    private static final int h[] = {
        4, 20, 52, 104, 204
    };
    private static final int i[][];
    public static int j;
    private static final int n[][];
    private static final int o[][];
    private static final int q[] = {
        7, 5, 4, 3, 1
    };
    private static final int r[] = {
        0, 348, 1388, 2948, 3988
    };
    private final List k = new ArrayList();
    private final List l = new ArrayList(11);
    private final int m[] = new int[2];
    private boolean p;

    public eq()
    {
        p = false;
    }

    private static int a(bQ bq, int i1)
    {
        int j1;
label0:
        {
            if (bq.e(i1))
            {
                j1 = bq.c(bq.a(i1));
                if (j == 0)
                {
                    break label0;
                }
            }
            j1 = bq.a(bq.c(i1));
        }
        return j1;
    }

    static c6 a(List list)
    {
        int i1 = j;
        String s = a0.a(t.a(list)).c();
        fw afw[] = ((gM)list.get(0)).b().b();
        fw afw1[] = ((gM)list.get(list.size() - 1)).b().b();
        list = afw[0];
        fw fw1 = afw[1];
        fw fw2 = afw1[0];
        fw fw3 = afw1[1];
        S s1 = S.RSS_EXPANDED;
        list = new c6(s, null, new fw[] {
            list, fw1, fw2, fw3
        }, s1);
        if (gh.a != 0)
        {
            j = i1 + 1;
        }
        return list;
    }

    private cm a(bQ bq, int i1, boolean flag)
    {
label0:
        {
            int i2 = j;
            if (flag)
            {
                int j1 = m[0] - 1;
                do
                {
                    int k1 = j1;
                    if (j1 < 0)
                    {
                        break;
                    }
                    int l1;
                    try
                    {
                        flag = bq.e(j1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (bQ bq)
                    {
                        throw bq;
                    }
                    k1 = j1;
                    if (flag)
                    {
                        break;
                    }
                    k1 = j1 - 1;
                    j1 = k1;
                } while (i2 == 0);
                j1 = k1 + 1;
                l1 = m[0] - j1;
                k1 = m[1];
                if (i2 == 0)
                {
                    break label0;
                }
            }
            j1 = m[0];
            k1 = bq.a(m[1] + 1);
            l1 = k1 - m[1];
        }
        bq = f();
        System.arraycopy(bq, 0, bq, 1, bq.length - 1);
        bq[0] = l1;
        try
        {
            l1 = a(((int []) (bq)), i);
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            return null;
        }
        return new cm(l1, new int[] {
            j1, k1
        }, j1, k1, i1);
    }

    private List a(List list, int i1)
    {
        int k1 = j;
_L2:
        Object obj;
        int j1;
        int l1;
        if (i1 >= k.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (gk)k.get(i1);
        l.clear();
        l1 = list.size();
        j1 = 0;
_L3:
        if (j1 < l1)
        {
            l.addAll(((gk)list.get(j1)).b());
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_201;
            }
        }
        boolean flag;
        l.addAll(((gk) (obj)).b());
        flag = b(l);
        if (!flag && k1 == 0)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        flag = a();
        if (flag)
        {
            try
            {
                list = l;
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list;
            }
            return list;
        }
        break MISSING_BLOCK_LABEL_148;
        list;
        try
        {
            throw list;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        throw list;
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.addAll(list);
        arraylist.add(obj);
        obj = a(((List) (arraylist)), i1 + 1);
        return ((List) (obj));
        gV gv;
        gv;
        i1++;
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        throw gV.a();
        j1++;
          goto _L3
    }

    private List a(boolean flag)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (k.size() <= 25) goto _L2; else goto _L1
_L1:
        k.clear();
_L4:
        return ((List) (obj1));
        obj;
        throw obj;
_L2:
        gV gv;
        try
        {
            l.clear();
        }
        catch (gV gv1)
        {
            throw gv1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Collections.reverse(k);
        obj1 = a(((List) (new ArrayList())), 0);
        obj = obj1;
_L5:
        obj1 = obj;
        if (flag)
        {
            try
            {
                Collections.reverse(k);
            }
            // Misplaced declaration of an exception variable
            catch (gV gv)
            {
                throw gv;
            }
            return ((List) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        gV gv2;
        gv2;
          goto _L5
    }

    private void a(int i1)
    {
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int k2;
        int l2;
        int i3;
        int j3;
        j1 = 0;
        flag2 = true;
        flag3 = true;
        k2 = j;
        l2 = a(e());
        i3 = a(b());
        j3 = (l2 + i3) - i1;
        if ((l2 & 1) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((i3 & 1) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l2 <= 13) goto _L2; else goto _L1
_L1:
        if (k2 == 0) goto _L4; else goto _L3
_L3:
        i2 = 1;
_L43:
        if (l2 < 4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L41:
        if (i3 <= 13) goto _L6; else goto _L5
_L5:
        if (k2 == 0) goto _L8; else goto _L7
_L7:
        k1 = 1;
_L40:
        j2 = k1;
        if (i3 < 4)
        {
            j1 = 1;
            j2 = k1;
        }
_L39:
        l1 = j2;
        k1 = i2;
        if (j3 != 1) goto _L10; else goto _L9
_L9:
        if (!flag1) goto _L12; else goto _L11
_L11:
        if (flag)
        {
            throw gV.a();
        }
        if (k2 == 0) goto _L14; else goto _L13
_L13:
        k1 = 1;
_L38:
        if (!flag)
        {
            throw gV.a();
        }
        if (k2 == 0) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L10:
        i2 = j1;
        j2 = i1;
        if (j3 != -1) goto _L18; else goto _L17
_L17:
        if (!flag1) goto _L20; else goto _L19
_L19:
        if (flag)
        {
            throw gV.a();
        }
        if (k2 == 0) goto _L22; else goto _L21
_L21:
        i1 = 1;
_L20:
        if (!flag)
        {
            throw gV.a();
        }
        if (k2 == 0) goto _L24; else goto _L23
_L23:
        i2 = 1;
        j2 = i1;
_L18:
        if (j3 != 0) goto _L26; else goto _L25
_L25:
        if (!flag1) goto _L28; else goto _L27
_L27:
        if (!flag)
        {
            throw gV.a();
        }
        if (l2 >= i3) goto _L30; else goto _L29
_L29:
        if (k2 == 0) goto _L32; else goto _L31
_L31:
        k1 = 1;
        i1 = 1;
_L36:
        if (k2 == 0) goto _L34; else goto _L33
_L33:
        l1 = 1;
        j1 = i1;
        i1 = l1;
        l1 = ((flag3) ? 1 : 0);
_L37:
        if (flag)
        {
            throw gV.a();
        }
          goto _L35
_L26:
        throw gV.a();
_L34:
        l1 = 1;
        j1 = i1;
        i1 = l1;
        l1 = ((flag2) ? 1 : 0);
_L35:
        if (j1 != 0)
        {
            if (i1 != 0)
            {
                throw gV.a();
            }
            b(e(), d());
        }
        if (i1 != 0)
        {
            a(e(), d());
        }
        if (l1 != 0)
        {
            if (k1 != 0)
            {
                throw gV.a();
            }
            b(b(), d());
        }
        if (k1 != 0)
        {
            a(b(), c());
        }
        return;
_L32:
        j2 = 1;
        i1 = k1;
        j1 = 1;
        l1 = i2;
        k1 = j2;
          goto _L35
_L30:
        i1 = j2;
        k1 = l1;
          goto _L36
_L28:
        i1 = k1;
        j1 = j2;
        k1 = l1;
        l1 = i2;
          goto _L37
_L24:
        j1 = i1;
        i1 = k1;
        k1 = l1;
        l1 = ((flag2) ? 1 : 0);
          goto _L35
_L22:
        i1 = k1;
        i2 = 1;
        k1 = l1;
        l1 = j1;
        j1 = i2;
          goto _L35
_L16:
        i2 = i1;
        i1 = k1;
        k1 = 1;
        l1 = j1;
        j1 = i2;
          goto _L35
_L14:
        i2 = i1;
        i1 = 1;
        k1 = j2;
        l1 = j1;
        j1 = i2;
          goto _L35
_L12:
        k1 = i2;
        if (true) goto _L38; else goto _L8
_L8:
        j2 = 1;
        if (true) goto _L39; else goto _L6
_L6:
        k1 = 0;
        if (true) goto _L40; else goto _L4
_L4:
        i2 = 1;
        i1 = 0;
        if (true) goto _L41; else goto _L2
_L2:
        i2 = 0;
        if (true) goto _L43; else goto _L42
_L42:
    }

    private void a(int i1, boolean flag)
    {
        int l1 = j;
        boolean flag2 = false;
        boolean flag1 = false;
        int j1 = 0;
        int k1;
        boolean flag3;
        boolean flag4;
        do
        {
            flag3 = flag2;
            flag4 = flag1;
            k1 = j1;
            if (j1 >= k.size())
            {
                break;
            }
            gk gk1 = (gk)k.get(j1);
            if (gk1.a() > i1)
            {
                flag2 = gk1.a(l);
                flag3 = flag2;
                flag4 = flag1;
                k1 = j1;
                if (l1 == 0)
                {
                    break;
                }
            }
            flag1 = gk1.a(l);
            j1++;
            if (l1 == 0)
            {
                continue;
            }
            k1 = j1;
            flag4 = flag1;
            break;
        } while (true);
        for (flag3 = flag2; flag3 || flag4 || a(((Iterable) (l)), ((Iterable) (k)));)
        {
            return;
        }

        k.add(k1, new gk(l, i1, flag));
        a(l, k);
    }

    private void a(bQ bq, List list, int i1)
    {
        int ai[];
        int i3;
        int j3;
label0:
        {
            i3 = j;
            ai = f();
            ai[0] = 0;
            ai[1] = 0;
            ai[2] = 0;
            ai[3] = 0;
            j3 = bq.b();
            if (i1 >= 0 && i3 == 0)
            {
                break label0;
            }
            if (list.isEmpty())
            {
                i1 = 0;
                if (i3 == 0)
                {
                    break label0;
                }
            }
            i1 = ((gM)list.get(list.size() - 1)).b().c()[1];
        }
        int j1;
        boolean flag;
        int k1;
        int i2;
        int j2;
        if (list.size() % 2 != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        flag = j1;
        if (p)
        {
            if (j1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        i2 = 0;
        k1 = i1;
        do
        {
            i1 = k1;
            if (k1 >= j3)
            {
                break;
            }
            boolean flag1;
            if (!bq.e(k1))
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 == 0)
            {
                i2 = j1;
                i1 = k1;
                if (i3 == 0)
                {
                    break;
                }
            }
            i1 = k1 + 1;
            i2 = j1;
            k1 = i1;
            if (i3 == 0)
            {
                continue;
            }
            i2 = j1;
            break;
        } while (true);
        k1 = i1;
        flag1 = false;
        j2 = i2;
        j1 = i1;
        i2 = k1;
        i1 = ((flag1) ? 1 : 0);
label1:
        do
        {
label2:
            {
                int l1;
                int k2;
                int l2;
label3:
                {
                    if (i2 >= j3)
                    {
                        break label1;
                    }
                    if (bq.e(i2) ^ j2)
                    {
                        ai[i1] = ai[i1] + 1;
                        k2 = j1;
                        l2 = i1;
                        l1 = j2;
                        if (i3 == 0)
                        {
                            break label2;
                        }
                    }
                    l1 = j1;
                    k2 = i1;
                    if (i1 == 3)
                    {
                        if (flag)
                        {
                            a(ai);
                        }
                        if (b(ai))
                        {
                            m[0] = j1;
                            m[1] = i2;
                            return;
                        }
                        if (flag)
                        {
                            a(ai);
                        }
                        l1 = j1 + (ai[0] + ai[1]);
                        ai[0] = ai[2];
                        ai[1] = ai[3];
                        ai[2] = 0;
                        ai[3] = 0;
                        k2 = i1 - 1;
                        j1 = l1;
                        i1 = k2;
                        if (i3 == 0)
                        {
                            break label3;
                        }
                    }
                    i1 = k2 + 1;
                    j1 = l1;
                }
                ai[i1] = 1;
                if (j2 == 0)
                {
                    l1 = 1;
                    l2 = i1;
                    k2 = j1;
                } else
                {
                    l1 = 0;
                    k2 = j1;
                    l2 = i1;
                }
            }
            i2++;
            j1 = k2;
            i1 = l2;
            j2 = l1;
        } while (i3 == 0);
        throw gV.a();
    }

    private static void a(List list, List list1)
    {
        int i1;
        i1 = j;
        list1 = list1.iterator();
_L4:
        Object obj;
        boolean flag;
        do
        {
            if (!list1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (gk)list1.next();
        } while (((gk) (obj)).b().size() == list.size() && i1 == 0);
        obj = ((gk) (obj)).b().iterator();
        flag = true;
_L2:
        boolean flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        gM gm = (gM)((Iterator) (obj)).next();
        Iterator iterator = list.iterator();
        flag1 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!gm.equals((gM)iterator.next()))
            {
                continue;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_187;
            }
            flag1 = true;
        } while (i1 == 0);
_L5:
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        flag = false;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            list1.remove();
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        return;
        flag = false;
          goto _L1
        flag1 = true;
          goto _L5
    }

    private static void a(int ai[])
    {
        int j1 = j;
        int k1 = ai.length;
        int i1 = 0;
        do
        {
            if (i1 >= k1 / 2)
            {
                break;
            }
            int l1 = ai[i1];
            ai[i1] = ai[k1 - i1 - 1];
            ai[k1 - i1 - 1] = l1;
            i1++;
        } while (j1 == 0);
    }

    private boolean a()
    {
        boolean flag = true;
        int j2 = j;
        Object obj = (gM)l.get(0);
        m m1 = ((gM) (obj)).d();
        obj = ((gM) (obj)).c();
        if (obj == null)
        {
            return false;
        }
        int i1 = ((m) (obj)).a();
        int j1 = 2;
        int k1 = 1;
        do
        {
label0:
            {
                int i2 = j1;
                int l1 = i1;
                if (k1 < l.size())
                {
                    Object obj1 = (gM)l.get(k1);
                    l1 = i1 + ((gM) (obj1)).d().a();
                    i2 = j1 + 1;
                    obj1 = ((gM) (obj1)).c();
                    j1 = i2;
                    i1 = l1;
                    if (obj1 != null)
                    {
                        i1 = l1 + ((m) (obj1)).a();
                        j1 = i2 + 1;
                    }
                    if (j2 == 0)
                    {
                        break label0;
                    }
                    l1 = i1;
                    i2 = j1;
                }
                if (l1 % 211 + (i2 - 4) * 211 != m1.b())
                {
                    flag = false;
                }
                return flag;
            }
            k1++;
        } while (true);
    }

    private static boolean a(cm cm1, boolean flag, boolean flag1)
    {
        return cm1.a() != 0 || !flag || !flag1;
    }

    private static boolean a(Iterable iterable, Iterable iterable1)
    {
        int i1;
        i1 = j;
        iterable1 = iterable1.iterator();
_L4:
        gk gk1;
        Iterator iterator;
        boolean flag;
        if (!iterable1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        gk1 = (gk)iterable1.next();
        iterator = iterable.iterator();
        flag = true;
_L2:
        boolean flag1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        gM gm = (gM)iterator.next();
        Iterator iterator1 = gk1.b().iterator();
        flag1 = false;
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            if (!gm.equals((gM)iterator1.next()))
            {
                continue;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_163;
            }
            flag1 = true;
        } while (i1 == 0);
_L5:
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        flag = false;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            return true;
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        return false;
        flag = false;
          goto _L1
        flag1 = true;
          goto _L5
    }

    private static boolean b(List list)
    {
        int ai[][];
        int i1;
        int k1;
        int l1;
        k1 = j;
        ai = o;
        l1 = ai.length;
        i1 = 0;
_L10:
        if (i1 >= l1) goto _L2; else goto _L1
_L1:
        int ai1[] = ai[i1];
        if (list.size() > ai1.length && k1 == 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        int j1;
        j1 = 0;
        flag = true;
_L11:
        boolean flag1 = flag;
        if (j1 >= list.size()) goto _L6; else goto _L5
_L5:
        if (((gM)list.get(j1)).b().a() != ai1[j1])
        {
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            flag = false;
        }
        if (k1 == 0) goto _L8; else goto _L7
_L7:
        flag1 = flag;
_L6:
        if (flag1)
        {
            return true;
        }
_L4:
        if (k1 == 0) goto _L9; else goto _L2
_L2:
        return false;
_L9:
        i1++;
          goto _L10
_L8:
        j1++;
          goto _L11
        flag1 = false;
          goto _L6
    }

    public c6 a(int i1, bQ bq, Map map)
    {
        l.clear();
        p = false;
        try
        {
            map = a(a(i1, bq));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            l.clear();
            p = true;
            return a(a(i1, bq));
        }
        return map;
    }

    m a(bQ bq, cm cm1, boolean flag, boolean flag1)
    {
        int ai[];
        int j4;
label0:
        {
            j4 = j;
            ai = a();
            ai[0] = 0;
            ai[1] = 0;
            ai[2] = 0;
            ai[3] = 0;
            ai[4] = 0;
            ai[5] = 0;
            ai[6] = 0;
            ai[7] = 0;
            if (flag1)
            {
                a(bq, cm1.c()[0], ai);
                if (j4 == 0)
                {
                    break label0;
                }
                gh.a++;
            }
            b(bq, cm1.c()[1], ai);
            int i2 = 0;
            int i1 = ai.length - 1;
            do
            {
                if (i2 >= i1)
                {
                    break;
                }
                int i3 = ai[i2];
                ai[i2] = ai[i1];
                ai[i1] = i3;
                i2++;
                i1--;
            } while (j4 == 0);
        }
        float f = (float)a(ai) / (float)17;
        float f1 = (float)(cm1.c()[1] - cm1.c()[0]) / 15F;
        if (Math.abs(f - f1) / f1 > 0.3F)
        {
            throw gV.a();
        }
        bq = e();
        int ai1[] = b();
        float af[] = d();
        float af1[] = c();
        int j3 = 0;
label1:
        do
        {
            float f2;
            int j1;
label2:
            {
                if (j3 >= ai.length)
                {
                    break label1;
                }
                f2 = (1.0F * (float)ai[j3]) / f;
                j1 = (int)(0.5F + f2);
                int j2 = j1;
                if (j1 < 1)
                {
                    if (f2 < 0.3F)
                    {
                        throw gV.a();
                    }
                    j1 = 1;
                    j2 = 1;
                    if (j4 == 0)
                    {
                        break label2;
                    }
                }
                j1 = j2;
                if (j2 > 8)
                {
                    if (f2 > 8.7F)
                    {
                        throw gV.a();
                    }
                    j1 = 8;
                }
            }
label3:
            {
                int k2 = j3 / 2;
                if ((j3 & 1) == 0)
                {
                    bq[k2] = j1;
                    af[k2] = f2 - (float)j1;
                    if (j4 == 0)
                    {
                        break label3;
                    }
                }
                ai1[k2] = j1;
                af1[k2] = f2 - (float)j1;
            }
            j3++;
        } while (j4 == 0);
        a(17);
        j3 = cm1.a();
        int k1;
        int l2;
        int k3;
        int l3;
        int l4;
        if (flag)
        {
            k1 = 0;
        } else
        {
            k1 = 2;
        }
        if (flag1)
        {
            l2 = 0;
        } else
        {
            l2 = 1;
        }
        l4 = (l2 + (j3 * 4 + k1)) - 1;
        j3 = bq.length;
        l2 = 0;
        k1 = 0;
        l3 = j3 - 1;
        do
        {
            j3 = l2;
            k3 = k1;
            if (l3 < 0)
            {
                break;
            }
            j3 = l2;
            if (a(cm1, flag, flag1))
            {
                j3 = l2 + n[l4][l3 * 2] * bq[l3];
            }
            k3 = k1 + bq[l3];
            l3--;
            l2 = j3;
            k1 = k3;
        } while (j4 == 0);
        l2 = ai1.length;
        k1 = 0;
        l3 = l2 - 1;
        do
        {
            l2 = k1;
            if (l3 < 0)
            {
                break;
            }
            l2 = k1;
            if (a(cm1, flag, flag1))
            {
                l2 = k1 + n[l4][l3 * 2 + 1] * ai1[l3];
            }
            l3--;
            k1 = l2;
        } while (j4 == 0);
        if ((k3 & 1) != 0 || k3 > 13 || k3 < 4)
        {
            throw gV.a();
        } else
        {
            int l1 = (13 - k3) / 2;
            int i4 = q[l1];
            k3 = fm.a(bq, i4, true);
            i4 = fm.a(ai1, 9 - i4, false);
            int k4 = h[l1];
            return new m(r[l1] + (k3 * k4 + i4), j3 + l2);
        }
    }

    List a(int i1, bQ bq)
    {
        try
        {
            do
            {
                gM gm = b(bq, l, i1);
                l.add(gm);
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq) { }
        try
        {
            if (l.isEmpty())
            {
                throw bq;
            }
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            throw bq;
        }
        if (!a()) goto _L2; else goto _L1
_L1:
        bq = l;
_L4:
        return bq;
        bq;
        throw bq;
_L2:
        List list;
        boolean flag;
        boolean flag1;
        try
        {
            flag1 = k.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            throw bq;
        }
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, false);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        list = a(false);
        bq = list;
        if (list != null) goto _L4; else goto _L3
_L3:
        list = a(true);
        bq = list;
        if (list != null) goto _L4; else goto _L5
_L5:
        throw gV.a();
    }

    public void a()
    {
        l.clear();
        k.clear();
    }

    gM b(bQ bq, List list, int i1)
    {
        cm cm1;
        m m1;
        boolean flag2;
        int l1 = j;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag3;
        try
        {
            j1 = list.size();
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            throw bq;
        }
        if (j1 % 2 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        try
        {
            flag3 = p;
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            try
            {
                throw bq;
            }
            // Misplaced declaration of an exception variable
            catch (bQ bq)
            {
                throw bq;
            }
        }
        if (flag3)
        {
            if (!flag2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
        }
        j1 = -1;
        flag = true;
        do
        {
label0:
            {
                a(bq, list, j1);
                cm1 = a(bq, i1, flag2);
                if (cm1 == null)
                {
                    int k1 = a(bq, m[0]);
                    j1 = k1;
                    flag1 = flag;
                    if (l1 == 0)
                    {
                        break label0;
                    }
                    j1 = k1;
                }
                flag1 = false;
            }
            flag = flag1;
        } while (flag1);
        m1 = a(bq, cm1, flag2, true);
        if (list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        flag3 = ((gM)list.get(list.size() - 1)).a();
        if (flag3)
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
        break MISSING_BLOCK_LABEL_191;
        bq;
        throw bq;
        try
        {
            bq = a(bq, cm1, flag2, false);
        }
        // Misplaced declaration of an exception variable
        catch (bQ bq)
        {
            bq = null;
        }
        return new gM(m1, bq, cm1, true);
    }

    static 
    {
        int ai[] = {
            3, 6, 4, 1
        };
        int ai1[] = {
            3, 4, 6, 1
        };
        i = (new int[][] {
            new int[] {
                1, 8, 4, 1
            }, ai, ai1, new int[] {
                3, 2, 8, 1
            }, new int[] {
                2, 6, 5, 1
            }, new int[] {
                2, 2, 9, 1
            }
        });
        ai = (new int[] {
            113, 128, 173, 97, 80, 29, 87, 50
        });
        ai1 = (new int[] {
            70, 210, 208, 202, 184, 130, 179, 115
        });
        int ai2[] = {
            55, 165, 73, 8, 24, 72, 5, 15
        };
        n = (new int[][] {
            new int[] {
                1, 3, 9, 27, 81, 32, 96, 77
            }, new int[] {
                20, 60, 180, 118, 143, 7, 21, 63
            }, new int[] {
                189, 145, 13, 39, 117, 140, 209, 205
            }, new int[] {
                193, 157, 49, 147, 19, 57, 171, 91
            }, new int[] {
                62, 186, 136, 197, 169, 85, 44, 132
            }, new int[] {
                185, 133, 188, 142, 4, 12, 36, 108
            }, ai, new int[] {
                150, 28, 84, 41, 123, 158, 52, 156
            }, new int[] {
                46, 138, 203, 187, 139, 206, 196, 166
            }, new int[] {
                76, 17, 51, 153, 37, 111, 122, 155
            }, new int[] {
                43, 129, 176, 106, 107, 110, 119, 146
            }, new int[] {
                16, 48, 144, 10, 30, 90, 59, 177
            }, new int[] {
                109, 116, 137, 200, 178, 112, 125, 164
            }, ai1, new int[] {
                134, 191, 151, 31, 93, 68, 204, 190
            }, new int[] {
                148, 22, 66, 198, 172, 94, 71, 2
            }, new int[] {
                6, 18, 54, 162, 64, 192, 154, 40
            }, new int[] {
                120, 149, 25, 75, 14, 42, 126, 167
            }, new int[] {
                79, 26, 78, 23, 69, 207, 199, 175
            }, new int[] {
                103, 98, 83, 38, 114, 131, 182, 124
            }, new int[] {
                161, 61, 183, 127, 170, 88, 53, 159
            }, ai2, new int[] {
                45, 135, 194, 160, 58, 174, 100, 89
            }
        });
        ai = (new int[] {
            0, 4, 1, 3, 2
        });
        ai1 = (new int[] {
            0, 0, 1, 1, 2, 2, 3, 3
        });
        o = (new int[][] {
            new int[] {
                0, 0
            }, new int[] {
                0, 1, 1
            }, new int[] {
                0, 2, 1, 3
            }, ai, new int[] {
                0, 4, 1, 3, 3, 5
            }, new int[] {
                0, 4, 1, 3, 4, 5, 5
            }, ai1, new int[] {
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
