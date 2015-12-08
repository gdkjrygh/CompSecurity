// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

// Referenced classes of package org.bouncycastle.crypto.macs:
//            MacCFBBlockCipher

public class CFBBlockCipherMac
    implements Mac
{

    private byte buf[];
    private int bufOff;
    private MacCFBBlockCipher cipher;
    private byte mac[];
    private int macSize;
    private BlockCipherPadding padding;

    public CFBBlockCipherMac(BlockCipher blockcipher)
    {
        this(blockcipher, 8, (blockcipher.getBlockSize() * 8) / 2, null);
    }

    public CFBBlockCipherMac(BlockCipher blockcipher, int i, int j)
    {
        this(blockcipher, i, j, null);
    }

    public CFBBlockCipherMac(BlockCipher blockcipher, int i, int j, BlockCipherPadding blockcipherpadding)
    {
        padding = null;
        if (j % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else
        {
            mac = new byte[blockcipher.getBlockSize()];
            cipher = new MacCFBBlockCipher(blockcipher, i);
            padding = blockcipherpadding;
            macSize = j / 8;
            buf = new byte[cipher.getBlockSize()];
            bufOff = 0;
            return;
        }
    }

    public CFBBlockCipherMac(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        this(blockcipher, 8, (blockcipher.getBlockSize() * 8) / 2, blockcipherpadding);
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
            padding.addPadding(buf, bufOff);
        }
        cipher.processBlock(buf, 0, mac, 0);
        cipher.getMacBlock(mac);
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
        cipher.init(cipherparameters);
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
        int j1 = cipher.getBlockSize();
        int k1 = j1 - bufOff;
        int k = i;
        int l = j;
        if (j > k1)
        {
            System.arraycopy(abyte0, i, buf, bufOff, k1);
            int i1 = cipher.processBlock(buf, 0, mac, 0) + 0;
            bufOff = 0;
            j -= k1;
            i += k1;
            do
            {
                k = i;
                l = j;
                if (j <= j1)
                {
                    break;
                }
                i1 += cipher.processBlock(abyte0, i, mac, 0);
                j -= j1;
                i += j1;
            } while (true);
        }
        System.arraycopy(abyte0, k, buf, bufOff, l);
        bufOff = bufOff + l;
    }
}
