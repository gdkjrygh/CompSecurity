// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;

class cipher
    implements cipher
{

    private static final String z;
    private BufferedBlockCipher cipher;

    public int doFinal(byte abyte0[], int i)
    {
        try
        {
            i = cipher.doFinal(abyte0, i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return i;
    }

    public String getAlgorithmName()
    {
        return cipher.getUnderlyingCipher().getAlgorithmName();
    }

    public int getOutputSize(int i)
    {
        return cipher.getOutputSize(i);
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher.getUnderlyingCipher();
    }

    public int getUpdateOutputSize(int i)
    {
        return cipher.getUpdateOutputSize(i);
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        cipher.init(flag, cipherparameters);
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        return cipher.processByte(byte0, abyte0, i);
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        return cipher.processBytes(abyte0, i, j, abyte1, k);
    }

    public void updateAAD(byte abyte0[], int i, int j)
    {
        throw new UnsupportedOperationException(z);
    }

    public boolean wrapOnNoPadding()
    {
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "6o8^\021\004\016\022\021\fW]\t\016\b\030\\\b\033\034WG\022^\f\037K\\\035\r\005\\\031\020\fWC\023\032\035Y".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 120;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 119;
          goto _L8
_L3:
        byte0 = 46;
          goto _L8
_L4:
        byte0 = 124;
          goto _L8
        byte0 = 126;
          goto _L8
    }

    (BlockCipher blockcipher)
    {
        cipher = new PaddedBufferedBlockCipher(blockcipher);
    }

    cipher(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        cipher = new PaddedBufferedBlockCipher(blockcipher, blockcipherpadding);
    }

    cipher(BufferedBlockCipher bufferedblockcipher)
    {
        cipher = bufferedblockcipher;
    }
}
