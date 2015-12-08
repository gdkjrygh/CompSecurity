// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player.v14;


// Referenced classes of package com.google.android.apps.youtube.medialib.player.v14:
//            TexturePlayerSurface, d

final class a
    implements Runnable
{

    final TexturePlayerSurface a;

    a(TexturePlayerSurface textureplayersurface)
    {
        a = textureplayersurface;
        super();
    }

    public final void run()
    {
        TexturePlayerSurface.a(a).setAlpha(1.0F);
        a.setBackgroundDrawable(null);
    }
}
