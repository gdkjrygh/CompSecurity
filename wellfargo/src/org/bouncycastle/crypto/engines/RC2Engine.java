// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;

public class RC2Engine
    implements BlockCipher
{

    private static final int BLOCK_SIZE = 8;
    private static byte piTable[] = {
        -39, 120, -7, -60, 25, -35, -75, -19, 40, -23, 
        -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 
        43, 118, 83, -114, 98, 76, 100, -120, 68, -117, 
        -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 
        97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 
        64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 
        92, 107, 78, -126, 84, -42, 101, -109, -50, 96, 
        -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 
        18, 117, -54, 31, 59, -66, -28, -47, 66, 61, 
        -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 
        70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 
        67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 
        6, -61, -43, 47, -56, 102, 30, -41, 8, -24, 
        -22, -34, -128, 82, -18, -9, -124, -86, 114, -84, 
        53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 
        73, 116, 75, -97, -48, 94, 4, 24, -92, -20, 
        -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, 
        -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 
        35, -72, -76, 122, -4, 2, 54, 91, 37, 85, 
        -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 
        5, -33, 41, 16, 103, 108, -70, -55, -45, 0, 
        -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 
        88, -30, -119, -87, 13, 56, 52, 27, -85, 51, 
        -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, 
        -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 
        32, 104, -2, 127, -63, -83
    };
    private boolean encrypting;
    private int workingKey[];

    public RC2Engine()
    {
    }

    private void decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int j1 = ((abyte0[i + 7] & 0xff) << 8) + (abyte0[i + 6] & 0xff);
        int l = ((abyte0[i + 5] & 0xff) << 8) + (abyte0[i + 4] & 0xff);
        int k = ((abyte0[i + 3] & 0xff) << 8) + (abyte0[i + 2] & 0xff);
        int i1 = abyte0[i + 1];
        i = (abyte0[i + 0] & 0xff) + ((i1 & 0xff) << 8);
        for (i1 = 60; i1 >= 44; i1 -= 4)
        {
            j1 = rotateWordLeft(j1, 11) - ((~l & i) + (k & l) + workingKey[i1 + 3]);
            l = rotateWordLeft(l, 13) - ((~k & j1) + (i & k) + workingKey[i1 + 2]);
            k = rotateWordLeft(k, 14) - ((~i & l) + (j1 & i) + workingKey[i1 + 1]);
            i = rotateWordLeft(i, 15) - ((~j1 & k) + (l & j1) + workingKey[i1]);
        }

        j1 -= workingKey[l & 0x3f];
        l -= workingKey[k & 0x3f];
        k -= workingKey[i & 0x3f];
        i -= workingKey[j1 & 0x3f];
        for (i1 = 40; i1 >= 20; i1 -= 4)
        {
            j1 = rotateWordLeft(j1, 11) - ((~l & i) + (k & l) + workingKey[i1 + 3]);
            l = rotateWordLeft(l, 13) - ((~k & j1) + (i & k) + workingKey[i1 + 2]);
            k = rotateWordLeft(k, 14) - ((~i & l) + (j1 & i) + workingKey[i1 + 1]);
            i = rotateWordLeft(i, 15) - ((~j1 & k) + (l & j1) + workingKey[i1]);
        }

        j1 -= workingKey[l & 0x3f];
        i1 = l - workingKey[k & 0x3f];
        l = k - workingKey[i & 0x3f];
        k = i - workingKey[j1 & 0x3f];
        for (i = 16; i >= 0; i -= 4)
        {
            j1 = rotateWordLeft(j1, 11) - ((~i1 & k) + (l & i1) + workingKey[i + 3]);
            i1 = rotateWordLeft(i1, 13) - ((~l & j1) + (k & l) + workingKey[i + 2]);
            l = rotateWordLeft(l, 14) - ((~k & i1) + (j1 & k) + workingKey[i + 1]);
            k = rotateWordLeft(k, 15) - ((~j1 & l) + (i1 & j1) + workingKey[i]);
        }

        abyte1[j + 0] = (byte)k;
        abyte1[j + 1] = (byte)(k >> 8);
        abyte1[j + 2] = (byte)l;
        abyte1[j + 3] = (byte)(l >> 8);
        abyte1[j + 4] = (byte)i1;
        abyte1[j + 5] = (byte)(i1 >> 8);
        abyte1[j + 6] = (byte)j1;
        abyte1[j + 7] = (byte)(j1 >> 8);
    }

    private void encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int i2 = ((abyte0[i + 7] & 0xff) << 8) + (abyte0[i + 6] & 0xff);
        int k = ((abyte0[i + 5] & 0xff) << 8) + (abyte0[i + 4] & 0xff);
        int l = ((abyte0[i + 3] & 0xff) << 8) + (abyte0[i + 2] & 0xff);
        int i1 = abyte0[i + 1];
        int l1 = (abyte0[i + 0] & 0xff) + ((i1 & 0xff) << 8);
        i1 = 0;
        i = i2;
        for (; i1 <= 16; i1 += 4)
        {
            l1 = rotateWordLeft(l1 + (~i & l) + (k & i) + workingKey[i1], 1);
            l = rotateWordLeft(l + (~l1 & k) + (i & l1) + workingKey[i1 + 1], 2);
            k = rotateWordLeft(k + (~l & i) + (l1 & l) + workingKey[i1 + 2], 3);
            i = rotateWordLeft(i + (~k & l1) + (l & k) + workingKey[i1 + 3], 5);
        }

        l1 += workingKey[i & 0x3f];
        l += workingKey[l1 & 0x3f];
        k += workingKey[l & 0x3f];
        i += workingKey[k & 0x3f];
        for (int j1 = 20; j1 <= 40; j1 += 4)
        {
            l1 = rotateWordLeft(l1 + (~i & l) + (k & i) + workingKey[j1], 1);
            l = rotateWordLeft(l + (~l1 & k) + (i & l1) + workingKey[j1 + 1], 2);
            k = rotateWordLeft(k + (~l & i) + (l1 & l) + workingKey[j1 + 2], 3);
            i = rotateWordLeft(i + (~k & l1) + (l & k) + workingKey[j1 + 3], 5);
        }

        l1 += workingKey[i & 0x3f];
        l += workingKey[l1 & 0x3f];
        k += workingKey[l & 0x3f];
        i += workingKey[k & 0x3f];
        for (int k1 = 44; k1 < 64; k1 += 4)
        {
            l1 = rotateWordLeft(l1 + (~i & l) + (k & i) + workingKey[k1], 1);
            l = rotateWordLeft(l + (~l1 & k) + (i & l1) + workingKey[k1 + 1], 2);
            k = rotateWordLeft(k + (~l & i) + (l1 & l) + workingKey[k1 + 2], 3);
            i = rotateWordLeft(i + (~k & l1) + (l & k) + workingKey[k1 + 3], 5);
        }

        abyte1[j + 0] = (byte)l1;
        abyte1[j + 1] = (byte)(l1 >> 8);
        abyte1[j + 2] = (byte)l;
        abyte1[j + 3] = (byte)(l >> 8);
        abyte1[j + 4] = (byte)k;
        abyte1[j + 5] = (byte)(k >> 8);
        abyte1[j + 6] = (byte)i;
        abyte1[j + 7] = (byte)(i >> 8);
    }

    private int[] generateWorkingKey(byte abyte0[], int i)
    {
        int ai[];
        int l;
        boolean flag;
        flag = false;
        ai = new int[128];
        for (int j = 0; j != abyte0.length; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        l = abyte0.length;
        if (l >= 128) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        i1 = ai[l - 1];
        k = 0;
_L5:
        int j1;
        i1 = piTable[ai[k] + i1 & 0xff] & 0xff;
        j1 = l + 1;
        ai[l] = i1;
        if (j1 < 128) goto _L3; else goto _L2
_L2:
        l = i + 7 >> 3;
        k = piTable[ai[128 - l] & 255 >> (-i & 7)] & 0xff;
        ai[128 - l] = k;
        for (i = 128 - l - 1; i >= 0; i--)
        {
            k = piTable[k ^ ai[i + l]] & 0xff;
            ai[i] = k;
        }

        abyte0 = new int[64];
        for (i = ((flag) ? 1 : 0); i != abyte0.length; i++)
        {
            abyte0[i] = ai[i * 2] + (ai[i * 2 + 1] << 8);
        }

        return abyte0;
_L3:
        l = j1;
        k++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private int rotateWordLeft(int i, int j)
    {
        i = 0xffff & i;
        return i >> 16 - j | i << j;
    }

    public String getAlgorithmName()
    {
        return "RC2";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        encrypting = flag;
        if (cipherparameters instanceof RC2Parameters)
        {
            cipherparameters = (RC2Parameters)cipherparameters;
            workingKey = generateWorkingKey(cipherparameters.getKey(), cipherparameters.getEffectiveKeyBits());
            return;
        }
        if (cipherparameters instanceof KeyParameter)
        {
            cipherparameters = ((KeyParameter)cipherparameters).getKey();
            workingKey = generateWorkingKey(cipherparameters, cipherparameters.length * 8);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to RC2 init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (workingKey == null)
        {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (encrypting)
        {
            encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            decryptBlock(abyte0, i, abyte1, j);
        }
        return 8;
    }

    public void reset()
    {
    }

}
