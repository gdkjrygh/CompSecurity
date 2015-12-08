// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.lang.reflect.Array;

// Referenced classes of package RLSDK:
//            at, y, w, ak

public final class av extends at
{

    private ak a;

    public av(w w1)
    {
        super(w1);
        a = null;
    }

    public final ak b()
        throws y
    {
        if (a == null)
        {
            w w1 = a();
            if (w1.b() >= 40 && w1.c() >= 40)
            {
                byte abyte0[] = w1.a();
                int j6 = w1.b();
                int k6 = w1.c();
                int i2 = j6 >> 3;
                if ((j6 & 7) != 0)
                {
                    i2++;
                }
                int j2 = k6 >> 3;
                if ((k6 & 7) != 0)
                {
                    j2++;
                }
                int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
                    j2, i2
                });
                for (int j1 = 0; j1 < j2; j1++)
                {
                    int i = j1 << 3;
                    int k2 = i;
                    if (i + 8 >= k6)
                    {
                        k2 = k6 - 8;
                    }
                    int i3 = 0;
                    while (i3 < i2) 
                    {
                        int j = i3 << 3;
                        int k3 = j;
                        if (j + 8 >= j6)
                        {
                            k3 = j6 - 8;
                        }
                        j = 0;
                        int k5 = 255;
                        int l5 = 0;
                        for (int j4 = 0; j4 < 8;)
                        {
                            int i5 = 0;
                            int l = j;
                            j = l5;
                            while (i5 < 8) 
                            {
                                l5 = abyte0[(k2 + j4) * j6 + k3 + i5] & 0xff;
                                int i6 = l + l5;
                                l = k5;
                                if (l5 < k5)
                                {
                                    l = l5;
                                }
                                if (l5 > j)
                                {
                                    j = l5;
                                }
                                i5++;
                                k5 = l;
                                l = i6;
                            }
                            j4++;
                            l5 = j;
                            j = l;
                        }

                        if (l5 - k5 > 24)
                        {
                            j >>= 6;
                        } else
                        if (l5 == 0)
                        {
                            j = 1;
                        } else
                        {
                            j = k5 >> 1;
                        }
                        ai[j1][i3] = j;
                        i3++;
                    }
                }

                a = new ak(j6, k6);
                ak ak1 = a;
                for (int k = 0; k < j2; k++)
                {
                    int l2 = k << 3;
                    if (l2 + 8 >= k6)
                    {
                        l2 = k6 - 8;
                    }
                    for (int i1 = 0; i1 < i2; i1++)
                    {
                        int j3 = i1 << 3;
                        if (j3 + 8 >= j6)
                        {
                            j3 = j6 - 8;
                        }
                        int k1;
                        int l3;
                        int j5;
                        if (i1 > 1)
                        {
                            k1 = i1;
                        } else
                        {
                            k1 = 2;
                        }
                        if (k1 < i2 - 2)
                        {
                            l3 = k1;
                        } else
                        {
                            l3 = i2 - 3;
                        }
                        if (k > 1)
                        {
                            k1 = k;
                        } else
                        {
                            k1 = 2;
                        }
                        if (k1 >= j2 - 2)
                        {
                            k1 = j2 - 3;
                        }
                        j5 = 0;
                        for (int k4 = -2; k4 <= 2; k4++)
                        {
                            int ai1[] = ai[k1 + k4];
                            j5 = j5 + ai1[l3 - 2] + ai1[l3 - 1] + ai1[l3] + ai1[l3 + 1] + ai1[l3 + 2];
                        }

                        int l4 = j5 / 25;
                        for (int l1 = 0; l1 < 8; l1++)
                        {
                            for (int i4 = 0; i4 < 8; i4++)
                            {
                                if ((abyte0[(l2 + l1) * j6 + j3 + i4] & 0xff) < l4)
                                {
                                    ak1.b(j3 + i4, l2 + l1);
                                }
                            }

                        }

                    }

                }

            } else
            {
                a = super.b();
            }
        }
        return a;
    }
}
