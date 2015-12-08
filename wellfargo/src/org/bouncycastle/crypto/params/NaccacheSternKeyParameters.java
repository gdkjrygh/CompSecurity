// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter

public class NaccacheSternKeyParameters extends AsymmetricKeyParameter
{

    private BigInteger g;
    int lowerSigmaBound;
    private BigInteger n;

    public NaccacheSternKeyParameters(boolean flag, BigInteger biginteger, BigInteger biginteger1, int i)
    {
        super(flag);
        g = biginteger;
        n = biginteger1;
        lowerSigmaBound = i;
    }

    public BigInteger getG()
    {
        return g;
    }

    public int getLowerSigmaBound()
    {
        return lowerSigmaBound;
    }

    public BigInteger getModulus()
    {
        return n;
    }
}
