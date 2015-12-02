// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressView

final class a
    implements android.animation.AnimatorUpdateListener
{

    final AddressView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        AddressView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    (AddressView addressview)
    {
        a = addressview;
        super();
    }
}
