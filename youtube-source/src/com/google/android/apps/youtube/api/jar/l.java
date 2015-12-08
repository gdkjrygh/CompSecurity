// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import com.google.android.apps.youtube.core.player.overlay.ControlsState;
import com.google.android.apps.youtube.core.player.overlay.as;
import com.google.android.apps.youtube.core.player.overlay.p;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiTvControlsOverlay

final class l
    implements as
{

    final ApiTvControlsOverlay a;

    private l(ApiTvControlsOverlay apitvcontrolsoverlay)
    {
        a = apitvcontrolsoverlay;
        super();
    }

    l(ApiTvControlsOverlay apitvcontrolsoverlay, byte byte0)
    {
        this(apitvcontrolsoverlay);
    }

    public final void a()
    {
        if (ApiTvControlsOverlay.b(a) != null)
        {
            ApiTvControlsOverlay.b(a).e();
        }
    }

    public final void a(double d1)
    {
        if (ApiTvControlsOverlay.b(a) != null)
        {
            d1 = Math.max(1.0D, d1);
            ApiTvControlsOverlay.b(a).a(ApiTvControlsOverlay.c(a) - (int)(d1 * 20000D));
        }
    }

    public final void a(int i)
    {
        if (ApiTvControlsOverlay.b(a) != null)
        {
            ApiTvControlsOverlay.b(a).a(i);
        }
    }

    public final void b()
    {
        while (ApiTvControlsOverlay.a(a) == ControlsState.PLAYING || ApiTvControlsOverlay.b(a) == null) 
        {
            return;
        }
        ApiTvControlsOverlay.b(a).a();
    }

    public final void b(double d1)
    {
        if (ApiTvControlsOverlay.b(a) != null)
        {
            d1 = Math.max(1.0D, d1);
            p p1 = ApiTvControlsOverlay.b(a);
            int i = ApiTvControlsOverlay.c(a);
            p1.a((int)(d1 * 20000D) + i);
        }
    }

    public final void c()
    {
        while (ApiTvControlsOverlay.a(a) == ControlsState.PAUSED || ApiTvControlsOverlay.b(a) == null) 
        {
            return;
        }
        ApiTvControlsOverlay.b(a).b();
    }

    public final void d()
    {
        if (ApiTvControlsOverlay.b(a) != null)
        {
            ApiTvControlsOverlay.b(a).d();
        }
    }

    public final void e()
    {
        if (ApiTvControlsOverlay.b(a) != null)
        {
            ApiTvControlsOverlay.b(a).g();
        }
    }
}
