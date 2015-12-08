// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyPairGenerator;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.rainbow:
//            BCRainbowPublicKey, BCRainbowPrivateKey

public class RainbowKeyPairGeneratorSpi extends KeyPairGenerator
{

    RainbowKeyPairGenerator engine;
    boolean initialised;
    RainbowKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public RainbowKeyPairGeneratorSpi()
    {
        super("Rainbow");
        engine = new RainbowKeyPairGenerator();
        strength = 1024;
        random = new SecureRandom();
        initialised = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!initialised)
        {
            param = new RainbowKeyGenerationParameters(random, new RainbowParameters((new RainbowParameterSpec()).getVi()));
            engine.init(param);
            initialised = true;
        }
        Object obj = engine.generateKeyPair();
        RainbowPublicKeyParameters rainbowpublickeyparameters = (RainbowPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (RainbowPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new BCRainbowPublicKey(rainbowpublickeyparameters), new BCRainbowPrivateKey(((RainbowPrivateKeyParameters) (obj))));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        strength = i;
        random = securerandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof RainbowParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a RainbowParameterSpec");
        } else
        {
            param = new RainbowKeyGenerationParameters(securerandom, new RainbowParameters(((RainbowParameterSpec)algorithmparameterspec).getVi()));
            engine.init(param);
            initialised = true;
            return;
        }
    }
}
