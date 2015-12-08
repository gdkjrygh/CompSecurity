// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;


// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            a

public class b
{

    public static String a(String s, String s1)
    {
        try
        {
            s = com.gau.go.launcherex.gowidget.statistics.a.a(a(s.getBytes("utf-8"), s1.getBytes("utf-8")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static byte[] a(byte abyte0[], byte byte0)
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = (byte)(abyte0[i] ^ byte0);
        }

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
