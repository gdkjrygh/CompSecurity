// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionsBar

final class a extends AnimatorListenerAdapter
{

    final VehicleOptionsBar a;

    public final void onAnimationCancel(Animator animator)
    {
        VehicleOptionsBar.a(a);
    }

    public final void onAnimationEnd(Animator animator)
    {
        VehicleOptionsBar.a(a);
    }

    public final void onAnimationStart(Animator animator)
    {
        VehicleOptionsBar.a(a, Boolean.valueOf(false));
    }

    (VehicleOptionsBar vehicleoptionsbar)
    {
        a = vehicleoptionsbar;
        super();
    }
}
