// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class gpq
{

    public static String a(String s, String s1, Locale locale)
    {
        if (TextUtils.isEmpty(s))
        {
            if (s1 != null)
            {
                return s1;
            } else
            {
                return "";
            }
        }
        if (TextUtils.isEmpty(s1))
        {
            return s;
        }
        if (gpp.a(locale) && gpp.a(s) && gpp.a(s1))
        {
            return (new gou(s, s1)).c();
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }
}
