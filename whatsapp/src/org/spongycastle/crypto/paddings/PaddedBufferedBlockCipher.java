// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.spongycastle.crypto.paddings:
//            PKCS7Padding, BlockCipherPadding

public class PaddedBufferedBlockCipher extends BufferedBlockCipher
{

    public static boolean a;
    private static final String z[];
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockcipher)
    {
        this(blockcipher, ((BlockCipherPadding) (new PKCS7Padding())));
    }

    public PaddedBufferedBlockCipher(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        cipher = blockcipher;
        padding = blockcipherpadding;
        buf = new byte[blockcipher.getBlockSize()];
        bufOff = 0;
    }

    public int doFinal(byte abyte0[], int i)
    {
        int k;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = a;
        k = cipher.getBlockSize();
        if (!forEncryption) goto _L2; else goto _L1
_L1:
        int j = bufOff;
        if (j != k) goto _L4; else goto _L3
_L3:
        j = abyte0.length;
        if (k * 2 + i > j)
        {
            try
            {
                reset();
                throw new OutputLengthException(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        break MISSING_BLOCK_LABEL_76;
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw abyte0;
        j = cipher.processBlock(buf, 0, abyte0, i);
        bufOff = 0;
_L7:
        padding.addPadding(buf, bufOff);
        j += cipher.processBlock(buf, 0, abyte0, i + j);
        try
        {
            reset();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (!flag1) goto _L5; else goto _L2
_L2:
        j = bufOff;
        if (j == k)
        {
            j = cipher.processBlock(buf, 0, buf, 0);
            try
            {
                bufOff = 0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_210;
            }
        }
        reset();
        throw new DataLengthException(z[3]);
        j -= padding.padCount(buf);
        System.arraycopy(buf, 0, abyte0, i, j);
        reset();
_L5:
        boolean flag2;
        try
        {
            flag2 = BaseKeyGenerator.a;
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
        if (flag2)
        {
            if (!flag1)
            {
                flag = true;
            }
            a = flag;
        }
        return j;
        abyte0;
        reset();
        throw abyte0;
_L4:
        j = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int getOutputSize(int i)
    {
        int j;
label0:
        {
            j = bufOff + i;
            i = j % buf.length;
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            i = j;
            try
            {
                if (!forEncryption)
                {
                    break label0;
                }
                i = buf.length;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            i = j + i;
        }
        return i;
        return (j - i) + buf.length;
    }

    public int getUpdateOutputSize(int i)
    {
        i = bufOff + i;
        int j = i % buf.length;
        if (j == 0)
        {
            try
            {
                i = Math.max(0, i - buf.length);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return i;
        } else
        {
            return i - j;
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        ParametersWithRandom parameterswithrandom;
        forEncryption = flag;
        reset();
        if (!(cipherparameters instanceof ParametersWithRandom))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        parameterswithrandom = (ParametersWithRandom)cipherparameters;
        padding.init(parameterswithrandom.getRandom());
        cipher.init(flag, parameterswithrandom.getParameters());
        if (!a)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        padding.init(null);
        cipher.init(flag, cipherparameters);
        return;
        cipherparameters;
        throw cipherparameters;
    }

    public int processByte(byte byte0, byte abyte0[], int i)
    {
        int j;
        if (bufOff == buf.length)
        {
            i = cipher.processBlock(buf, 0, abyte0, i);
            bufOff = 0;
        } else
        {
            i = 0;
        }
        abyte0 = buf;
        j = bufOff;
        bufOff = j + 1;
        abyte0[j] = byte0;
        return i;
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1;
        int i2;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = a;
        if (j < 0)
        {
            try
            {
                throw new IllegalArgumentException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        i2 = getBlockSize();
        int l = getUpdateOutputSize(j);
        if (l > 0)
        {
            try
            {
                if (l + k > abyte1.length)
                {
                    throw new OutputLengthException(z[0]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        j1 = buf.length - bufOff;
        if (j <= j1) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
label0:
        {
            System.arraycopy(abyte0, i, buf, bufOff, j1);
            int i1 = cipher.processBlock(buf, 0, abyte1, k) + 0;
            bufOff = 0;
            j -= j1;
            i = j1 + i;
            do
            {
                j1 = i1;
                k1 = j;
                l1 = i;
                if (j <= buf.length)
                {
                    break label0;
                }
                j1 = i1 + cipher.processBlock(abyte0, i, abyte1, k + i1);
                k1 = j - i2;
                l1 = i + i2;
                i1 = j1;
                j = k1;
                i = l1;
            } while (!flag1);
            try
            {
                flag1 = BaseKeyGenerator.a;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (!flag1)
            {
                flag = true;
            }
            BaseKeyGenerator.a = flag;
        }
_L4:
        System.arraycopy(abyte0, l1, buf, bufOff, k1);
        bufOff = k1 + bufOff;
        return j1;
_L2:
        j1 = 0;
        k1 = j;
        l1 = i;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "B[cAXY\016uDKKKe\021YBA7BEB\\c".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "nOy\026Y\rFvGH\rO7_HJOcX[H\016~_]XZ7]HCIcY\f".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_236;
_L1:
        byte0 = 45;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 45;
          goto _L7
_L3:
        byte0 = 46;
          goto _L7
_L4:
        byte0 = 23;
          goto _L7
        byte0 = 49;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "B[cAXY\016uDKKKe\021YBA7BEB\\c".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 321
    //                   3 328;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_328;
_L8:
        byte1 = 45;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 45;
          goto _L14
_L10:
        byte1 = 46;
          goto _L14
_L11:
        byte1 = 23;
          goto _L14
        byte1 = 49;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "AOdE\rOBxRF\rGyRB@^{TYH\016~_\rIKtCT]Z~^C".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 376
    //                   0 399
    //                   1 406
    //                   2 413
    //                   3 420;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_420;
_L15:
        byte2 = 45;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 45;
          goto _L21
_L17:
        byte2 = 46;
          goto _L21
_L18:
        byte2 = 23;
          goto _L21
        byte2 = 49;
          goto _L21
_L28:
        byte byte2;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 491
    //                   1 498
    //                   2 505
    //                   3 512;
           goto _L22 _L23 _L24 _L25 _L26
_L23:
        break; /* Loop/switch isn't completed */
_L26:
        break MISSING_BLOCK_LABEL_512;
_L22:
        byte byte3 = 45;
_L29:
        ac[i] = (char)(byte3 ^ c);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 45;
          goto _L29
_L24:
        byte3 = 46;
          goto _L29
_L25:
        byte3 = 23;
          goto _L29
        byte3 = 49;
          goto _L29
    }
}
