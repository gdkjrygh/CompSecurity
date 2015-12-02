// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.crypto.modes:
//            SICBlockCipher

public class OFBBlockCipher extends StreamBlockCipher
{

    private static final String z;
    private byte IV[];
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte ofbOutV[];
    private byte ofbV[];

    public OFBBlockCipher(BlockCipher blockcipher, int i)
    {
        super(blockcipher);
        cipher = blockcipher;
        blockSize = i / 8;
        IV = new byte[blockcipher.getBlockSize()];
        ofbV = new byte[blockcipher.getBlockSize()];
        ofbOutV = new byte[blockcipher.getBlockSize()];
    }

    protected byte calculateByte(byte byte0)
    {
        if (byteCount == 0)
        {
            cipher.processBlock(ofbV, 0, ofbOutV, 0);
        }
        byte abyte0[] = ofbOutV;
        int i = byteCount;
        byteCount = i + 1;
        byte byte1 = (byte)(abyte0[i] ^ byte0);
        if (byteCount == blockSize)
        {
            byteCount = 0;
            System.arraycopy(ofbV, blockSize, ofbV, 0, ofbV.length - blockSize);
            System.arraycopy(ofbOutV, 0, ofbV, ofbV.length - blockSize, blockSize);
        }
        return byte1;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append(z).append(blockSize * 8).toString();
    }

    public int getBlockSize()
    {
        return blockSize;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
label0:
        {
label1:
            {
                ParametersWithIV parameterswithiv;
label2:
                {
                    flag = SICBlockCipher.a;
                    if (!(cipherparameters instanceof ParametersWithIV))
                    {
                        break label1;
                    }
                    parameterswithiv = (ParametersWithIV)cipherparameters;
                    byte abyte0[] = parameterswithiv.getIV();
                    if (abyte0.length < IV.length)
                    {
                        System.arraycopy(abyte0, 0, IV, IV.length - abyte0.length, abyte0.length);
                        int i = 0;
                        do
                        {
                            if (i >= IV.length - abyte0.length)
                            {
                                break;
                            }
                            IV[i] = 0;
                            i++;
                        } while (!flag);
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    System.arraycopy(abyte0, 0, IV, 0, IV.length);
                }
                reset();
                if (parameterswithiv.getParameters() != null)
                {
                    cipher.init(true, parameterswithiv.getParameters());
                }
                if (!flag)
                {
                    break label0;
                }
            }
            reset();
            if (cipherparameters != null)
            {
                cipher.init(true, cipherparameters);
            }
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        processBytes(abyte0, i, blockSize, abyte1, j);
        return blockSize;
    }

    public void reset()
    {
        System.arraycopy(IV, 0, ofbV, 0, IV.length);
        byteCount = 0;
        cipher.reset();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\036c~!".toCharArray();
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
        byte byte0 = 48;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 49;
          goto _L8
_L3:
        byte0 = 44;
          goto _L8
_L4:
        byte0 = 56;
          goto _L8
        byte0 = 99;
          goto _L8
    }
}
