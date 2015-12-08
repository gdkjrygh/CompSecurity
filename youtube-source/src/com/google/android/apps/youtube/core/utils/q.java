// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q
{

    public final String a;
    public final boolean b;

    private q(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public static q a(Uri uri)
    {
        boolean flag1 = false;
        c.a(uri);
        if (!uri.isHierarchical())
        {
            return null;
        }
        String s = uri.getQueryParameter("playnext");
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (m.b(s, 0) != 0)
            {
                flag = true;
            }
        }
        s = uri.getQueryParameter("list");
        if (!TextUtils.isEmpty(s))
        {
            return new q(s, flag);
        }
        s = uri.getQueryParameter("p");
        if (!TextUtils.isEmpty(s))
        {
            return new q(s, flag);
        }
        uri = Pattern.compile("https://gdata.youtube.com/feeds/api/playlists/(.*)").matcher(Uri.decode(uri.toString()));
        if (uri.matches())
        {
            uri = uri.group(1);
            if (!TextUtils.isEmpty(uri))
            {
                return new q(uri, flag);
            }
        }
        return null;
    }
}
