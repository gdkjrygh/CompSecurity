// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringHasher
{

    private final String mAlgorithm;
    private final StringBuffer mBuffer = new StringBuffer(64);

    public StringHasher(String s)
    {
        mAlgorithm = s;
    }

    public String createHashedString(String s)
    {
        mBuffer.delete(0, mBuffer.length());
        MessageDigest messagedigest = MessageDigest.getInstance(mAlgorithm);
        messagedigest.reset();
        s = messagedigest.digest(s.getBytes());
        int i = 0;
_L2:
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = Integer.toHexString(s[i] & 0xff);
        if (s1.length() < 2)
        {
            mBuffer.append("0");
        }
        mBuffer.append(s1);
        i++;
        if (true) goto _L2; else goto _L1
        s;
        s.printStackTrace();
_L1:
        return mBuffer.toString();
    }
}
