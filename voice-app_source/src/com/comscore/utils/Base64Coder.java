// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


public class Base64Coder
{

    private static char a[];
    private static byte b[];

    private Base64Coder()
    {
    }

    public static byte[] decode(String s)
    {
        return decode(s.toCharArray());
    }

    public static byte[] decode(char ac[])
    {
        int i = 0;
        int k = ac.length;
        if (k % 4 != 0)
        {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        for (; k > 0 && ac[k - 1] == '='; k--) { }
        int i1 = (k * 3) / 4;
        byte abyte0[] = new byte[i1];
        int j = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            int l = i + 1;
            char c1 = ac[i];
            i = l + 1;
            char c2 = ac[l];
            char c;
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
                c = ac[i];
                i++;
            } else
            {
                c = 'A';
            }
            if (c1 > '\177' || c2 > '\177' || l > '\177' || c > '\177')
            {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte byte0 = b[c1];
            c2 = b[c2];
            c1 = b[l];
            c = b[c];
            if (byte0 < 0 || c2 < 0 || c1 < 0 || c < 0)
            {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            l = j + 1;
            abyte0[j] = (byte)(byte0 << 2 | c2 >>> 4);
            if (l < i1)
            {
                j = l + 1;
                abyte0[l] = (byte)((c2 & 0xf) << 4 | c1 >>> 2);
            } else
            {
                j = l;
            }
            if (j < i1)
            {
                l = j + 1;
                abyte0[j] = (byte)((c1 & 3) << 6 | c);
                j = l;
            }
        } while (true);
        return abyte0;
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
        int i2 = (i * 4 + 2) / 3;
        char ac[] = new char[((i + 2) / 3) * 4];
        int k = 0;
        int j = 0;
        while (j < i) 
        {
            int l = j + 1;
            int j2 = abyte0[j] & 0xff;
            char c;
            int j1;
            int l1;
            if (l < i)
            {
                j = abyte0[l] & 0xff;
                int i1 = l + 1;
                l = j;
                j = i1;
            } else
            {
                j1 = 0;
                j = l;
                l = j1;
            }
            if (j < i)
            {
                j1 = j + 1;
                int k1 = abyte0[j] & 0xff;
                j = j1;
                j1 = k1;
            } else
            {
                j1 = 0;
            }
            l1 = k + 1;
            ac[k] = a[j2 >>> 2];
            k = l1 + 1;
            ac[l1] = a[(j2 & 3) << 4 | l >>> 4];
            if (k < i2)
            {
                c = a[(l & 0xf) << 2 | j1 >>> 6];
            } else
            {
                c = '=';
            }
            ac[k] = c;
            k++;
            if (k < i2)
            {
                c = a[j1 & 0x3f];
            } else
            {
                c = '=';
            }
            ac[k] = c;
            k++;
        }
        return ac;
    }

    public static String encodeString(String s)
    {
        return new String(encode(s.getBytes()));
    }

    static 
    {
        boolean flag = false;
        a = new char[64];
        char c = 'A';
        int i;
        for (i = 0; c <= 'Z'; i++)
        {
            a[i] = c;
            c++;
        }

        for (char c1 = 'a'; c1 <= 'z';)
        {
            a[i] = c1;
            c1++;
            i++;
        }

        for (char c2 = '0'; c2 <= '9';)
        {
            a[i] = c2;
            c2++;
            i++;
        }

        char ac[] = a;
        int j = i + 1;
        ac[i] = '+';
        a[j] = '/';
        b = new byte[128];
        i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= b.length)
            {
                break;
            }
            b[i] = -1;
            i++;
        } while (true);
        for (; j < 64; j++)
        {
            b[a[j]] = (byte)j;
        }

    }
}
