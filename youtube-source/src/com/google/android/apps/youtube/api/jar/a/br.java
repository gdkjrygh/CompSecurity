// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.view.KeyEvent;
import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            bb

final class br
    implements Runnable
{

    final int a;
    final KeyEvent b;
    final bb c;

    br(bb bb1, int i, KeyEvent keyevent)
    {
        c = bb1;
        a = i;
        b = keyevent;
        super();
    }

    public final void run()
    {
        bb.b(c).onKeyDown(a, b);
    }
}
