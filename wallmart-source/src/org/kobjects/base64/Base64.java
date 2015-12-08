// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64
{

    static final char charTab[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public Base64()
    {
    }

    static int decode(char c)
    {
        if (c >= 'A' && c <= 'Z')
        {
            return c - 65;
        }
        if (c >= 'a' && c <= 'z')
        {
            return (c - 97) + 26;
        }
        if (c >= '0' && c <= '9')
        {
            return (c - 48) + 26 + 26;
        }
        switch (c)
        {
        default:
            throw new RuntimeException((new StringBuilder()).append("unexpected code: ").append(c).toString());

        case 43: // '+'
            return 62;

        case 47: // '/'
            return 63;

        case 61: // '='
            return 0;
        }
    }

    public static void decode(String s, OutputStream outputstream)
        throws IOException
    {
        int i;
        i = 0;
_L6:
        int j;
        for (j = s.length(); i < j && s.charAt(i) <= ' '; i++) { }
        if (i != j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        k = (decode(s.charAt(i)) << 18) + (decode(s.charAt(i + 1)) << 12) + (decode(s.charAt(i + 2)) << 6) + decode(s.charAt(i + 3));
        outputstream.write(k >> 16 & 0xff);
        if (s.charAt(i + 2) == '=') goto _L1; else goto _L3
_L3:
        outputstream.write(k >> 8 & 0xff);
        if (s.charAt(i + 3) == '=') goto _L1; else goto _L4
_L4:
        outputstream.write(k & 0xff);
        i += 4;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static byte[] decode(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            decode(s, ((OutputStream) (bytearrayoutputstream)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException();
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static String encode(byte abyte0[])
    {
        return encode(abyte0, 0, abyte0.length, null).toString();
    }

    public static StringBuffer encode(byte abyte0[], int i, int j, StringBuffer stringbuffer)
    {
        StringBuffer stringbuffer1 = stringbuffer;
        if (stringbuffer == null)
        {
            stringbuffer1 = new StringBuffer((abyte0.length * 3) / 2);
        }
        int k = i;
        int l = 0;
        int i1;
        for (; k <= j - 3; k = i1)
        {
            i1 = (abyte0[k] & 0xff) << 16 | (abyte0[k + 1] & 0xff) << 8 | abyte0[k + 2] & 0xff;
            stringbuffer1.append(charTab[i1 >> 18 & 0x3f]);
            stringbuffer1.append(charTab[i1 >> 12 & 0x3f]);
            stringbuffer1.append(charTab[i1 >> 6 & 0x3f]);
            stringbuffer1.append(charTab[i1 & 0x3f]);
            i1 = k + 3;
            k = l + 1;
            if (l >= 14)
            {
                k = 0;
                stringbuffer1.append("\r\n");
            }
            l = k;
        }

        if (k == (i + j) - 2)
        {
            i = (abyte0[k] & 0xff) << 16 | (abyte0[k + 1] & 0xff) << 8;
            stringbuffer1.append(charTab[i >> 18 & 0x3f]);
            stringbuffer1.append(charTab[i >> 12 & 0x3f]);
            stringbuffer1.append(charTab[i >> 6 & 0x3f]);
            stringbuffer1.append("=");
        } else
        if (k == (i + j) - 1)
        {
            i = (abyte0[k] & 0xff) << 16;
            stringbuffer1.append(charTab[i >> 18 & 0x3f]);
            stringbuffer1.append(charTab[i >> 12 & 0x3f]);
            stringbuffer1.append("==");
            return stringbuffer1;
        }
        return stringbuffer1;
    }

}
