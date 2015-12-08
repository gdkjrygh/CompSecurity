// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DHAgreement
{

    private DHParameters dhParams;
    private DHPrivateKeyParameters key;
    private BigInteger privateValue;
    private SecureRandom random;

    public DHAgreement()
    {
    }

    public BigInteger calculateAgreement(DHPublicKeyParameters dhpublickeyparameters, BigInteger biginteger)
    {
        if (!dhpublickeyparameters.getParameters().equals(dhParams))
        {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        } else
        {
            BigInteger biginteger1 = dhParams.getP();
            return biginteger.modPow(key.getX(), biginteger1).multiply(dhpublickeyparameters.getY().modPow(privateValue, biginteger1)).mod(biginteger1);
        }
    }

    public BigInteger calculateMessage()
    {
        Object obj = new DHKeyPairGenerator();
        ((DHKeyPairGenerator) (obj)).init(new DHKeyGenerationParameters(random, dhParams));
        obj = ((DHKeyPairGenerator) (obj)).generateKeyPair();
        privateValue = ((DHPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate()).getX();
        return ((DHPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic()).getY();
    }

    public void init(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            random = cipherparameters.getRandom();
            cipherparameters = (AsymmetricKeyParameter)cipherparameters.getParameters();
        } else
        {
            random = new SecureRandom();
            cipherparameters = (AsymmetricKeyParameter)cipherparameters;
        }
        if (!(cipherparameters instanceof DHPrivateKeyParameters))
        {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        } else
        {
            key = (DHPrivateKeyParameters)cipherparameters;
            dhParams = key.getParameters();
            return;
        }
    }
}
