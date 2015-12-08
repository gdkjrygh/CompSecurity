// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DHKeyParameters, DHParameters

public class DHPublicKeyParameters extends DHKeyParameters
{

    private BigInteger y;

    public DHPublicKeyParameters(BigInteger biginteger, DHParameters dhparameters)
    {
        super(false, dhparameters);
        y = biginteger;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DHPublicKeyParameters))
        {
            return false;
        }
        boolean flag;
        if (((DHPublicKeyParameters)obj).getY().equals(y) && super.equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public BigInteger getY()
    {
        return y;
    }

    public int hashCode()
    {
        return y.hashCode() ^ super.hashCode();
    }
}
