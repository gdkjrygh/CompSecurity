// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.f;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ds, dr, dw, dv, 
//            du, dt

public final class dq
{

    public static void a(f f1)
    {
        b(f1, "");
        f1.a("/entry", new ds());
    }

    public static void a(f f1, String s)
    {
        b(f1, s);
        f1.a((new StringBuilder()).append(s).append("/entry").toString(), new dr());
    }

    private static void b(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/entry/summary").toString(), new dw()).a((new StringBuilder()).append(s).append("/entry/link").toString(), new dv()).a((new StringBuilder()).append(s).append("/entry/author/name").toString(), new du()).a((new StringBuilder()).append(s).append("/entry/author/uri").toString(), new dt());
    }
}
