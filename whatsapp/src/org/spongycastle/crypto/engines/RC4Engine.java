// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class RC4Engine
    implements StreamCipher
{

    private static final int STATE_LENGTH = 256;
    public static int a;
    private static final String z[];
    private byte engineState[];
    private byte workingKey[];
    private int x;
    private int y;

    public RC4Engine()
    {
        engineState = null;
        x = 0;
        y = 0;
        workingKey = null;
    }

    private void setKey(byte abyte0[])
    {
        int j = 0;
        int l = a;
        int i;
        int k;
        try
        {
            workingKey = abyte0;
            x = 0;
            y = 0;
            if (engineState == null)
            {
                engineState = new byte[256];
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i = 0;
        do
        {
            if (i >= 256)
            {
                break;
            }
            engineState[i] = (byte)i;
            i++;
        } while (l == 0);
        k = 0;
        i = 0;
        do
        {
            if (j >= 256)
            {
                break;
            }
            k = k + ((abyte0[i] & 0xff) + engineState[j]) & 0xff;
            byte byte0 = engineState[j];
            engineState[j] = engineState[k];
            engineState[k] = byte0;
            i = (i + 1) % abyte0.length;
            j++;
        } while (l == 0);
    }

    public String getAlgorithmName()
    {
        return z[0];
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        try
        {
            if (cipherparameters instanceof KeyParameter)
            {
                workingKey = ((KeyParameter)cipherparameters).getKey();
                setKey(workingKey);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
        throw new IllegalArgumentException((new StringBuilder()).append(z[3]).append(cipherparameters.getClass().getName()).toString());
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int i1 = a;
        try
        {
            if (i + j > abyte0.length)
            {
                throw new DataLengthException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            if (k + j > abyte1.length)
            {
                throw new OutputLengthException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        int l = 0;
        do
        {
            if (l >= j)
            {
                break;
            }
            x = x + 1 & 0xff;
            y = engineState[x] + y & 0xff;
            byte byte0 = engineState[x];
            engineState[x] = engineState[y];
            engineState[y] = byte0;
            abyte1[l + k] = (byte)(abyte0[l + i] ^ engineState[engineState[x] + engineState[y] & 0xff]);
            l++;
        } while (i1 == 0);
        return j;
    }

    public void reset()
    {
        setKey(workingKey);
    }

    public byte returnByte(byte byte0)
    {
        byte byte1;
        int i;
        i = a;
        x = x + 1 & 0xff;
        y = engineState[x] + y & 0xff;
        byte1 = engineState[x];
        byte byte3;
        engineState[x] = engineState[y];
        engineState[y] = byte1;
        byte3 = engineState[engineState[x] + engineState[y] & 0xff];
        byte byte2 = (byte)(byte3 ^ byte0);
        if (i != 0)
        {
            IllegalArgumentException illegalargumentexception;
            boolean flag;
            try
            {
                flag = BaseKeyGenerator.a;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            BaseKeyGenerator.a = flag;
        }
        return byte2;
        illegalargumentexception;
        throw illegalargumentexception;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "Y\030\\".toCharArray();
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
            obj1 = "d.\034FG\177{\nCTm>\032\026Fd4HEZd)\034".toCharArray();
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
        byte0 = 50;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 11;
          goto _L7
_L3:
        byte0 = 91;
          goto _L7
_L4:
        byte0 = 104;
          goto _L7
        byte0 = 54;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "b5\030CF+9\035PTn)HB]d{\033^]y/".toCharArray();
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
        byte1 = 50;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 11;
          goto _L14
_L10:
        byte1 = 91;
          goto _L14
_L11:
        byte1 = 104;
          goto _L14
        byte1 = 54;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            ac = "b5\036W^b?HFSy:\005SFn)HFSx(\rR\022\1774Hdq?{\001X[\177{E\026".toCharArray();
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
        byte2 = 50;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 11;
          goto _L21
_L17:
        byte2 = 91;
          goto _L21
_L18:
        byte2 = 104;
          goto _L21
        byte2 = 54;
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
        byte byte3 = 50;
_L29:
        ac[i] = (char)(byte3 ^ c);
        i++;
        if (true) goto _L28; else goto _L27
_L27:
        byte3 = 11;
          goto _L29
_L24:
        byte3 = 91;
          goto _L29
_L25:
        byte3 = 104;
          goto _L29
        byte3 = 54;
          goto _L29
    }
}
