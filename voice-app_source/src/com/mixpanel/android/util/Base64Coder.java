// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;


public class Base64Coder
{

    private static char map1[];
    private static byte map2[];

    public Base64Coder()
    {
    }

    public static byte[] decode(String s)
    {
        return decode(s.toCharArray());
    }

    public static byte[] decode(char ac[])
    {
        int i = ac.length;
        int k = i;
        if (i % 4 != 0)
        {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        for (; k > 0 && ac[k - 1] == '='; k--) { }
        int j1 = (k * 3) / 4;
        byte abyte0[] = new byte[j1];
        int j = 0;
        i = 0;
        do
        {
            do
            {
                if (i >= k)
                {
                    return abyte0;
                }
                int l = i + 1;
                char c1 = ac[i];
                i = l + 1;
                char c2 = ac[l];
                int i1;
                if (i < k)
                {
                    l = ac[i];
                    i++;
                } else
                {
                    l = 65;
                }
                if (i < k)
                {
                    i1 = i + 1;
                    char c = ac[i];
                    i = i1;
                    i1 = c;
                } else
                {
                    i1 = 65;
                }
                if (c1 > '\177' || c2 > '\177' || l > '\177' || i1 > '\177')
                {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                c1 = map2[c1];
                c2 = map2[c2];
                byte byte0 = map2[l];
                i1 = map2[i1];
                if (c1 < 0 || c2 < 0 || byte0 < 0 || i1 < 0)
                {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                l = j + 1;
                abyte0[j] = (byte)(c1 << 2 | c2 >>> 4);
                if (l < j1)
                {
                    j = l + 1;
                    abyte0[l] = (byte)((c2 & 0xf) << 4 | byte0 >>> 2);
                } else
                {
                    j = l;
                }
            } while (j >= j1);
            abyte0[j] = (byte)((byte0 & 3) << 6 | i1);
            j++;
        } while (true);
    }

    public static String decodeString(String s)
    {
        return new String(decode(s));
    }

    public static char[] encode(byte abyte0[])
    {
        return encode(abyte0, abyte0.length);
    }

    public static char[] encode(byte abyte0[], int i)
    {
        int l1 = (i * 4 + 2) / 3;
        char ac[] = new char[((i + 2) / 3) * 4];
        int k = 0;
        int j = 0;
        do
        {
            if (j >= i)
            {
                return ac;
            }
            int l = j + 1;
            int i2 = abyte0[j] & 0xff;
            char c;
            int i1;
            int k1;
            if (l < i)
            {
                j = l + 1;
                l = abyte0[l] & 0xff;
            } else
            {
                i1 = 0;
                j = l;
                l = i1;
            }
            if (j < i)
            {
                i1 = j + 1;
                int j1 = abyte0[j] & 0xff;
                j = i1;
                i1 = j1;
            } else
            {
                i1 = 0;
            }
            k1 = k + 1;
            ac[k] = map1[i2 >>> 2];
            k = k1 + 1;
            ac[k1] = map1[(i2 & 3) << 4 | l >>> 4];
            if (k < l1)
            {
                c = map1[(l & 0xf) << 2 | i1 >>> 6];
            } else
            {
                c = '=';
            }
            ac[k] = c;
            k++;
            if (k < l1)
            {
                c = map1[i1 & 0x3f];
            } else
            {
                c = '=';
            }
            ac[k] = c;
            k++;
        } while (true);
    }

    public static String encodeString(String s)
    {
        return new String(encode(s.getBytes()));
    }

    static 
    {
        char c;
        int i;
        map1 = new char[64];
        c = 'A';
        i = 0;
_L9:
        if (c <= 'Z') goto _L2; else goto _L1
_L1:
        c = 'a';
_L10:
        if (c <= 'z') goto _L4; else goto _L3
_L3:
        c = '0';
_L11:
        if (c <= '9') goto _L6; else goto _L5
_L5:
        char ac[] = map1;
        int j = i + 1;
        ac[i] = '+';
        map1[j] = '/';
        map2 = new byte[128];
        i = 0;
_L12:
        if (i < map2.length) goto _L8; else goto _L7
_L7:
        i = 0;
_L13:
        if (i >= 64)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_150;
_L2:
        map1[i] = c;
        c++;
        i++;
          goto _L9
_L4:
        map1[i] = c;
        c++;
        i++;
          goto _L10
_L6:
        map1[i] = c;
        c++;
        i++;
          goto _L11
_L8:
        map2[i] = -1;
        i++;
          goto _L12
        map2[map1[i]] = (byte)i;
        i++;
          goto _L13
    }
}
