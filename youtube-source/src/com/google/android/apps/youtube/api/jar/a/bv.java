// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            bb

final class bv
    implements Runnable
{

    final List a;
    final bb b;

    bv(bb bb1, List list)
    {
        b = bb1;
        a = list;
        super();
    }

    public final void run()
    {
        bb.b(b).a(a);
    }
}
