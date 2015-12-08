// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.util;


public class TextUtils
{

    public TextUtils()
    {
    }

    public static transient boolean hasAnyPrefix(String s, String as[])
    {
        if (s != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (s.startsWith(as[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean isBlank(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    public static boolean isWholePositiveNumber(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        s = s.toCharArray();
        int j = s.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (!Character.isDigit(s[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static String nullIfBlank(String s)
    {
        String s1 = s;
        if (isBlank(s))
        {
            s1 = null;
        }
        return s1;
    }
}
