// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            AsymmetricCipherKeyPair, KeyEncoder

public class EphemeralKeyPair
{

    private AsymmetricCipherKeyPair keyPair;
    private KeyEncoder publicKeyEncoder;

    public EphemeralKeyPair(AsymmetricCipherKeyPair asymmetriccipherkeypair, KeyEncoder keyencoder)
    {
        keyPair = asymmetriccipherkeypair;
        publicKeyEncoder = keyencoder;
    }

    public byte[] getEncodedPublicKey()
    {
        return publicKeyEncoder.getEncoded(keyPair.getPublic());
    }

    public AsymmetricCipherKeyPair getKeyPair()
    {
        return keyPair;
    }
}
