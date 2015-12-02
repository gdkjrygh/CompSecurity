// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.ValueAnimator;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressFlowEditText

final class a
    implements android.animation.UpdateListener
{

    final AddressFlowEditText a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        AddressFlowEditText.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        AddressFlowEditText.f(a);
    }

    (AddressFlowEditText addressflowedittext)
    {
        a = addressflowedittext;
        super();
    }
}
