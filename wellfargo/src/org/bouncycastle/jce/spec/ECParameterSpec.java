// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECParameterSpec
    implements AlgorithmParameterSpec
{

    private ECPoint G;
    private ECCurve curve;
    private BigInteger h;
    private BigInteger n;
    private byte seed[];

    public ECParameterSpec(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger)
    {
        curve = eccurve;
        G = ecpoint;
        n = biginteger;
        h = BigInteger.valueOf(1L);
        seed = null;
    }

    public ECParameterSpec(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        curve = eccurve;
        G = ecpoint;
        n = biginteger;
        h = biginteger1;
        seed = null;
    }

    public ECParameterSpec(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        curve = eccurve;
        G = ecpoint;
        n = biginteger;
        h = biginteger1;
        seed = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ECParameterSpec)
        {
            if (getCurve().equals(((ECParameterSpec) (obj = (ECParameterSpec)obj)).getCurve()) && getG().equals(((ECParameterSpec) (obj)).getG()))
            {
                return true;
            }
        }
        return false;
    }

    public ECCurve getCurve()
    {
        return curve;
    }

    public ECPoint getG()
    {
        return G;
    }

    public BigInteger getH()
    {
        return h;
    }

    public BigInteger getN()
    {
        return n;
    }

    public byte[] getSeed()
    {
        return seed;
    }

    public int hashCode()
    {
        return getCurve().hashCode() ^ getG().hashCode();
    }
}
