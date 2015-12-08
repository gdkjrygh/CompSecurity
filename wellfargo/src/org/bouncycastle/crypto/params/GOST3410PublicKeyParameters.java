// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            GOST3410KeyParameters, GOST3410Parameters

public class GOST3410PublicKeyParameters extends GOST3410KeyParameters
{

    private BigInteger y;

    public GOST3410PublicKeyParameters(BigInteger biginteger, GOST3410Parameters gost3410parameters)
    {
        super(false, gost3410parameters);
        y = biginteger;
    }

    public BigInteger getY()
    {
        return y;
    }
}
