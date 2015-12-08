// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;


// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ca, ck, YouTubeTvScreen

final class cb
    implements Runnable
{

    final YouTubeTvScreen a;
    final ca b;

    cb(ca ca1, YouTubeTvScreen youtubetvscreen)
    {
        b = ca1;
        a = youtubetvscreen;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
