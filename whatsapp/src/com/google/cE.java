// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            cB, fw, fN, gh, 
//            d6, gV, T, by, 
//            bU, ek, c6, fG, 
//            S, bC

public final class cE
    implements cB
{

    private static final fw a[] = new fw[0];
    public static boolean b;
    private final fN c = new fN();

    public cE()
    {
        boolean flag = b;
        super();
        if (gh.a != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            b = flag;
        }
    }

    private static int a(int ai[], d6 d6_1)
    {
        boolean flag = b;
        int k = d6_1.b();
        int i = ai[0];
        int l = ai[1];
        int j;
        do
        {
            j = i;
            if (i >= k)
            {
                break;
            }
            j = i;
            if (!d6_1.b(i, l))
            {
                break;
            }
            j = i + 1;
            i = j;
        } while (!flag);
        if (j == k)
        {
            throw gV.a();
        }
        i = j - ai[0];
        if (i == 0)
        {
            throw gV.a();
        } else
        {
            return i;
        }
    }

    private static d6 a(d6 d6_1)
    {
        boolean flag = b;
        int ai[] = d6_1.g();
        int ai1[] = d6_1.d();
        if (ai == null || ai1 == null)
        {
            throw gV.a();
        }
        int k = a(ai, d6_1);
        int l = ai[1];
        int i = ai1[1];
        int i1 = ai[0];
        int j1 = ((ai1[0] - i1) + 1) / k;
        int k1 = ((i - l) + 1) / k;
        if (j1 <= 0 || k1 <= 0)
        {
            throw gV.a();
        }
        int l1 = k / 2;
        d6 d6_2 = new d6(j1, k1);
        i = 0;
        do
        {
label0:
            {
                if (i < k1)
                {
                    int j = 0;
                    do
                    {
                        if (j >= j1)
                        {
                            break;
                        }
                        if (d6_1.b(j * k + (i1 + l1), l + l1 + i * k))
                        {
                            d6_2.c(j, i);
                        }
                        j++;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return d6_2;
            }
            i++;
        } while (true);
    }

    public c6 a(by by1, Map map)
    {
        fw afw[];
label0:
        {
            boolean flag = b;
            if (map != null && map.containsKey(T.PURE_BARCODE))
            {
                map = a(by1.d());
                map = c.a(map);
                afw = a;
                if (!flag)
                {
                    break label0;
                }
                gh.a++;
            }
            by1 = (new bU(by1.d())).a();
            map = c.a(by1.b());
            afw = by1.a();
        }
        by1 = new c6(map.g(), map.b(), afw, S.DATA_MATRIX);
        java.util.List list = map.d();
        if (list != null)
        {
            by1.a(bC.BYTE_SEGMENTS, list);
        }
        map = map.a();
        if (map != null)
        {
            by1.a(bC.ERROR_CORRECTION_LEVEL, map);
        }
        return by1;
    }

    public void a()
    {
    }

}
