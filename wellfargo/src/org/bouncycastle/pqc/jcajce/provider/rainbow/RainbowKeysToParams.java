// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.rainbow:
//            BCRainbowPrivateKey, BCRainbowPublicKey

public class RainbowKeysToParams
{

    public RainbowKeysToParams()
    {
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privatekey)
    {
        if (privatekey instanceof BCRainbowPrivateKey)
        {
            privatekey = (BCRainbowPrivateKey)privatekey;
            return new RainbowPrivateKeyParameters(privatekey.getInvA1(), privatekey.getB1(), privatekey.getInvA2(), privatekey.getB2(), privatekey.getVi(), privatekey.getLayers());
        } else
        {
            throw new InvalidKeyException("can't identify Rainbow private key.");
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publickey)
    {
        if (publickey instanceof BCRainbowPublicKey)
        {
            publickey = (BCRainbowPublicKey)publickey;
            return new RainbowPublicKeyParameters(publickey.getDocLength(), publickey.getCoeffQuadratic(), publickey.getCoeffSingular(), publickey.getCoeffScalar());
        } else
        {
            throw new InvalidKeyException((new StringBuilder()).append("can't identify Rainbow public key: ").append(publickey.getClass().getName()).toString());
        }
    }
}
