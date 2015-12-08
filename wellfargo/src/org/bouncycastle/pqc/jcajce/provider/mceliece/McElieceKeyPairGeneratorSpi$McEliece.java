// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mceliece.McElieceParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.ECCKeyGenParameterSpec;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceKeyPairGeneratorSpi, BCMcEliecePublicKey, BCMcEliecePrivateKey

public class  extends McElieceKeyPairGeneratorSpi
{

    McElieceKeyPairGenerator kpg;

    public KeyPair generateKeyPair()
    {
        AsymmetricCipherKeyPair asymmetriccipherkeypair = kpg.generateKeyPair();
        McEliecePrivateKeyParameters mcelieceprivatekeyparameters = (McEliecePrivateKeyParameters)asymmetriccipherkeypair.getPrivate();
        return new KeyPair(new BCMcEliecePublicKey((McEliecePublicKeyParameters)asymmetriccipherkeypair.getPublic()), new BCMcEliecePrivateKey(mcelieceprivatekeyparameters));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        securerandom = new ECCKeyGenParameterSpec();
        try
        {
            initialize(((AlgorithmParameterSpec) (securerandom)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SecureRandom securerandom)
        {
            return;
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec)
    {
        kpg = new McElieceKeyPairGenerator();
        super.initialize(algorithmparameterspec);
        algorithmparameterspec = (ECCKeyGenParameterSpec)algorithmparameterspec;
        algorithmparameterspec = new McElieceKeyGenerationParameters(new SecureRandom(), new McElieceParameters(algorithmparameterspec.getM(), algorithmparameterspec.getT()));
        kpg.init(algorithmparameterspec);
    }

    public ()
    {
        super("McEliece");
    }
}
