// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            DefaultAdOverlay

final class v
    implements android.view.View.OnTouchListener
{

    final DefaultAdOverlay a;

    v(DefaultAdOverlay defaultadoverlay)
    {
        a = defaultadoverlay;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        DefaultAdOverlay.a(a, motionevent);
        return false;
    }
}
