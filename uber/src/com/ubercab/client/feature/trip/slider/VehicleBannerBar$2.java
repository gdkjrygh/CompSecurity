// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleBannerBar

final class a extends AnimatorListenerAdapter
{

    final VehicleBannerBar a;

    public final void onAnimationCancel(Animator animator)
    {
        VehicleBannerBar.a(a);
    }

    public final void onAnimationEnd(Animator animator)
    {
        VehicleBannerBar.a(a);
    }

    public final void onAnimationStart(Animator animator)
    {
        VehicleBannerBar.a(a, Boolean.valueOf(false));
    }

    (VehicleBannerBar vehiclebannerbar)
    {
        a = vehiclebannerbar;
        super();
    }
}
