// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player.v14;


// Referenced classes of package com.google.android.apps.youtube.medialib.player.v14:
//            TexturePlayerSurface

final class c
    implements Runnable
{

    final TexturePlayerSurface a;

    c(TexturePlayerSurface textureplayersurface)
    {
        a = textureplayersurface;
        super();
    }

    public final void run()
    {
        a.removeView(TexturePlayerSurface.a(a));
        TexturePlayerSurface.b(a);
        a.addView(TexturePlayerSurface.a(a));
    }
}
