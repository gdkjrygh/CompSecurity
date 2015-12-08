// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils
{

    public HashUtils()
    {
    }

    public static String convertToSha256Hash(String s)
    {
        StringBuffer stringbuffer;
        s = MessageDigest.getInstance("SHA256").digest(s.getBytes("UTF-8"));
        stringbuffer = new StringBuffer();
        int i = 0;
_L2:
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append(Integer.toHexString(s[i] & 0xff | 0x100).substring(1, 3));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s = stringbuffer.toString();
        return s;
        s;
_L4:
        return null;
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
