// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.ECCKeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceKeyPairGeneratorSpi, BCMcElieceCCA2PublicKey, BCMcElieceCCA2PrivateKey

public class  extends McElieceKeyPairGeneratorSpi
{

    McElieceCCA2KeyPairGenerator kpg;

    public KeyPair generateKeyPair()
    {
        AsymmetricCipherKeyPair asymmetriccipherkeypair = kpg.generateKeyPair();
        McElieceCCA2PrivateKeyParameters mceliececca2privatekeyparameters = (McElieceCCA2PrivateKeyParameters)asymmetriccipherkeypair.getPrivate();
        return new KeyPair(new BCMcElieceCCA2PublicKey((McElieceCCA2PublicKeyParameters)asymmetriccipherkeypair.getPublic()), new BCMcElieceCCA2PrivateKey(mceliececca2privatekeyparameters));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        securerandom = new McElieceCCA2ParameterSpec();
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
        kpg = new McElieceCCA2KeyPairGenerator();
        super.initialize(algorithmparameterspec);
        algorithmparameterspec = (ECCKeyGenParameterSpec)algorithmparameterspec;
        algorithmparameterspec = new McElieceCCA2KeyGenerationParameters(new SecureRandom(), new McElieceCCA2Parameters(algorithmparameterspec.getM(), algorithmparameterspec.getT()));
        kpg.init(algorithmparameterspec);
    }

    public ()
    {
        super("McElieceCCA-2");
    }

    public (String s)
    {
        super(s);
    }
}
