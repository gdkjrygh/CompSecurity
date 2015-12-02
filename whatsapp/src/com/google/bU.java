// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google:
//            bP, bW, fw, d6, 
//            fV, br, bz, gh, 
//            gV, ek

public final class bU
{

    public static boolean b;
    private final d6 a;
    private final bP c;

    public bU(d6 d6_1)
    {
        a = d6_1;
        c = new bP(d6_1);
    }

    private static d6 a(d6 d6_1, fw fw1, fw fw2, fw fw3, fw fw4, int i, int j)
    {
        return bW.a().a(d6_1, i, j, 0.5F, 0.5F, (float)i - 0.5F, 0.5F, (float)i - 0.5F, (float)j - 0.5F, 0.5F, (float)j - 0.5F, fw1.a(), fw1.b(), fw4.a(), fw4.b(), fw3.a(), fw3.b(), fw2.a(), fw2.b());
    }

    private fV a(fw fw1, fw fw2)
    {
        boolean flag4 = b;
        int j = (int)fw1.a();
        int i = (int)fw1.b();
        int k1 = (int)fw2.a();
        int l1 = (int)fw2.b();
        d6 d6_1;
        int k;
        int i1;
        boolean flag;
        int i2;
        int j2;
        int k2;
        boolean flag1;
        int j3;
        int k3;
        boolean flag2;
        if (Math.abs(l1 - i) > Math.abs(k1 - j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            int l = k1;
            k1 = l1;
            int j1 = j;
            l1 = l;
            j = i;
            i = j1;
        }
        j3 = Math.abs(l1 - i);
        k3 = Math.abs(k1 - j);
        k2 = -j3 / 2;
        if (j < k1)
        {
            i2 = 1;
        } else
        {
            i2 = -1;
        }
        if (i < l1)
        {
            j2 = 1;
        } else
        {
            j2 = -1;
        }
        flag1 = false;
        d6_1 = a;
        if (flag)
        {
            k = j;
        } else
        {
            k = i;
        }
        if (flag)
        {
            i1 = i;
        } else
        {
            i1 = j;
        }
        flag2 = d6_1.b(k, i1);
        i1 = k2;
        k = ((flag1) ? 1 : 0);
        do
        {
            int l2;
label0:
            {
label1:
                {
                    if (i == l1)
                    {
                        break label1;
                    }
                    d6 d6_2 = a;
                    int i3;
                    boolean flag3;
                    if (flag)
                    {
                        l2 = j;
                    } else
                    {
                        l2 = i;
                    }
                    if (flag)
                    {
                        i3 = i;
                    } else
                    {
                        i3 = j;
                    }
                    flag3 = d6_2.b(l2, i3);
                    if (flag3 != flag2)
                    {
                        flag2 = flag3;
                        k++;
                    }
                    i3 = i1 + k3;
                    l2 = j;
                    i1 = i3;
                    if (i3 > 0)
                    {
                        if (j == k1 && !flag4)
                        {
                            break label1;
                        }
                        l2 = j + i2;
                        i1 = i3 - j3;
                    }
                    i += j2;
                    if (!flag4)
                    {
                        break label0;
                    }
                }
                return new fV(fw1, fw2, k, null);
            }
            j = l2;
        } while (true);
    }

    private fw a(fw fw1, fw fw2, fw fw3, fw fw4, int i)
    {
        fw fw5;
        float f = (float)b(fw1, fw2) / (float)i;
        int j = b(fw3, fw4);
        float f1 = (fw4.a() - fw3.a()) / (float)j;
        float f2 = (fw4.b() - fw3.b()) / (float)j;
        fw5 = new fw(f1 * f + fw4.a(), f * f2 + fw4.b());
        f = (float)b(fw1, fw3) / (float)i;
        i = b(fw2, fw4);
        f1 = (fw4.a() - fw2.a()) / (float)i;
        f2 = (fw4.b() - fw2.b()) / (float)i;
        fw4 = new fw(f1 * f + fw4.a(), f * f2 + fw4.b());
        if (a(fw5)) goto _L2; else goto _L1
_L1:
        if (!a(fw4)) goto _L4; else goto _L3
_L3:
        fw1 = fw4;
_L6:
        return fw1;
_L4:
        return null;
_L2:
        fw1 = fw5;
        if (a(fw4))
        {
            fw1 = fw5;
            if (Math.abs(a(fw3, fw5).c() - a(fw2, fw5).c()) > Math.abs(a(fw3, fw4).c() - a(fw2, fw4).c()))
            {
                return fw4;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private fw a(fw fw1, fw fw2, fw fw3, fw fw4, int i, int j)
    {
        fw fw5;
        float f = (float)b(fw1, fw2) / (float)i;
        int k = b(fw3, fw4);
        float f1 = (fw4.a() - fw3.a()) / (float)k;
        float f2 = (fw4.b() - fw3.b()) / (float)k;
        fw5 = new fw(f1 * f + fw4.a(), f * f2 + fw4.b());
        f = (float)b(fw1, fw3) / (float)j;
        k = b(fw2, fw4);
        f1 = (fw4.a() - fw2.a()) / (float)k;
        f2 = (fw4.b() - fw2.b()) / (float)k;
        fw1 = new fw(f1 * f + fw4.a(), f * f2 + fw4.b());
        if (a(fw5)) goto _L2; else goto _L1
_L1:
        if (!a(fw1)) goto _L4; else goto _L3
_L3:
        return fw1;
_L4:
        return null;
_L2:
        if (!a(fw1))
        {
            return fw5;
        }
        if (Math.abs(i - a(fw3, fw5).c()) + Math.abs(j - a(fw2, fw5).c()) <= Math.abs(i - a(fw3, fw1).c()) + Math.abs(j - a(fw2, fw1).c()))
        {
            return fw5;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static void a(Map map, fw fw1)
    {
        Integer integer = (Integer)map.get(fw1);
        int i;
        if (integer == null)
        {
            i = 1;
        } else
        {
            i = integer.intValue() + 1;
        }
        map.put(fw1, Integer.valueOf(i));
    }

    private boolean a(fw fw1)
    {
        return fw1.a() >= 0.0F && fw1.a() < (float)a.b() && fw1.b() > 0.0F && fw1.b() < (float)a.c();
    }

    private static int b(fw fw1, fw fw2)
    {
        return br.a(fw.a(fw1, fw2));
    }

    public ek a()
    {
        Object obj;
        Object obj3;
        Object obj4;
        fw fw2;
        fw fw3;
        fw fw4;
        fw fw5;
        HashMap hashmap;
        Iterator iterator;
        boolean flag;
        flag = b;
        fw afw[] = c.a();
        fw2 = afw[0];
        fw3 = afw[1];
        fw4 = afw[2];
        fw5 = afw[3];
        Object obj1 = new ArrayList(4);
        ((List) (obj1)).add(a(fw2, fw3));
        ((List) (obj1)).add(a(fw2, fw4));
        ((List) (obj1)).add(a(fw3, fw5));
        ((List) (obj1)).add(a(fw4, fw5));
        Collections.sort(((List) (obj1)), new bz(null));
        obj = (fV)((List) (obj1)).get(0);
        obj1 = (fV)((List) (obj1)).get(1);
        hashmap = new HashMap();
        a(((Map) (hashmap)), ((fV) (obj)).a());
        a(((Map) (hashmap)), ((fV) (obj)).b());
        a(((Map) (hashmap)), ((fV) (obj1)).a());
        a(((Map) (hashmap)), ((fV) (obj1)).b());
        iterator = hashmap.entrySet().iterator();
        obj4 = null;
        obj = null;
        obj3 = null;
_L12:
        Object obj2;
        Object obj5;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_796;
        }
        obj5 = (java.util.Map.Entry)iterator.next();
        obj2 = (fw)((java.util.Map.Entry) (obj5)).getKey();
        if (((Integer)((java.util.Map.Entry) (obj5)).getValue()).intValue() != 2) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        gh.a++;
        obj4 = obj2;
_L2:
        obj5 = obj;
        if (obj != null) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        obj5 = obj2;
_L6:
        obj = obj2;
        obj3 = obj5;
        obj2 = obj4;
_L9:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_810;
        }
_L10:
label0:
        {
label1:
            {
                if (obj3 == null || obj2 == null || obj == null)
                {
                    throw gV.a();
                }
                fw afw1[] = new fw[3];
                afw1[0] = ((fw) (obj3));
                afw1[1] = ((fw) (obj2));
                afw1[2] = ((fw) (obj));
                fw.a(afw1);
                obj4 = afw1[0];
                fw fw1 = afw1[1];
                fw fw6 = afw1[2];
                int i;
                int j;
                int k;
                int l;
                if (hashmap.containsKey(fw2) || flag)
                {
                    if (hashmap.containsKey(fw3) || flag)
                    {
                        if (hashmap.containsKey(fw4) || flag)
                        {
                            obj = fw5;
                        } else
                        {
                            obj = fw4;
                        }
                    } else
                    {
                        obj = fw3;
                    }
                } else
                {
                    obj = fw2;
                }
                k = a(fw6, ((fw) (obj))).c();
                j = a(((fw) (obj4)), ((fw) (obj))).c();
                i = k;
                if ((k & 1) == 1)
                {
                    i = k + 1;
                }
                k = i + 2;
                i = j;
                if ((j & 1) == 1)
                {
                    i = j + 1;
                }
                l = i + 2;
                if (k * 4 < l * 7)
                {
                    j = k;
                    i = l;
                    if (l * 4 < k * 7)
                    {
                        break label1;
                    }
                }
                obj3 = a(fw1, ((fw) (obj4)), fw6, ((fw) (obj)), k, l);
                obj2 = obj3;
                if (obj3 == null)
                {
                    obj2 = obj;
                }
                j = a(fw6, ((fw) (obj2))).c();
                k = a(((fw) (obj4)), ((fw) (obj2))).c();
                i = j;
                if ((j & 1) == 1)
                {
                    i = j + 1;
                }
                j = k;
                if ((k & 1) == 1)
                {
                    j = k + 1;
                }
                obj3 = a(a, fw6, fw1, ((fw) (obj4)), ((fw) (obj2)), i, j);
                if (!flag)
                {
                    break label0;
                }
                k = i;
                i = j;
                j = k;
            }
            obj3 = a(fw1, ((fw) (obj4)), fw6, ((fw) (obj)), Math.min(i, j));
            obj2 = obj3;
            if (obj3 == null)
            {
                obj2 = obj;
            }
            j = Math.max(a(fw6, ((fw) (obj2))).c(), a(((fw) (obj4)), ((fw) (obj2))).c()) + 1;
            i = j;
            if ((j & 1) == 1)
            {
                i = j + 1;
            }
            obj3 = a(a, fw6, fw1, ((fw) (obj4)), ((fw) (obj2)), i, i);
        }
        return new ek(((d6) (obj3)), new fw[] {
            fw6, fw1, obj4, obj2
        });
_L8:
        obj = obj3;
        obj3 = obj2;
        obj2 = obj4;
          goto _L9
_L4:
        obj4 = obj3;
        obj3 = obj;
        obj = obj4;
          goto _L9
        obj2 = obj4;
        obj4 = obj;
        obj = obj3;
        obj3 = obj4;
          goto _L10
        Object obj6 = obj3;
        obj3 = obj;
        obj4 = obj2;
        obj = obj6;
        if (true) goto _L12; else goto _L11
_L11:
    }
}
