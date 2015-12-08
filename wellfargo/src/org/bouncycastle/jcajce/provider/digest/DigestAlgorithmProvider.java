// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

abstract class DigestAlgorithmProvider extends AlgorithmProvider
{

    DigestAlgorithmProvider()
    {
    }

    protected void addHMACAlgorithm(ConfigurableProvider configurableprovider, String s, String s1, String s2)
    {
        String s3 = (new StringBuilder()).append("HMAC").append(s).toString();
        configurableprovider.addAlgorithm((new StringBuilder()).append("Mac.").append(s3).toString(), s1);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Mac.HMAC-").append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Mac.HMAC/").append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(s3).toString(), s2);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyGenerator.HMAC-").append(s).toString(), s3);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyGenerator.HMAC/").append(s).toString(), s3);
    }

    protected void addHMACAlias(ConfigurableProvider configurableprovider, String s, ASN1ObjectIdentifier asn1objectidentifier)
    {
        s = (new StringBuilder()).append("HMAC").append(s).toString();
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Mac.").append(asn1objectidentifier).toString(), s);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyGenerator.").append(asn1objectidentifier).toString(), s);
    }
}
