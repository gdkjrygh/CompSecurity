// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.io.PrintStream;

public final class PolynomialRingGF2
{

    private PolynomialRingGF2()
    {
    }

    public static int add(int i, int j)
    {
        return i ^ j;
    }

    public static int degree(int i)
    {
        int j = -1;
        for (; i != 0; i >>>= 1)
        {
            j++;
        }

        return j;
    }

    public static int degree(long l)
    {
        int i = 0;
        for (; l != 0L; l >>>= 1)
        {
            i++;
        }

        return i - 1;
    }

    public static int gcd(int i, int j)
    {
        int k;
        for (; j != 0; j = k)
        {
            k = remainder(i, j);
            i = j;
        }

        return i;
    }

    public static int getIrreduciblePolynomial(int i)
    {
        if (i < 0)
        {
            System.err.println("The Degree is negative");
        } else
        {
            if (i > 31)
            {
                System.err.println("The Degree is more then 31");
                return 0;
            }
            if (i == 0)
            {
                return 1;
            }
            int j = (1 << i) + 1;
            while (j < 1 << i + 1) 
            {
                if (isIrreducible(j))
                {
                    return j;
                }
                j += 2;
            }
        }
        return 0;
    }

    public static boolean isIrreducible(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int l = degree(i);
        int k = 2;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= l >>> 1)
                {
                    break label1;
                }
                k = modMultiply(k, k, i);
                if (gcd(k ^ 2, i) != 1)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static int modMultiply(int i, int j, int k)
    {
        int i1 = 0;
        boolean flag = false;
        int l = remainder(i, k);
        j = remainder(j, k);
        if (j != 0)
        {
            int j1 = degree(k);
            i = ((flag) ? 1 : 0);
            do
            {
                i1 = i;
                if (l == 0)
                {
                    break;
                }
                if ((byte)(l & 1) == 1)
                {
                    i ^= j;
                }
                l >>>= 1;
                i1 = j << 1;
                j = i1;
                if (i1 >= 1 << j1)
                {
                    j = i1 ^ k;
                }
            } while (true);
        }
        return i1;
    }

    public static long multiply(int i, int j)
    {
        long l = 0L;
        long l2 = l;
        if (j != 0)
        {
            long l1 = (long)j & 0xffffffffL;
            do
            {
                l2 = l;
                if (i == 0)
                {
                    break;
                }
                l2 = l;
                if ((byte)(i & 1) == 1)
                {
                    l2 = l ^ l1;
                }
                i >>>= 1;
                l1 <<= 1;
                l = l2;
            } while (true);
        }
        return l2;
    }

    public static int remainder(int i, int j)
    {
        if (j != 0) goto _L2; else goto _L1
_L1:
        int k;
        System.err.println("Error: to be divided by 0");
        k = 0;
_L4:
        return k;
_L2:
        do
        {
            k = i;
            if (degree(i) < degree(j))
            {
                continue;
            }
            i ^= j << degree(i) - degree(j);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int rest(long l, int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k;
        System.err.println("Error: to be divided by 0");
        k = 0;
_L4:
        return k;
_L2:
        long l1 = (long)i & 0xffffffffL;
        for (; l >>> 32 != 0L; l ^= l1 << degree(l) - degree(l1)) { }
        int j = (int)(-1L & l);
        do
        {
            k = j;
            if (degree(j) < degree(i))
            {
                continue;
            }
            j ^= i << degree(j) - degree(i);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
