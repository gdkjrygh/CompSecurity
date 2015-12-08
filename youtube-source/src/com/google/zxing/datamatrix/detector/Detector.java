// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.a.b;
import com.google.zxing.common.f;
import com.google.zxing.common.h;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.zxing.datamatrix.detector:
//            b

public final class Detector
{

    private final com.google.zxing.common.b a;
    private final b b;

    public Detector(com.google.zxing.common.b b1)
    {
        a = b1;
        b = new b(b1);
    }

    private static int a(g g1, g g2)
    {
        return (int)(g.a(g1, g2) + 0.5F);
    }

    private static com.google.zxing.common.b a(com.google.zxing.common.b b1, g g1, g g2, g g3, g g4, int i, int j)
    {
        return h.a().a(b1, i, j, 0.5F, 0.5F, (float)i - 0.5F, 0.5F, (float)i - 0.5F, (float)j - 0.5F, 0.5F, (float)j - 0.5F, g1.a(), g1.b(), g4.a(), g4.b(), g3.a(), g3.b(), g2.a(), g2.b());
    }

    private static void a(Map map, g g1)
    {
        Integer integer = (Integer)map.get(g1);
        int i;
        if (integer == null)
        {
            i = 1;
        } else
        {
            i = integer.intValue() + 1;
        }
        map.put(g1, Integer.valueOf(i));
    }

    private boolean a(g g1)
    {
        return g1.a() >= 0.0F && g1.a() < (float)a.d() && g1.b() > 0.0F && g1.b() < (float)a.e();
    }

    private com.google.zxing.datamatrix.detector.b b(g g1, g g2)
    {
        int j = (int)g1.a();
        int i = (int)g1.b();
        int k1 = (int)g2.a();
        int l1 = (int)g2.b();
        com.google.zxing.common.b b1;
        int k;
        int i1;
        boolean flag;
        int i2;
        int j2;
        int k2;
        int l2;
        int j3;
        int k3;
        boolean flag1;
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
        k2 = -j3;
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
        l2 = 0;
        b1 = a;
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
        flag1 = b1.a(k, i1);
        k2 >>= 1;
        k = l2;
        do
        {
            l2 = k;
            if (i == l1)
            {
                break;
            }
            com.google.zxing.common.b b2 = a;
            int i3;
            boolean flag2;
            boolean flag3;
            if (flag)
            {
                i1 = j;
            } else
            {
                i1 = i;
            }
            if (flag)
            {
                l2 = i;
            } else
            {
                l2 = j;
            }
            flag3 = b2.a(i1, l2);
            i1 = k;
            flag2 = flag1;
            if (flag3 != flag1)
            {
                i1 = k + 1;
                flag2 = flag3;
            }
            i3 = k2 + k3;
            k = i3;
            k2 = j;
            if (i3 > 0)
            {
                l2 = i1;
                if (j == k1)
                {
                    break;
                }
                k2 = j + i2;
                k = i3 - j3;
            }
            i += j2;
            l2 = k;
            j = k2;
            k = i1;
            flag1 = flag2;
            k2 = l2;
        } while (true);
        return new com.google.zxing.datamatrix.detector.b(g1, g2, l2, (byte)0);
    }

