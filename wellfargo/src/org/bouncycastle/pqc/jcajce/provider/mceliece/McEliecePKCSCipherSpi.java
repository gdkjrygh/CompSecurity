// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSCipher;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceKeysToParams

public class McEliecePKCSCipherSpi extends AsymmetricBlockCipher
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    private McEliecePKCSCipher cipher;
    private Digest digest;

    public McEliecePKCSCipherSpi(Digest digest1, McEliecePKCSCipher mceliecepkcscipher)
    {
        digest = digest1;
        cipher = mceliecepkcscipher;
    }

    public int getKeySize(Key key)
    {
        if (key instanceof PublicKey)
        {
            key = (McElieceKeyParameters)McElieceKeysToParams.generatePublicKeyParameter((PublicKey)key);
        } else
        {
            key = (McElieceKeyParameters)McElieceKeysToParams.generatePrivateKeyParameter((PrivateKey)key);
        }
        return cipher.getKeySize(key);
    }

    public String getName()
    {
        return "McEliecePKCS";
    }

    protected void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        key = McElieceKeysToParams.generatePrivateKeyParameter((PrivateKey)key);
        digest.reset();
        cipher.init(false, key);
        maxPlainTextSize = cipher.maxPlainTextSize;
        cipherTextSize = cipher.cipherTextSize;
    }

    protected void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        key = new ParametersWithRandom(McElieceKeysToParams.generatePublicKeyParameter((PublicKey)key), securerandom);
        digest.reset();
        cipher.init(true, key);
        maxPlainTextSize = cipher.maxPlainTextSize;
        cipherTextSize = cipher.cipherTextSize;
    }

    protected byte[] messageDecrypt(byte abyte0[])
    {
        try
        {
            abyte0 = cipher.messageDecrypt(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    protected byte[] messageEncrypt(byte abyte0[])
    {
        try
        {
            abyte0 = cipher.messageEncrypt(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }
}
