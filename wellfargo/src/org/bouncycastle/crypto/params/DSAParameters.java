// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DSAValidationParameters

public class DSAParameters
    implements CipherParameters
{

    private BigInteger g;
    private BigInteger p;
    private BigInteger q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        g = biginteger2;
        p = biginteger;
        q = biginteger1;
    }

    public DSAParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, DSAValidationParameters dsavalidationparameters)
    {
        g = biginteger2;
        p = biginteger;
        q = biginteger1;
        validation = dsavalidationparameters;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAParameters)
        {
            if (((DSAParameters) (obj = (DSAParameters)obj)).getP().equals(p) && ((DSAParameters) (obj)).getQ().equals(q) && ((DSAParameters) (obj)).getG().equals(g))
            {
                return true;
            }
        }
        return false;
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

    public DSAValidationParameters getValidationParameters()
    {
        return validation;
    }

    public int hashCode()
    {
        return getP().hashCode() ^ getQ().hashCode() ^ getG().hashCode();
    }
}