    public final f a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        g g1;
        Object obj3;
        g g6;
        g g7;
        int i;
        int j1;
        g ag[] = b.a();
        g g2 = ag[0];
        g g3 = ag[1];
        g g4 = ag[2];
        g g5 = ag[3];
        obj1 = new ArrayList(4);
        ((List) (obj1)).add(b(g2, g3));
        ((List) (obj1)).add(b(g2, g4));
        ((List) (obj1)).add(b(g3, g5));
        ((List) (obj1)).add(b(g4, g5));
        Collections.sort(((List) (obj1)), new ResultPointsAndTransitionsComparator(null));
        obj = (com.google.zxing.datamatrix.detector.b)((List) (obj1)).get(0);
        obj1 = (com.google.zxing.datamatrix.detector.b)((List) (obj1)).get(1);
        HashMap hashmap = new HashMap();
        a(((Map) (hashmap)), ((com.google.zxing.datamatrix.detector.b) (obj)).a());
        a(((Map) (hashmap)), ((com.google.zxing.datamatrix.detector.b) (obj)).b());
        a(((Map) (hashmap)), ((com.google.zxing.datamatrix.detector.b) (obj1)).a());
        a(((Map) (hashmap)), ((com.google.zxing.datamatrix.detector.b) (obj1)).b());
        obj3 = hashmap.entrySet().iterator();
        obj2 = null;
        obj1 = null;
        g1 = null;
        while (((Iterator) (obj3)).hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj3)).next();
            obj = (g)entry.getKey();
            if (((Integer)entry.getValue()).intValue() == 2)
            {
                obj2 = obj;
            } else
            if (obj1 == null)
            {
                obj1 = obj;
            } else
            {
                g1 = ((g) (obj));
            }
        }
        if (obj1 == null || obj2 == null || g1 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        obj = new g[3];
        obj[0] = ((g) (obj1));
        obj[1] = ((g) (obj2));
        obj[2] = g1;
        g.a(((g []) (obj)));
        obj3 = obj[0];
        g6 = obj[1];
        g7 = obj[2];
        float f1;
        float f3;
        float f5;
        int k;
        if (!hashmap.containsKey(g2))
        {
            obj = g2;
        } else
        if (!hashmap.containsKey(g3))
        {
            obj = g3;
        } else
        if (!hashmap.containsKey(g4))
        {
            obj = g4;
        } else
        {
            obj = g5;
        }
        j1 = b(g7, ((g) (obj))).c();
        k = b(((g) (obj3)), ((g) (obj))).c();
        i = j1;
        if ((j1 & 1) == 1)
        {
            i = j1 + 1;
        }
        j1 = i + 2;
        i = k;
        if ((k & 1) == 1)
        {
            i = k + 1;
        }
        i += 2;
        if (j1 * 4 < i * 7 && i * 4 < j1 * 7) goto _L2; else goto _L1
_L1:
        f1 = (float)a(g6, ((g) (obj3))) / (float)j1;
        k = a(g7, ((g) (obj)));
        f3 = (((g) (obj)).a() - g7.a()) / (float)k;
        f5 = (((g) (obj)).b() - g7.b()) / (float)k;
        obj2 = new g(f3 * f1 + ((g) (obj)).a(), f1 * f5 + ((g) (obj)).b());
        f1 = (float)a(g6, g7) / (float)i;
        k = a(((g) (obj3)), ((g) (obj)));
        f3 = (((g) (obj)).a() - ((g) (obj3)).a()) / (float)k;
        f5 = (((g) (obj)).b() - ((g) (obj3)).b()) / (float)k;
        g1 = new g(f3 * f1 + ((g) (obj)).a(), f1 * f5 + ((g) (obj)).b());
        if (a(((g) (obj2)))) goto _L4; else goto _L3
_L3:
        if (a(g1)) goto _L6; else goto _L5
_L5:
        obj1 = null;
_L8:
        obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = obj;
        }
        k = b(g7, ((g) (obj2))).c();
        j1 = b(((g) (obj3)), ((g) (obj2))).c();
        i = k;
        if ((k & 1) == 1)
        {
            i = k + 1;
        }
        k = j1;
        if ((j1 & 1) == 1)
        {
            k = j1 + 1;
        }
        obj = a(a, g7, g6, ((g) (obj3)), ((g) (obj2)), i, k);
_L13:
        return new f(((com.google.zxing.common.b) (obj)), new g[] {
            g7, g6, obj3, obj2
        });
_L4:
        obj1 = obj2;
        if (!a(g1)) goto _L8; else goto _L7
_L7:
        obj1 = obj2;
        if (Math.abs(j1 - b(g7, ((g) (obj2))).c()) + Math.abs(i - b(((g) (obj3)), ((g) (obj2))).c()) <= Math.abs(j1 - b(g7, g1).c()) + Math.abs(i - b(((g) (obj3)), g1).c())) goto _L8; else goto _L6
_L6:
        obj1 = g1;
          goto _L8
_L2:
        i = Math.min(i, j1);
        float f2 = (float)a(g6, ((g) (obj3))) / (float)i;
        int l = a(g7, ((g) (obj)));
        float f4 = (((g) (obj)).a() - g7.a()) / (float)l;
        float f6 = (((g) (obj)).b() - g7.b()) / (float)l;
        obj2 = new g(f4 * f2 + ((g) (obj)).a(), f2 * f6 + ((g) (obj)).b());
        f2 = (float)a(g6, g7) / (float)i;
        i = a(((g) (obj3)), ((g) (obj)));
        f4 = (((g) (obj)).a() - ((g) (obj3)).a()) / (float)i;
        f6 = (((g) (obj)).b() - ((g) (obj3)).b()) / (float)i;
        g1 = new g(f4 * f2 + ((g) (obj)).a(), f2 * f6 + ((g) (obj)).b());
        if (a(((g) (obj2)))) goto _L10; else goto _L9
_L9:
        if (a(g1)) goto _L12; else goto _L11
_L11:
        obj1 = null;
_L15:
        obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = obj;
        }
        int i1 = Math.max(b(g7, ((g) (obj2))).c(), b(((g) (obj3)), ((g) (obj2))).c()) + 1;
        int j = i1;
        if ((i1 & 1) == 1)
        {
            j = i1 + 1;
        }
        obj = a(a, g7, g6, ((g) (obj3)), ((g) (obj2)), j, j);
          goto _L13
_L10:
        obj1 = obj2;
        if (!a(g1)) goto _L15; else goto _L14
_L14:
        obj1 = obj2;
        if (Math.abs(b(g7, ((g) (obj2))).c() - b(((g) (obj3)), ((g) (obj2))).c()) <= Math.abs(b(g7, g1).c() - b(((g) (obj3)), g1).c())) goto _L15; else goto _L12
_L12:
        obj1 = g1;
          goto _L15
    }

    private class ResultPointsAndTransitionsComparator
        implements Serializable, Comparator
    {

        public final int compare(com.google.zxing.datamatrix.detector.b b1, com.google.zxing.datamatrix.detector.b b2)
        {
            return b1.c() - b2.c();
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((com.google.zxing.datamatrix.detector.b)obj, (com.google.zxing.datamatrix.detector.b)obj1);
        }

        private ResultPointsAndTransitionsComparator()
        {
        }

        ResultPointsAndTransitionsComparator(a a1)
        {
            this();
        }
    }

}
