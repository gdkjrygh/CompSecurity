// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ECKeySpec, ECParameterSpec

public class ECPublicKeySpec extends ECKeySpec
{

    private ECPoint q;

    public ECPublicKeySpec(ECPoint ecpoint, ECParameterSpec ecparameterspec)
    {
        super(ecparameterspec);
        q = ecpoint;
    }

    public ECPoint getQ()
    {
        return q;
    }
}
