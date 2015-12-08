// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            ARC4

public class der extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/ARC4.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("Cipher.ARC4", (new StringBuilder()).append(PREFIX).append("$Base").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.1.2.840.113549.3.4", "ARC4");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.ARCFOUR", "ARC4");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RC4", "ARC4");
        configurableprovider.addAlgorithm("KeyGenerator.ARC4", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.RC4", "ARC4");
        configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
    }


    public der()
    {
    }
}
