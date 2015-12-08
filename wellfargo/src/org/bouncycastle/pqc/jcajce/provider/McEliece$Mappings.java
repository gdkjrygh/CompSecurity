// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;

public class vider extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyPairGenerator.McElieceKobaraImai", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McElieceCCA2");
        configurableprovider.addAlgorithm("KeyPairGenerator.McEliecePointcheval", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McElieceCCA2");
        configurableprovider.addAlgorithm("KeyPairGenerator.McElieceFujisaki", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McElieceCCA2");
        configurableprovider.addAlgorithm("KeyPairGenerator.McEliecePKCS", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McEliece");
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyPairGenerator.").append(PQCObjectIdentifiers.mcEliece).toString(), "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McEliece");
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyPairGenerator.").append(PQCObjectIdentifiers.mcElieceCca2).toString(), "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McElieceCCA2");
        configurableprovider.addAlgorithm("Cipher.McEliecePointcheval", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval");
        configurableprovider.addAlgorithm("Cipher.McEliecePointchevalWithSHA1", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval");
        configurableprovider.addAlgorithm("Cipher.McEliecePointchevalWithSHA224", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval224");
        configurableprovider.addAlgorithm("Cipher.McEliecePointchevalWithSHA256", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval256");
        configurableprovider.addAlgorithm("Cipher.McEliecePointchevalWithSHA384", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval384");
        configurableprovider.addAlgorithm("Cipher.McEliecePointchevalWithSHA512", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval512");
        configurableprovider.addAlgorithm("Cipher.McEliecePKCS", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS");
        configurableprovider.addAlgorithm("Cipher.McEliecePKCSWithSHA1", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS");
        configurableprovider.addAlgorithm("Cipher.McEliecePKCSWithSHA224", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS224");
        configurableprovider.addAlgorithm("Cipher.McEliecePKCSWithSHA256", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS256");
        configurableprovider.addAlgorithm("Cipher.McEliecePKCSWithSHA384", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS384");
        configurableprovider.addAlgorithm("Cipher.McEliecePKCSWithSHA512", "org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS512");
        configurableprovider.addAlgorithm("Cipher.McElieceKobaraImai", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai");
        configurableprovider.addAlgorithm("Cipher.McElieceKobaraImaiWithSHA1", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai");
        configurableprovider.addAlgorithm("Cipher.McElieceKobaraImaiWithSHA224", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai224");
        configurableprovider.addAlgorithm("Cipher.McElieceKobaraImaiWithSHA256", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai256");
        configurableprovider.addAlgorithm("Cipher.McElieceKobaraImaiWithSHA384", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai384");
        configurableprovider.addAlgorithm("Cipher.McElieceKobaraImaiWithSHA512", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai512");
        configurableprovider.addAlgorithm("Cipher.McElieceFujisaki", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki");
        configurableprovider.addAlgorithm("Cipher.McElieceFujisakiWithSHA1", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki");
        configurableprovider.addAlgorithm("Cipher.McElieceFujisakiWithSHA224", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki224");
        configurableprovider.addAlgorithm("Cipher.McElieceFujisakiWithSHA256", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki256");
        configurableprovider.addAlgorithm("Cipher.McElieceFujisakiWithSHA384", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki384");
        configurableprovider.addAlgorithm("Cipher.McElieceFujisakiWithSHA512", "org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki512");
    }

    public vider()
    {
    }
}
