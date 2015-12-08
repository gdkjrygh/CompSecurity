// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            GOST28147

public class  extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/GOST28147.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("Cipher.GOST28147", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(CryptoProObjectIdentifiers.gostR28147_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm("KeyGenerator.GOST28147", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
        configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyGenerator.").append(CryptoProObjectIdentifiers.gostR28147_cbc).toString(), "GOST28147");
        configurableprovider.addAlgorithm("Mac.GOST28147MAC", (new StringBuilder()).append(PREFIX).append("$Mac").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
    }


    public ()
    {
    }
}
