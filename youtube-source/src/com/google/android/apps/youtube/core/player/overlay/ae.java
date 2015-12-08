// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            DefaultLiveOverlay

final class ae
    implements Runnable
{

    final DefaultLiveOverlay a;

    ae(DefaultLiveOverlay defaultliveoverlay)
    {
        a = defaultliveoverlay;
        super();
    }

    public final void run()
    {
        DefaultLiveOverlay.a(a, DefaultLiveOverlay.a(a));
    }
}
