// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

public class RC532Engine
    implements BlockCipher
{

    private static final int P32 = 0xb7e15163;
    private static final int Q32 = 0x9e3779b9;
    private int _S[];
    private int _noRounds;
    private boolean forEncryption;

    public RC532Engine()
    {
        _noRounds = 12;
        _S = null;
    }

    private int bytesToWord(byte abyte0[], int i)
    {
        return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = bytesToWord(abyte0, i);
        int i1 = bytesToWord(abyte0, i + 4);
        int k = _noRounds;
        i = l;
        l = i1;
        for (; k >= 1; k--)
        {
            l = rotateRight(l - _S[k * 2 + 1], i) ^ i;
            i = rotateRight(i - _S[k * 2], l) ^ l;
        }

        wordToBytes(i - _S[0], abyte1, j);
        wordToBytes(l - _S[1], abyte1, j + 4);
        return 8;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = true;
        int k = bytesToWord(abyte0, i);
        int l = _S[0] + k;
        k = bytesToWord(abyte0, i + 4) + _S[1];
        for (i = ((flag) ? 1 : 0); i <= _noRounds; i++)
        {
            l = rotateLeft(l ^ k, k) + _S[i * 2];
            k = rotateLeft(k ^ l, l) + _S[i * 2 + 1];
        }

        wordToBytes(l, abyte1, j);
        wordToBytes(k, abyte1, j + 4);
        return 8;
    }

    private int rotateLeft(int i, int j)
    {
        return i << (j & 0x1f) | i >>> 32 - (j & 0x1f);
    }

    private int rotateRight(int i, int j)
    {
        return i >>> (j & 0x1f) | i << 32 - (j & 0x1f);
    }

    private void setKey(byte abyte0[])
    {
        int l = 0;
        int ai[] = new int[(abyte0.length + 3) / 4];
        for (int i = 0; i != abyte0.length; i++)
        {
            int i1 = i / 4;
            ai[i1] = ai[i1] + ((abyte0[i] & 0xff) << (i % 4) * 8);
        }

        _S = new int[(_noRounds + 1) * 2];
        _S[0] = 0xb7e15163;
        for (int j = 1; j < _S.length; j++)
        {
            _S[j] = _S[j - 1] - 0x61c88647;
        }

        int k;
        int j1;
        int k1;
        int l1;
        int i2;
        if (ai.length > _S.length)
        {
            k = ai.length * 3;
        } else
        {
            k = _S.length * 3;
        }
        j1 = 0;
        k1 = 0;
        l1 = 0;
        i2 = 0;
        for (; l < k; l++)
        {
            abyte0 = _S;
            i2 = rotateLeft(i2 + _S[k1] + l1, 3);
            abyte0[k1] = i2;
            l1 = rotateLeft(ai[j1] + i2 + l1, l1 + i2);
            ai[j1] = l1;
            k1 = (k1 + 1) % _S.length;
            j1 = (j1 + 1) % ai.length;
        }

    }

    private void wordToBytes(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        abyte0[j + 1] = (byte)(i >> 8);
        abyte0[j + 2] = (byte)(i >> 16);
        abyte0[j + 3] = (byte)(i >> 24);
    }

    public String getAlgorithmName()
    {
        return "RC5-32";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof RC5Parameters)
        {
            cipherparameters = (RC5Parameters)cipherparameters;
            _noRounds = cipherparameters.getRounds();
            setKey(cipherparameters.getKey());
        } else
        if (cipherparameters instanceof KeyParameter)
        {
            setKey(((KeyParameter)cipherparameters).getKey());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to RC532 init - ").append(cipherparameters.getClass().getName()).toString());
        }
        forEncryption = flag;
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (forEncryption)
        {
            return encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            return decryptBlock(abyte0, i, abyte1, j);
        }
    }

    public void reset()
    {
    }
}
