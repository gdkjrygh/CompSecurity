// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;


final class ParseRequest
{

    final int radix;
    final String rawValue;

    private ParseRequest(String s, int i)
    {
        rawValue = s;
        radix = i;
    }

    static ParseRequest fromString(String s)
    {
        if (s.length() == 0)
        {
            throw new NumberFormatException("empty string");
        }
        char c = s.charAt(0);
        if (s.startsWith("0x") || s.startsWith("0X"))
        {
            s = s.substring(2);
            c = '\020';
        } else
        if (c == '#')
        {
            s = s.substring(1);
            c = '\020';
        } else
        if (c == '0' && s.length() > 1)
        {
            s = s.substring(1);
            c = '\b';
        } else
        {
            c = '\n';
        }
        return new ParseRequest(s, c);
    }
}
