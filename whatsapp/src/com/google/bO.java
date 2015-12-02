// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            cB, fw, bA, gh, 
//            d6, gV, T, by, 
//            c6, fG, S, bC

public final class bO
    implements cB
{

    private static final fw a[] = new fw[0];
    public static int b;
    private final bA c = new bA();

    public bO()
    {
        int i = b;
        super();
        if (gh.a != 0)
        {
            b = i + 1;
        }
    }

    private static d6 a(d6 d6_1)
    {
        int k = b;
        int ai[] = d6_1.e();
        if (ai == null)
        {
            throw gV.a();
        }
        int l = ai[0];
        int i1 = ai[1];
        int j1 = ai[2];
        int k1 = ai[3];
        d6 d6_2 = new d6(30, 33);
        int i = 0;
        do
        {
label0:
            {
                if (i < 33)
                {
                    int l1 = (i * k1 + k1 / 2) / 33;
                    int j = 0;
                    do
                    {
                        if (j >= 30)
                        {
                            break;
                        }
                        if (d6_1.b((j * j1 + j1 / 2 + ((i & 1) * j1) / 2) / 30 + l, i1 + l1))
                        {
                            d6_2.c(j, i);
                        }
                        j++;
                    } while (k == 0);
                    if (k == 0)
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
label0:
        {
            int i = b;
            if (map != null && map.containsKey(T.PURE_BARCODE))
            {
                by1 = a(by1.d());
                by1 = c.a(by1, map);
                if (i == 0)
                {
                    break label0;
                }
                gh.a++;
            }
            throw gV.a();
        }
        map = a;
        map = new c6(by1.g(), by1.b(), map, S.MAXICODE);
        by1 = by1.a();
        if (by1 != null)
        {
            map.a(bC.ERROR_CORRECTION_LEVEL, by1);
        }
        return map;
    }

    public void a()
    {
    }

}
