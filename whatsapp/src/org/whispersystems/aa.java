// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

// Referenced classes of package org.whispersystems:
//            R, ba

public class aa
{

    public static int a;
    private static final String z;

    public static byte a(int i, int j)
    {
        return (byte)((i << 4 | j) & 0xff);
    }

    public static int a(byte byte0)
    {
        return (byte0 & 0xff) >> 4;
    }

    public static int a(byte abyte0[])
    {
        return c(abyte0, 0);
    }

    public static int a(byte abyte0[], int i, int j)
    {
        int k = a;
        abyte0[i + 3] = (byte)j;
        abyte0[i + 2] = (byte)(j >> 8);
        abyte0[i + 1] = (byte)(j >> 16);
        abyte0[i] = (byte)(j >> 24);
        if (R.A)
        {
            a = k + 1;
        }
        return 4;
    }

    public static byte[] a(int i)
    {
        byte abyte0[] = new byte[4];
        a(abyte0, 0, i);
        return abyte0;
    }

    public static byte[] a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
        return abyte1;
    }

    public static byte[] a(byte abyte0[][])
    {
        int j = a;
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        int k;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            k = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[][])
        {
            throw new AssertionError(abyte0);
        }
        i = 0;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(abyte0[i]);
        i++;
        if (j == 0) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    public static byte[][] a(byte abyte0[], int i, int j, int k)
    {
        boolean flag = true;
        int l = a;
        if (abyte0 == null || i < 0 || j < 0 || k < 0 || abyte0.length < i + j + k)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(z);
            if (abyte0 == null)
            {
                abyte0 = null;
            } else
            {
                abyte0 = ba.a(abyte0);
            }
            throw new ParseException(stringbuilder.append(abyte0).toString(), 0);
        }
        byte abyte1[][] = new byte[3][];
        abyte1[0] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1[0], 0, i);
        abyte1[1] = new byte[j];
        System.arraycopy(abyte0, i, abyte1[1], 0, j);
        abyte1[2] = new byte[k];
        System.arraycopy(abyte0, i + j, abyte1[2], 0, k);
        if (l != 0)
        {
            if (R.A)
            {
                flag = false;
            }
            R.A = flag;
        }
        return abyte1;
    }

    public static int b(byte abyte0[], int i)
    {
        return (abyte0[i] & 0xff) << 16 | (abyte0[i + 1] & 0xff) << 8 | abyte0[i + 2] & 0xff;
    }

    public static byte[] b(int i)
    {
        byte abyte0[] = new byte[3];
        c(abyte0, 0, i);
        return abyte0;
    }

    public static byte[][] b(byte abyte0[], int i, int j)
    {
        byte abyte1[][] = new byte[2][];
        abyte1[0] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1[0], 0, i);
        abyte1[1] = new byte[j];
        System.arraycopy(abyte0, i, abyte1[1], 0, j);
        return abyte1;
    }

    public static int c(byte abyte0[], int i)
    {
        return (abyte0[i] & 0xff) << 24 | (abyte0[i + 1] & 0xff) << 16 | (abyte0[i + 2] & 0xff) << 8 | abyte0[i + 3] & 0xff;
    }

    public static int c(byte abyte0[], int i, int j)
    {
        abyte0[i + 2] = (byte)j;
        abyte0[i + 1] = (byte)(j >> 8);
        abyte0[i] = (byte)(j >> 16);
        return 3;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\023j\0233\\zp\f)\b)i\002*D`$".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 40;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 90;
          goto _L8
_L3:
        byte0 = 4;
          goto _L8
_L4:
        byte0 = 99;
          goto _L8
        byte0 = 70;
          goto _L8
    }
}
