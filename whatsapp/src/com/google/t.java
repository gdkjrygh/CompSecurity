// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.List;

// Referenced classes of package com.google:
//            eq, gM, bQ, m

final class t
{

    static bQ a(List list)
    {
        int l1 = eq.j;
        int i = list.size() * 2 - 1;
        if (((gM)list.get(list.size() - 1)).c() == null)
        {
            i--;
        }
        bQ bq = new bQ(i * 12);
        int i1 = ((gM)list.get(0)).c().b();
        int l = 11;
        i = 0;
        int k;
        do
        {
            k = i;
            if (l < 0)
            {
                break;
            }
            if ((1 << l & i1) != 0)
            {
                bq.d(i);
            }
            k = i + 1;
            l--;
            i = k;
        } while (l1 == 0);
        l = 1;
        do
        {
label0:
            {
                if (l < list.size())
                {
                    gM gm = (gM)list.get(l);
                    int i2 = gm.d().b();
                    int j1 = 11;
                    int j;
                    do
                    {
                        j = k;
                        if (j1 < 0)
                        {
                            break;
                        }
                        if ((1 << j1 & i2) != 0)
                        {
                            bq.d(k);
                        }
                        j = k + 1;
                        j1--;
                        k = j;
                    } while (l1 == 0);
                    k = j;
                    if (gm.c() != null)
                    {
                        int j2 = gm.c().b();
                        int k1 = 11;
                        do
                        {
                            k = j;
                            if (k1 < 0)
                            {
                                break;
                            }
                            if ((1 << k1 & j2) != 0)
                            {
                                bq.d(j);
                            }
                            k = j + 1;
                            k1--;
                            j = k;
                        } while (l1 == 0);
                    }
                    if (l1 == 0)
                    {
                        break label0;
                    }
                }
                return bq;
            }
            l++;
        } while (true);
    }
}
