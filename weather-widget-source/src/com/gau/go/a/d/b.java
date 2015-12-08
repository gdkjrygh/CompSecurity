// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.d;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.gau.go.a.d:
//            a

public class b
{

    public static final byte a[] = {
        65, 66, 69, 78, 50, 48, 49, 50, 48, 57, 
        51, 48, 49, 56, 51, 48
    };

    public static String a(String s, String s1)
    {
        try
        {
            s = a(s.getBytes("utf-8"), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static String a(byte abyte0[], String s)
    {
        try
        {
            abyte0 = com.gau.go.a.d.a.a(a(abyte0, s.getBytes("utf-8")));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public static byte[] a(byte abyte0[], byte byte0)
    {
        byte abyte2[] = new byte[abyte0.length];
        int i = 0;
_L2:
        byte abyte1[] = abyte2;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte2[i] = (byte)(abyte0[i] ^ byte0);
        i++;
        if (true) goto _L2; else goto _L1
        abyte0;
        abyte1 = null;
_L1:
        return abyte1;
    }

    public static byte[] a(byte abyte0[], byte abyte1[])
    {
        for (int i = 0; i < abyte1.length; i++)
        {
            abyte0 = a(abyte0, abyte1[i]);
        }

        return abyte0;
    }

}
