// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.text.TextUtils;

public class o
{

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return a(s.getBytes());
        }
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++)
        {
            a(stringbuffer, abyte0[i]);
        }

        return stringbuffer.toString();
    }

    private static void a(StringBuffer stringbuffer, byte byte0)
    {
        stringbuffer.append("0123456789ABCDEF".charAt(byte0 >> 4 & 0xf)).append("0123456789ABCDEF".charAt(byte0 & 0xf));
    }

    public static String b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return new String(c(s));
        }
    }

    public static byte[] c(String s)
    {
        int j = s.length() / 2;
        byte abyte0[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            abyte0[i] = Integer.valueOf(s.substring(i * 2, i * 2 + 2), 16).byteValue();
        }

        return abyte0;
    }
}
