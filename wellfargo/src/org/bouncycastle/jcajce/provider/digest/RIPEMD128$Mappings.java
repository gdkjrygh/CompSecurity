// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, RIPEMD128

public class r extends DigestAlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/RIPEMD128.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("MessageDigest.RIPEMD128", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.MessageDigest.").append(TeleTrusTObjectIdentifiers.ripemd128).toString(), "RIPEMD128");
        addHMACAlgorithm(configurableprovider, "RIPEMD128", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
    }


    public r()
    {
    }
}
