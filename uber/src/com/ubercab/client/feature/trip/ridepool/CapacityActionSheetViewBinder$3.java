// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// Referenced classes of package com.ubercab.client.feature.trip.ridepool:
//            CapacityActionSheetViewBinder

final class a extends AnimatorListenerAdapter
{

    final CapacityActionSheetViewBinder a;

    public final void onAnimationEnd(Animator animator)
    {
        a.mCapacityActionSheetView.setVisibility(8);
        a.a.removeView(a.mCapacityActionSheetView);
    }

    (CapacityActionSheetViewBinder capacityactionsheetviewbinder)
    {
        a = capacityactionsheetviewbinder;
        super();
    }
}
