// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            bb

final class bo
    implements Runnable
{

    final int a;
    final int b;
    final int c;
    final bb d;

    bo(bb bb1, int i, int j, int k)
    {
        d = bb1;
        a = i;
        b = j;
        c = k;
        super();
    }

    public final void run()
    {
        bb.b(d).setTimes(a, b, c);
    }
}
