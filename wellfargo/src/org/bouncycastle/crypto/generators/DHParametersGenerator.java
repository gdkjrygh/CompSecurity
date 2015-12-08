// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            DHParametersHelper

public class DHParametersGenerator
{

    private static final BigInteger TWO = BigInteger.valueOf(2L);
    private int certainty;
    private SecureRandom random;
    private int size;

    public DHParametersGenerator()
    {
    }

    public DHParameters generateParameters()
    {
        BigInteger abiginteger[] = DHParametersHelper.generateSafePrimes(size, certainty, random);
        BigInteger biginteger = abiginteger[0];
        BigInteger biginteger1 = abiginteger[1];
        return new DHParameters(biginteger, DHParametersHelper.selectGenerator(biginteger, biginteger1, random), biginteger1, TWO, null);
    }

    public void init(int i, int j, SecureRandom securerandom)
    {
        size = i;
        certainty = j;
        random = securerandom;
    }

}
