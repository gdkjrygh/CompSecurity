// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.DESKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class ator extends BaseKeyGenerator
{

    protected SecretKey engineGenerateKey()
    {
        if (uninitialised)
        {
            engine.init(new KeyGenerationParameters(new SecureRandom(), defaultKeySize));
            uninitialised = false;
        }
        return new SecretKeySpec(engine.generateKey(), algName);
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        super.engineInit(i, securerandom);
    }

    public ator()
    {
        super("DES", 64, new DESKeyGenerator());
    }
}
