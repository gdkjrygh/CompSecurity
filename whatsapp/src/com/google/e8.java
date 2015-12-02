// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            e9, eH, bQ, S

public final class e8 extends e9
{

    private final int i[] = new int[4];

    public e8()
    {
    }

    protected int a(bQ bq, int ai[], StringBuilder stringbuilder)
    {
        boolean flag = eH.a;
        int ai1[] = i;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int l1 = bq.b();
        int j = ai[1];
        int i1 = 0;
        do
        {
label0:
            {
                int k = j;
                if (i1 < 4)
                {
                    k = j;
                    if (j < l1)
                    {
                        stringbuilder.append((char)(a(bq, ai1, j, g) + 48));
                        int i2 = ai1.length;
                        int j1 = 0;
                        k = j;
                        do
                        {
                            j = k;
                            if (j1 >= i2)
                            {
                                break;
                            }
                            j = k + ai1[j1];
                            j1++;
                            k = j;
                        } while (!flag);
                        if (!flag)
                        {
                            break label0;
                        }
                        k = j;
                    }
                }
                j = a(bq, k, true, d)[1];
                i1 = 0;
                do
                {
label1:
                    {
                        int l = j;
                        if (i1 < 4)
                        {
                            l = j;
                            if (j < l1)
                            {
                                stringbuilder.append((char)(a(bq, ai1, j, g) + 48));
                                int j2 = ai1.length;
                                int k1 = 0;
                                l = j;
                                do
                                {
                                    j = l;
                                    if (k1 >= j2)
                                    {
                                        break;
                                    }
                                    j = l + ai1[k1];
                                    k1++;
                                    l = j;
                                } while (!flag);
                                if (!flag)
                                {
                                    break label1;
                                }
                                l = j;
                            }
                        }
                        return l;
                    }
                    i1++;
                } while (true);
            }
            i1++;
        } while (true);
    }

    S a()
    {
        return S.EAN_8;
    }
}
