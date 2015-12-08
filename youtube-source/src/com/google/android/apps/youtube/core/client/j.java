// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.android.volley.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.e.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
{

    private static final Pattern a = Pattern.compile("^NO_MATCH_REGEX$");
    private final Pattern b;
    private final b c;
    private final b d;
    private final com.google.android.apps.youtube.common.e.b e;

    public j(b b1, b b2, Pattern pattern, com.google.android.apps.youtube.common.e.b b3)
    {
        c = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
        b1 = pattern;
        if (pattern == null)
        {
            b1 = a;
        }
        b = b1;
        e = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b3);
    }

    public final f a(Uri uri, String s)
    {
        if (b.matcher(uri.toString()).find())
        {
            b b1 = c;
            s = com.google.android.apps.youtube.datalib.e.b.a(s, 0x37046bc);
        } else
        {
            b b2 = d;
            s = com.google.android.apps.youtube.datalib.e.b.a(s, 0x37046bc);
        }
        return s.a(uri);
    }

    public final void a(f f1, n n)
    {
        if (b.matcher(f1.a().toString()).find())
        {
            c.a(f1, n);
            return;
        }
        Uri uri = f1.a();
        boolean flag;
        if (uri.getHost().endsWith(".doubleclick.net") || uri.getHost().equals("doubleclick.net"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && f1.f())
        {
            f1.a(f1.a().buildUpon().appendQueryParameter("ts", String.valueOf(e.a() / 1000L)).build());
        }
        d.a(f1, n);
    }

}
