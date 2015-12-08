// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;


// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            af, ApiMobileControlsOverlay, ai

final class g
    implements af
{

    final ApiMobileControlsOverlay a;

    private g(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        a = apimobilecontrolsoverlay;
        super();
    }

    g(ApiMobileControlsOverlay apimobilecontrolsoverlay, byte byte0)
    {
        this(apimobilecontrolsoverlay);
    }

    public final void a()
    {
        ApiMobileControlsOverlay.b(a);
        ApiMobileControlsOverlay.a(a).c();
    }

    public final void a(int i)
    {
        ApiMobileControlsOverlay.a(a).a(i);
        ApiMobileControlsOverlay.c(a);
    }
}
