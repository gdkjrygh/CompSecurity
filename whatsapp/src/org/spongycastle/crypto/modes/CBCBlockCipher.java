// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes:
//            SICBlockCipher

public class CBCBlockCipher
    implements BlockCipher
{

    private static final String z[];
    private byte IV[];
    private int blockSize;
    private byte cbcNextV[];
    private byte cbcV[];
    private BlockCipher cipher;
    private boolean encrypting;

    public CBCBlockCipher(BlockCipher blockcipher)
    {
        cipher = null;
        cipher = blockcipher;
        blockSize = blockcipher.getBlockSize();
        IV = new byte[blockSize];
        cbcV = new byte[blockSize];
        cbcNextV = new byte[blockSize];
    }

    private int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = false;
        boolean flag1 = SICBlockCipher.a;
        try
        {
            if (blockSize + i > abyte0.length)
            {
                throw new DataLengthException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        System.arraycopy(abyte0, i, cbcNextV, 0, blockSize);
        int l = cipher.processBlock(abyte0, i, abyte1, j);
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= blockSize)
            {
                break;
            }
            int k = j + i;
            abyte1[k] = (byte)(abyte1[k] ^ cbcV[i]);
            i++;
        } while (!flag1);
        abyte0 = cbcV;
        cbcV = cbcNextV;
        cbcNextV = abyte0;
        return l;
    }

    private int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag = SICBlockCipher.a;
        try
        {
            if (blockSize + i > abyte0.length)
            {
                throw new DataLengthException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        int k = 0;
        do
        {
            if (k >= blockSize)
            {
                break;
            }
            byte abyte2[] = cbcV;
            abyte2[k] = (byte)(abyte2[k] ^ abyte0[i + k]);
            k++;
        } while (!flag);
        i = cipher.processBlock(cbcV, 0, abyte1, j);
        System.arraycopy(abyte1, j, cbcV, 0, cbcV.length);
        return i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append(z[2]).toString();
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
        ParametersWithIV parameterswithiv;
        byte abyte0[];
        boolean flag1;
        boolean flag2;
        flag1 = SICBlockCipher.a;
        flag2 = encrypting;
        encrypting = flag;
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        parameterswithiv = (ParametersWithIV)cipherparameters;
        abyte0 = parameterswithiv.getIV();
        try
        {
            if (abyte0.length != blockSize)
            {
                throw new IllegalArgumentException(z[5]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
        CipherParameters cipherparameters1;
        System.arraycopy(abyte0, 0, IV, 0, abyte0.length);
        reset();
        cipherparameters1 = parameterswithiv.getParameters();
        if (cipherparameters1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        cipher.init(flag, parameterswithiv.getParameters());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (flag2 != flag)
        {
            try
            {
                throw new IllegalArgumentException(z[4]);
            }
            // Misplaced declaration of an exception variable
            catch (CipherParameters cipherparameters)
            {
                throw cipherparameters;
            }
        }
        break MISSING_BLOCK_LABEL_136;
        cipherparameters;
        try
        {
            throw cipherparameters;
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters) { }
        throw cipherparameters;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        reset();
        if (cipherparameters == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        cipher.init(flag, cipherparameters);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        if (flag2 != flag)
        {
            try
            {
                throw new IllegalArgumentException(z[3]);
            }
            // Misplaced declaration of an exception variable
            catch (CipherParameters cipherparameters)
            {
                throw cipherparameters;
            }
        }
        break MISSING_BLOCK_LABEL_193;
        cipherparameters;
        try
        {
            throw cipherparameters;
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters) { }
        throw cipherparameters;
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
label0:
        {
            try
            {
                if (!encrypting)
                {
                    break label0;
                }
                i = encryptBlock(abyte0, i, abyte1, j);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            return i;
        }
        return decryptBlock(abyte0, i, abyte1, j);
    }

    public void reset()
    {
        System.arraycopy(IV, 0, cbcV, 0, IV.length);
        Arrays.fill(cbcNextV, (byte)0);
        cipher.reset();
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = ";F\025qarJ\020bs7ZEpz=\b\026lz \\".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = ";F\025qarJ\020bs7ZEpz=\b\026lz \\".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 295
    //                   1 302
    //                   2 309
    //                   3 316;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_316;
_L1:
        byte0 = 21;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 82;
          goto _L7
_L3:
        byte0 = 40;
          goto _L7
_L4:
        byte0 = 101;
          goto _L7
        byte0 = 4;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "}k'G".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 364
    //                   0 387
    //                   1 394
    //                   2 401
    //                   3 408;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_408;
_L8:
        byte1 = 21;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 82;
          goto _L14
_L10:
        byte1 = 40;
          goto _L14
_L11:
        byte1 = 101;
          goto _L14
        byte1 = 4;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "1I\013jz&\b\006lt<O\000$p<K\027}e&A\013c5!\\\004ppr_\fp}=]\021$e G\023mq;F\002$~7QK".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_500;
_L15:
        byte2 = 21;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 82;
          goto _L21
_L17:
        byte2 = 40;
          goto _L21
_L18:
        byte2 = 101;
          goto _L21
        byte2 = 4;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "1I\013jz&\b\006lt<O\000$p<K\027}e&A\013c5!\\\004ppr_\fp}=]\021$e G\023mq;F\002$~7QK".toCharArray();
            j = obj4.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 548
    //                   0 571
    //                   1 578
    //                   2 585
    //                   3 592;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_592;
_L22:
        byte3 = 21;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 82;
          goto _L28
_L24:
        byte3 = 40;
          goto _L28
_L25:
        byte3 = 101;
          goto _L28
        byte3 = 4;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            ac = ";F\fp|3D\fwt&A\nj5$M\006pz \b\bqf&\b\007a5&@\000$f3E\000$y7F\002p}rI\026$w>G\006o5!A\037a".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c = obj4[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 640
    //                   0 664
    //                   1 671
    //                   2 678
    //                   3 685;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_685;
_L29:
        byte4 = 21;
_L35:
        obj4[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 82;
          goto _L35
_L31:
        byte4 = 40;
          goto _L35
_L32:
        byte4 = 101;
          goto _L35
        byte4 = 4;
          goto _L35
_L42:
        byte byte4;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 732
    //                   0 756
    //                   1 763
    //                   2 770
    //                   3 777;
           goto _L36 _L37 _L38 _L39 _L40
_L37:
        break; /* Loop/switch isn't completed */
_L40:
        break MISSING_BLOCK_LABEL_777;
_L36:
        byte byte5 = 21;
_L43:
        ac[i] = (char)(byte5 ^ c);
        i++;
        if (true) goto _L42; else goto _L41
_L41:
        byte5 = 82;
          goto _L43
_L38:
        byte5 = 40;
          goto _L43
_L39:
        byte5 = 101;
          goto _L43
        byte5 = 4;
          goto _L43
    }
}
