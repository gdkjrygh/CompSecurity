// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECDomainParameters
    implements ECConstants
{

    ECPoint G;
    ECCurve curve;
    BigInteger h;
    BigInteger n;
    byte seed[];

    public ECDomainParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger)
    {
        curve = eccurve;
        G = ecpoint;
        n = biginteger;
        h = ONE;
        seed = null;
    }

    public ECDomainParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        curve = eccurve;
        G = ecpoint;
        n = biginteger;
        h = biginteger1;
        seed = null;
    }

    public ECDomainParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        curve = eccurve;
        G = ecpoint;
        n = biginteger;
        h = biginteger1;
        seed = abyte0;
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
}
