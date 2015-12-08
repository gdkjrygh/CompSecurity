// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class GOST3410PublicKeySpec
    implements KeySpec
{

    private BigInteger a;
    private BigInteger p;
    private BigInteger q;
    private BigInteger y;

    public GOST3410PublicKeySpec(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
    {
        y = biginteger;
        p = biginteger1;
        q = biginteger2;
        a = biginteger3;
    }

    public BigInteger getA()
    {
        return a;
    }

    public BigInteger getP()
    {
        return p;
    }

    public BigInteger getQ()
    {
        return q;
    }

    public BigInteger getY()
    {
        return y;
    }
}
