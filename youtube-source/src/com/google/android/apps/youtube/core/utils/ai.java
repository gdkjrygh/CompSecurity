// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.common.http.UrlRules;

public final class ai
{

    private final ContentResolver a;
    private final UrlRules b = null;

    public ai(ContentResolver contentresolver)
    {
        a = (ContentResolver)c.a(contentresolver);
    }

    public final Uri a(Uri uri)
    {
        String s = uri.toString();
        String s1 = a(s);
        if (s.equals(s1))
        {
            return uri;
        } else
        {
            return Uri.parse(s1);
        }
    }

    public final String a(String s)
    {
        UrlRules urlrules;
        if (b != null)
        {
            urlrules = b;
        } else
        {
            urlrules = UrlRules.a(a);
        }
        return urlrules.a(s).a(s);
    }
}
