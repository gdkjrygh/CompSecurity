// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ECKeySpec, ECParameterSpec

public class ECPrivateKeySpec extends ECKeySpec
{

    private BigInteger d;

    public ECPrivateKeySpec(BigInteger biginteger, ECParameterSpec ecparameterspec)
    {
        super(ecparameterspec);
        d = biginteger;
    }

    public BigInteger getD()
    {
        return d;
    }
}
