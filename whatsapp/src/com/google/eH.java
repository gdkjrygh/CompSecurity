// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google:
//            cB, bQ, gV, gh, 
//            by, T, bC, c6, 
//            fw

public abstract class eH
    implements cB
{

    public static boolean a;

    public eH()
    {
    }

    protected static float a(int ai[], int ai1[], float f)
    {
        boolean flag = a;
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

    protected static void a(bQ bq, int i, int ai[])
    {
        boolean flag1 = a;
        int j = ai.length;
        boolean flag = bq.e(i);
        int l;
label0:
        do
        {
            int k;
            do
            {
                k = j;
                l = i;
                if (i <= 0)
                {
                    break label0;
                }
                k = j;
                l = i;
                if (j < 0)
                {
                    break label0;
                }
                l = i - 1;
                i = l;
            } while (bq.e(l) == flag);
            k = j - 1;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = k;
            i = l;
        } while (!flag1);
        if (k >= 0)
        {
            throw gV.a();
        } else
        {
            b(bq, l + 1, ai);
            return;
        }
    }

    private c6 b(by by1, Map map)
    {
        Object obj1;
        int l;
        int j1;
        boolean flag;
        flag = a;
        j1 = by1.b();
        l = by1.e();
        obj1 = new bQ(j1);
        if (map == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag1;
        try
        {
            flag1 = map.containsKey(T.TRY_HARDER);
        }
        // Misplaced declaration of an exception variable
        catch (by by1)
        {
            try
            {
                throw by1;
            }
            // Misplaced declaration of an exception variable
            catch (by by1)
            {
                throw by1;
            }
        }
        if (!flag1) goto _L2; else goto _L3
_L3:
        i = 1;
_L9:
        Object obj;
        fw afw[];
        int j;
        int k;
        int i1;
        int k1;
        boolean flag2;
        if (i != 0)
        {
            j = 8;
        } else
        {
            j = 5;
        }
        k1 = Math.max(1, l >> j);
        gV gv;
        Map map1;
        if (i == 0 || flag)
        {
            i = 15;
        } else
        {
            i = l;
        }
        j = 0;
        obj = map;
        map = ((Map) (obj1));
_L13:
        if (j >= i) goto _L5; else goto _L4
_L4:
        i1 = (j + 1) / 2;
        if ((j & 1) == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            k = i1;
        } else
        {
            k = -i1;
        }
        i1 = (l >> 1) + k * k1;
        if (i1 < 0 || i1 >= l && !flag) goto _L5; else goto _L6
_L6:
        obj1 = by1.a(i1, map);
        map = ((Map) (obj1));
_L10:
        k = 0;
        obj1 = obj;
_L14:
        obj = obj1;
        if (k >= 2) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        map.c();
        obj = obj1;
        if (obj1 != null)
        {
            try
            {
                flag2 = ((Map) (obj1)).containsKey(T.NEED_RESULT_POINT_CALLBACK);
            }
            // Misplaced declaration of an exception variable
            catch (by by1)
            {
                throw by1;
            }
            obj = obj1;
            if (flag2)
            {
                obj = new EnumMap(com/google/T);
                ((Map) (obj)).putAll(((Map) (obj1)));
                ((Map) (obj)).remove(T.NEED_RESULT_POINT_CALLBACK);
            }
        }
        obj1 = a(i1, map, ((Map) (obj)));
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        ((c6) (obj1)).a(bC.ORIENTATION, Integer.valueOf(180));
        afw = ((c6) (obj1)).a();
        if (afw == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        afw[0] = new fw((float)j1 - afw[0].a() - 1.0F, afw[0].b());
        afw[1] = new fw((float)j1 - afw[1].a() - 1.0F, afw[1].b());
        return ((c6) (obj1));
_L2:
        i = 0;
          goto _L9
        gv;
        map1 = map;
        gv = ((gV) (obj));
        if (!flag) goto _L11; else goto _L10
        by1;
        throw by1;
        gv;
        try
        {
            throw gv;
        }
        // Misplaced declaration of an exception variable
        catch (gV gv) { }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_455;
        }
_L8:
        gv = ((gV) (obj));
        map1 = map;
_L11:
        if (!flag) goto _L12; else goto _L5
_L5:
        throw gV.a();
_L12:
        j++;
        map = map1;
        obj = gv;
          goto _L13
        k++;
        gv = ((gV) (obj));
          goto _L14
    }

    protected static void b(bQ bq, int i, int ai[])
    {
        int j;
        int k;
        boolean flag = a;
        int i1 = ai.length;
        Arrays.fill(ai, 0, i1, 0);
        int j1 = bq.b();
        if (i >= j1)
        {
            throw gV.a();
        }
        int l;
        if (!bq.e(i))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = 0;
        l = j;
        j = k;
        if (i >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(bq.e(i) ^ l)) goto _L2; else goto _L1
_L1:
        ai[j] = ai[j] + 1;
        if (!flag) goto _L3; else goto _L2
_L2:
        k = j + 1;
        if (k == i1 && !flag) goto _L5; else goto _L4
_L4:
        ai[k] = 1;
        if (l == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        l = j;
        j = k;
_L3:
        i++;
        if (!flag) goto _L7; else goto _L6
_L7:
        break MISSING_BLOCK_LABEL_52;
_L6:
        if (j != i1 && (j != i1 - 1 || i != j1))
        {
            throw gV.a();
        } else
        {
            return;
        }
_L5:
        j = k;
        if (true) goto _L6; else goto _L8
_L8:
    }

    public abstract c6 a(int i, bQ bq, Map map);

    public c6 a(by by1, Map map)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = a;
        c6 c6_1 = b(by1, map);
        return c6_1;
        Object obj;
        obj;
        if (map == null) goto _L2; else goto _L1
_L1:
        int i;
        boolean flag2;
        try
        {
            flag2 = map.containsKey(T.TRY_HARDER);
        }
        // Misplaced declaration of an exception variable
        catch (by by1)
        {
            throw by1;
        }
        if (!flag2) goto _L2; else goto _L3
_L3:
        i = 1;
_L7:
        if (i == 0) goto _L5; else goto _L4
_L4:
        try
        {
            flag2 = by1.c();
        }
        // Misplaced declaration of an exception variable
        catch (by by1)
        {
            throw by1;
        }
        if (!flag2) goto _L5; else goto _L6
_L6:
        by1 = by1.a();
        map = b(by1, map);
        obj = map.b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        int j;
        boolean flag3;
        try
        {
            flag3 = ((Map) (obj)).containsKey(bC.ORIENTATION);
        }
        // Misplaced declaration of an exception variable
        catch (by by1)
        {
            throw by1;
        }
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        i = (((Integer)((Map) (obj)).get(bC.ORIENTATION)).intValue() + 270) % 360;
_L8:
        map.a(bC.ORIENTATION, Integer.valueOf(i));
        obj = map.a();
        if (obj != null)
        {
            j = by1.e();
            i = ((flag) ? 1 : 0);
            do
            {
                if (i >= obj.length)
                {
                    break;
                }
                obj[i] = new fw((float)j - obj[i].b() - 1.0F, obj[i].a());
                i++;
            } while (!flag1);
        }
        return map;
_L2:
        i = 0;
          goto _L7
_L5:
        throw obj;
        i = 270;
          goto _L8
    }

    public void a()
    {
    }
}
