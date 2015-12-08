// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class ElGamalParameterSpec
    implements AlgorithmParameterSpec
{

    private BigInteger g;
    private BigInteger p;

    public ElGamalParameterSpec(BigInteger biginteger, BigInteger biginteger1)
    {
        p = biginteger;
        g = biginteger1;
    }

    public BigInteger getG()
    {
        return g;
    }

    public BigInteger getP()
    {
        return p;
    }
}
