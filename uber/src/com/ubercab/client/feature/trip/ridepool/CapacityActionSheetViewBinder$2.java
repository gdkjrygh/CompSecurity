// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.animation.ValueAnimator;
import gdh;

// Referenced classes of package com.ubercab.client.feature.trip.ridepool:
//            CapacityActionSheetViewBinder

final class a
    implements android.animation.ener
{

    final int a;
    final CapacityActionSheetViewBinder b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        CapacityActionSheetViewBinder.a(b).a(valueanimator.getAnimatedFraction(), a);
    }

    (CapacityActionSheetViewBinder capacityactionsheetviewbinder, int i)
    {
        b = capacityactionsheetviewbinder;
        a = i;
        super();
    }
}
