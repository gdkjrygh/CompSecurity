// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.vehicleinspection;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.vehicleinspection:
//            PointOfInterestSelectionActivity

final class a
    implements android.animation.r
{

    final PointOfInterestSelectionActivity a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PointOfInterestSelectionActivity.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    (PointOfInterestSelectionActivity pointofinterestselectionactivity)
    {
        a = pointofinterestselectionactivity;
        super();
    }
}
