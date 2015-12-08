// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.test;


public final class NumberParsing
{

    private NumberParsing()
    {
    }

    public static int decodeIntFromHex(String s)
    {
        if (s.charAt(1) == 'x' || s.charAt(1) == 'X')
        {
            return Integer.parseInt(s.substring(2), 16);
        } else
        {
            return Integer.parseInt(s, 16);
        }
    }

    public static long decodeLongFromHex(String s)
    {
        if (s.charAt(1) == 'x' || s.charAt(1) == 'X')
        {
            return Long.parseLong(s.substring(2), 16);
        } else
        {
            return Long.parseLong(s, 16);
        }
    }
}
