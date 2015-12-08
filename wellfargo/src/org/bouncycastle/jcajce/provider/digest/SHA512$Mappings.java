// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, SHA512

public class ider extends DigestAlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/SHA512.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("MessageDigest.SHA-512", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
        configurableprovider.addAlgorithm("Alg.Alias.MessageDigest.SHA512", "SHA-512");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.MessageDigest.").append(NISTObjectIdentifiers.id_sha512).toString(), "SHA-512");
        addHMACAlgorithm(configurableprovider, "SHA512", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        addHMACAlias(configurableprovider, "SHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
    }


    public ider()
    {
    }
}
