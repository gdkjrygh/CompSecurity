// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.f;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            o, r, s, t, 
//            u, v, w, x, 
//            p, q

public final class n
{

    public static void a(f f1)
    {
        f1.a("/feed/entry", new o());
        a(f1, "/feed");
    }

    private static void a(f f1, String s1)
    {
        f1.a((new StringBuilder()).append(s1).append("/entry/title").toString(), new r());
        f1.a((new StringBuilder()).append(s1).append("/entry/summary").toString(), new s());
        f1.a((new StringBuilder()).append(s1).append("/entry/author/name").toString(), new t());
        f1.a((new StringBuilder()).append(s1).append("/entry/yt:channelStatistics").toString(), new u());
        f1.a((new StringBuilder()).append(s1).append("/entry/author/uri").toString(), new v());
        f1.a((new StringBuilder()).append(s1).append("/entry/updated").toString(), new w());
        f1.a((new StringBuilder()).append(s1).append("/entry/yt:paidContent").toString(), new x());
        f1.a((new StringBuilder()).append(s1).append("/entry/gd:feedLink").toString(), new p());
    }

    public static void b(f f1)
    {
        f1.a("/entry", new q());
        a(f1, "");
    }
}
