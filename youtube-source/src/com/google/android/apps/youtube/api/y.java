// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;

final class y extends CipherSpi
{

    private byte a[];
    private int b;
    private int c;
    private byte d[];

    private y()
    {
    }

    y(byte byte0)
    {
        this();
    }

    private void a()
    {
        a(d);
    }

    private void a(byte abyte0[])
    {
        int k = 0;
        d = abyte0;
        b = 0;
        c = 0;
        if (a == null)
        {
            a = new byte[256];
        }
        for (int i = 0; i < 256; i++)
        {
            a[i] = (byte)i;
        }

        int l = 0;
        int j = 0;
        for (; k < 256; k++)
        {
            l = l + ((abyte0[j] & 0xff) + a[k]) & 0xff;
            byte byte0 = a[k];
            a[k] = a[l];
            a[l] = byte0;
            j = (j + 1) % abyte0.length;
        }

    }

    private void a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (i + j > abyte0.length)
        {
            throw new IllegalStateException("Input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new IllegalStateException("Output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            b = b + 1 & 0xff;
            c = a[b] + c & 0xff;
            byte byte0 = a[b];
            a[b] = a[c];
            a[c] = byte0;
            abyte1[l + k] = (byte)(abyte0[l + i] ^ a[a[b] + a[c] & 0xff]);
        }

    }

    protected final int engineDoFinal(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (j != 0)
        {
            a(abyte0, i, j, abyte1, k);
        }
        a();
        return j;
    }

    protected final byte[] engineDoFinal(byte abyte0[], int i, int j)
    {
        if (j != 0)
        {
            abyte0 = engineUpdate(abyte0, i, j);
            a();
            return abyte0;
        } else
        {
            a();
            return new byte[0];
        }
    }

    protected final int engineGetBlockSize()
    {
        return 0;
    }

    protected final byte[] engineGetIV()
    {
        return null;
    }

    protected final int engineGetKeySize(Key key)
    {
        return key.getEncoded().length * 8;
    }

    protected final int engineGetOutputSize(int i)
    {
        return i;
    }

    protected final AlgorithmParameters engineGetParameters()
    {
        return null;
    }

    protected final void engineInit(int i, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        engineInit(i, key, ((AlgorithmParameterSpec) (null)), securerandom);
    }

    protected final void engineInit(int i, Key key, SecureRandom securerandom)
    {
        engineInit(i, key, ((AlgorithmParameterSpec) (null)), securerandom);
    }

    protected final void engineInit(int i, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!key.getAlgorithm().equals("RC4"))
        {
            throw new InvalidKeyException("Must be provided with an RC4 key.");
        } else
        {
            d = key.getEncoded();
            a(d);
            return;
        }
    }

    protected final void engineSetMode(String s)
    {
        throw new IllegalArgumentException((new StringBuilder("can't support mode ")).append(s).toString());
    }

    protected final void engineSetPadding(String s)
    {
        if (!s.equalsIgnoreCase("NoPadding"))
        {
            throw new NoSuchPaddingException((new StringBuilder("Padding ")).append(s).append(" unknown.").toString());
        } else
        {
            return;
        }
    }

    protected final int engineUpdate(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        a(abyte0, i, j, abyte1, k);
        return j;
    }

    protected final byte[] engineUpdate(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        a(abyte0, i, j, abyte1, 0);
        return abyte1;
    }
}
