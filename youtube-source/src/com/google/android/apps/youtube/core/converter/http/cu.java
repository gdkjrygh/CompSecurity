// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.f;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            da, cv, cy, cx, 
//            cw, df, de, dd, 
//            dc, db

public final class cu
{

    public static void a(f f1)
    {
        f1.a("/entry", new da());
        c(f1, "/entry");
    }

    public static void a(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/entry").toString(), new cv());
        c(f1, (new StringBuilder()).append(s).append("/entry").toString());
    }

    public static void b(f f1, String s)
    {
        f1.a(s, new cy()).a((new StringBuilder()).append(s).append("/entry").toString(), new cx());
        c(f1, (new StringBuilder()).append(s).append("/entry").toString());
    }

    private static void c(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/category").toString(), new cw()).a((new StringBuilder()).append(s).append("/content").toString(), new df()).a((new StringBuilder()).append(s).append("/yt:username").toString(), new de()).a((new StringBuilder()).append(s).append("/yt:playlistTitle").toString(), new dd()).a((new StringBuilder()).append(s).append("/yt:queryString").toString(), new dc()).a((new StringBuilder()).append(s).append("/link").toString(), new db());
    }
}
