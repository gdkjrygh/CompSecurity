// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PhotoDigest
{
    public static class DigestException extends Exception
    {

        public DigestException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    public PhotoDigest()
    {
    }

    private static String bytesToHexString(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < abyte0.length; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff);
            if (s.length() == 1)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    public static String md5(File file)
        throws DigestException
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            file = new FileInputStream(file);
            DigestInputStream digestinputstream = new DigestInputStream(file, messagedigest);
            for (byte abyte0[] = new byte[0x10000]; digestinputstream.read(abyte0) != -1;) { }
            digestinputstream.close();
            file.close();
            file = bytesToHexString(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new DigestException("NoSuchAlgorithmException", file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new DigestException("IOException", file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new DigestException("Exception", file);
        }
        return file;
    }

    public static String sha256(String s)
        throws DigestException
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
            messagedigest.update(s.getBytes("UTF-8"));
            s = bytesToHexString(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DigestException("NoSuchAlgorithmException", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DigestException("UnsupportedEncodingException", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DigestException("Exception", s);
        }
        return s;
    }
}
