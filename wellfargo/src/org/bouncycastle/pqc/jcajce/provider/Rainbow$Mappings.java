// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi;

public class ovider extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyFactory.Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi");
        configurableprovider.addAlgorithm("KeyPairGenerator.Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi");
        addSignatureAlgorithm(configurableprovider, "SHA224", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha224", PQCObjectIdentifiers.rainbowWithSha224);
        addSignatureAlgorithm(configurableprovider, "SHA256", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha256", PQCObjectIdentifiers.rainbowWithSha256);
        addSignatureAlgorithm(configurableprovider, "SHA384", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha384", PQCObjectIdentifiers.rainbowWithSha384);
        addSignatureAlgorithm(configurableprovider, "SHA512", "Rainbow", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$withSha512", PQCObjectIdentifiers.rainbowWithSha512);
        RainbowKeyFactorySpi rainbowkeyfactoryspi = new RainbowKeyFactorySpi();
        registerOid(configurableprovider, PQCObjectIdentifiers.rainbow, "Rainbow", rainbowkeyfactoryspi);
        registerOidAlgorithmParameters(configurableprovider, PQCObjectIdentifiers.rainbow, "Rainbow");
    }

    public ovider()
    {
    }
}
