// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.crypto:
//            KeyGenerationParameters

public class CipherKeyGenerator
{

    protected SecureRandom random;
    protected int strength;

    public CipherKeyGenerator()
    {
    }

    public byte[] generateKey()
    {
        byte abyte0[] = new byte[strength];
        random.nextBytes(abyte0);
        return abyte0;
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        random = keygenerationparameters.getRandom();
        strength = (keygenerationparameters.getStrength() + 7) / 8;
    }
}
