// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

public class DigestUtils
{

    public DigestUtils()
    {
    }

    static MessageDigest getDigest(String s)
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage());
        }
        return s;
    }

    private static MessageDigest getMd5Digest()
    {
        return getDigest("MD5");
    }

    private static MessageDigest getShaDigest()
    {
        return getDigest("SHA");
    }

    public static byte[] md5(String s)
    {
        return md5(s.getBytes());
    }

    public static byte[] md5(byte abyte0[])
    {
        return getMd5Digest().digest(abyte0);
    }

    public static String md5Hex(String s)
    {
        return new String(Hex.encodeHex(md5(s)));
    }

    public static String md5Hex(byte abyte0[])
    {
        return new String(Hex.encodeHex(md5(abyte0)));
    }

    public static byte[] sha(String s)
    {
        return sha(s.getBytes());
    }

    public static byte[] sha(byte abyte0[])
    {
        return getShaDigest().digest(abyte0);
    }

    public static String shaHex(String s)
    {
        return new String(Hex.encodeHex(sha(s)));
    }

    public static String shaHex(byte abyte0[])
    {
        return new String(Hex.encodeHex(sha(abyte0)));
    }
}
