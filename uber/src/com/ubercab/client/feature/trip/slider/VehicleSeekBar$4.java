// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleSeekBar

final class a
    implements android.animation.matorUpdateListener
{

    final VehicleSeekBar a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.setProgress(((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    (VehicleSeekBar vehicleseekbar)
    {
        a = vehicleseekbar;
        super();
    }
}
