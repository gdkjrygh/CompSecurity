// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ECKeyParameters, ECDomainParameters

public class ECPublicKeyParameters extends ECKeyParameters
{

    ECPoint Q;

    public ECPublicKeyParameters(ECPoint ecpoint, ECDomainParameters ecdomainparameters)
    {
        super(false, ecdomainparameters);
        Q = ecpoint;
    }

    public ECPoint getQ()
    {
        return Q;
    }
}
