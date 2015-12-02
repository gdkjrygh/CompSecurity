// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.ParametersWithIV;

public class SICBlockCipher extends StreamBlockCipher
    implements StreamCipher
{

    public static boolean a;
    private static final String z[];
    private byte IV[];
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte counter[];
    private byte counterOut[];

    public SICBlockCipher(BlockCipher blockcipher)
    {
        super(blockcipher);
        cipher = blockcipher;
        blockSize = cipher.getBlockSize();
        IV = new byte[blockSize];
        counter = new byte[blockSize];
        counterOut = new byte[blockSize];
        byteCount = 0;
    }

    private void incrementCounter()
    {
        boolean flag = a;
        int i = counter.length - 1;
        do
        {
            if (i < 0)
            {
                break;
            }
            byte byte0;
            byte abyte0[];
            try
            {
                abyte0 = counter;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            byte0 = (byte)(abyte0[i] + 1);
            abyte0[i] = byte0;
            if (byte0 != 0)
            {
                break;
            }
            i--;
        } while (!flag);
    }

    protected byte calculateByte(byte byte0)
    {
        if (byteCount != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int i;
        cipher.processBlock(counter, 0, counterOut, 0);
        abyte0 = counterOut;
        i = byteCount;
        byteCount = i + 1;
        byte byte1;
        i = abyte0[i];
        byte1 = (byte)(i ^ byte0);
_L4:
        return byte1;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
_L2:
        byte byte2;
        byte abyte1[] = counterOut;
        int j = byteCount;
        byteCount = j + 1;
        byte2 = (byte)(abyte1[j] ^ byte0);
        byte1 = byte2;
        if (byteCount != counter.length) goto _L4; else goto _L3
_L3:
        byteCount = 0;
        incrementCounter();
        return byte2;
        abyte1;
        throw abyte1;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append(z[1]).toString();
    }

    public int getBlockSize()
    {
        return cipher.getBlockSize();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        byte abyte0[] = cipherparameters.getIV();
        try
        {
            System.arraycopy(abyte0, 0, IV, 0, IV.length);
            if (cipherparameters.getParameters() != null)
            {
                cipher.init(true, cipherparameters.getParameters());
            }
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
        reset();
        if (!a)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        throw new IllegalArgumentException(z[0]);
        cipherparameters;
        throw cipherparameters;
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        processBytes(abyte0, i, blockSize, abyte1, j);
        return blockSize;
    }

    public void reset()
    {
        System.arraycopy(IV, 0, counter, 0, counter.length);
        cipher.reset();
        byteCount = 0;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\024u\027\0268(X1\026'\"M!_'\"Otf45]9S!\"N'a<3T\035`".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "ho\035u".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 148;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_148;
_L1:
        byte0 = 85;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 71;
          goto _L7
_L3:
        byte0 = 60;
          goto _L7
_L4:
        byte0 = 84;
          goto _L7
        byte0 = 54;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 228;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_228;
_L8:
        byte byte1 = 85;
_L15:
        ac[i] = (char)(byte1 ^ c);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 71;
          goto _L15
_L10:
        byte1 = 60;
          goto _L15
_L11:
        byte1 = 84;
          goto _L15
        byte1 = 54;
          goto _L15
    }
}
