// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pickup;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gbg;

// Referenced classes of package com.ubercab.client.feature.trip.map.layer.pickup:
//            HotspotMarker

final class a extends AnimatorListenerAdapter
{

    final HotspotMarker a;

    public final void onAnimationEnd(Animator animator)
    {
        a.setState$72569c07(gbg.a);
    }

    (HotspotMarker hotspotmarker)
    {
        a = hotspotmarker;
        super();
    }
}
