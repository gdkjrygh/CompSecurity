// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher;
import org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            McElieceCCA2KeysToParams

public class McElieceKobaraImaiCipherSpi extends AsymmetricHybridCipher
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    private ByteArrayOutputStream buf;
    private McElieceKobaraImaiCipher cipher;
    private Digest digest;

    public McElieceKobaraImaiCipherSpi()
    {
        buf = new ByteArrayOutputStream();
        buf = new ByteArrayOutputStream();
    }

    protected McElieceKobaraImaiCipherSpi(Digest digest1, McElieceKobaraImaiCipher mceliecekobaraimaicipher)
    {
        buf = new ByteArrayOutputStream();
        digest = digest1;
        cipher = mceliecekobaraimaicipher;
        buf = new ByteArrayOutputStream();
    }

    private byte[] pad()
    {
        buf.write(1);
        byte abyte0[] = buf.toByteArray();
        buf.reset();
        return abyte0;
    }

    private byte[] unpad(byte abyte0[])
    {
        int i;
        for (i = abyte0.length - 1; i >= 0 && abyte0[i] == 0; i--) { }
        if (abyte0[i] != 1)
        {
            throw new BadPaddingException("invalid ciphertext");
        } else
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 0, abyte1, 0, i);
            return abyte1;
        }
    }

    protected int decryptOutputSize(int i)
    {
        return 0;
    }

    public byte[] doFinal(byte abyte0[], int i, int j)
    {
        update(abyte0, i, j);
        if (opMode != 1) goto _L2; else goto _L1
_L1:
        abyte0 = cipher.messageEncrypt(pad());
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
        abyte0 = buf.toByteArray();
        buf.reset();
        abyte0 = unpad(cipher.messageDecrypt(abyte0));
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
            return cipher.getKeySize(key);
        }
        if (key instanceof PrivateKey)
        {
            key = (McElieceCCA2KeyParameters)McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey)key);
            return cipher.getKeySize(key);
        } else
        {
            throw new InvalidKeyException();
        }
    }

    public String getName()
    {
        return "McElieceKobaraImaiCipher";
    }

    protected void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        buf.reset();
        key = McElieceCCA2KeysToParams.generatePrivateKeyParameter((PrivateKey)key);
        digest.reset();
        cipher.init(false, key);
    }

    protected void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        buf.reset();
        key = new ParametersWithRandom(McElieceCCA2KeysToParams.generatePublicKeyParameter((PublicKey)key), securerandom);
        digest.reset();
        cipher.init(true, key);
    }

    public byte[] messageDecrypt()
    {
        byte abyte0[] = buf.toByteArray();
        buf.reset();
        try
        {
            abyte0 = unpad(cipher.messageDecrypt(abyte0));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public byte[] messageEncrypt()
    {
        byte abyte0[];
        try
        {
            abyte0 = cipher.messageEncrypt(pad());
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
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
