// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class RC6Engine
    implements BlockCipher
{

    private static final int LGW = 5;
    private static final int P32 = 0xb7e15163;
    private static final int Q32 = 0x9e3779b9;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int _S[];
    private boolean forEncryption;

    public RC6Engine()
    {
        _S = null;
    }

    private int bytesToWord(byte abyte0[], int i)
    {
        int k = 0;
        for (int j = 3; j >= 0; j--)
        {
            k = (k << 8) + (abyte0[j + i] & 0xff);
        }

        return k;
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int i1 = bytesToWord(abyte0, i);
        int j1 = bytesToWord(abyte0, i + 4);
        int k = bytesToWord(abyte0, i + 8);
        int l = bytesToWord(abyte0, i + 12);
        k -= _S[43];
        i = i1 - _S[42];
        for (i1 = 20; i1 >= 1;)
        {
            int k1 = rotateLeft((i * 2 + 1) * i, 5);
            int i2 = rotateLeft((k * 2 + 1) * k, 5);
            j1 = rotateRight(j1 - _S[i1 * 2 + 1], k1);
            l = rotateRight(l - _S[i1 * 2], i2);
            i1--;
            j1 ^= i2;
            k1 = l ^ k1;
            l = k;
            k = j1;
            j1 = i;
            i = k1;
        }

        i1 = _S[1];
        int l1 = _S[0];
        wordToBytes(i, abyte1, j);
        wordToBytes(j1 - l1, abyte1, j + 4);
        wordToBytes(k, abyte1, j + 8);
        wordToBytes(l - i1, abyte1, j + 12);
        return 16;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = 1;
        int j1 = bytesToWord(abyte0, i);
        int k = bytesToWord(abyte0, i + 4);
        int i1 = bytesToWord(abyte0, i + 8);
        i = bytesToWord(abyte0, i + 12);
        int k1 = _S[0];
        i = _S[1] + i;
        for (k = k1 + k; l <= 20; k = k1)
        {
            k1 = rotateLeft((k * 2 + 1) * k, 5);
            int i2 = rotateLeft((i * 2 + 1) * i, 5);
            j1 = rotateLeft(j1 ^ k1, i2);
            int l1 = _S[l * 2];
            i1 = rotateLeft(i1 ^ i2, k1);
            k1 = _S[l * 2 + 1];
            l++;
            k1 = i1 + k1;
            i1 = i;
            i = j1 + l1;
            j1 = k;
        }

        l = _S[42];
        k1 = _S[43];
        wordToBytes(l + j1, abyte1, j);
        wordToBytes(k, abyte1, j + 4);
        wordToBytes(k1 + i1, abyte1, j + 8);
        wordToBytes(i, abyte1, j + 12);
        return 16;
    }

    private int rotateLeft(int i, int j)
    {
        return i << j | i >>> -j;
    }

    private int rotateRight(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private void setKey(byte abyte0[])
    {
        int l = 0;
        if ((abyte0.length + 3) / 4 != 0);
        int ai[] = new int[((abyte0.length + 4) - 1) / 4];
        for (int i = abyte0.length - 1; i >= 0; i--)
        {
            ai[i / 4] = (ai[i / 4] << 8) + (abyte0[i] & 0xff);
        }

        _S = new int[44];
        _S[0] = 0xb7e15163;
        for (int j = 1; j < _S.length; j++)
        {
            _S[j] = _S[j - 1] - 0x61c88647;
        }

        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        if (ai.length > _S.length)
        {
            k = ai.length * 3;
        } else
        {
            k = _S.length * 3;
        }
        i1 = 0;
        j1 = 0;
        k1 = 0;
        l1 = 0;
        for (; l < k; l++)
        {
            abyte0 = _S;
            l1 = rotateLeft(l1 + _S[j1] + k1, 3);
            abyte0[j1] = l1;
            k1 = rotateLeft(ai[i1] + l1 + k1, k1 + l1);
            ai[i1] = k1;
            j1 = (j1 + 1) % _S.length;
            i1 = (i1 + 1) % ai.length;
        }

    }

    private void wordToBytes(int i, byte abyte0[], int j)
    {
        boolean flag = false;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            abyte0[i + j] = (byte)k;
            k >>>= 8;
        }

    }

    public String getAlgorithmName()
    {
        return "RC6";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to RC6 init - ").append(cipherparameters.getClass().getName()).toString());
        } else
        {
            cipherparameters = (KeyParameter)cipherparameters;
            forEncryption = flag;
            setKey(cipherparameters.getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = getBlockSize();
        if (_S == null)
        {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + k > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
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
