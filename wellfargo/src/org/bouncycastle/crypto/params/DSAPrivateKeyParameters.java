// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DSAKeyParameters, DSAParameters

public class DSAPrivateKeyParameters extends DSAKeyParameters
{

    private BigInteger x;

    public DSAPrivateKeyParameters(BigInteger biginteger, DSAParameters dsaparameters)
    {
        super(true, dsaparameters);
        x = biginteger;
    }

    public BigInteger getX()
    {
        return x;
    }
}
