// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;


// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            r, ApiMobileControlsOverlay, c

final class f
    implements r
{

    final ApiMobileControlsOverlay a;

    private f(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        a = apimobilecontrolsoverlay;
        super();
    }

    f(ApiMobileControlsOverlay apimobilecontrolsoverlay, byte byte0)
    {
        this(apimobilecontrolsoverlay);
    }

    public final void a()
    {
        if (ApiMobileControlsOverlay.d(a) != null)
        {
            ApiMobileControlsOverlay.d(a).a();
        }
    }

    public final void a(boolean flag)
    {
        ApiMobileControlsOverlay.a(a, flag);
        if (flag)
        {
            a.e();
            ApiMobileControlsOverlay.b(a);
        } else
        {
            ApiMobileControlsOverlay.c(a);
        }
        ApiMobileControlsOverlay.e(a);
    }

    public final void b()
    {
        ApiMobileControlsOverlay.c(a);
    }
}
