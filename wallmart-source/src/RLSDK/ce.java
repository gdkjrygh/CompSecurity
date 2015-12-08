// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public final class ce
{

    private static int a(int i, int j)
    {
        int j1 = 1;
        int k;
        int l;
        int i1;
        if (i - j > j)
        {
            l = i - j;
            k = j;
        } else
        {
            l = j;
            k = i - j;
        }
        j = 1;
        i1 = i;
        for (i = j1; i1 > l; i = j1)
        {
            int k1 = j * i1;
            j1 = i;
            j = k1;
            if (i <= k)
            {
                j = k1 / i;
                j1 = i + 1;
            }
            i1--;
        }

        for (; i <= k; i++)
        {
            j /= i;
        }

        return j;
    }

    public static int a(int ai[], int i, boolean flag)
    {
        int k2 = ai.length;
        int k = 0;
        int j;
        int l;
        for (j = 0; k < k2; j = l + j)
        {
            l = ai[k];
            k++;
        }

        int l1 = 0;
        k = 0;
        boolean flag1 = false;
        int k1 = j;
        j = k;
        k = ((flag1) ? 1 : 0);
        do
        {
            if (l1 >= k2 - 1)
            {
                break;
            }
            int i1 = k | 1 << l1;
            int i2 = 1;
            k = j;
            j = i1;
            while (i2 < ai[l1]) 
            {
                int j1 = a(k1 - i2 - 1, k2 - l1 - 2);
                i1 = j1;
                if (flag)
                {
                    i1 = j1;
                    if (j == 0)
                    {
                        i1 = j1;
                        if (k1 - i2 - (k2 - l1 - 1) >= k2 - l1 - 1)
                        {
                            i1 = j1 - a(k1 - i2 - (k2 - l1), k2 - l1 - 2);
                        }
                    }
                }
                if (k2 - l1 - 1 > 1)
                {
                    j1 = k1 - i2 - (k2 - l1 - 2);
                    int j2 = 0;
                    for (; j1 > i; j1--)
                    {
                        j2 += a(k1 - i2 - j1 - 1, k2 - l1 - 3);
                    }

                    j1 = i1 - (k2 - 1 - l1) * j2;
                } else
                {
                    j1 = i1;
                    if (k1 - i2 > i)
                    {
                        j1 = i1 - 1;
                    }
                }
                k += j1;
                i2++;
                j &= ~(1 << l1);
            }
            l1++;
            k1 -= i2;
            i1 = k;
            k = j;
            j = i1;
        } while (true);
        return j;
    }
}
