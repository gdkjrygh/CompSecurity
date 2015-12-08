// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes:
//            AEADBlockCipher

public class GCMBlockCipher
    implements AEADBlockCipher
{

    private static final int BLOCK_SIZE = 16;
    private byte H[];
    private byte J0[];
    private byte S[];
    private byte S_at[];
    private byte S_atPre[];
    private byte atBlock[];
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private byte bufBlock[];
    private int bufOff;
    private BlockCipher cipher;
    private byte counter[];
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte initialAssociatedText[];
    private byte macBlock[];
    private int macSize;
    private GCMMultiplier multiplier;
    private byte nonce[];
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockcipher)
    {
        this(blockcipher, null);
    }

    public GCMBlockCipher(BlockCipher blockcipher, GCMMultiplier gcmmultiplier)
    {
        if (blockcipher.getBlockSize() != 16)
        {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        Object obj = gcmmultiplier;
        if (gcmmultiplier == null)
        {
            obj = new Tables8kGCMMultiplier();
        }
        cipher = blockcipher;
        multiplier = ((GCMMultiplier) (obj));
    }

    private void gCTRBlock(byte abyte0[], byte abyte1[], int i)
    {
        byte abyte2[] = getNextCounterBlock();
        xor(abyte2, abyte0);
        System.arraycopy(abyte2, 0, abyte1, i, 16);
        abyte1 = S;
        if (forEncryption)
        {
            abyte0 = abyte2;
        }
        gHASHBlock(abyte1, abyte0);
        totalLength = totalLength + 16L;
    }

    private void gCTRPartial(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        byte abyte2[] = getNextCounterBlock();
        xor(abyte2, abyte0, i, j);
        System.arraycopy(abyte2, 0, abyte1, k, j);
        abyte1 = S;
        if (forEncryption)
        {
            abyte0 = abyte2;
        }
        gHASHPartial(abyte1, abyte0, 0, j);
        totalLength = totalLength + (long)j;
    }

    private void gHASH(byte abyte0[], byte abyte1[], int i)
    {
        for (int j = 0; j < i; j += 16)
        {
            gHASHPartial(abyte0, abyte1, j, Math.min(i - j, 16));
        }

    }

    private void gHASHBlock(byte abyte0[], byte abyte1[])
    {
        xor(abyte0, abyte1);
        multiplier.multiplyH(abyte0);
    }

    private void gHASHPartial(byte abyte0[], byte abyte1[], int i, int j)
    {
        xor(abyte0, abyte1, i, j);
        multiplier.multiplyH(abyte0);
    }

    private byte[] getNextCounterBlock()
    {
        int i = 15;
        do
        {
label0:
            {
                if (i >= 12)
                {
                    byte byte0 = (byte)(counter[i] + 1 & 0xff);
                    counter[i] = byte0;
                    if (byte0 == 0)
                    {
                        break label0;
                    }
                }
                byte abyte0[] = new byte[16];
                cipher.processBlock(counter, 0, abyte0, 0);
                return abyte0;
            }
            i--;
        } while (true);
    }

    private void initCipher()
    {
        if (atLength > 0L)
        {
            System.arraycopy(S_at, 0, S_atPre, 0, 16);
            atLengthPre = atLength;
        }
        if (atBlockPos > 0)
        {
            gHASHPartial(S_atPre, atBlock, 0, atBlockPos);
            atLengthPre = atLengthPre + (long)atBlockPos;
        }
        if (atLengthPre > 0L)
        {
            System.arraycopy(S_atPre, 0, S, 0, 16);
        }
    }

    private static void multiply(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = Arrays.clone(abyte0);
        byte abyte3[] = new byte[16];
        for (int i = 0; i < 16; i++)
        {
            byte byte0 = abyte1[i];
            int j = 7;
            while (j >= 0) 
            {
                if ((1 << j & byte0) != 0)
                {
                    xor(abyte3, abyte2);
                }
                boolean flag;
                if ((abyte2[15] & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                shiftRight(abyte2);
                if (flag)
                {
                    abyte2[0] = (byte)(abyte2[0] ^ 0xffffffe1);
                }
                j--;
            }
        }

        System.arraycopy(abyte3, 0, abyte0, 0, 16);
    }

    private void outputBlock(byte abyte0[], int i)
    {
        if (totalLength == 0L)
        {
            initCipher();
        }
        gCTRBlock(bufBlock, abyte0, i);
        if (forEncryption)
        {
            bufOff = 0;
            return;
        } else
        {
            System.arraycopy(bufBlock, 16, bufBlock, 0, macSize);
            bufOff = macSize;
            return;
        }
    }

    private void reset(boolean flag)
    {
        cipher.reset();
        S = new byte[16];
        S_at = new byte[16];
        S_atPre = new byte[16];
        atBlock = new byte[16];
        atBlockPos = 0;
        atLength = 0L;
        atLengthPre = 0L;
        counter = Arrays.clone(J0);
        bufOff = 0;
        totalLength = 0L;
        if (bufBlock != null)
        {
            Arrays.fill(bufBlock, (byte)0);
        }
        if (flag)
        {
            macBlock = null;
        }
        if (initialAssociatedText != null)
        {
            processAADBytes(initialAssociatedText, 0, initialAssociatedText.length);
        }
    }

    private static void shiftRight(byte abyte0[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = abyte0[j] & 0xff;
            abyte0[j] = (byte)(i | k >>> 1);
            j++;
            if (j == 16)
            {
                return;
            }
            i = (k & 1) << 7;
        } while (true);
    }

    private static void xor(byte abyte0[], byte abyte1[])
    {
        for (int i = 15; i >= 0; i--)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
        }

    }

    private static void xor(byte abyte0[], byte abyte1[], int i, int j)
    {
        do
        {
            int k = j - 1;
            if (j > 0)
            {
                abyte0[k] = (byte)(abyte0[k] ^ abyte1[i + k]);
                j = k;
            } else
            {
                return;
            }
        } while (true);
    }

    public int doFinal(byte abyte0[], int i)
    {
        if (totalLength == 0L)
        {
            initCipher();
        }
        int k = bufOff;
        int j = k;
        if (!forEncryption)
        {
            if (k < macSize)
            {
                throw new InvalidCipherTextException("data too short");
            }
            j = k - macSize;
        }
        if (j > 0)
        {
            gCTRPartial(bufBlock, 0, j, abyte0, i);
        }
        atLength = atLength + (long)atBlockPos;
        if (atLength > atLengthPre)
        {
            if (atBlockPos > 0)
            {
                gHASHPartial(S_at, atBlock, 0, atBlockPos);
            }
            if (atLengthPre > 0L)
            {
                xor(S_at, S_atPre);
            }
            long l = totalLength;
            byte abyte1[] = new byte[16];
            if (exp == null)
            {
                exp = new Tables1kGCMExponentiator();
                exp.init(H);
            }
            exp.exponentiateX(l * 8L + 127L >>> 7, abyte1);
            multiply(S_at, abyte1);
            xor(S, S_at);
        }
        byte abyte2[] = new byte[16];
        Pack.longToBigEndian(atLength * 8L, abyte2, 0);
        Pack.longToBigEndian(totalLength * 8L, abyte2, 8);
        gHASHBlock(S, abyte2);
        abyte2 = new byte[16];
        cipher.processBlock(J0, 0, abyte2, 0);
        xor(abyte2, S);
        macBlock = new byte[macSize];
        System.arraycopy(abyte2, 0, macBlock, 0, macSize);
        if (forEncryption)
        {
            System.arraycopy(macBlock, 0, abyte0, bufOff + i, macSize);
            j += macSize;
        } else
        {
            abyte0 = new byte[macSize];
            System.arraycopy(bufBlock, j, abyte0, 0, macSize);
            if (!Arrays.constantTimeAreEqual(macBlock, abyte0))
            {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return j;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/GCM").toString();
    }

    public byte[] getMac()
    {
        return Arrays.clone(macBlock);
    }

    public int getOutputSize(int i)
    {
        i = bufOff + i;
        if (forEncryption)
        {
            return i + macSize;
        }
        if (i < macSize)
        {
            return 0;
        } else
        {
            return i - macSize;
        }
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public int getUpdateOutputSize(int i)
    {
        int j = bufOff + i;
        i = j;
        if (!forEncryption)
        {
            if (j < macSize)
            {
                return 0;
            }
            i = j - macSize;
        }
        return i - i % 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        forEncryption = flag;
        macBlock = null;
        int j;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            nonce = cipherparameters.getNonce();
            initialAssociatedText = cipherparameters.getAssociatedText();
            int i = cipherparameters.getMacSize();
            if (i < 96 || i > 128 || i % 8 != 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid value for MAC size: ").append(i).toString());
            }
            macSize = i / 8;
            cipherparameters = cipherparameters.getKey();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            nonce = cipherparameters.getIV();
            initialAssociatedText = null;
            macSize = 16;
            cipherparameters = (KeyParameter)cipherparameters.getParameters();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        if (flag)
        {
            j = 16;
        } else
        {
            j = macSize + 16;
        }
        bufBlock = new byte[j];
        if (nonce == null || nonce.length < 1)
        {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (cipherparameters != null)
        {
            cipher.init(true, cipherparameters);
            H = new byte[16];
            cipher.processBlock(H, 0, H, 0);
            multiplier.init(H);
            exp = null;
        }
        J0 = new byte[16];
        if (nonce.length == 12)
        {
            System.arraycopy(nonce, 0, J0, 0, nonce.length);
            J0[15] = 1;
        } else
        {
            gHASH(J0, nonce, nonce.length);
            cipherparameters = new byte[16];
            Pack.longToBigEndian((long)nonce.length * 8L, cipherparameters, 8);
            gHASHBlock(J0, cipherparameters);
        }
        S = new byte[16];
        S_at = new byte[16];
        S_atPre = new byte[16];
        atBlock = new byte[16];
        atBlockPos = 0;
        atLength = 0L;
        atLengthPre = 0L;
        counter = Arrays.clone(J0);
        bufOff = 0;
        totalLength = 0L;
        if (initialAssociatedText != null)
        {
            processAADBytes(initialAssociatedText, 0, initialAssociatedText.length);
        }
    }

    public void processAADByte(byte byte0)
    {
        atBlock[atBlockPos] = byte0;
        int i = atBlockPos + 1;
        atBlockPos = i;
        if (i == 16)
        {
            gHASHBlock(S_at, atBlock);
            atBlockPos = 0;
            atLength = atLength + 16L;
        }
    }

    public void processAADBytes(byte abyte0[], int i, int j)
    {
        for (int k = 0; k < j; k++)
        {
            atBlock[atBlockPos] = abyte0[i + k];
            int l = atBlockPos + 1;
            atBlockPos = l;
            if (l == 16)
            {
                gHASHBlock(S_at, atBlock);
                atBlockPos = 0;
                atLength = atLength + 16L;
            }
        }

    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        bufBlock[bufOff] = byte0;
        int j = bufOff + 1;
        bufOff = j;
        if (j == bufBlock.length)
        {
            outputBlock(abyte0, i);
            return 16;
        } else
        {
            return 0;
        }
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int i1 = 0;
        for (int l = 0; l < j;)
        {
            bufBlock[bufOff] = abyte0[i + l];
            int k1 = bufOff + 1;
            bufOff = k1;
            int j1 = i1;
            if (k1 == bufBlock.length)
            {
                outputBlock(abyte1, k + i1);
                j1 = i1 + 16;
            }
            l++;
            i1 = j1;
        }

        return i1;
    }

    public void reset()
    {
        reset(true);
    }
}
