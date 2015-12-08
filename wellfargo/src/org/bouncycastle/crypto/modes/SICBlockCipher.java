// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class SICBlockCipher
    implements BlockCipher
{

    private byte IV[];
    private final int blockSize;
    private final BlockCipher cipher;
    private byte counter[];
    private byte counterOut[];

    public SICBlockCipher(BlockCipher blockcipher)
    {
        cipher = blockcipher;
        blockSize = cipher.getBlockSize();
        IV = new byte[blockSize];
        counter = new byte[blockSize];
        counterOut = new byte[blockSize];
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/SIC").toString();
    }

    public int getBlockSize()
    {
        return cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            System.arraycopy(cipherparameters.getIV(), 0, IV, 0, IV.length);
            reset();
            if (cipherparameters.getParameters() != null)
            {
                cipher.init(true, cipherparameters.getParameters());
            }
            return;
        } else
        {
            throw new IllegalArgumentException("SIC mode requires ParametersWithIV");
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 0;
        cipher.processBlock(counter, 0, counterOut, 0);
        for (; k < counterOut.length; k++)
        {
            abyte1[j + k] = (byte)(counterOut[k] ^ abyte0[i + k]);
        }

        i = counter.length - 1;
        do
        {
            if (i < 0)
            {
                break;
            }
            abyte0 = counter;
            byte byte0 = (byte)(abyte0[i] + 1);
            abyte0[i] = byte0;
            if (byte0 != 0)
            {
                break;
            }
            i--;
        } while (true);
        return counter.length;
    }

    public void reset()
    {
        System.arraycopy(IV, 0, counter, 0, counter.length);
        cipher.reset();
    }
}
