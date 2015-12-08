// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class d
{

    public static final byte a[] = {
        1, 3, 5, 7, 2, 4, 6, 8
    };

    public static String a(String s, String s1)
    {
        boolean flag = false;
        int ai[] = new int[4];
        s1 = s1.getBytes("utf-8");
        int i = 0;
        int k = 0;
        while (i < s1.length) 
        {
            if (i % 4 == 3)
            {
                ai[k] = ai[k] + s1[i];
                ai[k] = ai[k] % 17 + 49;
                k++;
            } else
            {
                ai[k] = ai[k] + s1[i];
            }
            i++;
        }
        s = s.getBytes("utf-8");
        for (int j = ((flag) ? 1 : 0); j < s.length; j++)
        {
            s[j] = (byte)(s[j] + ai[j]);
        }

        return new String(s);
    }

    public static String a(byte abyte0[])
    {
        try
        {
            abyte0 = b(MessageDigest.getInstance("MD5").digest(abyte0)).replace("-", "").substring(8, 24);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public static String b(byte abyte0[])
    {
        String s1 = "";
        for (int i = 0; i < abyte0.length; i++)
        {
            String s2 = Integer.toString(abyte0[i] & 0xff, 16);
            String s = s2;
            if (s2.length() == 1)
            {
                s = (new StringBuilder()).append("0").append(s2).toString();
            }
            s2 = s;
            if (s.length() == 0)
            {
                s2 = "00";
            }
            s1 = (new StringBuilder()).append(s1).append(s2).toString();
        }

        return s1;
    }

    public static byte[] c(byte abyte0[])
    {
        SecretKeySpec secretkeyspec = new SecretKeySpec("guangzhou_huizhiwccpcomm".getBytes("ASCII"), "DESede");
        Cipher cipher = Cipher.getInstance("DESede");
        cipher.init(1, secretkeyspec);
        return cipher.doFinal(abyte0);
    }

    public static byte[] d(byte abyte0[])
    {
        SecretKeySpec secretkeyspec = new SecretKeySpec("guangzhou_huizhiwccpcomm".getBytes("ASCII"), "DESede");
        Cipher cipher = Cipher.getInstance("DESede");
        cipher.init(2, secretkeyspec);
        return cipher.doFinal(abyte0);
    }

}
