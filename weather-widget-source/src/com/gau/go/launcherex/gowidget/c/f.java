// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.c;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public abstract class f
{

    public static String a(String s, String s1)
    {
        if (s == null)
        {
            return "";
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
            gzipoutputstream.write(s.getBytes());
            gzipoutputstream.close();
            s = bytearrayoutputstream.toString(s1);
            bytearrayoutputstream.close();
            return s;
        }
    }

    public static String a(String s, String s1, String s2)
    {
        if (s == null)
        {
            return "";
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
            gzipoutputstream.write(s.getBytes(s1));
            gzipoutputstream.close();
            s = bytearrayoutputstream.toString(s2);
            bytearrayoutputstream.close();
            return s;
        }
    }

    public static String b(String s, String s1, String s2)
    {
        if (s == null)
        {
            return "";
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        s = new ByteArrayInputStream(s.getBytes(s1));
        s1 = new GZIPInputStream(s);
        byte abyte0[] = new byte[256];
        do
        {
            int i = s1.read(abyte0);
            if (i < 0)
            {
                break;
            }
            bytearrayoutputstream.write(abyte0, 0, i);
        } while (true);
        s2 = bytearrayoutputstream.toString(s2);
        try
        {
            bytearrayoutputstream.close();
            s1.close();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s2;
        }
        return s2;
    }
}
