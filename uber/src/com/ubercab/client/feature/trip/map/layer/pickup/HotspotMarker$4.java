// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pickup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.map.layer.pickup:
//            HotspotMarker

final class a extends AnimatorListenerAdapter
{

    final HotspotMarker a;

    public final void onAnimationCancel(Animator animator)
    {
        a.b();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.b();
    }

    (HotspotMarker hotspotmarker)
    {
        a = hotspotmarker;
        super();
    }
}
