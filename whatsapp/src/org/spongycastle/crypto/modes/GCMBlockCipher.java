// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.gcm.GCMExponentiator;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.modes:
//            AEADBlockCipher, SICBlockCipher

public class GCMBlockCipher
    implements AEADBlockCipher
{

    private static final int BLOCK_SIZE = 16;
    private static final String z[];
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
            throw new IllegalArgumentException(z[11]);
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
        boolean flag;
        try
        {
            xor(abyte2, abyte0);
            System.arraycopy(abyte2, 0, abyte1, i, 16);
            abyte1 = S;
            flag = forEncryption;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (flag)
        {
            abyte0 = abyte2;
        }
        gHASHBlock(abyte1, abyte0);
        totalLength = totalLength + 16L;
    }

    private void gCTRPartial(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        byte abyte2[] = getNextCounterBlock();
        boolean flag;
        try
        {
            xor(abyte2, abyte0, i, j);
            System.arraycopy(abyte2, 0, abyte1, k, j);
            abyte1 = S;
            flag = forEncryption;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (flag)
        {
            abyte0 = abyte2;
        }
        gHASHPartial(abyte1, abyte0, 0, j);
        totalLength = totalLength + (long)j;
    }

    private void gHASH(byte abyte0[], byte abyte1[], int i)
    {
        boolean flag = SICBlockCipher.a;
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            gHASHPartial(abyte0, abyte1, j, Math.min(i - j, 16));
            j += 16;
        } while (!flag);
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
        boolean flag = SICBlockCipher.a;
        int i = 15;
        do
        {
            if (i < 12)
            {
                break;
            }
            byte byte0 = (byte)(counter[i] + 1 & 0xff);
            byte abyte0[];
            try
            {
                counter[i] = byte0;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                try
                {
                    throw illegalargumentexception;
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
            }
            if (byte0 != 0 && !flag)
            {
                break;
            }
            i--;
        } while (!flag);
        abyte0 = new byte[16];
        cipher.processBlock(counter, 0, abyte0, 0);
        return abyte0;
    }

    private void initCipher()
    {
        try
        {
            if (atLength > 0L)
            {
                System.arraycopy(S_at, 0, S_atPre, 0, 16);
                atLengthPre = atLength;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        try
        {
            if (atBlockPos > 0)
            {
                gHASHPartial(S_atPre, atBlock, 0, atBlockPos);
                atLengthPre = atLengthPre + (long)atBlockPos;
            }
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        try
        {
            if (atLengthPre > 0L)
            {
                System.arraycopy(S_atPre, 0, S, 0, 16);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
    }

    private static void multiply(byte abyte0[], byte abyte1[])
    {
        byte abyte2[];
        byte abyte3[];
        int i;
        boolean flag1;
        flag1 = SICBlockCipher.a;
        abyte2 = Arrays.clone(abyte0);
        abyte3 = new byte[16];
        i = 0;
_L4:
        if (i >= 16) goto _L2; else goto _L1
_L1:
        int j;
        byte byte0;
        byte0 = abyte1[i];
        j = 7;
_L5:
        if (j >= 0)
        {
            boolean flag;
            if ((1 << j & byte0) != 0)
            {
                try
                {
                    xor(abyte3, abyte2);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
            }
            if ((abyte2[15] & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                shiftRight(abyte2);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (flag)
            {
                abyte2[0] = (byte)(abyte2[0] ^ 0xffffffe1);
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_127;
            }
        }
        if (!flag1) goto _L3; else goto _L2
_L2:
        System.arraycopy(abyte3, 0, abyte0, 0, 16);
        return;
_L3:
        i++;
          goto _L4
        j--;
          goto _L5
    }

    private void outputBlock(byte abyte0[], int i)
    {
        try
        {
            if (abyte0.length < i + 16)
            {
                throw new OutputLengthException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        boolean flag;
        try
        {
            if (totalLength == 0L)
            {
                initCipher();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            gCTRBlock(bufBlock, abyte0, i);
            flag = forEncryption;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        bufOff = 0;
        if (!SICBlockCipher.a)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        System.arraycopy(bufBlock, 16, bufBlock, 0, macSize);
        bufOff = macSize;
    }

    private void reset(boolean flag)
    {
        try
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
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (flag)
        {
            try
            {
                macBlock = null;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        try
        {
            if (initialAssociatedText != null)
            {
                processAADBytes(initialAssociatedText, 0, initialAssociatedText.length);
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
    }

    private static void shiftRight(byte abyte0[])
    {
        int i = 0;
        boolean flag = SICBlockCipher.a;
        int j = 0;
        do
        {
            int k = abyte0[j] & 0xff;
            abyte0[j] = (byte)(i | k >>> 1);
            j++;
            if (j == 16 && !flag)
            {
                break;
            }
            i = (k & 1) << 7;
        } while (!flag);
    }

    private static void xor(byte abyte0[], byte abyte1[])
    {
        boolean flag = SICBlockCipher.a;
        int i = 15;
        do
        {
            if (i < 0)
            {
                break;
            }
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i--;
        } while (!flag);
    }

    private static void xor(byte abyte0[], byte abyte1[], int i, int j)
    {
        boolean flag = SICBlockCipher.a;
        do
        {
            int k;
label0:
            {
                k = j - 1;
                if (j > 0)
                {
                    abyte0[k] = (byte)(abyte0[k] ^ abyte1[i + k]);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            j = k;
        } while (true);
    }

    public int doFinal(byte abyte0[], int i)
    {
        int j;
        int k;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = SICBlockCipher.a;
        boolean flag2;
        try
        {
            if (totalLength == 0L)
            {
                initCipher();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        k = bufOff;
        flag2 = forEncryption;
        j = k;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        try
        {
            if (k < macSize)
            {
                throw new InvalidCipherTextException(z[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        break MISSING_BLOCK_LABEL_74;
        abyte0;
        throw abyte0;
        j = k - macSize;
        if (j > 0)
        {
            try
            {
                if (abyte0.length < i + j)
                {
                    throw new OutputLengthException(z[10]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            gCTRPartial(bufBlock, 0, j, abyte0, i);
        }
        long l1;
        long l3;
        atLength = atLength + (long)atBlockPos;
        l1 = atLength;
        l3 = atLengthPre;
        if (l1 > l3)
        {
            byte abyte1[];
            long l2;
            boolean flag3;
            try
            {
                if (atBlockPos > 0)
                {
                    gHASHPartial(S_at, atBlock, 0, atBlockPos);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            try
            {
                if (atLengthPre > 0L)
                {
                    xor(S_at, S_atPre);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            l2 = totalLength;
            abyte1 = new byte[16];
            try
            {
                if (exp == null)
                {
                    exp = new Tables1kGCMExponentiator();
                    exp.init(H);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            exp.exponentiateX(l2 * 8L + 127L >>> 7, abyte1);
            multiply(S_at, abyte1);
            xor(S, S_at);
        }
        abyte1 = new byte[16];
        Pack.longToBigEndian(atLength * 8L, abyte1, 0);
        Pack.longToBigEndian(totalLength * 8L, abyte1, 8);
        gHASHBlock(S, abyte1);
        abyte1 = new byte[16];
        cipher.processBlock(J0, 0, abyte1, 0);
        xor(abyte1, S);
        macBlock = new byte[macSize];
        System.arraycopy(abyte1, 0, macBlock, 0, macSize);
        flag3 = forEncryption;
        int l;
        boolean flag4;
        if (flag3)
        {
            try
            {
                if (abyte0.length < i + j + macSize)
                {
                    throw new OutputLengthException(z[8]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            break MISSING_BLOCK_LABEL_441;
        }
        i = j;
          goto _L1
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
        System.arraycopy(macBlock, 0, abyte0, bufOff + i, macSize);
        i = macSize + j;
        l = i;
        if (!flag1) goto _L3; else goto _L2
_L2:
        abyte0 = new byte[macSize];
        try
        {
            System.arraycopy(bufBlock, j, abyte0, 0, macSize);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        l = i;
        if (!Arrays.constantTimeAreEqual(macBlock, abyte0))
        {
            throw new InvalidCipherTextException(z[9]);
        }
_L3:
        try
        {
            reset(false);
            flag4 = BaseKeyGenerator.a;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (flag4)
        {
            if (!flag1)
            {
                flag = true;
            }
            SICBlockCipher.a = flag;
        }
        return l;
_L1:
        if (true) goto _L2; else goto _L4
_L4:
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append(z[6]).toString();
    }

    public byte[] getMac()
    {
        return Arrays.clone(macBlock);
    }

    public int getOutputSize(int i)
    {
label0:
        {
            i = bufOff + i;
            int j;
            try
            {
                if (!forEncryption)
                {
                    break label0;
                }
                j = macSize;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return i + j;
        }
        int k;
        try
        {
            k = macSize;
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (i < k)
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
        int j;
        j = bufOff + i;
        boolean flag;
        try
        {
            flag = forEncryption;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        i = j;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (j < macSize)
        {
            return 0;
        }
        i = j - macSize;
        return i - i % 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        Object obj;
        boolean flag2;
label0:
        {
            flag2 = SICBlockCipher.a;
            forEncryption = flag;
            macBlock = null;
            if (cipherparameters instanceof AEADParameters)
            {
                obj = (AEADParameters)cipherparameters;
                nonce = ((AEADParameters) (obj)).getNonce();
                initialAssociatedText = ((AEADParameters) (obj)).getAssociatedText();
                int i = ((AEADParameters) (obj)).getMacSize();
                if (i < 32 || i > 128 || i % 8 != 0)
                {
                    try
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append(z[3]).append(i).toString());
                    }
                    // Misplaced declaration of an exception variable
                    catch (CipherParameters cipherparameters)
                    {
                        throw cipherparameters;
                    }
                }
                macSize = i / 8;
                obj = ((AEADParameters) (obj)).getKey();
                if (!flag2)
                {
                    break label0;
                }
                boolean flag1;
                try
                {
                    flag1 = BaseKeyGenerator.a;
                }
                // Misplaced declaration of an exception variable
                catch (CipherParameters cipherparameters)
                {
                    throw cipherparameters;
                }
                if (flag1)
                {
                    flag1 = false;
                } else
                {
                    flag1 = true;
                }
                BaseKeyGenerator.a = flag1;
            }
            if (cipherparameters instanceof ParametersWithIV)
            {
                cipherparameters = (ParametersWithIV)cipherparameters;
                nonce = cipherparameters.getIV();
                initialAssociatedText = null;
                macSize = 16;
                obj = (KeyParameter)cipherparameters.getParameters();
                if (!flag2)
                {
                    break label0;
                }
            }
            try
            {
                throw new IllegalArgumentException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (CipherParameters cipherparameters)
            {
                throw cipherparameters;
            }
        }
        int j;
        if (flag)
        {
            j = 16;
        } else
        {
            j = macSize + 16;
        }
        try
        {
            bufBlock = new byte[j];
            cipherparameters = nonce;
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            try
            {
                throw cipherparameters;
            }
            // Misplaced declaration of an exception variable
            catch (CipherParameters cipherparameters)
            {
                throw cipherparameters;
            }
        }
        if (cipherparameters == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        if (nonce.length >= 1)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        throw new IllegalArgumentException(z[2]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        cipher.init(true, ((CipherParameters) (obj)));
        H = new byte[16];
        cipher.processBlock(H, 0, H, 0);
        multiplier.init(H);
        exp = null;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        try
        {
            if (H == null)
            {
                throw new IllegalArgumentException(z[4]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
        break MISSING_BLOCK_LABEL_369;
        cipherparameters;
        throw cipherparameters;
label1:
        {
label2:
            {
                try
                {
                    J0 = new byte[16];
                    if (nonce.length != 12)
                    {
                        break label2;
                    }
                    System.arraycopy(nonce, 0, J0, 0, nonce.length);
                    J0[15] = 1;
                }
                // Misplaced declaration of an exception variable
                catch (CipherParameters cipherparameters)
                {
                    throw cipherparameters;
                }
                if (!flag2)
                {
                    break label1;
                }
            }
            gHASH(J0, nonce, nonce.length);
            cipherparameters = new byte[16];
            Pack.longToBigEndian((long)nonce.length * 8L, cipherparameters, 8);
            gHASHBlock(J0, cipherparameters);
        }
        try
        {
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
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
    }

    public void processAADByte(byte byte0)
    {
        int i;
        try
        {
            atBlock[atBlockPos] = byte0;
            i = atBlockPos + 1;
            atBlockPos = i;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i != 16)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        gHASHBlock(S_at, atBlock);
        atBlockPos = 0;
        atLength = atLength + 16L;
    }

    public void processAADBytes(byte abyte0[], int i, int j)
    {
        int k;
        boolean flag;
        k = 0;
        flag = SICBlockCipher.a;
_L2:
        if (k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        int l;
        try
        {
            atBlock[atBlockPos] = abyte0[i + k];
            l = atBlockPos + 1;
            atBlockPos = l;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (l != 16)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        gHASHBlock(S_at, atBlock);
        atBlockPos = 0;
        atLength = atLength + 16L;
        k++;
        if (!flag) goto _L2; else goto _L1
_L1:
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
label0:
        {
            try
            {
                bufBlock[bufOff] = byte0;
                int j = bufOff + 1;
                bufOff = j;
                if (j != bufBlock.length)
                {
                    break label0;
                }
                outputBlock(abyte0, i);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return 16;
        }
        return 0;
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int l;
        int j1;
        boolean flag;
        l = 0;
        flag = SICBlockCipher.a;
        try
        {
            if (abyte0.length < i + j)
            {
                throw new DataLengthException(z[5]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        j1 = 0;
_L2:
        int i1 = l;
        if (j1 >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1;
        try
        {
            bufBlock[bufOff] = abyte0[i + j1];
            k1 = bufOff + 1;
            bufOff = k1;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i1 = l;
        if (k1 != bufBlock.length)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        outputBlock(abyte1, k + l);
        i1 = l + 16;
        j1++;
        l = i1;
        if (!flag) goto _L2; else goto _L1
_L1:
        return i1;
    }

    public void reset()
    {
        reset(true);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\025xg{a.-q~r<ha+`5b3x|5\177g".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "3cejx3i3{u(l~n`?\177`+d;~`npzy|+S\031@".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 524
    //                   0 547
    //                   1 554
    //                   2 561
    //                   3 568;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_568;
_L1:
        byte0 = 20;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 90;
          goto _L7
_L3:
        byte0 = 13;
          goto _L7
_L4:
        byte0 = 19;
          goto _L7
        byte0 = 11;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "\023[3fa)y3iqzlg+x?l`\1774k-qr`?".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 616
    //                   0 639
    //                   1 646
    //                   2 653
    //                   3 660;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_660;
_L8:
        byte1 = 20;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 90;
          goto _L14
_L10:
        byte1 = 13;
          goto _L14
_L11:
        byte1 = 19;
          goto _L14
        byte1 = 11;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\023cejx3i3}u6xv+r5\1773FU\031-`bn?73".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 708
    //                   0 731
    //                   1 738
    //                   2 745
    //                   3 752;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_752;
_L15:
        byte2 = 20;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 90;
          goto _L21
_L17:
        byte2 = 13;
          goto _L21
_L18:
        byte2 = 19;
          goto _L21
        byte2 = 11;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\021hj+y/~g+v?-`{q9dubq>-ze43cz\177};a3bz3y".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 800
    //                   0 823
    //                   1 830
    //                   2 837
    //                   3 844;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_844;
_L22:
        byte3 = 20;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 90;
          goto _L28
_L24:
        byte3 = 13;
          goto _L28
_L25:
        byte3 = 19;
          goto _L28
        byte3 = 11;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "\023cc~`zofmr?\1773\177{5-`c{(y".toCharArray();
            j = obj5.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 892
    //                   0 916
    //                   1 923
    //                   2 930
    //                   3 937;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_937;
_L29:
        byte4 = 20;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 90;
          goto _L35
_L31:
        byte4 = 13;
          goto _L35
_L32:
        byte4 = 19;
          goto _L35
        byte4 = 11;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "uJPF".toCharArray();
            j = obj6.length;
            i = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c = obj5[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 984
    //                   0 1008
    //                   1 1015
    //                   2 1022
    //                   3 1029;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1029;
_L36:
        byte5 = 20;
_L42:
        obj5[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 90;
          goto _L42
_L38:
        byte5 = 13;
          goto _L42
_L39:
        byte5 = 19;
          goto _L42
        byte5 = 11;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = ">lgj4.b|+g2ba\177".toCharArray();
            j = obj7.length;
            i = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c = obj6[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1076
    //                   0 1100
    //                   1 1107
    //                   2 1114
    //                   3 1121;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1121;
_L43:
        byte6 = 20;
_L49:
        obj6[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 90;
          goto _L49
_L45:
        byte6 = 13;
          goto _L49
_L46:
        byte6 = 19;
          goto _L49
        byte6 = 11;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "\025xg{a.-q~r<ha+`5b3x|5\177g".toCharArray();
            j = obj8.length;
            i = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c = obj7[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1168
    //                   0 1192
    //                   1 1199
    //                   2 1206
    //                   3 1213;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1213;
_L50:
        byte7 = 20;
_L56:
        obj7[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 90;
          goto _L56
_L52:
        byte7 = 13;
          goto _L56
_L53:
        byte7 = 19;
          goto _L56
        byte7 = 11;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            obj9 = "7lp+w2hp`43c3LW\027-uj}6hw".toCharArray();
            j = obj9.length;
            i = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c = obj8[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1260
    //                   0 1284
    //                   1 1291
    //                   2 1298
    //                   3 1305;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1305;
_L57:
        byte8 = 20;
_L63:
        obj8[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 90;
          goto _L63
_L59:
        byte8 = 13;
          goto _L63
_L60:
        byte8 = 19;
          goto _L63
        byte8 = 11;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            obj9 = (new String(((char []) (obj9)))).intern();
            obj10 = "\025xg{a.-q~r<ha+`5b3x|5\177g".toCharArray();
            j = obj10.length;
            i = 0;
            break MISSING_BLOCK_LABEL_359;
        }
        c = obj9[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1352
    //                   0 1376
    //                   1 1383
    //                   2 1390
    //                   3 1397;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1397;
_L64:
        byte9 = 20;
_L70:
        obj9[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 90;
          goto _L70
_L66:
        byte9 = 13;
          goto _L70
_L67:
        byte9 = 19;
          goto _L70
        byte9 = 11;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            obj10 = (new String(((char []) (obj10)))).intern();
            ac = "9dccq(-ane/danpzzz\177|zl3ix5nx+g3wv+{<-\"=:".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_395;
        }
        c = obj10[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1444
    //                   0 1468
    //                   1 1475
    //                   2 1482
    //                   3 1489;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1489;
_L71:
        byte10 = 20;
_L77:
        obj10[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 90;
          goto _L77
_L73:
        byte10 = 13;
          goto _L77
_L74:
        byte10 = 19;
          goto _L77
        byte10 = 11;
          goto _L77
_L84:
        byte byte10;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
                obj10, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1536
    //                   0 1560
    //                   1 1567
    //                   2 1574
    //                   3 1581;
           goto _L78 _L79 _L80 _L81 _L82
_L79:
        break; /* Loop/switch isn't completed */
_L82:
        break MISSING_BLOCK_LABEL_1581;
_L78:
        byte byte11 = 20;
_L85:
        ac[i] = (char)(byte11 ^ c);
        i++;
        if (true) goto _L84; else goto _L83
_L83:
        byte11 = 90;
          goto _L85
_L80:
        byte11 = 13;
          goto _L85
_L81:
        byte11 = 19;
          goto _L85
        byte11 = 11;
          goto _L85
    }
}
