// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n;

import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.bouncycastle.i18n:
//            MessageBundle

public class ErrorBundle extends MessageBundle
{

    public static final String DETAIL_ENTRY = "details";
    public static final String SUMMARY_ENTRY = "summary";

    public ErrorBundle(String s, String s1)
    {
        super(s, s1);
    }

    public ErrorBundle(String s, String s1, String s2)
    {
        super(s, s1, s2);
    }

    public ErrorBundle(String s, String s1, String s2, Object aobj[])
    {
        super(s, s1, s2, aobj);
    }

    public ErrorBundle(String s, String s1, Object aobj[])
    {
        super(s, s1, aobj);
    }

    public String getDetail(Locale locale)
    {
        return getEntry("details", locale, TimeZone.getDefault());
    }

    public String getDetail(Locale locale, TimeZone timezone)
    {
        return getEntry("details", locale, timezone);
    }

    public String getSummary(Locale locale)
    {
        return getEntry("summary", locale, TimeZone.getDefault());
    }

    public String getSummary(Locale locale, TimeZone timezone)
    {
        return getEntry("summary", locale, timezone);
    }
}
