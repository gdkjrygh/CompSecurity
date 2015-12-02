// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pickup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import cjl;
import gbh;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.trip.map.layer.pickup:
//            HotspotMarker

final class a extends AnimatorListenerAdapter
{

    final HotspotMarker a;

    public final void onAnimationCancel(Animator animator)
    {
        a.a.e();
        a.setOverlayDimensions(HotspotMarker.c(a));
    }

    public final void onAnimationEnd(Animator animator)
    {
        for (animator = HotspotMarker.b(a).iterator(); animator.hasNext(); ((gbh)animator.next()).a()) { }
    }

    public final void onAnimationStart(Animator animator)
    {
        a.a.e();
        HotspotMarker.a(a);
    }

    (HotspotMarker hotspotmarker)
    {
        a = hotspotmarker;
        super();
    }
}
