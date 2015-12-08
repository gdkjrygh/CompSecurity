// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceCCA2KeysToParams

public class McEliecePointchevalCipherSpi extends AsymmetricHybridCipher
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    private ByteArrayOutputStream buf;
    private McEliecePointchevalCipher cipher;
    private Digest digest;

    protected McEliecePointchevalCipherSpi(Digest digest1, McEliecePointchevalCipher mceliecepointchevalcipher)
    {
        buf = new ByteArrayOutputStream();
        digest = digest1;
        cipher = mceliecepointchevalcipher;
        buf = new ByteArrayOutputStream();
    }

    protected int decryptOutputSize(int i)
    {
        return 0;
    }

    public byte[] doFinal(byte abyte0[], int i, int j)
    {
        update(abyte0, i, j);
        abyte0 = buf.toByteArray();
        buf.reset();
        if (opMode != 1) goto _L2; else goto _L1
_L1:
        abyte0 = cipher.messageEncrypt(abyte0);
        return abyte0;
        abyte0;
        abyte0.printStackTrace();
_L4:
        return null;
_L2:
        if (opMode != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = cipher.messageDecrypt(abyte0);
        return abyte0;
        abyte0;
        abyte0.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected int encryptOutputSize(int i)
    {
        return 0;
    }

    public int getKeySize(Key key)
    {
        if (key instanceof PublicKey)
        {
            key = (McElieceCCA2KeyParameters)McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey)key);
        } else
        {
            key = (McElieceCCA2KeyParameters)McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey)key);
        }
        return cipher.getKeySize(key);
    }

    public String getName()
    {
        return "McEliecePointchevalCipher";
    }

    protected void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        key = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey)key);
        digest.reset();
        cipher.init(false, key);
    }

    protected void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        key = new ParametersWithRandom(McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey)key), securerandom);
        digest.reset();
        cipher.init(true, key);
    }

    public byte[] messageDecrypt(byte abyte0[])
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

    public byte[] messageEncrypt(byte abyte0[])
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

    public byte[] update(byte abyte0[], int i, int j)
    {
        buf.write(abyte0, i, j);
        return new byte[0];
    }
}
