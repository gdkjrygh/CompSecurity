// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dsa:
//            BCDSAPublicKey, BCDSAPrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    int certainty;
    DSAKeyPairGenerator engine;
    boolean initialised;
    DSAKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi()
    {
        super("DSA");
        engine = new DSAKeyPairGenerator();
        strength = 1024;
        certainty = 20;
        random = new SecureRandom();
        initialised = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!initialised)
        {
            DSAParametersGenerator dsaparametersgenerator = new DSAParametersGenerator();
            dsaparametersgenerator.init(strength, certainty, random);
            param = new DSAKeyGenerationParameters(random, dsaparametersgenerator.generateParameters());
            engine.init(param);
            initialised = true;
        }
        Object obj = engine.generateKeyPair();
        DSAPublicKeyParameters dsapublickeyparameters = (DSAPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (DSAPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new BCDSAPublicKey(dsapublickeyparameters), new BCDSAPrivateKey(((DSAPrivateKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        if (i < 512 || i > 1024 || i % 64 != 0)
        {
            throw new InvalidParameterException("strength must be from 512 - 1024 and a multiple of 64");
        } else
        {
            strength = i;
            random = securerandom;
            return;
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof DSAParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        } else
        {
            algorithmparameterspec = (DSAParameterSpec)algorithmparameterspec;
            param = new DSAKeyGenerationParameters(securerandom, new DSAParameters(algorithmparameterspec.getP(), algorithmparameterspec.getQ(), algorithmparameterspec.getG()));
            engine.init(param);
            initialised = true;
            return;
        }
    }
}
