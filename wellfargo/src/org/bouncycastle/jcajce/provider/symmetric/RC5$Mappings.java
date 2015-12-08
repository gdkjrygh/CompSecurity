// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            RC5

public class ider extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/RC5.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("Cipher.RC5", (new StringBuilder()).append(PREFIX).append("$ECB32").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.RC5-32", "RC5");
        configurableprovider.addAlgorithm("Cipher.RC5-64", (new StringBuilder()).append(PREFIX).append("$ECB64").toString());
        configurableprovider.addAlgorithm("KeyGenerator.RC5", (new StringBuilder()).append(PREFIX).append("$KeyGen32").toString());
        configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.RC5-32", "RC5");
        configurableprovider.addAlgorithm("KeyGenerator.RC5-64", (new StringBuilder()).append(PREFIX).append("$KeyGen64").toString());
        configurableprovider.addAlgorithm("AlgorithmParameters.RC5", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("AlgorithmParameters.RC5-64", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("Mac.RC5MAC", (new StringBuilder()).append(PREFIX).append("$Mac32").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.RC5", "RC5MAC");
        configurableprovider.addAlgorithm("Mac.RC5MAC/CFB8", (new StringBuilder()).append(PREFIX).append("$CFB8Mac32").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
    }


    public ider()
    {
    }
}
