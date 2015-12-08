// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class m
{

    public static String a(String s)
    {
        StringBuilder stringbuilder;
        int j;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("oh, MD5 not be supported?", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("oh, UTF-8 should be supported?", s);
        }
        stringbuilder = new StringBuilder(s.length * 2);
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = s[i];
            if ((byte0 & 0xff) < 16)
            {
                stringbuilder.append("0");
            }
            stringbuilder.append(Integer.toHexString(byte0 & 0xff));
        }

        return stringbuilder.toString();
    }
}
