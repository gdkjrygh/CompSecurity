// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzf
{

    private static final Pattern zzUP = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    public static double zzA(long l)
    {
        return (double)l / 1000D;
    }

    private static boolean zza(char c)
    {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '_' || c == '-';
    }

    public static boolean zza(Object obj, Object obj1)
    {
        return obj == null && obj1 == null || obj != null && obj1 != null && obj.equals(obj1);
    }

    public static String zzb(Locale locale)
    {
        StringBuilder stringbuilder = new StringBuilder(20);
        stringbuilder.append(locale.getLanguage());
        String s = locale.getCountry();
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append('-').append(s);
        }
        locale = locale.getVariant();
        if (!TextUtils.isEmpty(locale))
        {
            stringbuilder.append('-').append(locale);
        }
        return stringbuilder.toString();
    }

    public static void zzbD(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (s.length() > 128)
        {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!s.startsWith("urn:x-cast:"))
        {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (s.length() == "urn:x-cast:".length())
        {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        } else
        {
            return;
        }
    }

    public static String zzbE(String s)
    {
        return (new StringBuilder()).append("urn:x-cast:").append(s).toString();
    }

    public static String zzbF(String s)
    {
        if (zzUP.matcher(s).matches())
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(s.length());
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (zza(c) || c == '.' || c == ':')
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append(String.format("%%%04x", new Object[] {
                    Integer.valueOf(c & 0xffff)
                }));
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public static long zze(double d)
    {
        return (long)(1000D * d);
    }

}
