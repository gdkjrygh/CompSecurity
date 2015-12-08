// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;


// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            d, DefaultPlayerSurface

final class e
    implements Runnable
{

    final DefaultPlayerSurface a;
    final d b;

    e(d d1, DefaultPlayerSurface defaultplayersurface)
    {
        b = d1;
        a = defaultplayersurface;
        super();
    }

    public final void run()
    {
        if (DefaultPlayerSurface.c(b.c) != null)
        {
            DefaultPlayerSurface.c(b.c);
            float f = b.a;
            f = b.b;
        }
    }
}
