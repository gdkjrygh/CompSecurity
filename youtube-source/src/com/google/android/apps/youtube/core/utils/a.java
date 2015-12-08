// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import com.google.android.ads.q;
import com.google.android.ads.t;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.medialib.player.ae;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            b, c

public final class a
{

    static final int a[] = {
        144, 240, 360, 720, 1080
    };
    private final Context b;
    private final f c;
    private final ae d;
    private final String e;
    private int f;

    public a(Context context, ae ae1, String s)
    {
        this(context, ae1, s, "googleads.g.doubleclick.net", "/pagead/ads");
    }

    public a(Context context, ae ae1, String s, String s1, String s2)
    {
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        d = (ae)com.google.android.apps.youtube.common.fromguava.c.a(ae1);
        e = (new StringBuilder("a.")).append(s).toString();
        c = new b(this, context, s1, s2);
    }

    static String a(a a1)
    {
        return a1.e;
    }

    public static String c()
    {
        return "ms";
    }

    private String e()
    {
        int i = c.a.get(d.a(a, f));
        if (i == 0)
        {
            L.b("Could not select a stream, defaulting to itag 36");
            return "36";
        } else
        {
            return String.valueOf(i);
        }
    }

    public final Uri a(Uri uri)
    {
        Uri uri1 = uri;
        if (((t)c.b()).a(uri))
        {
            uri1 = b(uri);
        }
        return uri1;
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("ms", b());
        return hashmap;
    }

    public final void a(int i)
    {
        f = i;
    }

    public final Uri b(Uri uri)
    {
        return o.a(uri).a("sdkv", e).a("video_format", e()).a("output", "xml_vast2").a();
    }

    public final String b()
    {
        return ((t)c.b()).a().a(b);
    }

    public final boolean c(Uri uri)
    {
        return ((t)c.b()).a(uri);
    }

    public final String d()
    {
        return (new StringBuilder("sdkv=")).append(e).append("&video_format=").append(e()).append("&output=xml_vast2").toString();
    }

}
