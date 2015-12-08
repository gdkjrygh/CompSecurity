// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashSet;

public final class o
{

    private final android.net.Uri.Builder a;
    private final HashSet b;

    private o(Uri uri)
    {
        a = ((Uri)c.a(uri)).buildUpon();
        b = new HashSet(uri.getQueryParameterNames());
    }

    public static o a(Uri uri)
    {
        return new o(uri);
    }

    public final Uri a()
    {
        return a.build();
    }

    public final o a(String s, int i)
    {
        return a(s, String.valueOf(i));
    }

    public final o a(String s, String s1)
    {
        if (!b.contains(s))
        {
            b.add(s);
            a.appendQueryParameter(s, s1);
        }
        return this;
    }

    public final o a(String s, String s1, String s2)
    {
label0:
        {
            if (!b.contains(s))
            {
                b.add(s);
                s = (new StringBuilder()).append(Uri.encode(s, null)).append("=").append(Uri.encode(s1, s2)).toString();
                s1 = a.build().getEncodedQuery();
                if (TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                a.encodedQuery((new StringBuilder()).append(s1).append("&").append(s).toString());
            }
            return this;
        }
        a.encodedQuery(s);
        return this;
    }
}
