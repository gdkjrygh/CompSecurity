// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

class DHParametersHelper
{

    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static final BigInteger TWO = BigInteger.valueOf(2L);

    DHParametersHelper()
    {
    }

    static BigInteger[] generateSafePrimes(int i, int j, SecureRandom securerandom)
    {
        BigInteger biginteger;
        BigInteger biginteger1;
        do
        {
            biginteger = new BigInteger(i - 1, 2, securerandom);
            biginteger1 = biginteger.shiftLeft(1).add(ONE);
        } while (!biginteger1.isProbablePrime(j) || j > 2 && !biginteger.isProbablePrime(j));
        return (new BigInteger[] {
            biginteger1, biginteger
        });
    }

    static BigInteger selectGenerator(BigInteger biginteger, BigInteger biginteger1, SecureRandom securerandom)
    {
        biginteger1 = biginteger.subtract(TWO);
        BigInteger biginteger2;
        do
        {
            biginteger2 = BigIntegers.createRandomInRange(TWO, biginteger1, securerandom).modPow(TWO, biginteger);
        } while (biginteger2.equals(ONE));
        return biginteger2;
    }

}
