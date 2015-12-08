// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            CAST5

public class er extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/CAST5.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameters.CAST5", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.CAST5", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
        configurableprovider.addAlgorithm("Cipher.CAST5", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm("Cipher.1.2.840.113533.7.66.10", (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm("KeyGenerator.CAST5", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.1.2.840.113533.7.66.10", "CAST5");
    }


    public er()
    {
    }
}
