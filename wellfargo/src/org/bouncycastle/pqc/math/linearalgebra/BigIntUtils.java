// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;

public final class BigIntUtils
{

    private BigIntUtils()
    {
    }

    public static boolean equals(BigInteger abiginteger[], BigInteger abiginteger1[])
    {
        if (abiginteger.length == abiginteger1.length)
        {
            int i = 0;
            int j = 0;
            for (; i < abiginteger.length; i++)
            {
                j |= abiginteger[i].compareTo(abiginteger1[i]);
            }

            if (j == 0)
            {
                return true;
            }
        }
        return false;
    }

    public static void fill(BigInteger abiginteger[], BigInteger biginteger)
    {
        for (int i = abiginteger.length - 1; i >= 0; i--)
        {
            abiginteger[i] = biginteger;
        }

    }

    public static BigInteger[] subArray(BigInteger abiginteger[], int i, int j)
    {
        BigInteger abiginteger1[] = new BigInteger[j - i];
        System.arraycopy(abiginteger, i, abiginteger1, 0, j - i);
        return abiginteger1;
    }

    public static int[] toIntArray(BigInteger abiginteger[])
    {
        int ai[] = new int[abiginteger.length];
        for (int i = 0; i < abiginteger.length; i++)
        {
            ai[i] = abiginteger[i].intValue();
        }

        return ai;
    }

    public static int[] toIntArrayModQ(int i, BigInteger abiginteger[])
    {
        BigInteger biginteger = BigInteger.valueOf(i);
        int ai[] = new int[abiginteger.length];
        for (i = 0; i < abiginteger.length; i++)
        {
            ai[i] = abiginteger[i].mod(biginteger).intValue();
        }

        return ai;
    }

    public static byte[] toMinimalByteArray(BigInteger biginteger)
    {
        byte abyte0[] = biginteger.toByteArray();
        if (abyte0.length == 1 || (biginteger.bitLength() & 7) != 0)
        {
            return abyte0;
        } else
        {
            biginteger = new byte[biginteger.bitLength() >> 3];
            System.arraycopy(abyte0, 1, biginteger, 0, biginteger.length);
            return biginteger;
        }
    }
}
