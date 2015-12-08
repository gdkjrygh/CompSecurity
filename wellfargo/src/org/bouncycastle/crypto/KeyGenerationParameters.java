// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import java.security.SecureRandom;

public class KeyGenerationParameters
{

    private SecureRandom random;
    private int strength;

    public KeyGenerationParameters(SecureRandom securerandom, int i)
    {
        random = securerandom;
        strength = i;
    }

    public SecureRandom getRandom()
    {
        return random;
    }

    public int getStrength()
    {
        return strength;
    }
}
