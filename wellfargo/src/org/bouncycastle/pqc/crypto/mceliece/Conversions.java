// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.math.BigInteger;
import org.bouncycastle.pqc.math.linearalgebra.BigIntUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions;

final class Conversions
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static final BigInteger ZERO = BigInteger.valueOf(0L);

    private Conversions()
    {
    }

    public static byte[] decode(int i, int j, GF2Vector gf2vector)
    {
        if (gf2vector.getLength() != i || gf2vector.getHammingWeight() != j)
        {
            throw new IllegalArgumentException("vector has wrong length or hamming weight");
        }
        int ai[] = gf2vector.getVecArray();
        gf2vector = IntegerFunctions.binomial(i, j);
        BigInteger biginteger = ZERO;
        boolean flag = false;
        int l = i;
        int k = j;
        j = ((flag) ? 1 : 0);
        while (j < i) 
        {
            BigInteger biginteger2 = gf2vector.multiply(BigInteger.valueOf(l - k)).divide(BigInteger.valueOf(l));
            int i1 = l - 1;
            l = k;
            BigInteger biginteger1 = biginteger;
            gf2vector = biginteger2;
            if ((ai[j >> 5] & 1 << (j & 0x1f)) != 0)
            {
                biginteger1 = biginteger.add(biginteger2);
                l = k - 1;
                if (i1 == l)
                {
                    gf2vector = ONE;
                } else
                {
                    gf2vector = biginteger2.multiply(BigInteger.valueOf(l + 1)).divide(BigInteger.valueOf(i1 - l));
                }
            }
            j++;
            k = l;
            biginteger = biginteger1;
            l = i1;
        }
        return BigIntUtils.toMinimalByteArray(biginteger);
    }

    public static GF2Vector encode(int i, int j, byte abyte0[])
    {
        if (i < j)
        {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger biginteger = IntegerFunctions.binomial(i, j);
        BigInteger biginteger1 = new BigInteger(1, abyte0);
        if (biginteger1.compareTo(biginteger) >= 0)
        {
            throw new IllegalArgumentException("Encoded number too large.");
        }
        GF2Vector gf2vector = new GF2Vector(i);
        boolean flag = false;
        int l = i;
        int k = j;
        j = ((flag) ? 1 : 0);
        abyte0 = biginteger;
        biginteger = biginteger1;
        while (j < i) 
        {
            BigInteger biginteger3 = abyte0.multiply(BigInteger.valueOf(l - k)).divide(BigInteger.valueOf(l));
            int i1 = l - 1;
            l = k;
            BigInteger biginteger2 = biginteger;
            abyte0 = biginteger3;
            if (biginteger3.compareTo(biginteger) <= 0)
            {
                gf2vector.setBit(j);
                biginteger2 = biginteger.subtract(biginteger3);
                l = k - 1;
                if (i1 == l)
                {
                    abyte0 = ONE;
                } else
                {
                    abyte0 = biginteger3.multiply(BigInteger.valueOf(l + 1)).divide(BigInteger.valueOf(i1 - l));
                }
            }
            j++;
            k = l;
            biginteger = biginteger2;
            l = i1;
        }
        return gf2vector;
    }

    public static byte[] signConversion(int i, int j, byte abyte0[])
    {
        int i1 = 8;
        if (i < j)
        {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger biginteger1 = IntegerFunctions.binomial(i, j);
        int k = biginteger1.bitLength() - 1;
        int l = k >> 3;
        k &= 7;
        if (k == 0)
        {
            k = 8;
            l--;
        }
        int j1 = i >> 3;
        int k1 = i & 7;
        BigInteger biginteger;
        byte abyte1[];
        byte abyte2[];
        if (k1 == 0)
        {
            j1--;
        } else
        {
            i1 = k1;
        }
        abyte2 = new byte[j1 + 1];
        if (abyte0.length < abyte2.length)
        {
            System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
            for (i1 = abyte0.length; i1 < abyte2.length; i1++)
            {
                abyte2[i1] = 0;
            }

        } else
        {
            System.arraycopy(abyte0, 0, abyte2, 0, j1);
            abyte2[j1] = (byte)((1 << i1) - 1 & abyte0[j1]);
        }
        biginteger = ZERO;
        i1 = j;
        j1 = i;
        abyte0 = biginteger1;
        j = 0;
        while (j < i) 
        {
            BigInteger biginteger3 = abyte0.multiply(new BigInteger(Integer.toString(j1 - i1))).divide(new BigInteger(Integer.toString(j1)));
            k1 = j1 - 1;
            j1 = i1;
            BigInteger biginteger2 = biginteger;
            abyte0 = biginteger3;
            if ((byte)(abyte2[j >>> 3] & 1 << (j & 7)) != 0)
            {
                biginteger2 = biginteger.add(biginteger3);
                j1 = i1 - 1;
                if (k1 == j1)
                {
                    abyte0 = ONE;
                } else
                {
                    abyte0 = biginteger3.multiply(new BigInteger(Integer.toString(j1 + 1))).divide(new BigInteger(Integer.toString(k1 - j1)));
                }
            }
            j++;
            i1 = j1;
            biginteger = biginteger2;
            j1 = k1;
        }
        abyte0 = new byte[l + 1];
        abyte1 = biginteger.toByteArray();
        if (abyte1.length < abyte0.length)
        {
            System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
            for (i = abyte1.length; i < abyte0.length; i++)
            {
                abyte0[i] = 0;
            }

        } else
        {
            System.arraycopy(abyte1, 0, abyte0, 0, l);
            abyte0[l] = (byte)(abyte1[l] & (1 << k) - 1);
        }
        return abyte0;
    }

}
