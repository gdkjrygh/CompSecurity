// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.util;

import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.util:
//            CipherSpiExt

public abstract class AsymmetricBlockCipher extends CipherSpiExt
{

    protected ByteArrayOutputStream buf;
    protected int cipherTextSize;
    protected int maxPlainTextSize;
    protected AlgorithmParameterSpec paramSpec;

    public AsymmetricBlockCipher()
    {
        buf = new ByteArrayOutputStream();
    }

    protected void checkLength(int i)
    {
        i = buf.size() + i;
        if (opMode == 1)
        {
            if (i > maxPlainTextSize)
            {
                throw new IllegalBlockSizeException((new StringBuilder()).append("The length of the plaintext (").append(i).append(" bytes) is not supported by ").append("the cipher (max. ").append(maxPlainTextSize).append(" bytes).").toString());
            }
        } else
        if (opMode == 2 && i != cipherTextSize)
        {
            throw new IllegalBlockSizeException((new StringBuilder()).append("Illegal ciphertext length (expected ").append(cipherTextSize).append(" bytes, was ").append(i).append(" bytes).").toString());
        }
    }

    public final int doFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (abyte1.length < getOutputSize(j))
        {
            throw new ShortBufferException("Output buffer too short.");
        } else
        {
            abyte0 = doFinal(abyte0, i, j);
            System.arraycopy(abyte0, 0, abyte1, k, abyte0.length);
            return abyte0.length;
        }
    }

    public final byte[] doFinal(byte abyte0[], int i, int j)
    {
        checkLength(j);
        update(abyte0, i, j);
        abyte0 = buf.toByteArray();
        buf.reset();
        switch (opMode)
        {
        default:
            return null;

        case 1: // '\001'
            return messageEncrypt(abyte0);

        case 2: // '\002'
            return messageDecrypt(abyte0);
        }
    }

    public final int getBlockSize()
    {
        if (opMode == 1)
        {
            return maxPlainTextSize;
        } else
        {
            return cipherTextSize;
        }
    }

    public final byte[] getIV()
    {
        return null;
    }

    public final int getOutputSize(int i)
    {
        int l = buf.size();
        int k = getBlockSize();
        int j = k;
        if (i + l > k)
        {
            j = 0;
        }
        return j;
    }

    public final AlgorithmParameterSpec getParameters()
    {
        return paramSpec;
    }

    protected abstract void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmparameterspec);

    protected abstract void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom);

    public final void initDecrypt(Key key)
    {
        try
        {
            initDecrypt(key, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initDecrypt(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        opMode = 2;
        initCipherDecrypt(key, algorithmparameterspec);
    }

    public final void initEncrypt(Key key)
    {
        try
        {
            initEncrypt(key, null, new SecureRandom());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(Key key, SecureRandom securerandom)
    {
        try
        {
            initEncrypt(key, null, securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        initEncrypt(key, algorithmparameterspec, new SecureRandom());
    }

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        opMode = 1;
        initCipherEncrypt(key, algorithmparameterspec, securerandom);
    }

    protected abstract byte[] messageDecrypt(byte abyte0[]);

    protected abstract byte[] messageEncrypt(byte abyte0[]);

    protected final void setMode(String s)
    {
    }

    protected final void setPadding(String s)
    {
    }

    public final int update(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        update(abyte0, i, j);
        return 0;
    }

    public final byte[] update(byte abyte0[], int i, int j)
    {
        if (j != 0)
        {
            buf.write(abyte0, i, j);
        }
        return new byte[0];
    }
}
