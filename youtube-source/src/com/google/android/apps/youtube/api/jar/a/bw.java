// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            bb

final class bw
    implements Runnable
{

    final boolean a;
    final bb b;

    bw(bb bb1, boolean flag)
    {
        b = bb1;
        a = flag;
        super();
    }

    public final void run()
    {
        bb.b(b).setSupportsQualityToggle(a);
    }
}
