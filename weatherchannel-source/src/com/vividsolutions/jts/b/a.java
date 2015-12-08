// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import java.lang.reflect.Array;

// Referenced classes of package com.vividsolutions.jts.b:
//            n

public final class a
{

    private int a[][];

    public a()
    {
        a = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            2, 3
        });
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                a[i][j] = -1;
            }

        }

    }

    private static int c(int i)
    {
        if (i == 2)
        {
            return 0;
        }
        return i != 0 ? -1 : 1;
    }

    public final int a(int i, int j)
    {
        return a[i][j] > 0 ? 0 : 2;
    }

    public final void a(n n1)
    {
        for (int i = 0; i < 2; i++)
        {
            int j = 1;
            while (j < 3) 
            {
                int k = n1.a(i, j);
                if (k == 2 || k == 0)
                {
                    if (b(i, j))
                    {
                        a[i][j] = c(k);
                    } else
                    {
                        int ai[] = a[i];
                        int l = ai[j];
                        ai[j] = c(k) + l;
                    }
                }
                j++;
            }
        }

    }

    public final boolean a()
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (a[i][j] != -1)
                {
                    return false;
                }
            }

        }

        return true;
    }

    public final boolean a(int i)
    {
        return a[i][1] == -1;
    }

    public final int b(int i)
    {
        return a[i][2] - a[i][1];
    }

    public final void b()
    {
label0:
        for (int j = 0; j < 2; j++)
        {
            if (a(j))
            {
                continue;
            }
            int k = a[j][1];
            int i = k;
            if (a[j][2] < k)
            {
                i = a[j][2];
            }
            k = i;
            if (i < 0)
            {
                k = 0;
            }
            i = 1;
            do
            {
                if (i >= 3)
                {
                    continue label0;
                }
                int l;
                if (a[j][i] > k)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                a[j][i] = l;
                i++;
            } while (true);
        }

    }

    public final boolean b(int i, int j)
    {
        return a[i][j] == -1;
    }

    public final String toString()
    {
        return (new StringBuilder("A: ")).append(a[0][1]).append(",").append(a[0][2]).append(" B: ").append(a[1][1]).append(",").append(a[1][2]).toString();
    }
}
