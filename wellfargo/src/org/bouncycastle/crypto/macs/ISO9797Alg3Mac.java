// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class ISO9797Alg3Mac
    implements Mac
{

    private byte buf[];
    private int bufOff;
    private BlockCipher cipher;
    private KeyParameter lastKey2;
    private KeyParameter lastKey3;
    private byte mac[];
    private int macSize;
    private BlockCipherPadding padding;

    public ISO9797Alg3Mac(BlockCipher blockcipher)
    {
        this(blockcipher, blockcipher.getBlockSize() * 8, null);
    }

    public ISO9797Alg3Mac(BlockCipher blockcipher, int i)
    {
        this(blockcipher, i, null);
    }

    public ISO9797Alg3Mac(BlockCipher blockcipher, int i, BlockCipherPadding blockcipherpadding)
    {
        if (i % 8 != 0)
        {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(blockcipher instanceof DESEngine))
        {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
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

    public ISO9797Alg3Mac(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        this(blockcipher, blockcipher.getBlockSize() * 8, blockcipherpadding);
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
        DESEngine desengine = new DESEngine();
        desengine.init(false, lastKey2);
        desengine.processBlock(mac, 0, mac, 0);
        desengine.init(true, lastKey3);
        desengine.processBlock(mac, 0, mac, 0);
        System.arraycopy(mac, 0, abyte0, i, macSize);
        reset();
        return macSize;
    }

    public String getAlgorithmName()
    {
        return "ISO9797Alg3";
    }

    public int getMacSize()
    {
        return macSize;
    }

    public void init(CipherParameters cipherparameters)
    {
        reset();
        if (!(cipherparameters instanceof KeyParameter) && !(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        KeyParameter keyparameter;
        byte abyte0[];
        if (cipherparameters instanceof KeyParameter)
        {
            keyparameter = (KeyParameter)cipherparameters;
        } else
        {
            keyparameter = (KeyParameter)((ParametersWithIV)cipherparameters).getParameters();
        }
        abyte0 = keyparameter.getKey();
        if (abyte0.length == 16)
        {
            keyparameter = new KeyParameter(abyte0, 0, 8);
            lastKey2 = new KeyParameter(abyte0, 8, 8);
            lastKey3 = keyparameter;
        } else
        if (abyte0.length == 24)
        {
            keyparameter = new KeyParameter(abyte0, 0, 8);
            lastKey2 = new KeyParameter(abyte0, 8, 8);
            lastKey3 = new KeyParameter(abyte0, 16, 8);
        } else
        {
            throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipher.init(true, new ParametersWithIV(keyparameter, ((ParametersWithIV)cipherparameters).getIV()));
            return;
        } else
        {
            cipher.init(true, keyparameter);
            return;
        }
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
