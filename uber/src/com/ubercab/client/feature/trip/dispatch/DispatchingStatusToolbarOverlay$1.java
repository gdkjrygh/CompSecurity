// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.dispatch;

import android.animation.Animator;
import drv;
import fxv;
import fxw;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.trip.dispatch:
//            DispatchingStatusToolbarOverlay

final class a extends drv
{

    final DispatchingStatusToolbarOverlay a;

    public final void onAnimationEnd(Animator animator)
    {
        animator = a;
        int i;
        if (a())
        {
            i = fxw.a;
        } else
        {
            i = fxw.c;
        }
        DispatchingStatusToolbarOverlay.a(animator, i);
        DispatchingStatusToolbarOverlay.a(a);
        if (DispatchingStatusToolbarOverlay.b(a) == fxw.c)
        {
            for (animator = DispatchingStatusToolbarOverlay.c(a).iterator(); animator.hasNext(); ((fxv)animator.next()).e()) { }
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        DispatchingStatusToolbarOverlay.a(a, fxw.b);
        DispatchingStatusToolbarOverlay.a(a);
    }

    (DispatchingStatusToolbarOverlay dispatchingstatustoolbaroverlay)
    {
        a = dispatchingstatustoolbaroverlay;
        super();
    }
}
