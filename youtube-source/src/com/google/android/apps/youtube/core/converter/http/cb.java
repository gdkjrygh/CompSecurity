// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.f;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            cc, co, cn, cm, 
//            cl, ck, cj, ci, 
//            ch, cg, cf, ce, 
//            cd, cr, cq, cp

public final class cb
{

    public static void a(f f1)
    {
        f1.a("/feed/entry", new cc());
        a(f1, "/feed/entry");
    }

    private static void a(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/summary").toString(), new co()).a((new StringBuilder()).append(s).append("/content").toString(), new cn()).a((new StringBuilder()).append(s).append("/link").toString(), new cm()).a((new StringBuilder()).append(s).append("/yt:countHint").toString(), new cl());
        b(f1, s);
    }

    public static void b(f f1)
    {
        f1.a("/entry", new ck());
        a(f1, "/entry");
    }

    private static void b(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/yt:playlistId").toString(), new cj()).a((new StringBuilder()).append(s).append("/yt:private").toString(), new ci()).a((new StringBuilder()).append(s).append("/author/name").toString(), new ch()).a((new StringBuilder()).append(s).append("/title").toString(), new cg()).a((new StringBuilder()).append(s).append("/updated").toString(), new cf()).a((new StringBuilder()).append(s).append("/media:group/media:thumbnail").toString(), new ce());
    }

    public static void c(f f1)
    {
        f1.a("/feed", new cd()).a("/feed/subtitle", new cr()).a("/feed/link", new cq()).a("/feed/openSearch:totalResults", new cp());
        b(f1, "/feed");
    }
}
