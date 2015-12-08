// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, Tiger

public class vider extends DigestAlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/Tiger.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("MessageDigest.TIGER", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
        configurableprovider.addAlgorithm("MessageDigest.Tiger", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
        addHMACAlgorithm(configurableprovider, "TIGER", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        addHMACAlias(configurableprovider, "TIGER", IANAObjectIdentifiers.hmacTIGER);
    }


    public vider()
    {
    }
}
