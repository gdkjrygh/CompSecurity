// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;


// Referenced classes of package com.weather.commons.ups.facade:
//            Profile

public static class locale
{

    private final String language;
    private final String locale;

    public String getLanguage()
    {
        return language;
    }

    public String getLocale()
    {
        return locale;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Preference{language='").append(language).append('\'').append(", locale='").append(locale).append('\'').append('}').toString();
    }

    public ()
    {
        language = null;
        locale = null;
    }

    public locale(String s, String s1)
    {
        language = s;
        locale = s1;
    }
}
