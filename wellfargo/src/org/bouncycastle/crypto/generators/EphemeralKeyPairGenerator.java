// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.KeyEncoder;

public class EphemeralKeyPairGenerator
{

    private AsymmetricCipherKeyPairGenerator gen;
    private KeyEncoder keyEncoder;

    public EphemeralKeyPairGenerator(AsymmetricCipherKeyPairGenerator asymmetriccipherkeypairgenerator, KeyEncoder keyencoder)
    {
        gen = asymmetriccipherkeypairgenerator;
        keyEncoder = keyencoder;
    }

    public EphemeralKeyPair generate()
    {
        return new EphemeralKeyPair(gen.generateKeyPair(), keyEncoder);
    }
}
