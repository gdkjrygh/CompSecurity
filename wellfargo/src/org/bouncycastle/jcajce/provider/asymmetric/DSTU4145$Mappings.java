// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class  extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyFactory.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
        configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
        registerOid(configurableprovider, UAObjectIdentifiers.dstu4145le, "DSTU4145", new KeyFactorySpi());
        registerOidAlgorithmParameters(configurableprovider, UAObjectIdentifiers.dstu4145le, "DSTU4145");
        registerOid(configurableprovider, UAObjectIdentifiers.dstu4145be, "DSTU4145", new KeyFactorySpi());
        registerOidAlgorithmParameters(configurableprovider, UAObjectIdentifiers.dstu4145be, "DSTU4145");
        configurableprovider.addAlgorithm("KeyPairGenerator.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
        configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
        configurableprovider.addAlgorithm("Signature.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
        addSignatureAlgorithm(configurableprovider, "GOST3411", "DSTU4145LE", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", UAObjectIdentifiers.dstu4145le);
        addSignatureAlgorithm(configurableprovider, "GOST3411", "DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", UAObjectIdentifiers.dstu4145be);
    }

    public ()
    {
    }
}
