// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class CrashlyticsMissingDependencyException extends RuntimeException
{

    private static final long serialVersionUID = 0xf004ebc5c705cfa5L;

    CrashlyticsMissingDependencyException(String s, String s1)
    {
        super(a(s, s1));
    }

    private static String a(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append("\nThis app relies on Crashlytics. Configure your build environment here: \n");
            stringbuilder.append((new StringBuilder()).append(String.format("https://crashlytics.com/register/%s/android/%s", new Object[] {
                URLEncoder.encode(s, "UTF-8"), URLEncoder.encode(s1, "UTF-8")
            })).append("\n").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            v.a().b().a("Crashlytics", "Could not find UTF-8 encoding.", s);
        }
        return stringbuilder.toString();
    }
}
