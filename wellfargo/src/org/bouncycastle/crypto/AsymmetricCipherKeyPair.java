// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

// Referenced classes of package org.bouncycastle.crypto:
//            CipherParameters

public class AsymmetricCipherKeyPair
{

    private AsymmetricKeyParameter privateParam;
    private AsymmetricKeyParameter publicParam;

    public AsymmetricCipherKeyPair(CipherParameters cipherparameters, CipherParameters cipherparameters1)
    {
        publicParam = (AsymmetricKeyParameter)cipherparameters;
        privateParam = (AsymmetricKeyParameter)cipherparameters1;
    }

    public AsymmetricCipherKeyPair(AsymmetricKeyParameter asymmetrickeyparameter, AsymmetricKeyParameter asymmetrickeyparameter1)
    {
        publicParam = asymmetrickeyparameter;
        privateParam = asymmetrickeyparameter1;
    }

    public AsymmetricKeyParameter getPrivate()
    {
        return privateParam;
    }

    public AsymmetricKeyParameter getPublic()
    {
        return publicParam;
    }
}
