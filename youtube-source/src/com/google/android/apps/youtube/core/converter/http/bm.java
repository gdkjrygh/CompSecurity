// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.f;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bn, bo, fp, bs, 
//            br, bq, bp

public final class bm
{

    public static void a(f f1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        c(f1, s);
        f1.a((new StringBuilder()).append(s).append("/entry").toString(), new bn());
    }

    public static void b(f f1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        c(f1, s);
        f1.a((new StringBuilder()).append(s).append("/entry").toString(), new bo());
    }

    private static void c(f f1, String s)
    {
        fp.d(f1, (new StringBuilder()).append(s).append("/entry/content/entry").toString());
        f1.a((new StringBuilder()).append(s).append("/entry/content/entry").toString(), new bs()).a((new StringBuilder()).append(s).append("/entry/yt:when").toString(), new br()).a((new StringBuilder()).append(s).append("/entry/yt:status").toString(), new bq()).a((new StringBuilder()).append(s).append("/entry/link").toString(), new bp());
    }
}
