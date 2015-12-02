// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google:
//            bC, eH, bQ, e9, 
//            gV, fw, S, c6

final class i
{

    private final StringBuilder a = new StringBuilder();
    private final int b[] = new int[4];

    i()
    {
    }

    private static Map a(String s)
    {
        if (s.length() != 2)
        {
            return null;
        } else
        {
            EnumMap enummap = new EnumMap(com/google/bC);
            enummap.put(bC.ISSUE_NUMBER, Integer.valueOf(s));
            return enummap;
        }
    }

    int a(bQ bq, int ai[], StringBuilder stringbuilder)
    {
        boolean flag = eH.a;
        int ai1[] = b;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int k1 = bq.b();
        int j = ai[1];
        int j1 = 0;
        int k = 0;
        do
        {
            int i1;
label0:
            {
                i1 = k;
                int l = j;
                if (j1 < 2)
                {
                    i1 = k;
                    l = j;
                    if (j < k1)
                    {
                        int l1 = e9.a(bq, ai1, j, e9.c);
                        stringbuilder.append((char)(l1 % 10 + 48));
                        int i2 = ai1.length;
                        i1 = 0;
                        do
                        {
                            l = j;
                            if (i1 >= i2)
                            {
                                break;
                            }
                            l = j + ai1[i1];
                            i1++;
                            j = l;
                        } while (!flag);
                        i1 = k;
                        if (l1 >= 10)
                        {
                            i1 = k | 1 << 1 - j1;
                        }
                        j = l;
                        if (j1 != 1)
                        {
                            j = bq.a(bq.c(l));
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                        l = j;
                    }
                }
                if (stringbuilder.length() != 2)
                {
                    throw gV.a();
                }
                if (Integer.parseInt(stringbuilder.toString()) % 4 != i1)
                {
                    throw gV.a();
                } else
                {
                    return l;
                }
            }
            j1++;
            k = i1;
        } while (true);
    }

    c6 a(int j, bQ bq, int ai[])
    {
        Object obj = a;
        ((StringBuilder) (obj)).setLength(0);
        int k = a(bq, ai, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        bq = a(((String) (obj)));
        ai = new fw((float)(ai[0] + ai[1]) / 2.0F, j);
        fw fw1 = new fw(k, j);
        S s = S.UPC_EAN_EXTENSION;
        ai = new c6(((String) (obj)), null, new fw[] {
            ai, fw1
        }, s);
        if (bq != null)
        {
            ai.a(bq);
        }
        return ai;
    }
}
