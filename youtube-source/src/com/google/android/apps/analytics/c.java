// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class c
{

    static String a(String s, String s1)
    {
        try
        {
            s1 = URLEncoder.encode(s, s1).replace("+", "%20");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new AssertionError((new StringBuilder("URL encoding failed for: ")).append(s).toString());
        }
        return s1;
    }
}
