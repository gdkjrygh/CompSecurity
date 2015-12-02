// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import java.io.UnsupportedEncodingException;

public final class Utf8
{

    public Utf8()
    {
    }

    public static String convert(byte abyte0[])
    {
        if (abyte0 != null)
        {
            try
            {
                abyte0 = new String(abyte0, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new Error(abyte0);
            }
            return abyte0;
        } else
        {
            return null;
        }
    }

    public static byte[] convert(String s)
    {
        if (s != null)
        {
            try
            {
                s = s.getBytes("UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new Error(s);
            }
            return s;
        } else
        {
            return null;
        }
    }

    public static int utf8StringLengthInBytes(String s)
    {
        if (s != null)
        {
            int i;
            try
            {
                i = s.getBytes("UTF-8").length;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException();
            }
            return i;
        } else
        {
            return 0;
        }
    }
}
