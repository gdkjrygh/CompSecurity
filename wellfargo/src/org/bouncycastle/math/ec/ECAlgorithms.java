// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECPoint, ECCurve

public class ECAlgorithms
{

    public ECAlgorithms()
    {
    }

    private static ECPoint implShamirsTrick(ECPoint ecpoint, BigInteger biginteger, ECPoint ecpoint1, BigInteger biginteger1)
    {
        int i = Math.max(biginteger.bitLength(), biginteger1.bitLength());
        ECPoint ecpoint4 = ecpoint.add(ecpoint1);
        ECPoint ecpoint2 = ecpoint.getCurve().getInfinity();
        i--;
        while (i >= 0) 
        {
            ECPoint ecpoint3 = ecpoint2.twice();
            if (biginteger.testBit(i))
            {
                if (biginteger1.testBit(i))
                {
                    ecpoint2 = ecpoint3.add(ecpoint4);
                } else
                {
                    ecpoint2 = ecpoint3.add(ecpoint);
                }
            } else
            {
                ecpoint2 = ecpoint3;
                if (biginteger1.testBit(i))
                {
                    ecpoint2 = ecpoint3.add(ecpoint1);
                }
            }
            i--;
        }
        return ecpoint2;
    }

    public static ECPoint shamirsTrick(ECPoint ecpoint, BigInteger biginteger, ECPoint ecpoint1, BigInteger biginteger1)
    {
        if (!ecpoint.getCurve().equals(ecpoint1.getCurve()))
        {
            throw new IllegalArgumentException("P and Q must be on same curve");
        } else
        {
            return implShamirsTrick(ecpoint, biginteger, ecpoint1, biginteger1);
        }
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint ecpoint, BigInteger biginteger, ECPoint ecpoint1, BigInteger biginteger1)
    {
        ECCurve eccurve = ecpoint.getCurve();
        if (!eccurve.equals(ecpoint1.getCurve()))
        {
            throw new IllegalArgumentException("P and Q must be on same curve");
        }
        if ((eccurve instanceof ECCurve.F2m) && ((ECCurve.F2m)eccurve).isKoblitz())
        {
            return ecpoint.multiply(biginteger).add(ecpoint1.multiply(biginteger1));
        } else
        {
            return implShamirsTrick(ecpoint, biginteger, ecpoint1, biginteger1);
        }
    }
}
