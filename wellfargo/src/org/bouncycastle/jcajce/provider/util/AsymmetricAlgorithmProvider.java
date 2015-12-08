// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.util;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.util:
//            AlgorithmProvider, AsymmetricKeyInfoConverter

public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider
{

    public AsymmetricAlgorithmProvider()
    {
    }

    protected void addSignatureAlgorithm(ConfigurableProvider configurableprovider, String s, String s1, String s2, ASN1ObjectIdentifier asn1objectidentifier)
    {
        String s3 = (new StringBuilder()).append(s).append("WITH").append(s1).toString();
        String s4 = (new StringBuilder()).append(s).append("with").append(s1).toString();
        String s5 = (new StringBuilder()).append(s).append("With").append(s1).toString();
        s = (new StringBuilder()).append(s).append("/").append(s1).toString();
        configurableprovider.addAlgorithm((new StringBuilder()).append("Signature.").append(s3).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s4).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s5).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(asn1objectidentifier).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.OID.").append(asn1objectidentifier).toString(), s3);
    }

    protected void registerOid(ConfigurableProvider configurableprovider, ASN1ObjectIdentifier asn1objectidentifier, String s, AsymmetricKeyInfoConverter asymmetrickeyinfoconverter)
    {
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyFactory.").append(asn1objectidentifier).toString(), s);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyPairGenerator.").append(asn1objectidentifier).toString(), s);
        configurableprovider.addKeyInfoConverter(asn1objectidentifier, asymmetrickeyinfoconverter);
    }

    protected void registerOidAlgorithmParameters(ConfigurableProvider configurableprovider, ASN1ObjectIdentifier asn1objectidentifier, String s)
    {
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(asn1objectidentifier).toString(), s);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(asn1objectidentifier).toString(), s);
    }
}
