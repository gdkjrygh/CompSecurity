// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen

final class bp
{

    private final YouTubeTvScreen a;
    private final String b;
    private final String c;
    private final long d;
    private final boolean e;
    private final String f;
    private final int g;

    private bp(YouTubeTvScreen youtubetvscreen, String s, long l, String s1, int i, boolean flag, 
            String s2)
    {
        f = s2;
        a = (YouTubeTvScreen)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreen);
        b = s;
        c = s1;
        d = l;
        e = flag;
        g = i;
    }

    bp(YouTubeTvScreen youtubetvscreen, String s, long l, String s1, int i, boolean flag, 
            String s2, byte byte0)
    {
        this(youtubetvscreen, s, l, s1, i, true, s2);
    }

    static YouTubeTvScreen a(bp bp1)
    {
        return bp1.a;
    }

    static String b(bp bp1)
    {
        return bp1.b;
    }

    static boolean c(bp bp1)
    {
        return bp1.e;
    }

    static String d(bp bp1)
    {
        return bp1.f;
    }

    static long e(bp bp1)
    {
        return bp1.d;
    }

    static int f(bp bp1)
    {
        return bp1.g;
    }

    static String g(bp bp1)
    {
        return bp1.c;
    }
}
