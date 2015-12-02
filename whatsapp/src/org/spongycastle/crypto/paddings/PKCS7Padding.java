// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.spongycastle.crypto.paddings:
//            BlockCipherPadding, PaddedBufferedBlockCipher

public class PKCS7Padding
    implements BlockCipherPadding
{

    private static final String z[];

    public PKCS7Padding()
    {
    }

    public int addPadding(byte abyte0[], int i)
    {
        boolean flag = PaddedBufferedBlockCipher.a;
        byte byte0 = (byte)(abyte0.length - i);
        do
        {
            if (i >= abyte0.length)
            {
                break;
            }
            abyte0[i] = byte0;
            i++;
        } while (!flag);
        return byte0;
    }

    public String getPaddingName()
    {
        return z[2];
    }

    public void init(SecureRandom securerandom)
    {
    }

    public int padCount(byte abyte0[])
    {
        boolean flag = PaddedBufferedBlockCipher.a;
        int j = abyte0[abyte0.length - 1] & 0xff;
        if (j > abyte0.length || j == 0)
        {
            throw new InvalidCipherTextException(z[0]);
        }
        int i = 1;
        do
        {
            if (i > j)
            {
                break;
            }
            if (abyte0[abyte0.length - i] != j)
            {
                throw new InvalidCipherTextException(z[1]);
            }
            i++;
        } while (!flag);
        return j;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "\b\r[\t\001\024\003\\BC\033\003M[\026\b\030ZM".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\b\r[\t\001\024\003\\BC\033\003M[\026\b\030ZM".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_195;
_L1:
        byte0 = 99;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 120;
          goto _L7
_L3:
        byte0 = 108;
          goto _L7
_L4:
        byte0 = 63;
          goto _L7
        byte0 = 41;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "('|zT".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_279;
_L8:
        byte1 = 99;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 120;
          goto _L14
_L10:
        byte1 = 108;
          goto _L14
_L11:
        byte1 = 63;
          goto _L14
        byte1 = 41;
          goto _L14
_L21:
        byte byte1;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 345
    //                   1 351
    //                   2 357
    //                   3 363;
           goto _L15 _L16 _L17 _L18 _L19
_L16:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_363;
_L15:
        byte byte2 = 99;
_L22:
        ac[i] = (char)(byte2 ^ c);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 120;
          goto _L22
_L17:
        byte2 = 108;
          goto _L22
_L18:
        byte2 = 63;
          goto _L22
        byte2 = 41;
          goto _L22
    }
}
