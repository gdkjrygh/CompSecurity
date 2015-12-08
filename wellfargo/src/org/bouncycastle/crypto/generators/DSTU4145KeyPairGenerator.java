// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            ECKeyPairGenerator

public class DSTU4145KeyPairGenerator extends ECKeyPairGenerator
{

    public DSTU4145KeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        Object obj = super.generateKeyPair();
        ECPublicKeyParameters ecpublickeyparameters = (ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new AsymmetricCipherKeyPair(new ECPublicKeyParameters(ecpublickeyparameters.getQ().negate(), ecpublickeyparameters.getParameters()), ((org.bouncycastle.crypto.params.AsymmetricKeyParameter) (obj)));
    }
}
