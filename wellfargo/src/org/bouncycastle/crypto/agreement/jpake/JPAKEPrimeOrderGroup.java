// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.agreement.jpake:
//            JPAKEUtil

public class JPAKEPrimeOrderGroup
{

    private final BigInteger g;
    private final BigInteger p;
    private final BigInteger q;

    public JPAKEPrimeOrderGroup(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        this(biginteger, biginteger1, biginteger2, false);
    }

    JPAKEPrimeOrderGroup(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, boolean flag)
    {
        JPAKEUtil.validateNotNull(biginteger, "p");
        JPAKEUtil.validateNotNull(biginteger1, "q");
        JPAKEUtil.validateNotNull(biginteger2, "g");
        if (!flag)
        {
            if (!biginteger.subtract(JPAKEUtil.ONE).mod(biginteger1).equals(JPAKEUtil.ZERO))
            {
                throw new IllegalArgumentException("p-1 must be evenly divisible by q");
            }
            if (biginteger2.compareTo(BigInteger.valueOf(2L)) == -1 || biginteger2.compareTo(biginteger.subtract(JPAKEUtil.ONE)) == 1)
            {
                throw new IllegalArgumentException("g must be in [2, p-1]");
            }
            if (!biginteger2.modPow(biginteger1, biginteger).equals(JPAKEUtil.ONE))
            {
                throw new IllegalArgumentException("g^q mod p must equal 1");
            }
            if (!biginteger.isProbablePrime(20))
            {
                throw new IllegalArgumentException("p must be prime");
            }
            if (!biginteger1.isProbablePrime(20))
            {
                throw new IllegalArgumentException("q must be prime");
            }
        }
        p = biginteger;
        q = biginteger1;
        g = biginteger2;
    }

    public BigInteger getG()
    {
        return g;
    }

    public BigInteger getP()
    {
        return p;
    }

    public BigInteger getQ()
    {
        return q;
    }
}
