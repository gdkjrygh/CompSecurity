// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            bb

final class bn
    implements Runnable
{

    final com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style a;
    final bb b;

    bn(bb bb1, com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        b = bb1;
        a = style;
        super();
    }

    public final void run()
    {
        bb.b(b).setStyle(a);
    }
}
