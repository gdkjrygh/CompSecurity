// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.BigIntegers;

class DHKeyGeneratorHelper
{

    static final DHKeyGeneratorHelper INSTANCE = new DHKeyGeneratorHelper();
    private static final BigInteger ONE = BigInteger.valueOf(1L);
    private static final BigInteger TWO = BigInteger.valueOf(2L);

    private DHKeyGeneratorHelper()
    {
    }

    BigInteger calculatePrivate(DHParameters dhparameters, SecureRandom securerandom)
    {
        BigInteger biginteger1 = dhparameters.getP();
        int i = dhparameters.getL();
        if (i != 0)
        {
            return (new BigInteger(i, securerandom)).setBit(i - 1);
        }
        BigInteger biginteger = TWO;
        i = dhparameters.getM();
        if (i != 0)
        {
            biginteger = ONE.shiftLeft(i - 1);
        }
        biginteger1 = biginteger1.subtract(TWO);
        BigInteger biginteger2 = dhparameters.getQ();
        dhparameters = biginteger1;
        if (biginteger2 != null)
        {
            dhparameters = biginteger2.subtract(TWO);
        }
        return BigIntegers.createRandomInRange(biginteger, dhparameters, securerandom);
    }

    BigInteger calculatePublic(DHParameters dhparameters, BigInteger biginteger)
    {
        return dhparameters.getG().modPow(biginteger, dhparameters.getP());
    }

}
