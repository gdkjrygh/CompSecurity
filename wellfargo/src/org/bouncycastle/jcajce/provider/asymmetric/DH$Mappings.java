// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class ider extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyPairGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        configurableprovider.addAlgorithm("KeyAgreement.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        configurableprovider.addAlgorithm("KeyFactory.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        configurableprovider.addAlgorithm("AlgorithmParameters.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.DH", "org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
        configurableprovider.addAlgorithm("Cipher.DHIES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
        configurableprovider.addAlgorithm("Cipher.DHIESwithAES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES");
        configurableprovider.addAlgorithm("Cipher.DHIESWITHAES", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES");
        configurableprovider.addAlgorithm("Cipher.DHIESWITHDESEDE", "org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESede");
        configurableprovider.addAlgorithm("KeyPairGenerator.IES", "org.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
    }

    public ider()
    {
    }
}
