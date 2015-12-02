// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pickup;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.trip.map.layer.pickup:
//            HotspotMarker

final class a
    implements android.animation.imatorUpdateListener
{

    final HotspotMarker a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        valueanimator = (Integer)valueanimator.getAnimatedValue();
        a.setOverlayDimensions(valueanimator.intValue());
    }

    (HotspotMarker hotspotmarker)
    {
        a = hotspotmarker;
        super();
    }
}
