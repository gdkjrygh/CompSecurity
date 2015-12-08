// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DHKeyParameters, DHParameters

public class DHPrivateKeyParameters extends DHKeyParameters
{

    private BigInteger x;

    public DHPrivateKeyParameters(BigInteger biginteger, DHParameters dhparameters)
    {
        super(true, dhparameters);
        x = biginteger;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DHPrivateKeyParameters))
        {
            return false;
        }
        boolean flag;
        if (((DHPrivateKeyParameters)obj).getX().equals(x) && super.equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public BigInteger getX()
    {
        return x;
    }

    public int hashCode()
    {
        return x.hashCode() ^ super.hashCode();
    }
}
