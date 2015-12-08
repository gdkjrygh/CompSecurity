// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            DefaultPlayerSurface

final class a
    implements Runnable
{

    final DefaultPlayerSurface a;

    a(DefaultPlayerSurface defaultplayersurface)
    {
        a = defaultplayersurface;
        super();
    }

    public final void run()
    {
        DefaultPlayerSurface.a(a).setVisibility(8);
    }
}
