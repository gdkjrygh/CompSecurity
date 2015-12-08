// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Skipjack

public class  extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/Skipjack.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("Cipher.SKIPJACK", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm("KeyGenerator.SKIPJACK", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm("AlgorithmParameters.SKIPJACK", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("Mac.SKIPJACKMAC", (new StringBuilder()).append(PREFIX).append("$Mac").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
        configurableprovider.addAlgorithm("Mac.SKIPJACKMAC/CFB8", (new StringBuilder()).append(PREFIX).append("$MacCFB8").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
    }


    public ()
    {
    }
}
