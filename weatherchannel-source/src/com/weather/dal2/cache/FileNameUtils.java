// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import com.squareup.okhttp.internal.Util;
import java.io.File;

public final class FileNameUtils
{

    private static final int MILLIS_IN_ONE_SECOND = 1000;
    private static final int SECONDS_IN_ONE_MINUTE = 60;

    private FileNameUtils()
    {
    }

    public static String createFileName(int i, String s)
    {
        long l = System.currentTimeMillis() / 1000L / 60L;
        return (new StringBuilder()).append((long)i + l).append("-").append(toBaseName(s)).toString();
    }

    public static String extractBase(String s)
    {
        return s.substring(findHyphen(s) + 1);
    }

    public static int extractExpirationTime(String s)
    {
        int i = findHyphen(s);
        if (i == -1)
        {
            return -1;
        } else
        {
            return Integer.parseInt(s.substring(0, i));
        }
    }

    private static int findHyphen(String s)
    {
        int j;
        byte byte0;
        byte0 = -1;
        j = byte0;
        if (s.isEmpty()) goto _L2; else goto _L1
_L1:
        j = byte0;
        if (!Character.isDigit(s.charAt(0))) goto _L2; else goto _L3
_L3:
        int i;
        int k;
        i = 0;
        k = s.length();
_L9:
        j = byte0;
        if (i >= k - 1) goto _L2; else goto _L4
_L4:
        char c = s.charAt(i);
        if (c != '-') goto _L6; else goto _L5
_L5:
        if (i >= 10)
        {
            i = -1;
        }
        j = i;
_L2:
        return j;
_L6:
        j = byte0;
        if (!Character.isDigit(c)) goto _L2; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static boolean hasKey(File file, String s)
    {
        return extractBase(file.getName()).equals(Util.md5Hex(s));
    }

    public static boolean isCachedFile(CharSequence charsequence)
    {
        return findHyphen(charsequence.toString()) != -1;
    }

    public static String toBaseName(String s)
    {
        return Util.md5Hex(s);
    }
}
