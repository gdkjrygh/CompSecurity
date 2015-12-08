// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen

final class cp
    implements b
{

    private final b a;
    private final YouTubeTvScreen b;

    public cp(YouTubeTvScreen youtubetvscreen, b b1)
    {
        a = b1;
        b = youtubetvscreen;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a.a(b, exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (YouTubeTvScreen)obj1;
        a.a(b, obj);
    }
}
