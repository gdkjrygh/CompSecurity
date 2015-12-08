// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.UnsupportedEncodingException;

final class Base64
{

    private static final byte MAP[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };

    private Base64()
    {
    }

    public static byte[] decode(String s)
    {
        int l1 = s.length();
_L6:
        if (l1 <= 0) goto _L2; else goto _L1
_L1:
        int i = s.charAt(l1 - 1);
        if (i == '=' || i == '\n' || i == '\r' || i == ' ' || i == '\t') goto _L3; else goto _L2
_L2:
        byte abyte0[];
        int i1;
        int j1;
        int i2;
        abyte0 = new byte[(int)(((long)l1 * 6L) / 8L)];
        j1 = 0;
        i1 = 0;
        i2 = 0;
        i = 0;
_L5:
        int j;
        int k1;
        char c;
        if (i2 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        c = s.charAt(i2);
        if (c >= 'A' && c <= 'Z')
        {
            j = c - 65;
        } else
        if (c >= 'a' && c <= 'z')
        {
            j = c - 71;
        } else
        if (c >= '0' && c <= '9')
        {
            j = c + 4;
        } else
        if (c == '+')
        {
            j = 62;
        } else
        {
label0:
            {
                if (c != '/')
                {
                    break label0;
                }
                j = 63;
            }
        }
        i1 = i1 << 6 | (byte)j;
        j1++;
        k1 = j1;
        j = i1;
        if (j1 % 4 != 0)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        j = i + 1;
        abyte0[i] = (byte)(i1 >> 16);
        k1 = j + 1;
        abyte0[j] = (byte)(i1 >> 8);
        i = k1 + 1;
        abyte0[k1] = (byte)i1;
        j = i1;
_L7:
        i2++;
        i1 = j;
        if (true) goto _L5; else goto _L4
_L3:
        l1--;
          goto _L6
label1:
        {
            k1 = j1;
            j = i1;
            if (c == '\n')
            {
                break MISSING_BLOCK_LABEL_443;
            }
            k1 = j1;
            j = i1;
            if (c == '\r')
            {
                break MISSING_BLOCK_LABEL_443;
            }
            k1 = j1;
            j = i1;
            if (c == ' ')
            {
                break MISSING_BLOCK_LABEL_443;
            }
            if (c != '\t')
            {
                break label1;
            }
            j = i1;
        }
          goto _L7
        s = null;
_L9:
        return s;
_L4:
        j1 %= 4;
        if (j1 == 1)
        {
            return null;
        }
        if (j1 == 2)
        {
            int k = i + 1;
            abyte0[i] = (byte)((i1 << 12) >> 16);
            i = k;
        } else
        {
            int l = i;
            if (j1 == 3)
            {
                i1 <<= 6;
                j1 = i + 1;
                abyte0[i] = (byte)(i1 >> 16);
                l = j1 + 1;
                abyte0[j1] = (byte)(i1 >> 8);
            }
            i = l;
        }
        s = abyte0;
        if (i == abyte0.length) goto _L9; else goto _L8
_L8:
        s = new byte[i];
        System.arraycopy(abyte0, 0, s, 0, i);
        return s;
        j1 = k1;
          goto _L7
    }

    public static String encode(byte abyte0[])
    {
        byte abyte1[];
        int i;
        int l;
        abyte1 = new byte[((abyte0.length + 2) * 4) / 3];
        l = abyte0.length - abyte0.length % 3;
        int j = 0;
        i = 0;
        for (; j < l; j += 3)
        {
            int i1 = i + 1;
            abyte1[i] = MAP[(abyte0[j] & 0xff) >> 2];
            i = i1 + 1;
            abyte1[i1] = MAP[(abyte0[j] & 3) << 4 | (abyte0[j + 1] & 0xff) >> 4];
            i1 = i + 1;
            abyte1[i] = MAP[(abyte0[j + 1] & 0xf) << 2 | (abyte0[j + 2] & 0xff) >> 6];
            i = i1 + 1;
            abyte1[i1] = MAP[abyte0[j + 2] & 0x3f];
        }

        abyte0.length % 3;
        JVM INSTR tableswitch 1 2: default 172
    //                   1 187
    //                   2 248;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_248;
_L4:
        int k;
        try
        {
            abyte0 = new String(abyte1, 0, i, "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
_L2:
        k = i + 1;
        abyte1[i] = MAP[(abyte0[l] & 0xff) >> 2];
        i = k + 1;
        abyte1[k] = MAP[(abyte0[l] & 3) << 4];
        k = i + 1;
        abyte1[i] = 61;
        abyte1[k] = 61;
        i = k + 1;
          goto _L4
        k = i + 1;
        abyte1[i] = MAP[(abyte0[l] & 0xff) >> 2];
        i = k + 1;
        abyte1[k] = MAP[(abyte0[l] & 3) << 4 | (abyte0[l + 1] & 0xff) >> 4];
        k = i + 1;
        abyte1[i] = MAP[(abyte0[l + 1] & 0xf) << 2];
        i = k + 1;
        abyte1[k] = 61;
          goto _L4
    }

}
