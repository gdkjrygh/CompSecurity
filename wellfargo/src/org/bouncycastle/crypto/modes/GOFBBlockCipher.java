// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class GOFBBlockCipher
    implements BlockCipher
{

    static final int C1 = 0x1010104;
    static final int C2 = 0x1010101;
    private byte IV[];
    int N3;
    int N4;
    private final int blockSize;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte ofbOutV[];
    private byte ofbV[];

    public GOFBBlockCipher(BlockCipher blockcipher)
    {
        firstStep = true;
        cipher = blockcipher;
        blockSize = blockcipher.getBlockSize();
        if (blockSize != 8)
        {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        } else
        {
            IV = new byte[blockcipher.getBlockSize()];
            ofbV = new byte[blockcipher.getBlockSize()];
            ofbOutV = new byte[blockcipher.getBlockSize()];
            return;
        }
    }

    private int bytesToint(byte abyte0[], int i)
    {
        return (abyte0[i + 3] << 24 & 0xff000000) + (abyte0[i + 2] << 16 & 0xff0000) + (abyte0[i + 1] << 8 & 0xff00) + (abyte0[i] & 0xff);
    }

    private void intTobytes(int i, byte abyte0[], int j)
    {
        abyte0[j + 3] = (byte)(i >>> 24);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j] = (byte)i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/GCTR").toString();
    }

    public int getBlockSize()
    {
        return blockSize;
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        firstStep = true;
        N3 = 0;
        N4 = 0;
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.getIV();
            if (abyte0.length < IV.length)
            {
                System.arraycopy(abyte0, 0, IV, IV.length - abyte0.length, abyte0.length);
                for (int i = 0; i < IV.length - abyte0.length; i++)
                {
                    IV[i] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, IV, 0, IV.length);
            }
            reset();
            if (cipherparameters.getParameters() != null)
            {
                cipher.init(true, cipherparameters.getParameters());
            }
        } else
        {
            reset();
            if (cipherparameters != null)
            {
                cipher.init(true, cipherparameters);
                return;
            }
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (blockSize + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (firstStep)
        {
            firstStep = false;
            cipher.processBlock(ofbV, 0, ofbOutV, 0);
            N3 = bytesToint(ofbOutV, 0);
            N4 = bytesToint(ofbOutV, 4);
        }
        N3 = N3 + 0x1010101;
        N4 = N4 + 0x1010104;
        intTobytes(N3, ofbV, 0);
        intTobytes(N4, ofbV, 4);
        cipher.processBlock(ofbV, 0, ofbOutV, 0);
        for (int k = 0; k < blockSize; k++)
        {
            abyte1[j + k] = (byte)(ofbOutV[k] ^ abyte0[i + k]);
        }

        System.arraycopy(ofbV, blockSize, ofbV, 0, ofbV.length - blockSize);
        System.arraycopy(ofbOutV, 0, ofbV, ofbV.length - blockSize, blockSize);
        return blockSize;
    }

    public void reset()
    {
        System.arraycopy(IV, 0, ofbV, 0, IV.length);
        cipher.reset();
    }
}
