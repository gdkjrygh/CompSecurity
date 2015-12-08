// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.ShortBufferException;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.util:
//            CipherSpiExt

public abstract class AsymmetricHybridCipher extends CipherSpiExt
{

    protected AlgorithmParameterSpec paramSpec;

    public AsymmetricHybridCipher()
    {
    }

    protected abstract int decryptOutputSize(int i);

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

    public abstract byte[] doFinal(byte abyte0[], int i, int j);

    protected abstract int encryptOutputSize(int i);

    public final int getBlockSize()
    {
        return 0;
    }

    public final byte[] getIV()
    {
        return null;
    }

    public final int getOutputSize(int i)
    {
        if (opMode == 1)
        {
            return encryptOutputSize(i);
        } else
        {
            return decryptOutputSize(i);
        }
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

    protected final void setMode(String s)
    {
    }

    protected final void setPadding(String s)
    {
    }

    public final int update(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (abyte1.length < getOutputSize(j))
        {
            throw new ShortBufferException("output");
        } else
        {
            abyte0 = update(abyte0, i, j);
            System.arraycopy(abyte0, 0, abyte1, k, abyte0.length);
            return abyte0.length;
        }
    }

    public abstract byte[] update(byte abyte0[], int i, int j);
}
