// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import java.util.Locale;

public class LocaleUtil
{

    public LocaleUtil()
    {
    }

    public static boolean deviceIsEnglish()
    {
        return deviceLocaleBeginsWith("en");
    }

    public static boolean deviceLocaleBeginsWith(String s)
    {
        Locale locale = Locale.getDefault();
        if (locale != null && locale.getLanguage() != null)
        {
            return locale.getLanguage().startsWith(s);
        } else
        {
            return s.equals("en");
        }
    }
}
