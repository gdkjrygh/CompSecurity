// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            BCMcEliecePrivateKey, BCMcEliecePublicKey

public class McElieceKeysToParams
{

    public McElieceKeysToParams()
    {
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privatekey)
    {
        if (privatekey instanceof BCMcEliecePrivateKey)
        {
            privatekey = (BCMcEliecePrivateKey)privatekey;
            return new McEliecePrivateKeyParameters(privatekey.getOIDString(), privatekey.getN(), privatekey.getK(), privatekey.getField(), privatekey.getGoppaPoly(), privatekey.getSInv(), privatekey.getP1(), privatekey.getP2(), privatekey.getH(), privatekey.getQInv(), privatekey.getMcElieceParameters());
        } else
        {
            throw new InvalidKeyException("can't identify McEliece private key.");
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publickey)
    {
        if (publickey instanceof BCMcEliecePublicKey)
        {
            publickey = (BCMcEliecePublicKey)publickey;
            return new McEliecePublicKeyParameters(publickey.getOIDString(), publickey.getN(), publickey.getT(), publickey.getG(), publickey.getMcElieceParameters());
        } else
        {
            throw new InvalidKeyException((new StringBuilder()).append("can't identify McEliece public key: ").append(publickey.getClass().getName()).toString());
        }
    }
}
