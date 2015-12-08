// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            BCMcElieceCCA2PrivateKey, BCMcElieceCCA2PublicKey

public class McElieceCCA2KeysToParams
{

    public McElieceCCA2KeysToParams()
    {
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privatekey)
    {
        if (privatekey instanceof BCMcElieceCCA2PrivateKey)
        {
            privatekey = (BCMcElieceCCA2PrivateKey)privatekey;
            return new McElieceCCA2PrivateKeyParameters(privatekey.getOIDString(), privatekey.getN(), privatekey.getK(), privatekey.getField(), privatekey.getGoppaPoly(), privatekey.getP(), privatekey.getH(), privatekey.getQInv(), privatekey.getMcElieceCCA2Parameters());
        } else
        {
            throw new InvalidKeyException("can't identify McElieceCCA2 private key.");
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publickey)
    {
        if (publickey instanceof BCMcElieceCCA2PublicKey)
        {
            publickey = (BCMcElieceCCA2PublicKey)publickey;
            return new McElieceCCA2PublicKeyParameters(publickey.getOIDString(), publickey.getN(), publickey.getT(), publickey.getG(), publickey.getMcElieceCCA2Parameters());
        } else
        {
            throw new InvalidKeyException((new StringBuilder()).append("can't identify McElieceCCA2 public key: ").append(publickey.getClass().getName()).toString());
        }
    }
}
