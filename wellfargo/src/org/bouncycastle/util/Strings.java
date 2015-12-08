// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

public final class Strings
{

    public Strings()
    {
    }

    public static char[] asCharArray(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        return ac;
    }

    public static String fromByteArray(byte abyte0[])
    {
        return new String(asCharArray(abyte0));
    }

    public static String fromUTF8ByteArray(byte abyte0[])
    {
        boolean flag = false;
        int k = 0;
        for (int i = 0; i < abyte0.length;)
        {
            k++;
            if ((abyte0[i] & 0xf0) == 240)
            {
                k++;
                i += 4;
            } else
            if ((abyte0[i] & 0xe0) == 224)
            {
                i += 3;
            } else
            if ((abyte0[i] & 0xc0) == 192)
            {
                i += 2;
            } else
            {
                i++;
            }
        }

        char ac[] = new char[k];
        k = 0;
        int j = ((flag) ? 1 : 0);
        while (k < abyte0.length) 
        {
            char c;
            int i1;
            if ((abyte0[k] & 0xf0) == 240)
            {
                int l = ((abyte0[k] & 3) << 18 | (abyte0[k + 1] & 0x3f) << 12 | (abyte0[k + 2] & 0x3f) << 6 | abyte0[k + 3] & 0x3f) - 0x10000;
                char c1 = (char)(0xd800 | l >> 10);
                c = (char)(l & 0x3ff | 0xdc00);
                l = j + 1;
                ac[j] = c1;
                j = k + 4;
                k = l;
            } else
            if ((abyte0[k] & 0xe0) == 224)
            {
                c = (char)((abyte0[k] & 0xf) << 12 | (abyte0[k + 1] & 0x3f) << 6 | abyte0[k + 2] & 0x3f);
                int j1 = k + 3;
                k = j;
                j = j1;
            } else
            if ((abyte0[k] & 0xd0) == 208)
            {
                c = (char)((abyte0[k] & 0x1f) << 6 | abyte0[k + 1] & 0x3f);
                int k1 = k + 2;
                k = j;
                j = k1;
            } else
            if ((abyte0[k] & 0xc0) == 192)
            {
                c = (char)((abyte0[k] & 0x1f) << 6 | abyte0[k + 1] & 0x3f);
                int l1 = k + 2;
                k = j;
                j = l1;
            } else
            {
                c = (char)(abyte0[k] & 0xff);
                int i2 = k + 1;
                k = j;
                j = i2;
            }
            i1 = k + 1;
            ac[k] = c;
            k = j;
            j = i1;
        }
        return new String(ac);
    }

    public static String[] split(String s, char c)
    {
        boolean flag1 = false;
        Vector vector = new Vector();
        for (boolean flag = true; flag;)
        {
            int i = s.indexOf(c);
            if (i > 0)
            {
                vector.addElement(s.substring(0, i));
                s = s.substring(i + 1);
            } else
            {
                vector.addElement(s);
                flag = false;
            }
        }

        s = new String[vector.size()];
        for (c = flag1; c != s.length; c++)
        {
            s[c] = (String)vector.elementAt(c);
        }

        return s;
    }

    public static byte[] toByteArray(String s)
    {
        byte abyte0[] = new byte[s.length()];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)s.charAt(i);
        }

        return abyte0;
    }

    public static byte[] toByteArray(char ac[])
    {
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        return abyte0;
    }

    public static String toLowerCase(String s)
    {
        int i = 0;
        char ac[] = s.toCharArray();
        boolean flag;
        boolean flag1;
        for (flag = false; i != ac.length; flag = flag1)
        {
            char c = ac[i];
            flag1 = flag;
            if ('A' <= c)
            {
                flag1 = flag;
                if ('Z' >= c)
                {
                    flag1 = true;
                    ac[i] = (char)((c - 65) + 97);
                }
            }
            i++;
        }

        if (flag)
        {
            s = new String(ac);
        }
        return s;
    }

    public static void toUTF8ByteArray(char ac[], OutputStream outputstream)
    {
        int i = 0;
        while (i < ac.length) 
        {
            int j = ac[i];
            if (j < 128)
            {
                outputstream.write(j);
            } else
            if (j < 2048)
            {
                outputstream.write(j >> 6 | 0xc0);
                outputstream.write(j & 0x3f | 0x80);
            } else
            if (j >= 55296 && j <= 57343)
            {
                if (i + 1 >= ac.length)
                {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                i++;
                char c = ac[i];
                if (j > 56319)
                {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                j = ((j & 0x3ff) << 10 | c & 0x3ff) + 0x10000;
                outputstream.write(j >> 18 | 0xf0);
                outputstream.write(j >> 12 & 0x3f | 0x80);
                outputstream.write(j >> 6 & 0x3f | 0x80);
                outputstream.write(j & 0x3f | 0x80);
            } else
            {
                outputstream.write(j >> 12 | 0xe0);
                outputstream.write(j >> 6 & 0x3f | 0x80);
                outputstream.write(j & 0x3f | 0x80);
            }
            i++;
        }
    }

    public static byte[] toUTF8ByteArray(String s)
    {
        return toUTF8ByteArray(s.toCharArray());
    }

    public static byte[] toUTF8ByteArray(char ac[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            toUTF8ByteArray(ac, ((OutputStream) (bytearrayoutputstream)));
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static String toUpperCase(String s)
    {
        int i = 0;
        char ac[] = s.toCharArray();
        boolean flag;
        boolean flag1;
        for (flag = false; i != ac.length; flag = flag1)
        {
            char c = ac[i];
            flag1 = flag;
            if ('a' <= c)
            {
                flag1 = flag;
                if ('z' >= c)
                {
                    flag1 = true;
                    ac[i] = (char)((c - 97) + 65);
                }
            }
            i++;
        }

        if (flag)
        {
            s = new String(ac);
        }
        return s;
    }
}
