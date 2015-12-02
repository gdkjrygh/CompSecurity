// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleSlideUpPanel

final class a extends AnimatorListenerAdapter
{

    final VehicleSlideUpPanel a;

    public final void onAnimationStart(Animator animator)
    {
        a.mBunkerMessage.setVisibility(0);
    }

    (VehicleSlideUpPanel vehicleslideuppanel)
    {
        a = vehicleslideuppanel;
        super();
    }
}
