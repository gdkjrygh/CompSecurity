// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.api.b.a.ar;
import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            cd, bb

final class bc
    implements Runnable
{

    final ar a;
    final bb b;

    bc(bb bb1, ar ar)
    {
        b = bb1;
        a = ar;
        super();
    }

    public final void run()
    {
        bb.a(b, new cd(a));
        bb.b(b).setListener(bb.a(b));
    }
}
