// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

public class CBCBlockCipherMac
    implements Mac
{

    private byte buf[];
    private int bufOff;
    private BlockCipher cipher;
    private byte mac[];
    private int macSize;
    private BlockCipherPadding padding;

    public CBCBlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, (blockcipher.getBlockSize() * 8) / 2, null);
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, int i)
    {
        this(blockcipher, i, null);
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, int i, BlockCipherPadding blockcipherpadding)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            cipher = new CBCBlockCipher(blockcipher);
            padding = blockcipherpadding;
            macSize = i / 8;
            mac = new byte[blockcipher.getBlockSize()];
            buf = new byte[blockcipher.getBlockSize()];
            bufOff = 0;
            return;
        }
    }

    public CBCBlockCipherMac(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        this(blockcipher, (blockcipher.getBlockSize() * 8) / 2, blockcipherpadding);
    }

    public int doFinal(byte abyte0[], int i)
    {
        int j = cipher.getBlockSize();
        if (padding == null)
        {
            for (; bufOff < j; bufOff = bufOff + 1)
            {
                buf[bufOff] = 0;
            }

        } else
        {
            if (bufOff == j)
            {
                cipher.processBlock(buf, 0, mac, 0);
                bufOff = 0;
            }
            padding.addPadding(buf, bufOff);
        }
        cipher.processBlock(buf, 0, mac, 0);
        System.arraycopy(mac, 0, abyte0, i, macSize);
        reset();
        return macSize;
    }

    public String getAlgorithmName()
    {
        return cipher.getAlgorithmName();
    }

    public int getMacSize()
    {
        return macSize;
    }

    public void init(CipherParameters cipherparameters)
    {
        reset();
        cipher.init(true, cipherparameters);
    }

    public void reset()
    {
        for (int i = 0; i < buf.length; i++)
        {
            buf[i] = 0;
        }

        bufOff = 0;
        cipher.reset();
    }

    public void update(byte byte0)
    {
        if (bufOff == buf.length)
        {
            cipher.processBlock(buf, 0, mac, 0);
            bufOff = 0;
        }
        byte abyte0[] = buf;
        int i = bufOff;
        bufOff = i + 1;
        abyte0[i] = byte0;
    }

    public void update(byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i1 = cipher.getBlockSize();
        int j1 = i1 - bufOff;
        int k = i;
        int l = j;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, buf, bufOff, j1);
            cipher.processBlock(buf, 0, mac, 0);
            bufOff = 0;
            j -= j1;
            i += j1;
            do
            {
                k = i;
                l = j;
                if (j <= i1)
                {
                    break;
                }
                cipher.processBlock(abyte0, i, mac, 0);
                j -= i1;
                i += i1;
            } while (true);
        }
        System.arraycopy(abyte0, k, buf, bufOff, l);
        bufOff = bufOff + l;
    }
}
