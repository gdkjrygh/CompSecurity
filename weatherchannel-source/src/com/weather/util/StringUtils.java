// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.google.common.base.CharMatcher;

public final class StringUtils
{

    private static final CharMatcher digitMatcher = CharMatcher.inRange('0', '9');

    private StringUtils()
    {
    }

    public static boolean areEqual(String s, String s1)
    {
        return s == null && s1 == null || s != null && s1 != null && s.equals(s1);
    }

    public static boolean hasAnyDigits(CharSequence charsequence)
    {
        return charsequence != null && digitMatcher.matchesAnyOf(charsequence);
    }

    public static boolean hasOnlyLettersDigits(CharSequence charsequence)
    {
        return charsequence != null && CharMatcher.JAVA_LETTER_OR_DIGIT.matchesAllOf(charsequence);
    }

    public static boolean isBlank(String s)
    {
        return s == null || s.trim().isEmpty();
    }

    public static String objectString(Object obj)
    {
        return (new StringBuilder()).append(obj.getClass().getSimpleName()).append('@').append(Integer.toHexString(System.identityHashCode(obj))).toString();
    }

    public static CharSequence trimTrailingWhitespace(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return "";
        }
        int i = charsequence.length();
        int j;
label0:
        do
        {
            do
            {
                j = i - 1;
                if (j < 0)
                {
                    break label0;
                }
                i = j;
            } while (Character.isWhitespace(charsequence.charAt(j)));
            i = j;
        } while (Character.isSpaceChar(charsequence.charAt(j)));
        return charsequence.subSequence(0, j + 1);
    }

}
