// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class NoekeonEngine
    implements BlockCipher
{

    private static final int genericSize = 16;
    private static final int nullVector[] = {
        0, 0, 0, 0
    };
    private static final int roundConstants[] = {
        128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 
        188, 99, 198, 151, 53, 106, 212
    };
    private boolean _forEncryption;
    private boolean _initialised;
    private int decryptKeys[];
    private int state[];
    private int subKeys[];

    public NoekeonEngine()
    {
        state = new int[4];
        subKeys = new int[4];
        decryptKeys = new int[4];
        _initialised = false;
    }

    private int bytesToIntBig(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (abyte0[j] & 0xff) << 16 | i << 24 | (abyte0[k] & 0xff) << 8 | abyte0[k + 1] & 0xff;
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        state[0] = bytesToIntBig(abyte0, i);
        state[1] = bytesToIntBig(abyte0, i + 4);
        state[2] = bytesToIntBig(abyte0, i + 8);
        state[3] = bytesToIntBig(abyte0, i + 12);
        System.arraycopy(subKeys, 0, decryptKeys, 0, subKeys.length);
        theta(decryptKeys, nullVector);
        for (i = 16; i > 0; i--)
        {
            theta(state, decryptKeys);
            abyte0 = state;
            abyte0[0] = abyte0[0] ^ roundConstants[i];
            pi1(state);
            gamma(state);
            pi2(state);
        }

        theta(state, decryptKeys);
        abyte0 = state;
        byte byte0 = abyte0[0];
        abyte0[0] = roundConstants[i] ^ byte0;
        intToBytesBig(state[0], abyte1, j);
        intToBytesBig(state[1], abyte1, j + 4);
        intToBytesBig(state[2], abyte1, j + 8);
        intToBytesBig(state[3], abyte1, j + 12);
        return 16;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        state[0] = bytesToIntBig(abyte0, i);
        state[1] = bytesToIntBig(abyte0, i + 4);
        state[2] = bytesToIntBig(abyte0, i + 8);
        state[3] = bytesToIntBig(abyte0, i + 12);
        for (i = 0; i < 16; i++)
        {
            abyte0 = state;
            abyte0[0] = abyte0[0] ^ roundConstants[i];
            theta(state, subKeys);
            pi1(state);
            gamma(state);
            pi2(state);
        }

        abyte0 = state;
        byte byte0 = abyte0[0];
        abyte0[0] = roundConstants[i] ^ byte0;
        theta(state, subKeys);
        intToBytesBig(state[0], abyte1, j);
        intToBytesBig(state[1], abyte1, j + 4);
        intToBytesBig(state[2], abyte1, j + 8);
        intToBytesBig(state[3], abyte1, j + 12);
        return 16;
    }

    private void gamma(int ai[])
    {
        ai[1] = ai[1] ^ ~ai[3] & ~ai[2];
        ai[0] = ai[0] ^ ai[2] & ai[1];
        int i = ai[3];
        ai[3] = ai[0];
        ai[0] = i;
        ai[2] = ai[2] ^ (ai[0] ^ ai[1] ^ ai[3]);
        ai[1] = ai[1] ^ ~ai[3] & ~ai[2];
        ai[0] = ai[0] ^ ai[2] & ai[1];
    }

    private void intToBytesBig(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = (byte)(i >>> 24);
        j = k + 1;
        abyte0[k] = (byte)(i >>> 16);
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    private void pi1(int ai[])
    {
        ai[1] = rotl(ai[1], 1);
        ai[2] = rotl(ai[2], 5);
        ai[3] = rotl(ai[3], 2);
    }

    private void pi2(int ai[])
    {
        ai[1] = rotl(ai[1], 31);
        ai[2] = rotl(ai[2], 27);
        ai[3] = rotl(ai[3], 30);
    }

    private int rotl(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private void setKey(byte abyte0[])
    {
        subKeys[0] = bytesToIntBig(abyte0, 0);
        subKeys[1] = bytesToIntBig(abyte0, 4);
        subKeys[2] = bytesToIntBig(abyte0, 8);
        subKeys[3] = bytesToIntBig(abyte0, 12);
    }

    private void theta(int ai[], int ai1[])
    {
        int i = ai[0] ^ ai[2];
        i ^= rotl(i, 8) ^ rotl(i, 24);
        ai[1] = ai[1] ^ i;
        ai[3] = i ^ ai[3];
        for (i = 0; i < 4; i++)
        {
            ai[i] = ai[i] ^ ai1[i];
        }

        i = ai[1] ^ ai[3];
        i ^= rotl(i, 8) ^ rotl(i, 24);
        ai[0] = ai[0] ^ i;
        ai[2] = i ^ ai[2];
    }

    public String getAlgorithmName()
    {
        return "Noekeon";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to Noekeon init - ").append(cipherparameters.getClass().getName()).toString());
        } else
        {
            _forEncryption = flag;
            _initialised = true;
            setKey(((KeyParameter)cipherparameters).getKey());
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!_initialised)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (_forEncryption)
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
